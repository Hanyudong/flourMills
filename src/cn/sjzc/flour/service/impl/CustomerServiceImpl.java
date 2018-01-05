package cn.sjzc.flour.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.sun.org.apache.bcel.internal.generic.GETSTATIC;

import cn.sjzc.flour.dao.CustomerDao;
import cn.sjzc.flour.pojo.Customer;
import cn.sjzc.flour.pojo.PageBean;
import cn.sjzc.flour.pojo.ProductType;
import cn.sjzc.flour.service.CustomerService;
@Component("customerService")
public class CustomerServiceImpl implements CustomerService {
	@Resource
	private CustomerDao customerDao;
	@Override
	public List<Customer> findAll() {
		// TODO Auto-generated method stub
		return customerDao.findAll();
	}

	@Override
	public void addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		customerDao.addCustomer(customer);
	}

	@Override
	public void delCustomer(int customerId) {
		// TODO Auto-generated method stub
		customerDao.delCustomer(customerId);
	}

	@Override
	public Customer findByTypeId(int customerId) {
		// TODO Auto-generated method stub
		Customer customer = customerDao.findByCustomerId(customerId);
		return customer;
	}

	@Override
	public void updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		customerDao.updateCustomer(customer);
	}
		
	@Override
	public PageBean queryForPage(int pageSize, int page) {
		// TODO Auto-generated method stub
		String hql = "select count(*) from Customer";
		int count = customerDao.getCount(hql); // �ܼ�¼��
		int totalPage = PageBean.countTotalPage(pageSize, count); // ��ҳ��
		int offset = PageBean.countOffset(pageSize, page); // ��ǰҳ��ʼ��¼
		int length = pageSize; // ÿҳ��¼��
		int currentPage = PageBean.countCurrentPage(page);
		List<Customer> list = customerDao.queryForPage("from Customer", offset, length); // �÷�ҳ�ļ�¼
		// �ѷ�ҳ��Ϣ���浽Bean��
		PageBean pageBean = new PageBean();
		pageBean.setPageSize(pageSize);
		pageBean.setCurrentPage(currentPage);
		pageBean.setAllRow(count);
		pageBean.setTotalPage(totalPage);
		pageBean.setList(list);
		pageBean.init();
		return pageBean;
	}

	
	public CustomerDao getCustomerDao() {
		return customerDao;
	}

	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}

}
