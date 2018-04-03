package com.jk.wld_order.dao;

import java.util.List;



public interface OrderDao {


	List queryorder();

	Integer getorderSum(Integer producttype, String zhanghao);

	List getorderlist(Integer start, Integer pageSize, Integer producttype, String zhanghao);

	List queryinfoByinfoid(String userphone,String orderno);

	List queryborrowByUserid(String userid);

	List companylist(String userid1);

	List bankinglist(String useridbrank);

	List queryhouselist(String useridhouse);

	List querycarlist(String useridhouse);

	List querygongsilist(String useridhouse);

	List querypeoplelist(String useridhouse);

	List queryguaranteelist(String useridhouse);

	void updateorder(String orderno);

	Integer getdahuiorder(String ordercause, String users);

	List getdahuiorderList(Integer start, Integer pageSize, String ordercause,
			String users);

	
      
	
	

}
