package cn.sjzc.flour.pojo;

/**
 * 
 * <p>Title: FlourStock </p>
 * <p>Description:   ��ۿ��� </p>	
 * @author author
 * @date 2017��12��28�� ����2:40:24
 */
public class FlourStock {
	
	private int flourStockId;//��ۿ����
	private String typeName;//��Ʒ����
	private float stockSum;//�������
	private float customerStock;//�ͻ����
	
	
	public int getFlourStockId() {
		return flourStockId;
	}
	public void setFlourStockId(int flourStockId) {
		this.flourStockId = flourStockId;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public float getStockSum() {
		return stockSum;
	}
	public void setStockSum(float stockSum) {
		this.stockSum = stockSum;
	}
	public float getCustomerStock() {
		return customerStock;
	}
	public void setCustomerStock(float customerStock) {
		this.customerStock = customerStock;
	}
	

}
