package com.jk.product.controller;

import javax.annotation.Resource;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import com.jk.common.base.BaseController;
import com.jk.common.util.PageUtil;
import com.jk.product.service.ProductService;

@Results(
		@Result(name="index",location="index.jsp")
		)
public class ProductController extends BaseController{
	
	@Resource
	private ProductService productService;
	
	private PageUtil pageUtil;
	
	private Integer page;
	
	private Integer rows;
	
	@Action("queryProduct")
	public void queryProduct(){
		
		pageUtil = new PageUtil(page, rows);
		
		pageUtil = productService.queryProduct(pageUtil);
		
		toJson(pageUtil);
		
	}

	public PageUtil getPageUtil() {
		return pageUtil;
	}

	public void setPageUtil(PageUtil pageUtil) {
		this.pageUtil = pageUtil;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}
	
	

}
