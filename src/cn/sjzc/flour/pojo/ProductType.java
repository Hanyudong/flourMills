package cn.sjzc.flour.pojo;

/**
 * 
 * <p>Title: ProductType </p>
 * <p>Description: 产品类型表 : 存储商品的相关信息 </p>	
 * @author author
 * @date 2017年12月28日 下午2:33:05
 */
public class ProductType {
	private int typeId;//产品编号
	private String typeName;//产品名称
	private String productName;//商品类型
	private String rate;//产品出粉率
	private int state;//产品类型状态 （0：删除；1：正常）
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
