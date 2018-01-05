package cn.sjzc.flour.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import cn.sjzc.flour.dao.SystemUserDao;
import cn.sjzc.flour.pojo.PageBean;
import cn.sjzc.flour.pojo.ProductType;
import cn.sjzc.flour.pojo.SystemUser;
import cn.sjzc.flour.service.SystemUserService;
@Component("systemUserService")
public class SystemUserServiceImpl implements SystemUserService {
	@Resource
	private SystemUserDao systemUserDao;
	@Override
	public List<SystemUser> findAll() {
		// TODO Auto-generated method stub
		return systemUserDao.findAll();
	}

	@Override
	public void addSystemUser(SystemUser systemuser) {
		// TODO Auto-generated method stub
		systemUserDao.addSystemUser(systemuser);
	}

	@Override
	public void delSystemUser(int userId) {
		// TODO Auto-generated method stub
		systemUserDao.delSystemUser(userId);
	}

	@Override
	public SystemUser findByUserId(int userId) {
		// TODO Auto-generated method stub
		SystemUser systemUser = systemUserDao.findByUserId(userId);
		return systemUser;
	}

	@Override
	public void updateSystemUser(SystemUser systemUser) {
		// TODO Auto-generated method stub
		systemUserDao.updateSystemUser(systemUser);
	}

	@Override
	public PageBean queryForPage(int pageSize, int page) {
		// TODO Auto-generated method stub
		String hql = "select count(*) from SystemUser";
		int count = systemUserDao.getCount(hql); // �ܼ�¼��
		int totalPage = PageBean.countTotalPage(pageSize, count); // ��ҳ��
		int offset = PageBean.countOffset(pageSize, page); // ��ǰҳ��ʼ��¼
		int length = pageSize; // ÿҳ��¼��
		int currentPage = PageBean.countCurrentPage(page);
		List<SystemUser> list = systemUserDao.queryForPage("from SystemUser", offset, length); // �÷�ҳ�ļ�¼
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
	
	
	
	//getter��setter����
	public SystemUserDao getSystemUserDao() {
		return systemUserDao;
	}

	public void setSystemUserDao(SystemUserDao systemUserDao) {
		this.systemUserDao = systemUserDao;
	}

	
	
	
}
