package com.jk.common.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * 
 * <pre>项目名称：用户表实体类    
 * 类名称：User    
 * 类描述：    
 * 创建人：王爽 cht_java@126.com    
 * 创建时间：2018年3月12日 下午5:27:02    
 * 修改人：王爽 cht_java@126.com  
 * 修改时间：2018年3月12日 下午5:27:02    
 * 修改备注：       
 * @version </pre>
 */

@Entity
@Table(name="t_user")
public class User implements Serializable{

	private static final long serialVersionUID = -5167811998802213040L;
	@Id
	
    private   String userid;
	private   String username;
	private   String userpass;
	private   String userphone;
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserpass() {
		return userpass;
	}
	public void setUserpass(String userpass) {
		this.userpass = userpass;
	}
	public String getUserphone() {
		return userphone;
	}
	public void setUserphone(String userphone) {
		this.userphone = userphone;
	}
	@Override
	public String toString() {
		return "User [userid=" + userid + ", username=" + username
				+ ", userpass=" + userpass + ", userphone=" + userphone + "]";
	}
	
	
}
