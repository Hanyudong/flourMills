package cn.sjzc.flour.service;

import java.util.List;

import cn.sjzc.flour.pojo.PageBean;
import cn.sjzc.flour.pojo.ProductType;

public interface ProductTypeService {
	/**
	 * 查询所有产品
	 * @return
	 */
	public List<ProductType> findAll();
	
	/**
	 * 分页查询
	 * @param pageSize
	 * @param currentPage
	 * @return
	 */
	public PageBean queryForPage(int pageSize,int currentPage);
	
	
	/**
	 * 添加产品
	 * @param product
	 */
	public void addProductType(ProductType product);
	
	/**
	 * 根据产品编号删除系统用户,可以删除一个，也可以批量删除
	 * @param typeId
	 */
	public void delProductType(int typeId);
	
	/**
	 * 根据typeId查询产品
	 * @param typeId
	 * @return
	 */
	public ProductType findByTypeId(int typeId);
	
	/**
	 * 根据typeId更新数据
	 * @param product
	 */
	public void updateProductType(ProductType product);
}
