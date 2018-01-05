package cn.sjzc.flour.pojo;

import java.util.Date;

/**
 * 
 * <p>Title: Voucher </p>
 * <p>Description:   凭证表   </p>	
 * @author author
 * @date 2017年12月28日 下午2:40:01
 */
public class Voucher {
	private int voucherId;//凭证表ID
	private int evidenceId;//凭证编号
	private Customer customer;//客户信息
	private Date date;//日期
	private float  receivable;//应收金额 
	private float collected;//实收金额
	private  int agentId;//经办人编号
	private int voucherType;//经办人编号类型
	private int debtyn;//是否欠款
	
	
	public int getVoucherId() {
		return voucherId;
	}
	public void setVoucherId(int voucherId) {
		this.voucherId = voucherId;
	}
	public int getEvidenceId() {
		return evidenceId;
	}
	public void setEvidenceId(int evidenceId) {
		this.evidenceId = evidenceId;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public float getReceivable() {
		return receivable;
	}
	public void setReceivable(float receivable) {
		this.receivable = receivable;
	}
	public float getCollected() {
		return collected;
	}
	public void setCollected(float collected) {
		this.collected = collected;
	}
	public int getAgentId() {
		return agentId;
	}
	public void setAgentId(int agentId) {
		this.agentId = agentId;
	}
	public int getVoucherType() {
		return voucherType;
	}
	public void setVoucherType(int voucherType) {
		this.voucherType = voucherType;
	}
	public int getDebtyn() {
		return debtyn;
	}
	public void setDebtyn(int debtyn) {
		this.debtyn = debtyn;
	}
	
	

}
