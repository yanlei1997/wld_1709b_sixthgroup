package com.jk.common.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="t_product")
public class Product  implements Serializable{

	private static final long serialVersionUID = -4425701649856065565L;
    @Id
	private  String productid;
	
	private String productname;
	
	private  Integer producttype;
	
	private  Integer productstatus;
	
	private  String productsource;
	
	private  Date productdate;
	
	private  String interestid;

	public String getProductid() {
		return productid;
	}

	public void setProductid(String productid) {
		this.productid = productid;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public Integer getProducttype() {
		return producttype;
	}

	public void setProducttype(Integer producttype) {
		this.producttype = producttype;
	}

	public Integer getProductstatus() {
		return productstatus;
	}

	public void setProductstatus(Integer productstatus) {
		this.productstatus = productstatus;
	}

	public String getProductsource() {
		return productsource;
	}

	public void setProductsource(String productsource) {
		this.productsource = productsource;
	}

	public Date getProductdate() {
		return productdate;
	}

	public void setProductdate(Date productdate) {
		this.productdate = productdate;
	}

	public String getInterestid() {
		return interestid;
	}

	public void setInterestid(String interestid) {
		this.interestid = interestid;
	}

	@Override
	public String toString() {
		return "Product [productid=" + productid + ", productname="
				+ productname + ", producttype=" + producttype
				+ ", productstatus=" + productstatus + ", productsource="
				+ productsource + ", productdate=" + productdate
				+ ", interestid=" + interestid + "]";
	}
	
	
	
	
}
