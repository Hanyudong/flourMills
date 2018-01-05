package cn.sjzc.flour.dao;

import java.util.List;

import cn.sjzc.flour.pojo.SystemUser;

public interface SystemUserDao {
	/**
	 * 查询所有系统用户
	 * @return
	 */
	public List<SystemUser> findAll();
	
	/**
	 * 分页查询
	 * @param hql
	 * @param offset
	 * @param length
	 * @return
	 */
	public List<SystemUser> queryForPage(String hql,int offset,int length);
	/**
	 * 总记录条数
	 * @param hql
	 * @return
	 */
	public int getCount(String hql);
	
	/**
	 * 添加系统用户
	 * @param systemuser
	 */
	public void addSystemUser(SystemUser systemuser);
	
	/**
	 * 根据系统用户编号删除系统用户,可以删除一个，也可以批量删除
	 * @param userId
	 */
	public void delSystemUser(int userId);
	
	/**
	 * 修改系统用户
	 * @param systemUser
	 */
	public void updateSystemUser(SystemUser systemUser);
	
	/**
	 * 根据userId查询系统用户
	 * @param userId
	 * @return
	 */
	public SystemUser findByUserId(int userId);
}
