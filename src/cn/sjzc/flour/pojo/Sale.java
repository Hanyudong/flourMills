package cn.sjzc.flour.pojo;

/**
 * 
 * <p>Title: Sale </p>
 * <p>Description:  ��Ʒ���۱�  </p>	
 * @author author
 * @date 2017��12��28�� ����2:38:52
 */
public class Sale {

	private int saleId;//��Ʒ���۱��
	private int evidenceId;//ƾ֤���
	private String typeName;//��Ʒ����
	private float price;//����
	private float bagNum;//����
	private float unitWeight;//ÿ������
	private float total;//�ܼ�
	private float weight;//��������
	
	
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
