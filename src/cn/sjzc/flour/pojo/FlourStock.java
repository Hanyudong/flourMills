package cn.sjzc.flour.pojo;

/**
 * 
 * <p>Title: FlourStock </p>
 * <p>Description:   面粉库存表 </p>	
 * @author author
 * @date 2017年12月28日 下午2:40:24
 */
public class FlourStock {
	
	private int flourStockId;//面粉库存编号
	private String typeName;//产品名称
	private float stockSum;//库存重量
	private float customerStock;//客户库存
	
	
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
