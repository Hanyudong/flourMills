package cn.sjzc.flour.dao;

import java.util.List;

import cn.sjzc.flour.pojo.ProductType;
import cn.sjzc.flour.pojo.SystemUser;

public interface ProductTypeDao {
	/**
	 * ��ѯ���в�Ʒ
	 * @return
	 */
	public List<ProductType> findAll();
	
	/**
	 * ��ҳ��ѯ
	 * @param hql
	 * @param offset
	 * @param length
	 * @return
	 */
	public List<ProductType> queryForPage(String hql,int offset,int length);
	/**
	 * �ܼ�¼����
	 * @param hql
	 * @return
	 */
	public int getCount(String hql);
	
	
	/**
	 * ��Ӳ�Ʒ
	 * @param type
	 */
	public void addProductType(ProductType type);
	
	/**
	 * ���ݲ�Ʒ���ɾ��ϵͳ�û�,����ɾ��һ����Ҳ��������ɾ��
	 * @param typeId
	 */
	public void delProductType(int typeId);
	
	/**
	 * �޸Ĳ�Ʒ
	 * @param productType
	 */
	public void updateProductType(ProductType productType);
	
	/**
	 * ����typeId��ѯ��Ʒ
	 * @param typeId
	 * @return
	 */
	public ProductType findByTypeId(int typeId);
}
