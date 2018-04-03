package com.jk.common.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.jk.common.dao.MenuDao;
import com.jk.common.entity.Menu;
import com.jk.common.service.MenuService;

@Service
public class MenuServiceImpl implements MenuService{
	
	@Resource
	private MenuDao menuDao;

	/**
	 * 查询一级菜单
	 */
	@Override
	public List<Menu> queryMenu() {
		
		//查询一级菜单
		List<Menu> firstMenu = menuDao.queryMenu(0);
		//查询一级菜单的子菜单
		recursionMenu(firstMenu);
		
		return firstMenu;
	}
	
	/**
	 * 递归查询子菜单
	 * @param firstMenu 
	 */
	
	public void recursionMenu(List<Menu> firstMenu){
		
		for (Menu menu : firstMenu) {

			// 查询菜单是否有子菜单
			List<Menu> menuList2 = menuDao.queryMenu(menu.getId());

			if (menuList2.size() > 0) {

				menu.setChildren(menuList2);

				recursionMenu(menuList2);
			}

		}
	}

}
