package com.jk.common.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="t_banktype")
public class Banktype {

	@Id
	//配置uuid，本来jpa是不支持uuid的，但借用hibernate的方法可以实现。
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid")
	private String branktyprid;
	
	private String branktypename;

	public String getBranktyprid() {
		return branktyprid;
	}

	public void setBranktyprid(String branktyprid) {
		this.branktyprid = branktyprid;
	}

	public String getBranktypename() {
		return branktypename;
	}

	public void setBranktypename(String branktypename) {
		this.branktypename = branktypename;
	}

	@Override
	public String toString() {
		return "Banktype [branktyprid=" + branktyprid + ", branktypename=" + branktypename + "]";
	}
    
    
}
