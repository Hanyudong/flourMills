package cn.sjzc.flour.pojo;

import java.util.Date;

/**
 * 
 * <p>Title: Voucher </p>
 * <p>Description:   ƾ֤��   </p>	
 * @author author
 * @date 2017��12��28�� ����2:40:01
 */
public class Voucher {
	private int voucherId;//ƾ֤��ID
	private int evidenceId;//ƾ֤���
	private Customer customer;//�ͻ���Ϣ
	private Date date;//����
	private float  receivable;//Ӧ�ս�� 
	private float collected;//ʵ�ս��
	private  int agentId;//�����˱��
	private int voucherType;//�����˱������
	private int debtyn;//�Ƿ�Ƿ��
	
	
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
