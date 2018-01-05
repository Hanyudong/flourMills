package cn.sjzc.flour.service;

import java.util.List;

import cn.sjzc.flour.pojo.PageBean;
import cn.sjzc.flour.pojo.SystemUser;

public interface SystemUserService {
	/**
	 * 查询所有系统用户
	 * @return
	 */
	public List<SystemUser> findAll();
	
	/**
	 * 分页查询
	 * @param pageSize
	 * @param currentPage
	 * @return
	 */
	public PageBean queryForPage(int pageSize,int currentPage);
	
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
	 * 根据userId查询系统用户
	 * @param userId
	 * @return
	 */
	public SystemUser findByUserId(int userId);
	
	/**
	 * 根据typeId更新数据
	 * @param systemUser
	 */
	public void updateSystemUser(SystemUser systemUser);
}
