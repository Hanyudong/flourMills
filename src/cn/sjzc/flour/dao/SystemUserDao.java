package cn.sjzc.flour.dao;

import java.util.List;

import cn.sjzc.flour.pojo.SystemUser;

public interface SystemUserDao {
	/**
	 * ��ѯ����ϵͳ�û�
	 * @return
	 */
	public List<SystemUser> findAll();
	
	/**
	 * ��ҳ��ѯ
	 * @param hql
	 * @param offset
	 * @param length
	 * @return
	 */
	public List<SystemUser> queryForPage(String hql,int offset,int length);
	/**
	 * �ܼ�¼����
	 * @param hql
	 * @return
	 */
	public int getCount(String hql);
	
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
	 * �޸�ϵͳ�û�
	 * @param systemUser
	 */
	public void updateSystemUser(SystemUser systemUser);
	
	/**
	 * ����userId��ѯϵͳ�û�
	 * @param userId
	 * @return
	 */
	public SystemUser findByUserId(int userId);
}
