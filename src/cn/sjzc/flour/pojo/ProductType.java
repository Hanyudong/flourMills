package cn.sjzc.flour.pojo;

/**
 * 
 * <p>Title: ProductType </p>
 * <p>Description: ��Ʒ���ͱ� : �洢��Ʒ�������Ϣ </p>	
 * @author author
 * @date 2017��12��28�� ����2:33:05
 */
public class ProductType {
	private int typeId;//��Ʒ���
	private String typeName;//��Ʒ����
	private String productName;//��Ʒ����
	private String rate;//��Ʒ������
	private int state;//��Ʒ����״̬ ��0��ɾ����1��������
	public int getTypeId() {
		return typeId;
	}
	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getRate() {
		return rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	
	
}
