package cn.sjzc.flour.pojo;

import java.util.Date;

/**
 * 
 * <p>Title: FlourProcess </p>
 * <p>Description:   ��ۼӹ���  </p>	
 * @author author
 * @date 2017��12��28�� ����2:41:15
 */
public class FlourProcess {
	private int processId;//�ӹ���ID
	private SystemUser systemUser;//�û���Ϣ
	private String typeName;//��Ʒ����
	private float stockSum;//�������
	private float processWeight;//�ӹ�����
	private float strageWeight;//�������
	private float branWeight;//��Ƥ����
	private Date date;//�ӹ�����
	private int evno;//�ӹ����
	
	
	public int getProcessId() {
		return processId;
	}
	public void setProcessId(int processId) {
		this.processId = processId;
	}
	public SystemUser getSystemUser() {
		return systemUser;
	}
	public void setSystemUser(SystemUser systemUser) {
		this.systemUser = systemUser;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public float getStockSum() {
		return stockSum;
	}
	public void setStockSum(float stockSum) {
		this.stockSum = stockSum;
	}
	public float getProcessWeight() {
		return processWeight;
	}
	public void setProcessWeight(float processWeight) {
		this.processWeight = processWeight;
	}
	public float getStrageWeight() {
		return strageWeight;
	}
	public void setStrageWeight(float strageWeight) {
		this.strageWeight = strageWeight;
	}
	public float getBranWeight() {
		return branWeight;
	}
	public void setBranWeight(float branWeight) {
		this.branWeight = branWeight;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getEvno() {
		return evno;
	}
	public void setEvno(int evno) {
		this.evno = evno;
	}
	

}
