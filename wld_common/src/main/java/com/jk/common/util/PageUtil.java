/** 
 * <pre>项目名称:pageutil_test 
 * 文件名称:PageUtil.java 
 * 包名:com.jk 
 * 创建日期:2018年3月13日上午9:54:49 
 * Copyright (c) 2018, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.jk.common.util;

import java.util.List;

/** 
 * <pre>项目名称：pageutil_test    
 * 类名称：PageUtil    
 * 类描述：    分页插件
 * 创建人：李聪聪 cong66990@qq.com    
 * 创建时间：2018年3月13日 上午9:54:49    
 * 修改人：李聪聪 cong66990@qq.com  
 * 修改时间：2018年3月13日 上午9:54:49    
 * 修改备注：       
 * @version </pre>    
 */
public class PageUtil<T> {
	
	//当前页
	private Integer page;
	//每页条数
	private Integer pageSize;//rows
	//开始条数
	private Integer start;
	//总条数
	private Integer total;
	//数据内容
	private List<T> rows;
	public  PageUtil (Integer page,Integer pageSize){
		
		this.page=page;
		
		this.pageSize=pageSize;
		
		this.start=(page-1)*pageSize;
		
	}
	
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public Integer getStart() {
		return start;
	}
	public void setStart(Integer start) {
		this.start = start;
	}
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	public List<T> getRows() {
		return rows;
	}
	public void setRows(List<T> rows) {
		this.rows = rows;
	}

	@Override
	public String toString() {
		return "PageUtil [page=" + page + ", pageSize=" + pageSize + ", start="
				+ start + ", total=" + total + ", rows=" + rows + "]";
	}
	
	
}
