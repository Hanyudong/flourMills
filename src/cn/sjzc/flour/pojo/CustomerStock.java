package cn.sjzc.flour.pojo;

/**
 * 
 * <p>Title: CustomerStock </p>
 * <p>Description:  客户库存表 </p>	
 * @author author
 * @date 2017年12月28日 下午2:39:22
 */
public class CustomerStock {

	private int stockId;//客户库存编号
	private Customer customer;//客户信息
	private String typeName;//产品名称
	private float weight;//库存重量
	
	
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
