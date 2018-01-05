package cn.sjzc.flour.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Component;

import cn.sjzc.flour.dao.SystemUserDao;
import cn.sjzc.flour.pojo.SystemUser;
@Component("systemUserDao")
public class SystemUserDaoImpl extends BaseDao implements SystemUserDao {

	@Override
	public List<SystemUser> findAll() {
		// TODO Auto-generated method stub
		String hql = "from SystemUser";
		
		return getSession().createQuery(hql).list();
	}

	@Override
	public void addSystemUser(SystemUser systemuser) {
		// TODO Auto-generated method stub
		SystemUser user = new SystemUser();
		user.setUserName(systemuser.getUserName());
		user.setRealName(systemuser.getRealName());
		user.setPhone(systemuser.getPhone());
		user.setInitpwd("123456");
		user.setState(1);
		
		getSession().save(user);
	}

	@Override
	public void delSystemUser(int userId) {
		// TODO Auto-generated method stub
		String hql = "delete SystemUser user where user.userId=?";
		getSession().createQuery(hql).setParameter(0, userId).executeUpdate();
	}

	@Override
	public void updateSystemUser(SystemUser systemUser) {
		// TODO Auto-generated method stub
		String hql = "update SystemUser suser set suser.userName=?,suser.passWord=?,suser.initpwd=?,suser.realName=?,suser.phone=? where suser.userId=?";
		getSession().createQuery(hql).setParameter(0, systemUser.getUserName())
									 .setParameter(1, systemUser.getPassWord())
									 .setParameter(2, systemUser.getInitpwd())									 
									 .setParameter(3, systemUser.getRealName())
									 .setParameter(4, systemUser.getPhone())
									 .setParameter(5, systemUser.getUserId())
									 .executeUpdate();
		
	}

	@Override
	public SystemUser findByUserId(int userId) {
		// TODO Auto-generated method stub
		SystemUser systemUser = (SystemUser) getSession().get(SystemUser.class, userId);
		return systemUser;
	}

	@Override
	public List<SystemUser> queryForPage(String hql, int offset, int length) {
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
