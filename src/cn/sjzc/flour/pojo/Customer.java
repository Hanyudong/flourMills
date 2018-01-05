package cn.sjzc.flour.pojo;


/**
 * 
 * <p>Title: Customer </p>
 * <p>Description:  客户信息表: 存储客户的相关信息 </p>	
 * @author author
 * @date 2017年12月28日 下午2:33:54
 */
public class Customer {
	private int customerId;//客户编号
	private String customerName;//客户姓名，企业姓名
	private String address;//客户联系地址
	private String idCard;//身份证机构代码号
	private String mobile;//移动电话
	private String landLine;//固定电话
	private int state;//客户状态
	
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getLandLine() {
		return landLine;
	}
	public void setLandLine(String landLine) {
		this.landLine = landLine;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	
	

}
