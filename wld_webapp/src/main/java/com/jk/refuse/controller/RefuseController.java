package com.jk.refuse.controller;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;
import org.apache.struts2.convention.annotation.Results;

import com.jk.common.base.BaseController;
import com.jk.common.entity.User;
import com.jk.common.entity.Userinfo;
import com.jk.common.util.PageUtil;
import com.jk.refuse.service.OrderrefuseService;

/**
 * 
 * <pre>项目名称：wld_webapp    
 * 类名称：RefuseController    
 * 类描述：    
 * 创建人：李烨卿897846548@qq.com  
 * 创建时间：2018年3月13日 上午11:40:47    
 * 修改人： 李烨卿   
 * 修改时间：2018年3月13日 上午11:40:47    
 * 修改备注：       
 * @version </pre>
 */
@Results(
		@Result(name="orderrefuse",location="orderrefuse.jsp"))
@ResultPath("/refuse")
public class RefuseController extends BaseController implements Serializable {

	private static final long serialVersionUID = -283705927042881283L;
	
	@Resource
	private OrderrefuseService orderrefuseService;
	
	private Integer rows;
	
	private Integer page;
	
	private PageUtil pageUtil;
	
	private String serachname;
	
	private User user;
	
	private Userinfo userinfo;
	
	private List list;
	
	private String userphone;
	
	private List list2;
	
	private List list3;
	
	private List list4;
	
	private List list5;
	
	private List list6;
	
	/**
	 * <pre>orderrefusedanbao(风控资料得担保人查询)   
	 * 创建人：李烨卿897846548@qq.com      
	 * 创建时间：2018年3月17日 上午11:05:21    
	 * 修改人： 李烨卿     
	 * 修改时间：2018年3月17日 上午11:05:21    
	 * 修改备注： </pre>
	 */
	@Action("orderrefusedanbao")
	public void orderrefusedanbao(){
		
		list6 =	orderrefuseService.orderrefusedanbao(userphone);
		
		toJson(list6);
	}
	
	/**
	 * <pre>orderrefusezichan(风控资料得资产信息查询)   
	 * 创建人：李烨卿897846548@qq.com      
	 * 创建时间：2018年3月16日 下午9:12:22    
	 * 修改人： 李烨卿     
	 * 修改时间：2018年3月16日 下午9:12:22    
	 * 修改备注： </pre>
	 */
	@Action("orderrefusezichan")
	public void orderrefusezichan(){
		
	list5 = 	orderrefuseService.orderrefusezichan(userphone);
		
	 toJson(list5);
	}
	
	/**
	 * <pre>orderrefusebrankcard(查询订单详情页银行卡信息)    
	 * k
	 * 创建人：李烨卿897846548@qq.com      
	 * 创建时间：2018年3月15日 下午9:29:36    
	 * 修改人： 李烨卿     
	 * 修改时间：2018年3月15日 下午9:29:36    
	 * 修改备注： </pre>
	 */
	@Action("orderrefusebrankcard")
	public void orderrefusebrankcard(){
		
		list4 = 	orderrefuseService.orderrefusebrankcard(userphone);
		
		toJson(list4);
	}
	
	/**
	 * <pre>orderrefusegongsi(订单详情页企业信息查询)   
	 * 创建人：李烨卿897846548@qq.com      
	 * 创建时间：2018年3月15日 下午8:57:54    
	 * 修改人： 李烨卿     
	 * 修改时间：2018年3月15日 下午8:57:54    
	 * 修改备注： </pre>
	 */
	@Action("orderrefusegongsi")
	public void orderrefusegongsi(){
		
	list3 = 	orderrefuseService.orderrefusegongsi(userphone);
	
		toJson(list3);
	}
	
	/**
	 * <pre>orderrefuseborrow(查询借款信息)   
	 * 创建人：李烨卿897846548@qq.com      
	 * 创建时间：2018年3月15日 下午7:03:17    
	 * 修改人： 李烨卿     
	 * 修改时间：2018年3月15日 下午7:03:17    
	 * 修改备注： </pre>
	 */
	@Action("orderrefuseborrow")
	public void orderrefuseborrow(){
		
	list2 =	orderrefuseService.orderrefuseborrow(userphone);
		
		toJson(list2);
	}
	
	/**
	 * <pre>orderrefuselook(查询基本信息)   
	 * 创建人：李烨卿897846548@qq.com      
	 * 创建时间：2018年3月14日 下午6:54:28    
	 * 修改人： 李烨卿     
	 * 修改时间：2018年3月14日 下午6:54:28    
	 * 修改备注： </pre>
	 */
	@Action("orderrefuselook")
	public void orderrefuselook(){
			
	 list = 	orderrefuseService.queryorderuseranduserinfobyphone(userphone);
		
	  toJson(list);
	  
	}
	
	 /**
	  * <pre>orderrefuse(订单管理得已拒订单查询)   
	  * 创建人：李烨卿897846548@qq.com      
	  * 创建时间：2018年3月13日 上午11:41:58    
	  * 修改人： 李烨卿     
	  * 修改时间：2018年3月13日 上午11:41:58    
	  * 修改备注： </pre>
	  */
		@Action("orderrefuse")
		
		public void orderrefuse(){
			
		 pageUtil =  new  PageUtil(page, rows);
			
		 pageUtil =  orderrefuseService.orderrefuse(pageUtil,serachname);
		
		 toJson(pageUtil);
		 
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
	public PageUtil getPageUtil() {
		return pageUtil;
	}
	public void setPageUtil(PageUtil pageUtil) {
		this.pageUtil = pageUtil;
	}
	public String getSerachname() {
		return serachname;
	}
	public void setSerachname(String serachname) {
		this.serachname = serachname;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Userinfo getUserinfo() {
		return userinfo;
	}

	public void setUserinfo(Userinfo userinfo) {
		this.userinfo = userinfo;
	}

	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}

	public String getUserphone() {
		return userphone;
	}

	public void setUserphone(String userphone) {
		this.userphone = userphone;
	}

	public List getList2() {
		return list2;
	}

	public void setList2(List list2) {
		this.list2 = list2;
	}

	public List getList3() {
		return list3;
	}

	public void setList3(List list3) {
		this.list3 = list3;
	}

	public List getList4() {
		return list4;
	}

	public void setList4(List list4) {
		this.list4 = list4;
	}

	public List getList5() {
		return list5;
	}

	public void setList5(List list5) {
		this.list5 = list5;
	}

	public List getList6() {
		return list6;
	}

	public void setList6(List list6) {
		this.list6 = list6;
	}

		
}
