package com.jk.common.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
/**
 * 
 * <pre>项目名称：车表实体类  
 * 类名称：Car    
 * 类描述：    
 * 创建人：王爽 cht_java@126.com    
 * 创建时间：2018年3月12日 下午7:51:25    
 * 修改人：王爽 cht_java@126.com  
 * 修改时间：2018年3月12日 下午7:51:25    
 * 修改备注：       
 * @version </pre>
 */
@Entity
@Table(name="t_car")
public class Car implements Serializable {


    private static final long serialVersionUID = -1080078306590669497L;
    @Id
	private   String carid;
    private   Integer  carcount;
    @DateTimeFormat(pattern="yyyy-mm-dd")
    private   Date carbuytime;
    private   Integer carbuytype;
    private   String carprice;
    private   String userid;
    private   Integer carstatus;
    private   Integer carpeople;
	public String getCarid() {
		return carid;
	}
	public void setCarid(String carid) {
		this.carid = carid;
	}
	public Integer getCarcount() {
		return carcount;
	}
	public void setCarcount(Integer carcount) {
		this.carcount = carcount;
	}
	public Date getCarbuytime() {
		return carbuytime;
	}
	public void setCarbuytime(Date carbuytime) {
		this.carbuytime = carbuytime;
	}
	public Integer getCarbuytype() {
		return carbuytype;
	}
	public void setCarbuytype(Integer carbuytype) {
		this.carbuytype = carbuytype;
	}
	public String getCarprice() {
		return carprice;
	}
	public void setCarprice(String carprice) {
		this.carprice = carprice;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public Integer getCarstatus() {
		return carstatus;
	}
	public void setCarstatus(Integer carstatus) {
		this.carstatus = carstatus;
	}
	public Integer getCarpeople() {
		return carpeople;
	}
	public void setCarpeople(Integer carpeople) {
		this.carpeople = carpeople;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Car [carid=" + carid + ", carcount=" + carcount
				+ ", carbuytime=" + carbuytime + ", carbuytype=" + carbuytype
				+ ", carprice=" + carprice + ", userid=" + userid
				+ ", carstatus=" + carstatus + ", carpeople=" + carpeople + "]";
	}
	

}
