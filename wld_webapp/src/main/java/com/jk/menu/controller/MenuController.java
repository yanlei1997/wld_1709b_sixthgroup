package com.jk.menu.controller;

import java.util.List;

import javax.annotation.Resource;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import com.jk.common.base.BaseController;
import com.jk.common.entity.Menu;
import com.jk.common.service.MenuService;

@Results(
		@Result(name="index",location="tree.jsp")
		)
public class MenuController extends BaseController{

	@Resource
	private MenuService menuService;
	
	private List<Menu> list;
	
	@Action("queryMenu")
	public void queryMenu(){
		
		list = menuService.queryMenu();
		
		System.out.println(list+"*******************");
		
		toJson(list);
	}
	
}
