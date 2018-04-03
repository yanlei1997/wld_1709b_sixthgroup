package com.jk.channel.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.jk.channel.dao.ChannelDao;
import com.jk.channel.service.ChannelService;
import com.jk.common.entity.Channel;
import com.jk.common.util.PageUtil;

@Service
public class ChannelServiceImpl implements ChannelService{
	
	@Resource
	private ChannelDao channelDao;

	@Override
	public PageUtil queryChannel(PageUtil pageUtil, String cn) {
		
		
		pageUtil.setTotal(channelDao.queryChannelCount(cn));
		
		pageUtil.setRows(channelDao.queryChannelList(pageUtil.getStart(),pageUtil.getPageSize(),cn));
		
		return pageUtil;
	}

	@Override
	public List<Channel> upd(String id) {
		
		return channelDao.upd(id);
	}

	@Override
	public void updateChannel(Channel channel) {
		
		channelDao.updateChannel(channel);
	}

	@Override
	public void deleteChannel(String id) {
		
		channelDao.deleteChannel(id);
	}

	@Override
	public void addChannel(Channel channel) {
		
		System.out.println(channel+"*****************************************");
		
		channelDao.addChannel(channel);
	}

}
