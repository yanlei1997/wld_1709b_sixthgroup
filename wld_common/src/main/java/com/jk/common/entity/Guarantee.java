package com.jk.common.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * 
 * <pre>项目名称：联系表实体类   
 * 类名称：Guarantee    
 * 类描述：    
 * 创建人：王爽 cht_java@126.com    
 * 创建时间：2018年3月12日 下午8:28:56    
 * 修改人：王爽 cht_java@126.com  
 * 修改时间：2018年3月12日 下午8:28:56    
 * 修改备注：       
 * @version </pre>
 */
@Entity
@Table(name="t_guarantee")
public class Guarantee implements Serializable  {

	private static final long serialVersionUID = -3492152918825040198L;

	@Id
	
	private String guaranteeid;
	private String guaranteename;
	private String registerednum;
	private String guaranteeaddress;
	private String guaranteephone;
	private String userid;
	public String getGuaranteeid() {
		return guaranteeid;
	}
	public void setGuaranteeid(String guaranteeid) {
		this.guaranteeid = guaranteeid;
	}
	public String getGuaranteename() {
		return guaranteename;
	}
	public void setGuaranteename(String guaranteename) {
		this.guaranteename = guaranteename;
	}
	public String getRegisterednum() {
		return registerednum;
	}
	public void setRegisterednum(String registerednum) {
		this.registerednum = registerednum;
	}
	public String getGuaranteeaddress() {
		return guaranteeaddress;
	}
	public void setGuaranteeaddress(String guaranteeaddress) {
		this.guaranteeaddress = guaranteeaddress;
	}
	public String getGuaranteephone() {
		return guaranteephone;
	}
	public void setGuaranteephone(String guaranteephone) {
		this.guaranteephone = guaranteephone;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	@Override
	public String toString() {
		return "Guarantee [guaranteeid=" + guaranteeid + ", guaranteename="
				+ guaranteename + ", registerednum=" + registerednum
				+ ", guaranteeaddress=" + guaranteeaddress
				+ ", guaranteephone=" + guaranteephone + ", userid=" + userid
				+ "]";
	}
	
	
}
