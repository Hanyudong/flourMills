package cn.sjzc.flour.pojo;

import java.util.Date;

/**
 * 
 * <p>Title: GrainPurchase </p>
 * <p>Description: ԭ�����ñ�  </p>	
 * @author author
 * @date 2017��12��28�� ����2:36:57
 */
public class GrainPurchase {
	private  int purId;//ԭ������ID
	private int evidenceId;//ƾ֤���
	private Date purDate;//��������
	private String purName;//����ԭ������
	private float purWeight;//ԭ��ÿ������
	private int purBag;//����ԭ������
	private float totalWeight;//ԭ��������
	private float price;//ԭ������
	private float totalPrices;//ԭ���ܼ�
	
	
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
