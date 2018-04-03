package com.jk.wld_order.service;

import java.util.List;

import com.jk.common.util.PageUtil;

/**
 * 
 * @author Damon
 *
 */

public interface OrderService {

	List queryorder();

	PageUtil orderpage(PageUtil pageutil, Integer producttype, String zhanghao);

	List queryinfoByinfoid(String userphone,String orderno);

	List queryborrowByUserid(String userid);

	List companylist(String userid1);

	List bankinglist(String useridbrank);

	List queryhouselist(String useridhouse);

	List carhouselist(String useridhouse);

	List gongsilist(String useridhouse);

	List querypeoplelist(String useridhouse);

	List queryguaranteelist(String useridhouse);

	void updateorder(String orderno);

	PageUtil dahuiorderlist(PageUtil pagedahui, String ordercause, String users);

	

}
