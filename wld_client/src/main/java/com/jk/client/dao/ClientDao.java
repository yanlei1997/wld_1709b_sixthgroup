package com.jk.client.dao;

import java.util.List;

import com.jk.common.entity.Order;
import com.jk.common.entity.Userinfo;

public interface ClientDao {



	Integer getcountorder();

	List orderlist(Integer start, Integer pageSize);

	Integer getcountcustomer(String usern,String status);

	List querycustomer(Integer start, Integer pageSize, String usern,String status);

	Integer getcountblack(String usern);

	List queryblacklist(Integer start, Integer pageSize, String usern);




}
