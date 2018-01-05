package cn.sjzc.flour.dao;

import java.util.List;

import cn.sjzc.flour.pojo.ProductType;
import cn.sjzc.flour.pojo.SystemUser;

public interface ProductTypeDao {
	/**
	 * 查询所有产品
	 * @return
	 */
	public List<ProductType> findAll();
	
	/**
	 * 分页查询
	 * @param hql
	 * @param offset
	 * @param length
	 * @return
	 */
	public List<ProductType> queryForPage(String hql,int offset,int length);
	/**
	 * 总记录条数
	 * @param hql
	 * @return
	 */
	public int getCount(String hql);
	
	
	/**
	 * 添加产品
	 * @param type
	 */
	public void addProductType(ProductType type);
	
	/**
	 * 根据产品编号删除系统用户,可以删除一个，也可以批量删除
	 * @param typeId
	 */
	public void delProductType(int typeId);
	
	/**
	 * 修改产品
	 * @param productType
	 */
	public void updateProductType(ProductType productType);
	
	/**
	 * 根据typeId查询产品
	 * @param typeId
	 * @return
	 */
	public ProductType findByTypeId(int typeId);
}
