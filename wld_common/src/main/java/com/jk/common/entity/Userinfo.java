package com.jk.common.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
/**
 * 
 * <pre>项目名称：用户信息表表实体类
 * 类名称：Userinfo    
 * 类描述：    
 * 创建人：王爽 cht_java@126.com    
 * 创建时间：2018年3月12日 下午7:03:39    
 * 修改人：王爽 cht_java@126.com  
 * 修改时间：2018年3月12日 下午7:03:39    
 * 修改备注：       
 * @version </pre>
 */
@Entity
@Table(name="t_userinfo")
public class Userinfo implements  Serializable
{


	private static final long serialVersionUID = -7292836450481577983L;
	@Id
	
    private   String userinfoid;
	private   String userid;
	private   String status;
	private   String Education;
	private   String sex;
	private   String nowaddress;
	private   String maritalstatus;
	private   String Accountlocation;
	private   String cardnumber;
	private   String manid;
	
	
	public String getManid() {
		return manid;
	}
	public void setManid(String manid) {
		this.manid = manid;
	}
	@DateTimeFormat(pattern="yyyy-mm-dd")
	private   Date   Submissiontime;
	public String getUserinfoid() {
		return userinfoid;
	}
	public void setUserinfoid(String userinfoid) {
		this.userinfoid = userinfoid;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getEducation() {
		return Education;
	}
	public void setEducation(String education) {
		Education = education;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getNowaddress() {
		return nowaddress;
	}
	public void setNowaddress(String nowaddress) {
		this.nowaddress = nowaddress;
	}
	public String getMaritalstatus() {
		return maritalstatus;
	}
	public void setMaritalstatus(String maritalstatus) {
		this.maritalstatus = maritalstatus;
	}
	public String getAccountlocation() {
		return Accountlocation;
	}
	public void setAccountlocation(String accountlocation) {
		Accountlocation = accountlocation;
	}
	public String getCardnumber() {
		return cardnumber;
	}
	public void setCardnumber(String cardnumber) {
		this.cardnumber = cardnumber;
	}
	public Date getSubmissiontime() {
		return Submissiontime;
	}
	public void setSubmissiontime(Date submissiontime) {
		Submissiontime = submissiontime;
	}
	@Override
	public String toString() {
		return "Userinfo [userinfoid=" + userinfoid + ", userid=" + userid + ", status=" + status + ", Education="
				+ Education + ", sex=" + sex + ", nowaddress=" + nowaddress + ", maritalstatus=" + maritalstatus
				+ ", Accountlocation=" + Accountlocation + ", cardnumber=" + cardnumber + ", manid=" + manid
				+ ", Submissiontime=" + Submissiontime + "]";
	}

	

}
