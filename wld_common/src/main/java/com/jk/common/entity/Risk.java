package com.jk.common.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * <pre>项目名称：风控表实体类
 * 类名称：Risk    
 * 类描述：    
 * 创建人：王爽 cht_java@126.com    
 * 创建时间：2018年3月12日 下午7:25:42    
 * 修改人：王爽 cht_java@126.com  
 * 修改时间：2018年3月12日 下午7:25:42    
 * 修改备注：       
 * @version </pre>
 */
@Entity
@Table(name="t_risk")
public class Risk implements Serializable {


	private static final long serialVersionUID = -5863856250295022559L;
	@Id

    private   String riskid;
	private   String companyid;
	private   String incomemoney;
    private   String socialcard;
	private   String houseid;
	private   String carid;
	private   String riskistatus;
	private   String userid;
	private   String department;
	private   String position;
	public String getRiskid() {
		return riskid;
	}
	public void setRiskid(String riskid) {
		this.riskid = riskid;
	}
	public String getCompanyid() {
		return companyid;
	}
	public void setCompanyid(String companyid) {
		this.companyid = companyid;
	}
	public String getIncomemoney() {
		return incomemoney;
	}
	public void setIncomemoney(String incomemoney) {
		this.incomemoney = incomemoney;
	}
	public String getSocialcard() {
		return socialcard;
	}
	public void setSocialcard(String socialcard) {
		this.socialcard = socialcard;
	}
	public String getHouseid() {
		return houseid;
	}
	public void setHouseid(String houseid) {
		this.houseid = houseid;
	}
	public String getCarid() {
		return carid;
	}
	public void setCarid(String carid) {
		this.carid = carid;
	}
	public String getRiskistatus() {
		return riskistatus;
	}
	public void setRiskistatus(String riskistatus) {
		this.riskistatus = riskistatus;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Risk [riskid=" + riskid + ", companyid=" + companyid
				+ ", incomemoney=" + incomemoney + ", socialcard=" + socialcard
				+ ", houseid=" + houseid + ", carid=" + carid
				+ ", riskistatus=" + riskistatus + ", userid=" + userid
				+ ", department=" + department + ", position=" + position + "]";
	}
	

}
