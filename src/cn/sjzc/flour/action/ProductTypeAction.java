package cn.sjzc.flour.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.sjzc.flour.pojo.PageBean;
import cn.sjzc.flour.pojo.ProductType;
import cn.sjzc.flour.service.ProductTypeService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;
@Controller
@Scope("prototype")
public class ProductTypeAction implements ModelDriven<ProductType> {
	
	private ProductType productType;
	@Resource
	private ProductTypeService productTypeService;
	
	private int page;
	private PageBean pageBean;
	/**
	 * 查询所有产品
	 * @return
	 */
	public String findAll(){
		List<ProductType> productTypes = productTypeService.findAll();
		
		//将systemUsers集合放到valuestack中
		ActionContext.getContext().put("productTypes", productTypes);
		
		return "findAll";		
	}
	
	/**
	 * 实现分页查询
	 * @return
	 */
	public String getPageList(){
		this.pageBean = productTypeService.queryForPage(4, page);
		return "producttypeList";
	}
	
	/**
	 * 添加产品
	 * @return
	 */
	public String addProductType(){
		
		productTypeService.addProductType(productType);
		
		return "add";		
	}
	
	/**
	 * 根据产品的编号删除产品
	 * @return
	 */
	public String delProductType(){
		
		productTypeService.delProductType(productType.getTypeId());
		return "del";		
	}
	
	/**
	 * 编辑，根据typeId查询产品
	 * @return
	 */
	public String editProductType(){
		
		int typeId = productType.getTypeId();
		ProductType products = productTypeService.findByTypeId(typeId);
		ActionContext.getContext().put("product", products);
		
		return "edit";	
	}
	
	/**
	 * 根据typeId更新数据
	 * @return
	 */
	public String updateProductType(){
		
		productTypeService.updateProductType(productType);
		return "update";
	
	}
	
	@Override
	public ProductType getModel() {
		// TODO Auto-generated method stub
		if(productType == null){
			productType = new ProductType();
		}
		return productType;
	}
	//getter、setter方法

	public ProductType getProductType() {
		return productType;
	}

	public void setProductType(ProductType productType) {
		this.productType = productType;
	}

	public ProductTypeService getProductTypeService() {
		return productTypeService;
	}

	public void setProductTypeService(ProductTypeService productTypeService) {
		this.productTypeService = productTypeService;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public PageBean getPageBean() {
		return pageBean;
	}

	public void setPageBean(PageBean pageBean) {
		this.pageBean = pageBean;
	}

}
