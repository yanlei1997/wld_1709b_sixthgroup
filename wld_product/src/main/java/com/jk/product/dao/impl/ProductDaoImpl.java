package com.jk.product.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.jk.product.dao.ProductDao;

@Repository
public class ProductDaoImpl implements ProductDao{
	
	@Resource
	private SessionFactory sessionFactory;

	@Override
	public Integer queryProductCount() {
		
		String hql = "select count(1) from Product";
		
		Session session = sessionFactory.getCurrentSession();
		
		return Integer.parseInt(session.createQuery(hql).uniqueResult()+"");
	}

	@Override
	public List queryProductList(Integer start, Integer pageSize) {
		
		String hql = "from Product";
		
		Session session = sessionFactory.getCurrentSession();
		
		List list = session.createQuery(hql).list();
		
		System.out.println(list+"***********************");
		
		return list;
	}

}
