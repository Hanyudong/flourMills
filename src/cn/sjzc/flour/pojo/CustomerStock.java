package cn.sjzc.flour.pojo;

/**
 * 
 * <p>Title: CustomerStock </p>
 * <p>Description:  �ͻ����� </p>	
 * @author author
 * @date 2017��12��28�� ����2:39:22
 */
public class CustomerStock {

	private int stockId;//�ͻ������
	private Customer customer;//�ͻ���Ϣ
	private String typeName;//��Ʒ����
	private float weight;//�������
	
	
	public int getStockId() {
		return stockId;
	}
	public void setStockId(int stockId) {
		this.stockId = stockId;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	
}
