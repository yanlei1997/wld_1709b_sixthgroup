package com.jk.common.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="t_bankcard")
public class Bankcard {
	
	@Id
	//配置uuid，本来jpa是不支持uuid的，但借用hibernate的方法可以实现。
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid")
	private String bankcardid;
	private String banknumber;
	private String bankphone;
	private String userid;
	private String banktypeid;
	public String getBankcardid() {
		return bankcardid;
	}
	public void setBankcardid(String bankcardid) {
		this.bankcardid = bankcardid;
	}
	public String getBanknumber() {
		return banknumber;
	}
	public void setBanknumber(String banknumber) {
		this.banknumber = banknumber;
	}
	public String getBankphone() {
		return bankphone;
	}
	public void setBankphone(String bankphone) {
		this.bankphone = bankphone;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getBanktypeid() {
		return banktypeid;
	}
	public void setBanktypeid(String banktypeid) {
		this.banktypeid = banktypeid;
	}
	@Override
	public String toString() {
		return "Bankcard [bankcardid=" + bankcardid + ", banknumber=" + banknumber + ", bankphone=" + bankphone
				+ ", userid=" + userid + ", banktypeid=" + banktypeid + "]";
	}
	
	
	

}
