package cn.sjzc.flour.pojo;

import java.util.Date;

/**
 * 
 * <p>Title: GrainPut </p>
 * <p>Description: ԭ������  </p>	
 * @author author
 * @date 2017��12��28�� ����2:36:12
 */
public class GrainPut {
	private int grainId;//ԭ�����ID
	private Customer customer; //�ͻ���Ϣ
	private int evidenceId;//ƾ֤���
	private Date putDate;//�������
	private float grainType;//ԭ������
	private String grainWeight;//ԭ������
	
	
	public int getGrainId() {
		return grainId;
	}
	public void setGrainId(int grainId) {
		this.grainId = grainId;
	}	
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public int getEvidenceId() {
		return evidenceId;
	}
	public void setEvidenceId(int evidenceId) {
		this.evidenceId = evidenceId;
	}
	public Date getPutDate() {
		return putDate;
	}
	public void setPutDate(Date putDate) {
		this.putDate = putDate;
	}
    
	public float getGrainType() {
		return grainType;
	}
	public void setGrainType(float grainType) {
		this.grainType = grainType;
	}
	public String getGrainWeight() {
		return grainWeight;
	}
	public void setGrainWeight(String grainWeight) {
		this.grainWeight = grainWeight;
	}
	
	
	

}
