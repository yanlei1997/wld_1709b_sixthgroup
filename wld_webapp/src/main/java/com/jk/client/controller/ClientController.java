package com.jk.client.controller;


import java.util.List;

import javax.annotation.Resource;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;
import org.apache.struts2.convention.annotation.Results;

import com.jk.client.service.ClientService;
import com.jk.common.base.BaseController;
import com.jk.common.util.PageUtil;


@Results(
		{@Result(name="success",location="customer.jsp"),
		 @Result(name="success2",location="blacklist.jsp"),	
	
		}
	)
@ResultPath("/client")
public class ClientController extends BaseController{

	@Resource
	private ClientService clientService;
	

    private Integer page;
    
    private Integer rows;
	
    private PageUtil pageUtil ;
    
    private String usern;
  
    private String status;

    private List listuserinfo;
    
    private String username;
 
 
   
 	

    /**
     * <pre>tiaozhuan3(跳转至黑名单客户的blacklist.jsp页面)   
     * 创建人：荣楠楠  
     * 创建时间：2018年3月14日 下午5:25:03    
     * 修改人：荣楠楠    
     * 修改时间：2018年3月14日 下午5:25:03    
     * 修改备注： 
     * @return</pre>
     */
    @Action("tiaozhuan2")
    public String tiaozhuan2(){

 	   return "success2";
    }


/**
    *  <pre>queryblacklist(黑名单客户的分页查询  )   
    * 创建人：荣楠楠  
    * 创建时间：2018年3月14日 下午6:53:10    
    * 修改人：荣楠楠    
    * 修改时间：2018年3月14日 下午6:53:10    
    * 修改备注： </pre>
    */
    @Action("queryblacklist")
	public void queryblacklist(){

		pageUtil= new PageUtil(page, rows);
		
		pageUtil = clientService.queryblacklist(pageUtil,usern);
	
	    toJson(pageUtil);

	}
       
   
	/**
	 * <pre>queryorder(客户详情中的订单记录分页查询)   
	 * 创建人：荣楠楠  
	 * 创建时间：2018年3月13日 下午2:00:33    
	 * 修改人：荣楠楠    
	 * 修改时间：2018年3月13日 下午2:00:33    
	 * 修改备注： </pre>
	 */
	@Action("orderlist")
	public void orderlist(){

		pageUtil= new PageUtil(page, rows);
		
		pageUtil = clientService.orderlist(pageUtil);
	
	    toJson(pageUtil);

	}


/**
    *  <pre>tiaozhuan(跳转至客户详情页的customer.jsp页面)   
    * 创建人：荣楠楠  
    * 创建时间：2018年3月14日 上午10:49:19    
    * 修改人：荣楠楠    
    * 修改时间：2018年3月14日 上午10:49:19    
    * 修改备注： 
    * @return</pre>
    */
   @Action("tiaozhuan")
   public String tiaozhuan(){

	   return "success";
   }

	
	/**
	 * <pre>querycustomer(客户列表分页查询 以及根据用户名和状态的条件查询)   
	 * 创建人：荣楠楠  
	 * 创建时间：2018年3月14日 下午5:27:53    
	 * 修改人：荣楠楠    
	 * 修改时间：2018年3月14日 下午5:27:53    
	 * 修改备注： </pre>
	 */
	@Action("querycustomer")
	public void querycustomer(){

		pageUtil= new PageUtil(page, rows);
		
		pageUtil = clientService.querycustomer(pageUtil, usern,status);
	
	    toJson(pageUtil);

	}

	/**
	 * <pre>getPage(get,set 方法)   
	 * 创建人：荣楠楠  
	 * 创建时间：2018年3月15日 上午9:54:08    
	 * 修改人：荣楠楠    
	 * 修改时间：2018年3月15日 上午9:54:08    
	 * 修改备注： 
	 * @return</pre>
	 */
	 
		public Integer getPage() {
			return page;
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

		public PageUtil getPageUtil() {
			return pageUtil;
		}

		public void setPageUtil(PageUtil pageUtil) {
			this.pageUtil = pageUtil;
		}
		
		
		 
		

    public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}

	   
	 public List getListuserinfo() {
			return listuserinfo;
		}

		public void setListuserinfo(List listuserinfo) {
			this.listuserinfo = listuserinfo;
		}

		public String getUsern() {
			return usern;
		}

		public void setUsern(String usern) {
			this.usern = usern;
		}

		   
		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}  

	
			
}
