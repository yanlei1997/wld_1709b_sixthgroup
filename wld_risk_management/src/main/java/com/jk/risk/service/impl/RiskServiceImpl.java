package com.jk.risk.service.impl;

import java.util.List;















import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.jk.common.util.PageUtil;
import com.jk.risk.dao.RiskDao;
import com.jk.risk.service.RiskService;
/**
 * 
 * <pre>项目名称：风控页面订单列表查询    
 * 类名称：RiskServiceImpl    
 * 类描述：    
 * 创建人：王爽 cht_java@126.com    
 * 创建时间：2018年3月13日 上午10:47:37    
 * 修改人：王爽 cht_java@126.com  
 * 修改时间：2018年3月13日 上午10:47:37    
 * 修改备注：       
 * @version </pre>
 */
@Service
public class RiskServiceImpl implements RiskService {

	@Resource
	private RiskDao riskDao;

	@Override
	public PageUtil listrisk(PageUtil pageUtil, String name,String orderstatus) {
		
		
        pageUtil.setTotal(riskDao.querycount(name,orderstatus));
		
		pageUtil.setRows(riskDao.querylist(pageUtil.getStart(),pageUtil.getPageSize(),name,orderstatus));
		
		return pageUtil;
	}

	@Override
	public List listuserinfobyid(String userphone) {
	
		return riskDao.listuserinfobyid(userphone);
	}

	@Override
	public List listgongsibyuserid(String userphone) {
		
		return riskDao.listgongsibyuserid(userphone);
	}

	@Override
	public List listyinhangbyphone(String userid) {
		
		return riskDao.listyinhangbyphone(userid);
	}

	@Override
	public List listjiekuanbyid(String userphone) {
		
		return riskDao.listjiekuanbyid(userphone);
	}

	@Override
	public List listcarbyuserid(String userid) {
		
		return riskDao.listcarbyuserid(userid);
	}

	@Override
	public List listgongsibyuserphone(String userphone) {
		
		return riskDao.listgongsibyuserphone(userphone);
	}

	@Override
	public List listdanbaorenbyuserid(String userid) {
		
		return riskDao.listdanbaorenbyuserid(userid);
	}

	@Override
	public List listuseridbylianxi(String userid) {
		
		return riskDao.listuseridbylianxi(userid);
	}

	@Override
	public List listhousebyuserid(String userid) {

		return riskDao.listhousebyuserid(userid);
	}

	@Override
	public void updateshen(String userid, Integer ordershen, String orderstatus) {
		
		String sql="UPDATE t_order o "
				+ "SET o.ordershen= "+ordershen+" ,"
				+ "orderstatus= '"+orderstatus.trim()+"' "
				+ "WHERE o.userid='"+userid.trim()+"'";
		
		riskDao.updateshen(sql);
	}

}
