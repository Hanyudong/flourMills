package cn.sjzc.flour.pojo;

import java.util.List;



/**
 * 
 * <p>Title: SystemUser </p>
 * <p>Description: ϵͳ�û��� : �洢ϵͳ����Ա�������Ϣ </p>	
 * @author author
 * @date 2017��12��28�� ����2:31:50
 */
public class SystemUser {
	
	private int userId;//�û����
	private String userName;//�û�����
	private String passWord;//�û�����
	private String initpwd;//��ʼ����
	private String realName;//��ʵ����
	private String phone;//�绰
	private int state;//�û�״̬��0��ɾ����1��������	
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getInitpwd() {
		return initpwd;
	}
	public void setInitpwd(String initpwd) {
		this.initpwd = initpwd;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}

	
	
}
