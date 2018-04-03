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
 * <pre>项目名称：利率表实体类    
 * 类名称：Interest    
 * 类描述：    
 * 创建人：王爽 cht_java@126.com    
 * 创建时间：2018年3月12日 下午7:27:05    
 * 修改人：王爽 cht_java@126.com  
 * 修改时间：2018年3月12日 下午7:27:05    
 * 修改备注：       
 * @version </pre>
 */
@Entity
@Table(name="t_interest")
public class Interest implements Serializable {

	private static final long serialVersionUID = -4934722940387207188L;
	@Id

    private   String interestid;
	private   String interest;
	private   String interestservice;
	private   String interesttime;
	public String getInterestid() {
		return interestid;
	}
	public void setInterestid(String interestid) {
		this.interestid = interestid;
	}
	public String getInterest() {
		return interest;
	}
	public void setInterest(String interest) {
		this.interest = interest;
	}
	public String getInterestservice() {
		return interestservice;
	}
	public void setInterestservice(String interestservice) {
		this.interestservice = interestservice;
	}
	public String getInteresttime() {
		return interesttime;
	}
	public void setInteresttime(String interesttime) {
		this.interesttime = interesttime;
	}
	@Override
	public String toString() {
		return "Interest [interestid=" + interestid + ", interest=" + interest
				+ ", interestservice=" + interestservice + ", interesttime="
				+ interesttime + "]";
	}
	
	
}
