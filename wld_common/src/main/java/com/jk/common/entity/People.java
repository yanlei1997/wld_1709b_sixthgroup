package com.jk.common.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * 
 * <pre>项目名称：联系人表    
 * 类名称：People    
 * 类描述：    
 * 创建人：王爽 cht_java@126.com    
 * 创建时间：2018年3月12日 下午8:15:36    
 * 修改人：王爽 cht_java@126.com  
 * 修改时间：2018年3月12日 下午8:15:36    
 * 修改备注：       
 * @version </pre>
 */
@Entity
@Table(name="t_people")

public class People implements Serializable  {

	private static final long serialVersionUID = 1117242249766482386L;

	@Id

	private String  peopleid;
	private String  peoplename;
	private String  peoplerelation;
	private String  peoplephone;
	private String  userid;
	public String getPeopleid() {
		return peopleid;
	}
	public void setPeopleid(String peopleid) {
		this.peopleid = peopleid;
	}
	public String getPeoplename() {
		return peoplename;
	}
	public void setPeoplename(String peoplename) {
		this.peoplename = peoplename;
	}
	public String getPeoplerelation() {
		return peoplerelation;
	}
	public void setPeoplerelation(String peoplerelation) {
		this.peoplerelation = peoplerelation;
	}
	public String getPeoplephone() {
		return peoplephone;
	}
	public void setPeoplephone(String peoplephone) {
		this.peoplephone = peoplephone;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	@Override
	public String toString() {
		return "People [peopleid=" + peopleid + ", peoplename=" + peoplename
				+ ", peoplerelation=" + peoplerelation + ", peoplephone="
				+ peoplephone + ", userid=" + userid + "]";
	}
	
	
	
	
	
}
