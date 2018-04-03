package com.jk.common.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="t_salesman")
public class Salesman implements Serializable{

	
	/**
	 * 业务员表
	 */
	private static final long serialVersionUID = -3987027283593096977L;

	  @Id
	//配置uuid，本来jpa是不支持uuid的，但借用hibernate的方法可以实现。
	  @GeneratedValue(generator = "uuid")
	  @GenericGenerator(name = "uuid", strategy = "uuid")
	
	private String manid;
	
	private String manname;

	public String getManid() {
		return manid;
	}

	public void setManid(String manid) {
		this.manid = manid;
	}

	public String getManname() {
		return manname;
	}

	public void setManname(String manname) {
		this.manname = manname;
	}

	@Override
	public String toString() {
		return "Salesman [manid=" + manid + ", manname=" + manname + "]";
	}
	
	
}
