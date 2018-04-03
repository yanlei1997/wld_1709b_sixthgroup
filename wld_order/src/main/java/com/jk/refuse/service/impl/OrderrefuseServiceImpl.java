package com.jk.refuse.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.jk.common.util.PageUtil;
import com.jk.refuse.dao.OrderrefuseDao;
import com.jk.refuse.service.OrderrefuseService;
@Service
public class OrderrefuseServiceImpl implements OrderrefuseService{

	@Resource
	private OrderrefuseDao orderrefuseDao;
	
	@Override
	public PageUtil orderrefuse(PageUtil pageUtil, String serachname) {
		
		pageUtil.setTotal(orderrefuseDao.orderrefusesum(serachname));
		
		pageUtil.setRows(orderrefuseDao.orderrefuselist(pageUtil.getStart(),pageUtil.getPageSize(),serachname));
		
		return pageUtil;
	}

	@Override
	public List queryorderuseranduserinfobyphone(String userphone) {
	
		return orderrefuseDao.queryorderuseranduserinfobyphone(userphone);
	}

	@Override
	public List orderrefuseborrow(String userphone) {
		
		return orderrefuseDao.orderrefuseborrow(userphone);
	}

	@Override
	public List orderrefusegongsi(String userphone) {
		
		return orderrefuseDao.orderrefusegongsi(userphone);
	}

	@Override
	public List orderrefusebrankcard(String userphone) {
		
		return orderrefuseDao.orderrefusebrankcard(userphone);
	}

	@Override
	public List orderrefusezichan(String userphone) {

		return orderrefuseDao.orderrefusezichan(userphone);
	}

	@Override
	public List orderrefusedanbao(String userphone) {

		return orderrefuseDao.orderrefusedanbao(userphone);
	}

	
}
