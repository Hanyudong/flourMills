package cn.sjzc.flour.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Component;

import cn.sjzc.flour.dao.CustomerDao;
import cn.sjzc.flour.pojo.Customer;
@Component("customerDao")
public class CustomerDaoImpl extends BaseDao implements CustomerDao {

	@Override
	public List<Customer> findAll() {
		// TODO Auto-generated method stub
		String hql = "from Customer";
		return getSession().createQuery(hql).list();
	}

	@Override
	public void addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		Customer customers = new Customer();
		customers.setCustomerName(customer.getCustomerName());
		customers.setAddress(customer.getAddress());
		customers.setIdCard(customer.getIdCard());
		customers.setMobile(customer.getMobile());
		customers.setLandLine(customer.getLandLine());
		customers.setState(1);
		 
		getSession().save(customers);
	}

	@Override
	public void delCustomer(int customerId) {
		// TODO Auto-generated method stub
		String hql = "delete Customer cus where cus.customerId = ?";
		getSession().createQuery(hql).setParameter(0, customerId).executeUpdate();
	}

	@Override
	public void updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		String hql = "update Customer cus set cus.customerName=?,cus.address=?,cus.idCard=?,cus.mobile=?,cus.landLine=? where cus.customerId=?";
		getSession().createQuery(hql).setParameter(0, customer.getCustomerName())
									 .setParameter(1, customer.getAddress())
									 .setParameter(2, customer.getIdCard())
									 .setParameter(3, customer.getMobile())
									 .setParameter(4, customer.getLandLine())
									 .setParameter(5, customer.getCustomerId())
									 .executeUpdate();
		
	}

	@Override
	public Customer findByCustomerId(int customerId) {
		// TODO Auto-generated method stub
		Customer customer = (Customer) getSession().get(Customer.class, customerId);
		return customer;
	}

	@Override
	public List<Customer> queryForPage(String hql, int offset, int length) {
		// TODO Auto-generated method stub
		Query q = getSession().createQuery(hql);
		q.setFirstResult(offset);
		q.setMaxResults(length);
		return q.list();
	}

	@Override
	public int getCount(String hql) {
		// TODO Auto-generated method stub
		Query q = getSession().createQuery(hql);
		return Integer.parseInt(q.list().get(0).toString());
	}

}
