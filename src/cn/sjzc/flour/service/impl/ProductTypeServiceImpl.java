package cn.sjzc.flour.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import cn.sjzc.flour.dao.ProductTypeDao;
import cn.sjzc.flour.pojo.PageBean;
import cn.sjzc.flour.pojo.ProductType;
import cn.sjzc.flour.pojo.SystemUser;
import cn.sjzc.flour.service.ProductTypeService;
@Component("productTypeService")
public class ProductTypeServiceImpl implements ProductTypeService {
	@Resource
	private ProductTypeDao productTypeDao;
	@Override
	public List<ProductType> findAll() {
		// TODO Auto-generated method stub
		return productTypeDao.findAll();
	}

	@Override
	public void addProductType(ProductType product) {
		// TODO Auto-generated method stub
		productTypeDao.addProductType(product);
	}

	@Override
	public void delProductType(int typeId) {
		// TODO Auto-generated method stub
		productTypeDao.delProductType(typeId);
	}

	@Override
	public ProductType findByTypeId(int typeId) {
		// TODO Auto-generated method stub
		ProductType productType = productTypeDao.findByTypeId(typeId);
		return productType;
	}

	@Override
	public void updateProductType(ProductType product) {
		// TODO Auto-generated method stub
		productTypeDao.updateProductType(product);
	}
	
	@Override
	public PageBean queryForPage(int pageSize, int page) {
		// TODO Auto-generated method stub
		String hql = "select count(*) from ProductType";
		int count = productTypeDao.getCount(hql); // �ܼ�¼��
		int totalPage = PageBean.countTotalPage(pageSize, count); // ��ҳ��
		int offset = PageBean.countOffset(pageSize, page); // ��ǰҳ��ʼ��¼
		int length = pageSize; // ÿҳ��¼��
		int currentPage = PageBean.countCurrentPage(page);
		List<ProductType> list = productTypeDao.queryForPage("from ProductType", offset, length); // �÷�ҳ�ļ�¼
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
	public ProductTypeDao getProductTypeDao() {
		return productTypeDao;
	}

	public void setProductTypeDao(ProductTypeDao productTypeDao) {
		this.productTypeDao = productTypeDao;
	}

	
	
	
}
