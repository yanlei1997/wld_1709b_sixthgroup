package com.jk.common.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * 
 * <pre>项目名称：渠道实体类   
 * 类名称：Channel    
 * 类描述：    
 * 创建人：王爽 cht_java@126.com    
 * 创建时间：2018年3月12日 下午7:31:15    
 * 修改人：王爽 cht_java@126.com  
 * 修改时间：2018年3月12日 下午7:31:15    
 * 修改备注：       
 * @version </pre>
 */
@Entity
@Table(name="t_channel")
public class Channel implements Serializable {


	private static final long serialVersionUID = 6094210937594390571L;
	
	@Id
	//配置uuid，本来jpa是不支持uuid的，但借用hibernate的方法可以实现。
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid")
	private   String  id;
	private   Integer channelid;
	private   Integer channelsource;
	private   String  channelrank;
	private   String  companyname;
	private   String  companyaddress;
	private   String  people;
	private   String  linkphone;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Integer getChannelid() {
		return channelid;
	}
	public void setChannelid(Integer channelid) {
		this.channelid = channelid;
	}
	public Integer getChannelsource() {
		return channelsource;
	}
	public void setChannelsource(Integer channelsource) {
		this.channelsource = channelsource;
	}
	public String getChannelrank() {
		return channelrank;
	}
	public void setChannelrank(String channelrank) {
		this.channelrank = channelrank;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public String getCompanyaddress() {
		return companyaddress;
	}
	public void setCompanyaddress(String companyaddress) {
		this.companyaddress = companyaddress;
	}
	public String getPeople() {
		return people;
	}
	public void setPeople(String people) {
		this.people = people;
	}
	public String getLinkphone() {
		return linkphone;
	}
	public void setLinkphone(String linkphone) {
		this.linkphone = linkphone;
	}
	@Override
	public String toString() {
		return "Channel [id=" + id + ", channelid=" + channelid
				+ ", channelsource=" + channelsource + ", channelrank="
				+ channelrank + ", companyname=" + companyname
				+ ", companyaddress=" + companyaddress + ", people=" + people
				+ ", linkphone=" + linkphone + "]";
	}
	

	
	
}
