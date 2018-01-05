package cn.sjzc.flour.service;

import java.util.List;

import cn.sjzc.flour.pojo.Customer;
import cn.sjzc.flour.pojo.PageBean;

public interface CustomerService {
	/**
	 * ��ѯ���пͻ�
	 * @return
	 */
	public List<Customer> findAll();
	
	/**
	 * ��ҳ��ѯ
	 * @param pageSize
	 * @param currentPage
	 * @return
	 */
	public PageBean queryForPage(int pageSize,int currentPage);
	
	
	
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
	 * ����customerId��ѯ�ͻ�
	 * @param customerId
	 * @return
	 */
	public Customer findByTypeId(int customerId);
	
	/**
	 * ����customerId��������
	 * @param customer
	 */
	public void updateCustomer(Customer customer);
}
