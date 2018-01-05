package cn.sjzc.flour.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Component;

import cn.sjzc.flour.dao.ProductTypeDao;
import cn.sjzc.flour.pojo.ProductType;
import cn.sjzc.flour.pojo.SystemUser;
@Component("productTypeDao")
public class ProductTypeDaoImpl extends BaseDao implements ProductTypeDao {

	@Override
	public List<ProductType> findAll() {
		// TODO Auto-generated method stub
		String hql = "from ProductType";
		
		return getSession().createQuery(hql).list();
	}

	@Override
	public void addProductType(ProductType type) {
		// TODO Auto-generated method stub
		ProductType productType = new ProductType();
		productType.setTypeName(type.getTypeName());
		productType.setProductName("Ãæ·Û");
		productType.setRate(type.getRate());
		productType.setState(1);
		
		getSession().save(productType);
	}

	@Override
	public void delProductType(int typeId) {
		// TODO Auto-generated method stub
		String hql = "delete ProductType product where product.typeId = ?";
		getSession().createQuery(hql).setParameter(0, typeId).executeUpdate();
	}

	@Override
	public void updateProductType(ProductType productType) {
		// TODO Auto-generated method stub
		String hql = "update ProductType ptype set ptype.typeName = ?,ptype.rate = ? where ptype.typeId = ?";
		getSession().createQuery(hql).setParameter(0, productType.getTypeName())
									 .setParameter(1, productType.getRate())
									 .setParameter(2, productType.getTypeId()).executeUpdate();
	}

	@Override
	public ProductType findByTypeId(int typeId) {
		// TODO Auto-generated method stub
		ProductType productType = (ProductType) getSession().get(ProductType.class, typeId);
		return productType;
	}

	@Override
	public List<ProductType> queryForPage(String hql, int offset, int length) {
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
