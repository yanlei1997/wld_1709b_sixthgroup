package com.jk.common.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * 
 * <pre>项目名称：借款表实体类   
 * 类名称：Borrow    
 * 类描述：    
 * 创建人：王爽 cht_java@126.com    
 * 创建时间：2018年3月12日 下午8:35:50    
 * 修改人：王爽 cht_java@126.com  
 * 修改时间：2018年3月12日 下午8:35:50    
 * 修改备注：       
 * @version </pre>
 */
@Entity
@Table(name="t_borrow")
public class Borrow implements Serializable {

	private static final long serialVersionUID = 7174851096603713312L;
	@Id
	
	private String borrowid;
	
	private Integer borrowway;
	
	private Integer borrowtime;
	
	private String repayway;
	
	private double borrowmoney;
	
	private String borrowinterest;
	
	private String borrowmonth;
	
	private double borrowservice;	
	
	private String  borrowuse;
	
	private String repaysource;
	
	private double repaymoney;
	
	private Double interest;

	public String getBorrowid() {
		return borrowid;
	}

	public void setBorrowid(String borrowid) {
		this.borrowid = borrowid;
	}

	public Integer getBorrowway() {
		return borrowway;
	}

	public void setBorrowway(Integer borrowway) {
		this.borrowway = borrowway;
	}



	public void setBorrowtime(Integer borrowtime) {
		this.borrowtime = borrowtime;
	}



	public String getRepayway() {
		return repayway;
	}

	public void setRepayway(String repayway) {
		this.repayway = repayway;
	}

	public double getBorrowmoney() {
		return borrowmoney;
	}

	public void setBorrowmoney(double borrowmoney) {
		this.borrowmoney = borrowmoney;
	}

	public String getBorrowinterest() {
		return borrowinterest;
	}

	public void setBorrowinterest(String borrowinterest) {
		this.borrowinterest = borrowinterest;
	}

	public String getBorrowmonth() {
		return borrowmonth;
	}

	public void setBorrowmonth(String borrowmonth) {
		this.borrowmonth = borrowmonth;
	}

	public double getBorrowservice() {
		return borrowservice;
	}

	public void setBorrowservice(double borrowservice) {
		this.borrowservice = borrowservice;
	}

	public String getBorrowuse() {
		return borrowuse;
	}

	public void setBorrowuse(String borrowuse) {
		this.borrowuse = borrowuse;
	}

	public String getRepaysource() {
		return repaysource;
	}

	public void setRepaysource(String repaysource) {
		this.repaysource = repaysource;
	}

	public double getRepaymoney() {
		return repaymoney;
	}

	public void setRepaymoney(double repaymoney) {
		this.repaymoney = repaymoney;
	}

	public Double getInterest() {
		return interest;
	}

	public void setInterest(Double interest) {
		this.interest = interest;
	}

	@Override
	public String toString() {
		return "Borrow [borrowid=" + borrowid + ", borrowway=" + borrowway
				+ ", borrowtime=" + borrowtime + ", repayway=" + repayway
				+ ", borrowmoney=" + borrowmoney + ", borrowinterest="
				+ borrowinterest + ", borrowmonth=" + borrowmonth
				+ ", borrowservice=" + borrowservice + ", borrowuse="
				+ borrowuse + ", repaysource=" + repaysource + ", repaymoney="
				+ repaymoney + ", interest=" + interest + "]";
	}


	
}
