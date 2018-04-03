package com.jk.common.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
/**
 * 
 * <pre>项目名称：wld_common    
 * 类名称：Menu    
 * 类描述：    权限实体类
 * 创建人：闫磊 1092204331@qq.com    
 * 创建时间：2018年3月15日 下午8:30:52    
 * 修改人：闫磊 1092204331@qq.com  
 * 修改时间：2018年3月15日 下午8:30:52    
 * 修改备注：       
 * @version </pre>
 */
@Entity
@Table(name="t_menu")
public class Menu implements Serializable{

	private static final long serialVersionUID = -3141413579771833020L;
	
	@Id
	private Integer id;
	
	private String text;
	
	private String url;
	
	private Integer pid;
	
	@Transient
	private List<Menu>   children;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public List<Menu> getChildren() {
		return children;
	}

	public void setChildren(List<Menu> children) {
		this.children = children;
	}

	@Override
	public String toString() {
		return "Menu [id=" + id + ", text=" + text + ", url=" + url + ", pid=" + pid + ", children=" + children + "]";
	}

	

}
