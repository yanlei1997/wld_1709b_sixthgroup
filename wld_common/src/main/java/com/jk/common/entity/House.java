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
 * <pre>项目名称：房屋信息实体类                                                                           
 * 类名称：House    
 * 类描述：    
 * 创建人：王爽 cht_java@126.com    
 * 创建时间：2018年3月12日 下午8:04:29    
 * 修改人：王爽 cht_java@126.com  
 * 修改时间：2018年3月12日 下午8:04:29    
 * 修改备注：       
 * @version </pre>
 */
@Entity
@Table(name="t_house")
public class House  implements Serializable  {

	private static final long serialVersionUID = 4461344705306096297L;

	
	@Id	
    private   String houseid;
	
	private   Integer house;
	
	 @DateTimeFormat(pattern="yyyy-mm-dd")
	private   Date housebuytime;
	
    private  Integer housebuytype;
	 
    private  String  housebuyprice;
	 
	private  String houseaddress;
	
	private  Integer houseaffiliation;
	
	private  String userid;
	
	private  String  housecount;

	public String getHouseid() {
		return houseid;
	}

	public void setHouseid(String houseid) {
		this.houseid = houseid;
	}

	public Integer getHouse() {
		return house;
	}

	public void setHouse(Integer house) {
		this.house = house;
	}

	public Date getHousebuytime() {
		return housebuytime;
	}

	public void setHousebuytime(Date housebuytime) {
		this.housebuytime = housebuytime;
	}

	public Integer getHousebuytype() {
		return housebuytype;
	}

	public void setHousebuytype(Integer housebuytype) {
		this.housebuytype = housebuytype;
	}

	public String getHousebuyprice() {
		return housebuyprice;
	}

	public void setHousebuyprice(String housebuyprice) {
		this.housebuyprice = housebuyprice;
	}

	public String getHouseaddress() {
		return houseaddress;
	}

	public void setHouseaddress(String houseaddress) {
		this.houseaddress = houseaddress;
	}

	public Integer getHouseaffiliation() {
		return houseaffiliation;
	}

	public void setHouseaffiliation(Integer houseaffiliation) {
		this.houseaffiliation = houseaffiliation;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getHousecount() {
		return housecount;
	}

	public void setHousecount(String housecount) {
		this.housecount = housecount;
	}

	@Override
	public String toString() {
		return "House [houseid=" + houseid + ", house=" + house
				+ ", housebuytime=" + housebuytime + ", housebuytype="
				+ housebuytype + ", housebuyprice=" + housebuyprice
				+ ", houseaddress=" + houseaddress + ", houseaffiliation="
				+ houseaffiliation + ", userid=" + userid + ", housecount="
				+ housecount + "]";
	}
	 

	
	
}
