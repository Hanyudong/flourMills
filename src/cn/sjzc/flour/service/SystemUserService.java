package cn.sjzc.flour.service;

import java.util.List;

import cn.sjzc.flour.pojo.PageBean;
import cn.sjzc.flour.pojo.SystemUser;

public interface SystemUserService {
	/**
	 * ��ѯ����ϵͳ�û�
	 * @return
	 */
	public List<SystemUser> findAll();
	
	/**
	 * ��ҳ��ѯ
	 * @param pageSize
	 * @param currentPage
	 * @return
	 */
	public PageBean queryForPage(int pageSize,int currentPage);
	
	/**
	 * ���ϵͳ�û�
	 * @param systemuser
	 */
	public void addSystemUser(SystemUser systemuser);
	
	/**
	 * ����ϵͳ�û����ɾ��ϵͳ�û�,����ɾ��һ����Ҳ��������ɾ��
	 * @param userId
	 */
	public void delSystemUser(int userId);
	
	/**
	 * ����userId��ѯϵͳ�û�
	 * @param userId
	 * @return
	 */
	public SystemUser findByUserId(int userId);
	
	/**
	 * ����typeId��������
	 * @param systemUser
	 */
	public void updateSystemUser(SystemUser systemUser);
}
