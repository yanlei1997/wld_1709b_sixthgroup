package com.jk.risk.controller;

import java.util.List;

import javax.annotation.Resource;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;
import org.apache.struts2.convention.annotation.Results;

import com.jk.common.base.BaseController;
import com.jk.common.util.PageUtil;
import com.jk.risk.service.RiskService;

@Results(
		@Result(name="list",location="list.jsp")
	)

@ResultPath("/risk")
public class RiskController extends BaseController  {

	@Resource
	private  RiskService riskService;
	
	//每页条数
	private Integer  rows;
	//当前页
	private Integer page;
	
	private PageUtil pageUtil;
	//条件查询根据订单编号
	private String name;
	//条件查询根据订单状态
	private String orderstatus;
    //客户信息中  基本信息查询传参
	private  String userphone;
	
	private String userid;
	
	private List listgongsi;
	
	private Integer ordershen;
	
	private List list;

	/**
	 * <pre>listrisk(风控管理订单查询 分页和条件查询)   
	 * 创建人：王爽 cht_java@126.com     
	 * 创建时间：2018年3月12日 下午9:22:44    
	 * 修改人：王爽 cht_java@126.com      
	 * 修改时间：2018年3月12日 下午9:22:44    
	 * 修改备注： 
	 * @return</pre>
	 */
	@Action("listrisk")
	public void listrisk(){
		

		pageUtil=new PageUtil(page, rows);
		
		pageUtil=riskService.listrisk(pageUtil,name,orderstatus);
		
		toJson(pageUtil);
  
	}
/**
 * <pre>listuserinfobyid(风控管理订单查询 初审页面     用户基本信息查询)   
 * 创建人：王爽 cht_java@126.com     
 * 创建时间：2018年3月14日 下午10:06:14    
 * 修改人：王爽 cht_java@126.com      
 * 修改时间：2018年3月14日 下午10:06:14    
 * 修改备注： </pre>
 */
	@Action("listuserinfobyid")
	public void listuserinfobyid(){
		
	 list=	riskService.listuserinfobyid(userphone);
	
		toJson(list);

	}
/**、
 * <pre>getUserphone(用户信息基本信息表查询    企业查询)   
 * 创建人：王爽 cht_java@126.com     
 * 创建时间：2018年3月15日 下午4:14:22    
 * 修改人：王爽 cht_java@126.com      
 * 修改时间：2018年3月15日 下午4:14:22    
 * 修改备注： 
 * @return</pre>
 */
	
	@Action("listgongsibyuserid")
	public void listgongsibyuserid(){
		
	 listgongsi=	riskService.listgongsibyuserid(userphone);
	
		toJson(listgongsi);
	
	}
	
	/**
	 * <pre>getUserphone(初审页面  银行卡查询)   
	 * 创建人：王爽 cht_java@126.com     
	 * 创建时间：2018年3月15日 下午7:13:10    
	 * 修改人：王爽 cht_java@126.com      
	 * 修改时间：2018年3月15日 下午7:13:10    
	 * 修改备注： 
	 * @return</pre>
	 */
	@Action("listyinhangbyphone")
	public void listyinhangbyphone(){
		
	List  listyinhang=	riskService.listyinhangbyphone(userid);
	
	System.out.println(listyinhang);
		toJson(listyinhang);
	
	}
	
	/**
	 * <pre>listjiekuanbyid(初审页面  借款信息表查询)   
	 * 创建人：王爽 cht_java@126.com     
	 * 创建时间：2018年3月15日 下午8:36:34    
	 * 修改人：王爽 cht_java@126.com      
	 * 修改时间：2018年3月15日 下午8:36:34    
	 * 修改备注： </pre>
	 */
	@Action("listjiekuanbyid")
	public void listjiekuanbyid(){
		
	List  listjiekuan=	riskService.listjiekuanbyid(userphone);
	
		toJson(listjiekuan);
	
	}
	
		/**
		 * <pre>listcarbyuserid(风控资料 车表查询  )   
		 * 创建人：王爽 cht_java@126.com     
		 * 创建时间：2018年3月16日 下午6:36:18    
		 * 修改人：王爽 cht_java@126.com      
		 * 修改时间：2018年3月16日 下午6:36:18    
		 * 修改备注： </pre>
		 */
			@Action("listcarbyuserid")
			public void listcarbyuserid(){
				
			List  listuserid  = riskService.listcarbyuserid(userid);
			
				toJson(listuserid);
				
			
			}
	
			/**
			 * <pre>getUserphone(风控资料 公司表查询 )   
			 * 创建人：王爽 cht_java@126.com     
			 * 创建时间：2018年3月16日 下午8:30:48    
			 * 修改人：王爽 cht_java@126.com      
			 * 修改时间：2018年3月16日 下午8:30:48    
			 * 修改备注： 
			 * @return</pre>
			 */
			
			@Action("listgongsibyuserphone")
			public void listgongsibyuserphone(){
				
			List  listgongsi  = riskService.listgongsibyuserphone(userphone);
			
				toJson(listgongsi);
		
			}
			
		/**
		 * 	<pre>listdanbaorenbyuserid(风控信息表   担保人表查询)   
		 * 创建人：王爽 cht_java@126.com     
		 * 创建时间：2018年3月16日 下午9:15:38    
		 * 修改人：王爽 cht_java@126.com      
		 * 修改时间：2018年3月16日 下午9:15:38    
		 * 修改备注： </pre>
		 */
			
				@Action("listdanbaorenbyuserid")
				public void listdanbaorenbyuserid(){
					
				List  listdanbaoren  = riskService.listdanbaorenbyuserid(userid);
				
					toJson(listdanbaoren);
			
				}
			/**
			 * <pre>listuseridbylianxi(风控信息表   联系人表查询)   
			 * 创建人：王爽 cht_java@126.com     
			 * 创建时间：2018年3月16日 下午9:39:05    
			 * 修改人：王爽 cht_java@126.com      
			 * 修改时间：2018年3月16日 下午9:39:05    
			 * 修改备注： </pre>
			 */
			@Action("listuseridbylianxi")
			public void listuseridbylianxi(){
				
			List  listlianxi  = riskService.listuseridbylianxi(userid);
			
				toJson(listlianxi);
		
			}	
			
			/**
			 * <pre>listhousebyuserid(风控资料 房屋表查询)   
			 * 创建人：王爽 cht_java@126.com     
			 * 创建时间：2018年3月16日 下午10:02:08    
			 * 修改人：王爽 cht_java@126.com      
			 * 修改时间：2018年3月16日 下午10:02:08    
			 * 修改备注： </pre>
			 */
			@Action("listhousebyuserid")
			public void listhousebyuserid(){
				
			List  listlouse  = riskService.listhousebyuserid(userid);
			
				toJson(listlouse);
		
			}
			/**
			 * <pre>updateshen(修改订单状态)   
			 * 创建人：王爽 cht_java@126.com     
			 * 创建时间：2018年3月18日 下午9:03:31    
			 * 修改人：王爽 cht_java@126.com      
			 * 修改时间：2018年3月18日 下午9:03:31    
			 * 修改备注： </pre>
			 */
			@Action("updateshen")
			public void updateshen(){
				
				if (ordershen!=null) {
					riskService.updateshen(userid,ordershen,orderstatus);
					
					toJson(true);
				}else{
					
					toJson(false);
				}
		
			}
	
	public Integer getOrdershen() {
				return ordershen;
			}
			public void setOrdershen(Integer ordershen) {
				this.ordershen = ordershen;
			}
	public String getUserphone() {
		return userphone;
	}


	public void setUserphone(String userphone) {
		this.userphone = userphone;
	}

	public PageUtil getPageUtil() {
		return pageUtil;
	}


	public void setPageUtil(PageUtil pageUtil) {
		this.pageUtil = pageUtil;
	}
	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getOrderstatus() {
		return orderstatus;
	}

	public void setOrderstatus(String orderstatus) {
		this.orderstatus = orderstatus;
	}
	public List getListgongsi() {
		return listgongsi;
	}
	public void setListgongsi(List listgongsi) {
		this.listgongsi = listgongsi;
	}

	public List getList() {
		return list;
	}
	public void setList(List list) {
		this.list = list;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}

}
