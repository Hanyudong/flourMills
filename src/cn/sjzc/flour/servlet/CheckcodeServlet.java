package cn.sjzc.flour.servlet;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGImageEncoder;

public class CheckcodeServlet extends HttpServlet {

	private int width;
	private int height;
	private int number; //��ʾ���ٸ��ַ�
	private String codes; //����Щ�ַ��ɹ�ѡ��
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		width = Integer.parseInt(config.getInitParameter("width"));
		height = Integer.parseInt(config.getInitParameter("height"));
		number = Integer.parseInt(config.getInitParameter("number"));
		codes = config.getInitParameter("codes");
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("image/jpeg");
		
		//����һ��ͼƬ
		BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		Graphics2D g = image.createGraphics();
		
		//������ɫ����
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, width, height);
		
		//���ڱ߿�
		g.setColor(Color.black);
		g.drawRect(0, 0, width-1, height-1);
		
		Random random = new Random();
		
		//ÿ���ַ�ռ�ݵĿ���
		int x = width / number;
		int y = height - 4;
		
		StringBuffer sb = new StringBuffer();
		//��������ַ�
		for(int i=0;i<number;i++){
			String code = String.valueOf(codes.charAt(random.nextInt(codes.length())));
			int red = random.nextInt(255);
			int green = random.nextInt(255);
			int blue = random.nextInt(255);
			
			g.setColor(new Color(red,green,blue));
			
			Font font = new Font("Arial",Font.PLAIN,random(height/2,height));
			g.setFont(font);
			
			g.drawString(code, i * x + 1, y);
			
			sb.append(code);
		}
		
		//����֤�봮�ŵ� HTTP session��
		request.getSession().setAttribute("codes", sb.toString());
		
		//�������һЩ��
		for(int i=0;i<50;i++){
			int red = random.nextInt(255);
			int green = random.nextInt(255);
			int blue = random.nextInt(255);
			
			g.setColor(new Color(red,green,blue));
			g.drawOval(random.nextInt(width), random.nextInt(height), 1, 1);
		}
		
		
		
		OutputStream out = response.getOutputStream();
		//��ͼƬת��ΪJPEG����
		JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(out);
		encoder.encode(image);
		
		out.flush();
		out.close();
	}
	
	/**
	 * ����һ����min��max֮��������
	 * @param min
	 * @param max
	 * @return
	 */
	private int random(int min,int max){
		int m = new Random().nextInt(999999) % (max - min);
		return m + min;
	}
	
	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		this.doGet(request, response);
	}

}