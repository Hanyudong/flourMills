package cn.sjzc.flour.pojo;

/**
 * 
 * <p>Title: StockHandle </p>
 * <p>Description: 库存处理表   </p>	
 * @author author
 * @date 2017年12月28日 下午2:38:14
 */
public class StockHandle {
	private int stockId;//库存处理编号
	private int evidenceId;//凭证编号
	private String typeName;//产品名称
	private float handleWeight;//处理重量
	private int method;//处理方法（1：出库；2：收购）
	
	
	public int getStockId() {
		return stockId;
	}
	public void setStockId(int stockId) {
		this.stockId = stockId;
	}
	public int getEvidenceId() {
		return evidenceId;
	}
	public void setEvidenceId(int evidenceId) {
		this.evidenceId = evidenceId;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	
	public float getHandleWeight() {
		return handleWeight;
	}
	public void setHandleWeight(float handleWeight) {
		this.handleWeight = handleWeight;
	}
	public int getMethod() {
		return method;
	}
	public void setMethod(int method) {
		this.method = method;
	}
	

}
