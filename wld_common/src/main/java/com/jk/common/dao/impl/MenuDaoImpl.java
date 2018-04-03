package com.jk.common.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.jk.common.dao.MenuDao;
import com.jk.common.entity.Menu;

@Repository
public class MenuDaoImpl implements MenuDao{
	
	@Resource
	private SessionFactory sessionFactory;

	@Override
	public List<Menu> queryMenu(int i) {
		
		String hql = "from Menu where pid = ?";
		
		Session session = sessionFactory.getCurrentSession();
		
		List<Menu> list = session.createQuery(hql).setParameter(0, i).list();
		
		return list;
	}

}
