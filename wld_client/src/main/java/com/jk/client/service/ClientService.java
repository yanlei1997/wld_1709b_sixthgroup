package com.jk.client.service;

import java.util.List;

import com.jk.common.entity.Order;
import com.jk.common.entity.Userinfo;
import com.jk.common.util.PageUtil;

public interface ClientService {

	

    //客户详情中的订单记录查询

	PageUtil orderlist(PageUtil pageUtil);
   //客户列表
	PageUtil querycustomer(PageUtil pageUtil, String usern,String status);
  //黑名单客户
	PageUtil queryblacklist(PageUtil pageUtil, String usern);








}
