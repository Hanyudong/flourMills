package cn.sjzc.flour.service;

import java.util.List;

import cn.sjzc.flour.pojo.PageBean;
import cn.sjzc.flour.pojo.ProductType;

public interface ProductTypeService {
	/**
	 * ��ѯ���в�Ʒ
	 * @return
	 */
	public List<ProductType> findAll();
	
	/**
	 * ��ҳ��ѯ
	 * @param pageSize
	 * @param currentPage
	 * @return
	 */
	public PageBean queryForPage(int pageSize,int currentPage);
	
	
	/**
	 * ��Ӳ�Ʒ
	 * @param product
	 */
	public void addProductType(ProductType product);
	
	/**
	 * ���ݲ�Ʒ���ɾ��ϵͳ�û�,����ɾ��һ����Ҳ��������ɾ��
	 * @param typeId
	 */
	public void delProductType(int typeId);
	
	/**
	 * ����typeId��ѯ��Ʒ
	 * @param typeId
	 * @return
	 */
	public ProductType findByTypeId(int typeId);
	
	/**
	 * ����typeId��������
	 * @param product
	 */
	public void updateProductType(ProductType product);
}
