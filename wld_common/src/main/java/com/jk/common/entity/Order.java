package com.jk.common.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;



@Entity 
@Table  (name ="t_order")
public class Order   implements Serializable{

	/**
	 *  订单表
	 */
	private static final long serialVersionUID = 3712541479533110825L;


  @Id
//配置uuid，本来jpa是不支持uuid的，但借用hibernate的方法可以实现。
  @GeneratedValue(generator = "uuid")
  @GenericGenerator(name = "uuid", strategy = "uuid")	
	private   String  orderid;
	
	private   String   orderstatus;
	
	private   Date orderdate;
	
	private  String  orderno;
	
	private  String  userid;
	
	private   String channelid;
	
	private   String productid;
	
	private   String ordercause;
	
	private   String userinfoid;
	
	private   String manid;
	
	private Integer ordershen;

	public String getManid() {
		return manid;
	}

	public void setManid(String manid) {
		this.manid = manid;
	}

	public String getOrderid() {
		return orderid;
	}

	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}

	public String getOrderstatus() {
		return orderstatus;
	}

	public void setOrderstatus(String orderstatus) {
		this.orderstatus = orderstatus;
	}

	public Date getOrderdate() {
		return orderdate;
	}

	public void setOrderdate(Date orderdate) {
		this.orderdate = orderdate;
	}

	public String getOrderno() {
		return orderno;
	}

	public void setOrderno(String orderno) {
		this.orderno = orderno;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getChannelid() {
		return channelid;
	}

	public void setChannelid(String channelid) {
		this.channelid = channelid;
	}

	public String getProductid() {
		return productid;
	}

	public void setProductid(String productid) {
		this.productid = productid;
	}

	public String getOrdercause() {
		return ordercause;
	}

	public void setOrdercause(String ordercause) {
		this.ordercause = ordercause;
	}

	public String getUserinfoid() {
		return userinfoid;
	}

	public void setUserinfoid(String userinfoid) {
		this.userinfoid = userinfoid;
	}

	public Integer getOrdershen() {
		return ordershen;
	}

	public void setOrdershen(Integer ordershen) {
		this.ordershen = ordershen;
	}

	@Override
	public String toString() {
		return "Order [orderid=" + orderid + ", orderstatus=" + orderstatus
				+ ", orderdate=" + orderdate + ", orderno=" + orderno
				+ ", userid=" + userid + ", channelid=" + channelid
				+ ", productid=" + productid + ", ordercause=" + ordercause
				+ ", userinfoid=" + userinfoid + ", manid=" + manid
				+ ", ordershen=" + ordershen + "]";
	}

	 
}
