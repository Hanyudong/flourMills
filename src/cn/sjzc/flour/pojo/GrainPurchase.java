package cn.sjzc.flour.pojo;

import java.util.Date;

/**
 * 
 * <p>Title: GrainPurchase </p>
 * <p>Description: 原粮购置表  </p>	
 * @author author
 * @date 2017年12月28日 下午2:36:57
 */
public class GrainPurchase {
	private  int purId;//原粮购置ID
	private int evidenceId;//凭证编号
	private Date purDate;//购置日期
	private String purName;//购置原粮名称
	private float purWeight;//原粮每袋重量
	private int purBag;//购置原粮袋数
	private float totalWeight;//原粮总质量
	private float price;//原粮单价
	private float totalPrices;//原粮总价
	
	
	public int getPurId() {
		return purId;
	}
	public void setPurId(int purId) {
		this.purId = purId;
	}
	public int getEvidenceId() {
		return evidenceId;
	}
	public void setEvidenceId(int evidenceId) {
		this.evidenceId = evidenceId;
	}
	public Date getPurDate() {
		return purDate;
	}
	public void setPurDate(Date purDate) {
		this.purDate = purDate;
	}
	public String getPurName() {
		return purName;
	}
	public void setPurName(String purName) {
		this.purName = purName;
	}
	public float getPurWeight() {
		return purWeight;
	}
	public void setPurWeight(float purWeight) {
		this.purWeight = purWeight;
	}
	public int getPurBag() {
		return purBag;
	}
	public void setPurBag(int purBag) {
		this.purBag = purBag;
	}
	public float getTotalWeight() {
		return totalWeight;
	}
	public void setTotalWeight(float totalWeight) {
		this.totalWeight = totalWeight;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public float getTotalPrices() {
		return totalPrices;
	}
	public void setTotalPrices(float totalPrices) {
		this.totalPrices = totalPrices;
	}
	
}
