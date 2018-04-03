package com.jk.channel.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;
import org.apache.struts2.convention.annotation.Results;

import com.jk.channel.service.ChannelService;
import com.jk.common.base.BaseController;
import com.jk.common.entity.Channel;
import com.jk.common.util.PageUtil;

@Results(
		{@Result(name="channel",location="channel.jsp"),@Result(name="updateChannel",location="updateChannel.jsp")
		,@Result(name="cha",location="channel.jsp"),@Result(name="chanl",location="channel.jsp")
		,@Result(name="cch",location="channel.jsp")
		}
		)
@ResultPath("/channel")
public class ChannelController extends BaseController{
	
	@Resource
	private ChannelService channelService;
	
	private Integer page;
	
	private Integer rows;
	
	private PageUtil pageUtil;
	
	private List<Channel> list;
	
	private String id;
	
	private Channel channel;
	
	private String  cn;
	
	/**
	 * <pre>upd(根据序号查询对应的一条信息返回到修改页面)   
	 * 创建人：闫磊 1092204331@qq.com     
	 * 创建时间：2018年3月14日 上午11:58:30    
	 * 修改人：闫磊 1092204331@qq.com      
	 * 修改时间：2018年3月14日 上午11:58:30    
	 * 修改备注： 
	 * @return</pre>
	 */
	@Action("upd")
	public String upd(){
		
		list = new ArrayList() ;
		
		list = channelService.upd(id);
		
		HttpServletRequest request = ServletActionContext.getRequest();
		
		request.setAttribute("list", list);
		
		return "updateChannel";
	}
	
	/**
	 * <pre>zz(用来跳转页面)   
	 * 创建人：闫磊 1092204331@qq.com     
	 * 创建时间：2018年3月14日 上午11:59:09    
	 * 修改人：闫磊 1092204331@qq.com      
	 * 修改时间：2018年3月14日 上午11:59:09    
	 * 修改备注： 
	 * @return</pre>
	 */
	@Action("zz")
	public String zz(){
		
		return "channel";
	}
	
	/**
	 * <pre>queryChannel(分页查询渠道表的全部信息)   
	 * 创建人：闫磊 1092204331@qq.com     
	 * 创建时间：2018年3月14日 上午11:59:46    
	 * 修改人：闫磊 1092204331@qq.com      
	 * 修改时间：2018年3月14日 上午11:59:46    
	 * 修改备注： </pre>
	 */
	@Action("queryChannel")
	public void queryChannel(){
		
		pageUtil = new PageUtil(page, rows);
		
		pageUtil = channelService.queryChannel(pageUtil,cn);
		
		toJson(pageUtil);
		
		System.out.println(pageUtil);
	}
	
	/**
	 * <pre>getPage(修改方法)   
	 * 创建人：闫磊 1092204331@qq.com     
	 * 创建时间：2018年3月14日 下午9:37:46    
	 * 修改人：闫磊 1092204331@qq.com      
	 * 修改时间：2018年3月14日 下午9:37:46    
	 * 修改备注： 
	 * @return</pre>
	 */
	@Action("updateChannel")
	public String updateChannel(){
		
		channelService.updateChannel(channel);
		
		return "chnne";
	}
	
	/**
	 * <pre>getPage(修改页面的取消方法)   
	 * 创建人：闫磊 1092204331@qq.com     
	 * 创建时间：2018年3月14日 下午9:53:04    
	 * 修改人：闫磊 1092204331@qq.com      
	 * 修改时间：2018年3月14日 下午9:53:04    
	 * 修改备注： 
	 * @return</pre>
	 */
	@Action("updchan")
	public String upchan(){
		
		return "cha";
	}
	
	/**
	 * <pre>getPage(根据id删除一条数据)   
	 * 创建人：闫磊 1092204331@qq.com     
	 * 创建时间：2018年3月14日 下午11:09:29    
	 * 修改人：闫磊 1092204331@qq.com      
	 * 修改时间：2018年3月14日 下午11:09:29    
	 * 修改备注： 
	 * @return</pre>
	 */
	@Action("deleteChannel")
	public String deleteChannel(){
		
		channelService.deleteChannel(id);
		
		return "chanl";
	}
	
	/**
	 * <pre>getPage(新增渠道信息)   
	 * 创建人：闫磊 1092204331@qq.com     
	 * 创建时间：2018年3月15日 下午4:47:40    
	 * 修改人：闫磊 1092204331@qq.com      
	 * 修改时间：2018年3月15日 下午4:47:40    
	 * 修改备注： 
	 * @return</pre>
	 */
	@Action("addChannel")
	public String addChannel(){
		
		channelService.addChannel(channel);
		
		return "cch";
	}
	

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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<Channel> getList() {
		return list;
	}

	public void setList(List<Channel> list) {
		this.list = list;
	}

	public Channel getChannel() {
		return channel;
	}

	public void setChannel(Channel channel) {
		this.channel = channel;
	}

	public String getCn() {
		return cn;
	}

	public void setCn(String cn) {
		this.cn = cn;
	}

	
	
}
