package cn.sjzc.flour.service;

import java.util.List;

import cn.sjzc.flour.pojo.Customer;
import cn.sjzc.flour.pojo.PageBean;

public interface CustomerService {
	/**
	 * 查询所有客户
	 * @return
	 */
	public List<Customer> findAll();
	
	/**
	 * 分页查询
	 * @param pageSize
	 * @param currentPage
	 * @return
	 */
	public PageBean queryForPage(int pageSize,int currentPage);
	
	
	
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
	 * 根据customerId查询客户
	 * @param customerId
	 * @return
	 */
	public Customer findByTypeId(int customerId);
	
	/**
	 * 根据customerId更新数据
	 * @param customer
	 */
	public void updateCustomer(Customer customer);
}
