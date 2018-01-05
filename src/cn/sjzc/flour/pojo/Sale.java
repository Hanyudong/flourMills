package cn.sjzc.flour.pojo;

/**
 * 
 * <p>Title: Sale </p>
 * <p>Description:  产品销售表  </p>	
 * @author author
 * @date 2017年12月28日 下午2:38:52
 */
public class Sale {

	private int saleId;//产品销售编号
	private int evidenceId;//凭证编号
	private String typeName;//产品名称
	private float price;//单价
	private float bagNum;//袋数
	private float unitWeight;//每袋质量
	private float total;//总价
	private float weight;//销售重量
	
	
	public int getSaleId() {
		return saleId;
	}
	public void setSaleId(int saleId) {
		this.saleId = saleId;
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
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public float getBagNum() {
		return bagNum;
	}
	public void setBagNum(float bagNum) {
		this.bagNum = bagNum;
	}
	public float getUnitWeight() {
		return unitWeight;
	}
	public void setUnitWeight(float unitWeight) {
		this.unitWeight = unitWeight;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	
}
