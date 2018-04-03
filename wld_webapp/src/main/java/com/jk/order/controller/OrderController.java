package com.jk.order.controller;

import java.util.ArrayList;
import java.util.List;
 






import javax.annotation.Resource;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.ui.Model;

import com.jk.common.base.BaseController;
import com.jk.common.util.PageUtil;
import com.jk.wld_order.service.OrderService;
import com.mysql.fabric.xmlrpc.base.Array;


/**
 * 
 * <pre>项目名称：wld_webapp    
 * 类名称：OrderController    
 * 类描述：      
 * 创建人：周慧茹 960297232@qq.com 
 * 创建时间：2018年3月12日 下午8:55:39    
 * 修改人：周慧茹 960297232@qq.com
 * 修改时间：2018年3月12日 下午8:55:39    
 * 修改备注：       
 * @version </pre>
 */
@Results({@Result(name="show",location="orderlist.jsp"),@Result(name="query",location="client.jsp")})
@ResultPath("/order")
public class OrderController extends BaseController {

	@Resource
	private    OrderService  orderservice; 
	
	private  Integer page;
	
	private  Integer  rows;
	
	private  PageUtil pageUtil;

	private  Integer producttype;
	
	private  String  userphone;
	
	private  List  list;

	 private  Model  model;
	
	private  String orderno; 
	
	
	private  String zhanghao;
	
	private  String userid;
	
	private   List  listborrow;
	
	private  String userid1;
	
	
	private   List  listgongsi;
	
	
	private  String useridbrank;
	
	private  List  branklist;
	
	private  List   houselist;
	
	private   String useridhouse;
	
	private   List  carhouselist;
	
	private   List  gongsilist;
	
	private    List   querypeoplelist;
		
	private    List   guaranteelist;
	
	private  PageUtil pagedahui;
	 
	private  String ordercause;
	
	private  String users;
	
	
	@Action(value="dahuiorderlist")
	 public void dahuiorderlist(){
		 
		pagedahui = new PageUtil(page,rows);
		
		pagedahui = 	orderservice.dahuiorderlist(pagedahui,ordercause,users);
		
					
		toJson(pagedahui);
		
		 
		 
	 }
	
	
	/**
	 * <pre>updateorder(修改订单状态)   
	 * 创建人：周慧茹 960297232@qq.com     
	 * 创建时间：2018年3月18日 下午10:29:31    
	 * 修改人：周慧茹 960297232@qq.com     
	 * 修改时间：2018年3月18日 下午10:29:31    
	 * 修改备注： </pre>
	 */
	@Action(value="updateorder")
	public   void  updateorder(){
		
		
		orderservice.updateorder(orderno);
	}
	
	
	
	/**
	 * <pre>queryguaranteelist(查询对应的担保人)   
	 * 创建人：周慧茹 960297232@qq.com     
	 * 创建时间：2018年3月18日 下午9:48:40    
	 * 修改人：周慧茹 960297232@qq.com     
	 * 修改时间：2018年3月18日 下午9:48:40    
	 * 修改备注： </pre>
	 */
	@Action(value="queryguaranteelist")
	public  void  queryguaranteelist(){
		
		
		guaranteelist =	orderservice.queryguaranteelist(useridhouse);
			
			toJson(guaranteelist);
		
		
	}
	
	
	
	/***
	 * <pre>querypeoplelist(通过用户id查询对应的联系人)   
	 * 创建人：周慧茹 960297232@qq.com     
	 * 创建时间：2018年3月18日 下午9:30:18    
	 * 修改人：周慧茹 960297232@qq.com     
	 * 修改时间：2018年3月18日 下午9:30:18    
	 * 修改备注： </pre>
	 */
	@Action(value="querypeoplelist")
	public  void  querypeoplelist(){
		
		querypeoplelist =	orderservice.querypeoplelist(useridhouse);
			
			toJson(querypeoplelist);
		
		
	}
	
	
	
	/***
	 * <pre>gongsilist(根据用户查询公司)   
	 * 创建人：周慧茹 960297232@qq.com     
	 * 创建时间：2018年3月18日 下午8:59:37    
	 * 修改人：周慧茹 960297232@qq.com     
	 * 修改时间：2018年3月18日 下午8:59:37    
	 * 修改备注： </pre>
	 */
	   @Action(value="gongsilist")
			public  void gongsilist(){						
		   gongsilist =	orderservice.gongsilist(useridhouse);
											
				toJson(gongsilist);
			}
	
	
	/**
	 * <pre>carhouselist(根据用户查询对应的车辆)   
	 * 创建人：周慧茹 960297232@qq.com     
	 * 创建时间：2018年3月18日 下午8:58:22    
	 * 修改人：周慧茹 960297232@qq.com     
	 * 修改时间：2018年3月18日 下午8:58:22    
	 * 修改备注： </pre>
	 */
	   @Action(value="carhouselist")
		public  void carhouselist(){
			
			
			
		   carhouselist =	orderservice.carhouselist(useridhouse);
			
			
			
			toJson(carhouselist);
		}
		
	
	/**
	 * <pre>queryhouselist(根据用户查询对应的房产)   
	 * 创建人：周慧茹 960297232@qq.com     
	 * 创建时间：2018年3月16日 下午8:16:16    
	 * 修改人：周慧茹 960297232@qq.com     
	 * 修改时间：2018年3月16日 下午8:16:16    
	 * 修改备注： </pre>
	 */
	 @Action(value="queryhouselist")
	public  void queryhouselist(){
		
		
		
		houselist =	orderservice.queryhouselist(useridhouse);
		
		
		
		toJson(houselist);
	}
	
	
	
	 @Action(value="bankinglist")
	public  void  bankinglist(){
		
		 branklist=  orderservice.bankinglist(useridbrank);
		 toJson(branklist);
		
	}
	
	
	/**
	 * <pre>companylist(根据用户id查询对应的)   
	 * 创建人：周慧茹 960297232@qq.com     
	 * 创建时间：2018年3月15日 下午8:09:56    
	 * 修改人：周慧茹 960297232@qq.com     
	 * 修改时间：2018年3月15日 下午8:09:56    
	 * 修改备注： </pre>
	 */
	 @Action(value="companylist")
	 public void companylist(){
		 
		 listgongsi= orderservice.companylist(userid);
		 
		 
		 toJson(listgongsi);
	 }
	
	/**
	 * <pre>queryborrowByUserid(通过用户查询对应的借款信息)   
	 * 创建人：周慧茹 960297232@qq.com     
	 * 创建时间：2018年3月15日 下午7:47:12    
	 * 修改人：周慧茹 960297232@qq.com     
	 * 修改时间：2018年3月15日 下午7:47:12    
	 * 修改备注： </pre>
	 */
	@Action(value="queryborrowByUserid")
	 public  void queryborrowByUserid(){
		 
		 
		 listborrow= orderservice.queryborrowByUserid(userid);
		 
	
		 toJson(listborrow);
	 }
	
	
	 
	/**
	 * <pre>queryinfoByinfoid(通过用户信息id查询对应的详情信息)   
	 * 创建人：周慧茹 960297232@qq.com     
	 * 创建时间：2018年3月14日 下午4:03:05    
	 * 修改人：周慧茹 960297232@qq.com     
	 * 修改时间：2018年3月14日 下午4:03:05    
	 * 修改备注： </pre>
	 */
	@Action(value="queryinfoByinfoid")
	public void queryinfoByinfoid(){
		
	 list =	orderservice.queryinfoByinfoid(userphone,orderno);
	
	  toJson(list);
	  
	 
	}
	
	/**
	 * <pre>tz(用来进行页面跳转)   
	 * 创建人：周慧茹 960297232@qq.com     
	 * 创建时间：2018年3月14日 下午4:02:19    
	 * 修改人：周慧茹 960297232@qq.com     
	 * 修改时间：2018年3月14日 下午4:02:19    
	 * 修改备注： 
	 * @return</pre>
	 */
	
	@Action(value="tz")
	public  String  tz(){
		
		return  "show";
	}
     
	/**
	 * <pre>queryorder(分页查询订单)   
	 * 创建人：周慧茹 960297232@qq.com     
	 * 创建时间：2018年3月14日 下午4:02:05    
	 * 修改人：周慧茹 960297232@qq.com     
	 * 修改时间：2018年3月14日 下午4:02:05    
	 * 修改备注： </pre>
	 */
	@Action(value="queryorder")
	public  void  queryorder(){
		
		pageUtil = new PageUtil(page,rows);
		
		pageUtil = 	orderservice.orderpage(pageUtil,producttype,zhanghao);
		
		
		
		
		
		toJson(pageUtil);
		
	   
	}




	/**
	 * <pre>getPage(下面全都是get set 方法)   
	 * 创建人：周慧茹 960297232@qq.com     
	 * 创建时间：2018年3月13日 下午1:02:04    
	 * 修改人：周慧茹 960297232@qq.com     
	 * 修改时间：2018年3月13日 下午1:02:04    
	 * 修改备注： 
	 * @return</pre>
	 */
	
	
	
	
	public Integer getPage() {
		return page;
	}

	public String getOrdercause() {
		return ordercause;
	}


	public void setOrdercause(String ordercause) {
		this.ordercause = ordercause;
	}


	public String getUsers() {
		return users;
	}


	public void setUsers(String users) {
		this.users = users;
	}


	public PageUtil getPagedahui() {
		return pagedahui;
	}


	public void setPagedahui(PageUtil pagedahui) {
		this.pagedahui = pagedahui;
	}


	public List getGuaranteelist() {
		return guaranteelist;
	}



	public void setGuaranteelist(List guaranteelist) {
		this.guaranteelist = guaranteelist;
	}



	public List getQuerypeoplelist() {
		return querypeoplelist;
	}



	public void setQuerypeoplelist(List querypeoplelist) {
		this.querypeoplelist = querypeoplelist;
	}



	public List getGongsilist() {
		return gongsilist;
	}


	public void setGongsilist(List gongsilist) {
		this.gongsilist = gongsilist;
	}


	public List getCarhouselist() {
		return carhouselist;
	}


	public void setCarhouselist(List carhouselist) {
		this.carhouselist = carhouselist;
	}


	public String getUseridbrank() {
		return useridbrank;
	}

	public void setUseridbrank(String useridbrank) {
		this.useridbrank = useridbrank;
	}

	public PageUtil getPageUtil() {
		return pageUtil;
	}

	public void setPageUtil(PageUtil pageUtil) {
		this.pageUtil = pageUtil;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}

	public Integer getProducttype() {
		return producttype;
	}

	public void setProducttype(Integer producttype) {
		this.producttype = producttype;
	}



	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}

	public Model getModel() {
		return model;
	}

	public void setModel(Model model) {
		this.model = model;
	}

	public String getOrderno() {
		return orderno;
	}

	public void setOrderno(String orderno) {
		this.orderno = orderno;
	}

	public String getUserphone() {
		return userphone;
	}

	public void setUserphone(String userphone) {
		this.userphone = userphone;
	}

	public String getZhanghao() {
		return zhanghao;
	}

	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}



	public String getUserid() {
		return userid;
	}



	public void setUserid(String userid) {
		this.userid = userid;
	}



	public List getListborrow() {
		return listborrow;
	}



	public void setListborrow(List listborrow) {
		this.listborrow = listborrow;
	}

	public String getUserid1() {
		return userid1;
	}

	public void setUserid1(String userid1) {
		this.userid1 = userid1;
	}

	public List getListgongsi() {
		return listgongsi;
	}

	public void setListgongsi(List listgongsi) {
		this.listgongsi = listgongsi;
	}



	public List getBranklist() {
		return branklist;
	}



	public void setBranklist(List branklist) {
		this.branklist = branklist;
	}



	public List getHouselist() {
		return houselist;
	}



	public void setHouselist(List houselist) {
		this.houselist = houselist;
	}



	public String getUseridhouse() {
		return useridhouse;
	}



	public void setUseridhouse(String useridhouse) {
		this.useridhouse = useridhouse;
	}


    
	

	
     
	
	
	
}
