package cn.sjzc.flour.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.sjzc.flour.pojo.Customer;
import cn.sjzc.flour.pojo.PageBean;
import cn.sjzc.flour.pojo.ProductType;
import cn.sjzc.flour.service.CustomerService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;
@Controller
@Scope("prototype")
public class CustomerAction implements ModelDriven<Customer> {
	
	private Customer customer;
	@Resource
	private CustomerService customerService;
	
	private int page;
	private PageBean pageBean;
	/**
	 * ��ѯ���пͻ�
	 * @return
	 */
	public String findAll(){
		List<Customer> customers = customerService.findAll();
		
		//��systemUsers���Ϸŵ�valuestack��
		ActionContext.getContext().put("customers", customers);
		
		return "findAll";		
	}
	
	/**
	 * ʵ�ַ�ҳ��ѯ
	 * @return
	 */
	public String getPageList(){
		this.pageBean = customerService.queryForPage(4, page);
		return "customerList";
	}
	
	/**
	 * ��ӿͻ�
	 * @return
	 */
	public String addCustomer(){
		
		customerService.addCustomer(customer);
		
		return "add";		
	}
	
	/**
	 * ���ݿͻ��ı��ɾ���ͻ�
	 * @return
	 */
	public String delCustomer(){
		
		customerService.delCustomer(customer.getCustomerId());
		return "del";		
	}
	
	/**
	 * �༭������customerId��ѯ�ͻ�
	 * @return
	 */
	public String editCustomer(){
		
		int customerId = customer.getCustomerId();
		Customer customers = customerService.findByTypeId(customerId);
		ActionContext.getContext().put("customer", customers);
		
		return "edit";	
	}
	
	/**
	 * ����customerId��������
	 * @return
	 */
	public String updateCustomer(){
		
		customerService.updateCustomer(customer);
		return "update";
	
	}
	
	
	@Override
	public Customer getModel() {
		// TODO Auto-generated method stub
		if(customer == null){
			customer = new Customer();
		}
		return customer;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public CustomerService getCustomerService() {
		return customerService;
	}
	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public PageBean getPageBean() {
		return pageBean;
	}

	public void setPageBean(PageBean pageBean) {
		this.pageBean = pageBean;
	}
	
	
}
