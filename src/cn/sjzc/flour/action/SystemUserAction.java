package cn.sjzc.flour.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.sjzc.flour.pojo.PageBean;
import cn.sjzc.flour.pojo.ProductType;
import cn.sjzc.flour.pojo.SystemUser;
import cn.sjzc.flour.service.SystemUserService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;
@Controller
@Scope("prototype")
public class SystemUserAction implements ModelDriven<SystemUser> {
	
	private SystemUser systemUser;
	@Resource
	private SystemUserService systemUserService;
	
	private int page;
	private PageBean pageBean;
	/**
	 * ��ѯ����ϵͳ�û�
	 * @return
	 */
	public String findAll(){
		List<SystemUser> systemUsers = systemUserService.findAll();
		
		//��systemUsers���Ϸŵ�valuestack��
		ActionContext.getContext().put("systemUsers", systemUsers);
		
		return "findAll";	
		
	}
	
	/**
	 * ʵ�ַ�ҳ��ѯ
	 * @return
	 */
	public String getPageList(){
		this.pageBean = systemUserService.queryForPage(4, page);
		return "systemuserList";
	}
	
	/**
	 * ���ϵͳ�û�
	 * @return
	 */
	public String addSystemUser(){
		
		systemUserService.addSystemUser(systemUser);
		
		return "add";		
	}
	
	/**
	 * ����ϵͳ�û��ı��ɾ��ϵͳ�û�
	 * @return
	 */
	public String delSystemUser(){
		
		systemUserService.delSystemUser(systemUser.getUserId());
		return "del";		
	}
	
	/**
	 * �༭������userId��ѯϵͳ�û�
	 * @return
	 */
	public String editSystemUser(){
		
		int userId = systemUser.getUserId();
		SystemUser systemUsers = systemUserService.findByUserId(userId);
		ActionContext.getContext().put("systemUser", systemUsers);
		
		return "edit";	
	}
	
	/**
	 * ����typeId��������
	 * @return
	 */
	public String updateSystemUser(){
		
		systemUserService.updateSystemUser(systemUser);
		return "update";
	
	}
	
	@Override
	public SystemUser getModel() {
		// TODO Auto-generated method stub
		if(systemUser == null){
			systemUser = new SystemUser();
		}
		return systemUser;
	}
	
	
	//getter��setter����
	public SystemUser getSystemUser() {
		return systemUser;
	}

	public void setSystemUser(SystemUser systemUser) {
		this.systemUser = systemUser;
	}

	public SystemUserService getSystemUserService() {
		return systemUserService;
	}

	public void setSystemUserService(SystemUserService systemUserService) {
		this.systemUserService = systemUserService;
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
