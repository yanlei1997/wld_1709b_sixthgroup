package com.jk.product.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.jk.common.util.PageUtil;
import com.jk.product.dao.ProductDao;
import com.jk.product.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Resource
	private ProductDao productDao;

	@Override
	public PageUtil queryProduct(PageUtil pageUtil) {
		
		pageUtil.setTotal(productDao.queryProductCount());
		
		pageUtil.setRows(productDao.queryProductList(pageUtil.getStart(),pageUtil.getPageSize()));
		
		return pageUtil;
	}

}
