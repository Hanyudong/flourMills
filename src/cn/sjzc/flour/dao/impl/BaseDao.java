package cn.sjzc.flour.dao.impl;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

public class BaseDao {
	@Resource
	protected SessionFactory sessionfactory;
	
	protected Session getSession(){
		return sessionfactory.getCurrentSession();
		
	}
	
}
