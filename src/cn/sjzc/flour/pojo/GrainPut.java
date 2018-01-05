package cn.sjzc.flour.pojo;

import java.util.Date;

/**
 * 
 * <p>Title: GrainPut </p>
 * <p>Description: 原粮入库表  </p>	
 * @author author
 * @date 2017年12月28日 下午2:36:12
 */
public class GrainPut {
	private int grainId;//原粮入库ID
	private Customer customer; //客户信息
	private int evidenceId;//凭证编号
	private Date putDate;//入库日期
	private float grainType;//原粮类型
	private String grainWeight;//原粮重量
	
	
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
