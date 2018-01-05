package cn.sjzc.flour.dao;

import java.util.List;

import cn.sjzc.flour.pojo.Customer;
import cn.sjzc.flour.pojo.ProductType;


public interface CustomerDao {
	/**
	 * ��ѯ���пͻ�
	 * @return
	 */
	public List<Customer> findAll();
	
	/**
	 * ��ҳ��ѯ
	 * @param hql
	 * @param offset
	 * @param length
	 * @return
	 */
	public List<Customer> queryForPage(String hql,int offset,int length);
	/**
	 * �ܼ�¼����
	 * @param hql
	 * @return
	 */
	public int getCount(String hql);
	
	
	
	/**
	 * ��ӿͻ�
	 * @param customer
	 */
	public void addCustomer(Customer customer);
	
	/**
	 * ���ݿͻ����ɾ��ϵͳ�û�,����ɾ��һ����Ҳ��������ɾ��
	 * @param customerId
	 */
	public void delCustomer(int customerId);
	
	/**
	 * �޸Ŀͻ�
	 * @param customer
	 */
	public void updateCustomer(Customer customer);
	
	/**
	 * ����customerId��ѯ�ͻ�
	 * @param customerId
	 * @return
	 */
	public Customer findByCustomerId(int customerId);
}
