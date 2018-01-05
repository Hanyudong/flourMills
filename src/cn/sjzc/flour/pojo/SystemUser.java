package cn.sjzc.flour.pojo;

import java.util.List;



/**
 * 
 * <p>Title: SystemUser </p>
 * <p>Description: 系统用户表 : 存储系统管理员的相关信息 </p>	
 * @author author
 * @date 2017年12月28日 下午2:31:50
 */
public class SystemUser {
	
	private int userId;//用户编号
	private String userName;//用户名称
	private String passWord;//用户密码
	private String initpwd;//初始密码
	private String realName;//真实姓名
	private String phone;//电话
	private int state;//用户状态（0：删除；1：正常）	
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getInitpwd() {
		return initpwd;
	}
	public void setInitpwd(String initpwd) {
		this.initpwd = initpwd;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}

	
	
}
