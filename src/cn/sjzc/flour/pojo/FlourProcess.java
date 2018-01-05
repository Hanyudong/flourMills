package cn.sjzc.flour.pojo;

import java.util.Date;

/**
 * 
 * <p>Title: FlourProcess </p>
 * <p>Description:   面粉加工表  </p>	
 * @author author
 * @date 2017年12月28日 下午2:41:15
 */
public class FlourProcess {
	private int processId;//加工表ID
	private SystemUser systemUser;//用户信息
	private String typeName;//产品名称
	private float stockSum;//库存重量
	private float processWeight;//加工重量
	private float strageWeight;//入库重量
	private float branWeight;//麸皮重量
	private Date date;//加工日期
	private int evno;//加工编号
	
	
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
