package com.jk.client.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.jk.client.dao.ClientDao;
import com.jk.client.service.ClientService;
import com.jk.common.entity.Order;
import com.jk.common.entity.User;
import com.jk.common.entity.Userinfo;
import com.jk.common.util.PageUtil;
@Service
public class ClientServiceImpl implements ClientService{

	@Resource
	private ClientDao clientDao;
	


	@Override
	public PageUtil orderlist(PageUtil pageUtil) {

		pageUtil.setTotal(clientDao.getcountorder());
		
		pageUtil.setRows(clientDao.orderlist(pageUtil.getStart(),pageUtil.getPageSize()));

		
		return pageUtil;
	}



	@Override
	public PageUtil querycustomer(PageUtil pageUtil, String usern,String status) {

        pageUtil.setTotal(clientDao.getcountcustomer(usern,status));
		
		pageUtil.setRows(clientDao.querycustomer(pageUtil.getStart(),pageUtil.getPageSize(),usern,status));

		
		return pageUtil;
	}


	@Override
	public PageUtil queryblacklist(PageUtil pageUtil, String usern) {

		    pageUtil.setTotal(clientDao.getcountblack(usern));
			
			pageUtil.setRows(clientDao.queryblacklist(pageUtil.getStart(),pageUtil.getPageSize(),usern));

			
			return pageUtil;
	}
	


	

}
