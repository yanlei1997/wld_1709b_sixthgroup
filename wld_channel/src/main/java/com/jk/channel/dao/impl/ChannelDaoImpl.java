package com.jk.channel.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.jk.channel.dao.ChannelDao;
import com.jk.common.entity.Channel;

@Repository
public class ChannelDaoImpl implements ChannelDao{
	
	@Resource
	private SessionFactory sessionFactory;

	@Override
	public Integer queryChannelCount(String cn) {
		
		String hql = "select count(1) from Channel where 1=1";
		
		if(cn!=null && cn.trim()!=""){
			
			hql += "and companyname like '%"+cn+"%' or channelid = '"+cn+"'";
		}
		
		Session session = sessionFactory.getCurrentSession();
		
		return Integer.parseInt(session.createQuery(hql).uniqueResult()+"");
	}

	@Override
	public List queryChannelList(Integer start, Integer pageSize, String cn) {
		
		String hql = "from Channel where 1=1";
		
		if(cn!=null && cn.trim()!=""){
			
			hql += "and companyname like '%"+cn+"%' or channelid = '"+cn+"'";
		}
		
		Session session = sessionFactory.getCurrentSession();
		
		List list = session.createQuery(hql).setFirstResult(start).setMaxResults(pageSize).list();
		
		return list;
	}

	@Override
	public List<Channel> upd(String id) {
		
		String hql = "from Channel where id=?";
		
		Session session = sessionFactory.getCurrentSession();
		
		List list = session.createQuery(hql).setParameter(0, id).list();
		
		return list;
	}

	@Override
	public void updateChannel(Channel channel) {
		
		Session session = sessionFactory.getCurrentSession();
		
		session.update(channel);
	}

	@Override
	public void deleteChannel(String id) {
		
		String hql = "delete Channel where id = ?";
		
		Session session = sessionFactory.getCurrentSession();
		
		Query query = session.createQuery(hql).setParameter(0, id);
		
		query.executeUpdate();
	}

	@Override
	public void addChannel(Channel channel) {
		
		Session session = sessionFactory.getCurrentSession();
		
		session.save(channel);
	}

}
