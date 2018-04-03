package com.jk.wld_order.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jk.common.util.PageUtil;
import com.jk.wld_order.dao.OrderDao;
import com.jk.wld_order.service.OrderService;

@Service
public class OrderServiceimpl  implements  OrderService{
     
	@Autowired
	private OrderDao orderdao;
	
	
	@Override
	public List queryorder() {
		
		
		return orderdao.queryorder();
	}


	@Override
	public PageUtil orderpage(PageUtil pageutil, Integer producttype, String zhanghao) {
		
		pageutil.setTotal(orderdao.getorderSum(producttype,zhanghao));
		
		pageutil.setRows(orderdao.getorderlist(pageutil.getStart(),pageutil.getPageSize(),producttype,zhanghao));
		
		
		return pageutil;
	}


	@Override
	public List queryinfoByinfoid(String userphone,String orderno) {
		
		
		return orderdao.queryinfoByinfoid(userphone,orderno);
	}


	@Override
	public List queryborrowByUserid(String userid) {
		
		return orderdao.queryborrowByUserid(userid);
	}


	@Override
	public List companylist(String userid1) {
		
		
		return orderdao.companylist(userid1);
	}


	@Override
	public List bankinglist(String useridbrank) {
		
		
		
		return orderdao.bankinglist(useridbrank);
	}


	@Override
	public List queryhouselist(String useridhouse) {
		
		
		
		 
	   List houselist =	 orderdao.queryhouselist(useridhouse);
	  
	   
	  
	   
	  
		 
		return  houselist ;
	}


	@Override
	public List carhouselist(String useridhouse) {
	
		return  orderdao.querycarlist(useridhouse);
	}


	@Override
	public List gongsilist(String useridhouse) {
		 List gongsilist  = orderdao.querygongsilist(useridhouse);
		
		return gongsilist;
	}


	@Override
	public List querypeoplelist(String useridhouse) {
		
		 List querypeoplelist  = orderdao.querypeoplelist(useridhouse);
					
		return querypeoplelist;
	}


	@Override
	public List queryguaranteelist(String useridhouse) {
		
		return orderdao.queryguaranteelist(useridhouse);
	}


	@Override
	public void updateorder(String orderno) {
	  
		orderdao.updateorder(orderno);
	}


	@Override
	public PageUtil dahuiorderlist(PageUtil pagedahui, String ordercause,
			String users) {

		pagedahui.setTotal(orderdao.getdahuiorder(ordercause,users));
		
		pagedahui.setRows(orderdao.getdahuiorderList(pagedahui.getStart(),pagedahui.getPageSize(),ordercause,users));
		return pagedahui;
	}


	



}
