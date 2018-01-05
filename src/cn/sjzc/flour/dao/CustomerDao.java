package cn.sjzc.flour.dao;

import java.util.List;

import cn.sjzc.flour.pojo.Customer;
import cn.sjzc.flour.pojo.ProductType;


public interface CustomerDao {
	/**
	 * 查询所有客户
	 * @return
	 */
	public List<Customer> findAll();
	
	/**
	 * 分页查询
	 * @param hql
	 * @param offset
	 * @param length
	 * @return
	 */
	public List<Customer> queryForPage(String hql,int offset,int length);
	/**
	 * 总记录条数
	 * @param hql
	 * @return
	 */
	public int getCount(String hql);
	
	
	
	/**
	 * 添加客户
	 * @param customer
	 */
	public void addCustomer(Customer customer);
	
	/**
	 * 根据客户编号删除系统用户,可以删除一个，也可以批量删除
	 * @param customerId
	 */
	public void delCustomer(int customerId);
	
	/**
	 * 修改客户
	 * @param customer
	 */
	public void updateCustomer(Customer customer);
	
	/**
	 * 根据customerId查询客户
	 * @param customerId
	 * @return
	 */
	public Customer findByCustomerId(int customerId);
}
