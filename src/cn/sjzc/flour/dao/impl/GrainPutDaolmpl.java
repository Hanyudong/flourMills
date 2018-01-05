package cn.sjzc.flour.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import cn.sjzc.flour.dao.GrainPutDao;
import cn.sjzc.flour.pojo.GrainPut;
import cn.sjzc.flour.pojo.Voucher;
@Repository
public class GrainPutDaolmpl implements GrainPutDao {
	@Resource
	private SessionFactory sessionFactory;
	

	
	//查询所有user对象并返回
		@SuppressWarnings("unchecked")
		public List<GrainPut> findAll() {
			
			String hql = "from GrainPut";
			List<GrainPut> grainput = sessionFactory.getCurrentSession().createQuery(hql).list();
			
			return grainput;
			
		}
	
	
	public void addGrainput(GrainPut grainput){
		System.out.println("向数据库添加grainbuy对象。。。。。");
		sessionFactory.getCurrentSession().save(grainput);	
	}
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	public void addVoucher(Voucher voucher){
		System.out.println("向数据库添加voucher对象。。。。。");
		sessionFactory.getCurrentSession().save(voucher);
		
	}
	public void addGrainPut(GrainPut grainput) {
		// TODO Auto-generated method stub
		
	}
	
}
