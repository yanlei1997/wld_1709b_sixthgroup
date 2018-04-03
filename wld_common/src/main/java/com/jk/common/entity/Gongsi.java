package com.jk.common.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * <pre>项目名称：wld_common    
 * 类名称：Gongsi    
 * 类描述： 企业基本信息表（公司表） 
 * 创建人：李烨卿897846548@qq.com  
 * 创建时间：2018年3月15日 上午11:13:00    
 * 修改人： 李烨卿   
 * 修改时间：2018年3月15日 上午11:13:00    
 * 修改备注：       
 * @version </pre>
 */
@Entity
@Table(name="t_gongsi")
public class Gongsi implements Serializable{
	
    private static final long serialVersionUID = 7239888075470752241L;
    
    @Id
	//公司ID
	private String gongsiid;
	//公司名称
	private String gongname;
	//公司工商号
	private String gongnumber;
	//行业
	private String gonghang;
	//公司规模
	private String gonggui;
	//公司电话
	private String gongphone;
	//公司地址
	private String gongaddress;
	//用户id
	private String userid;
	//公司性质
	private String gongsixingzhi;
	//部门
	private String bumen;
	//职位
	private String zhiwei;
	//公司收入
	private Integer gongshouru;
	//社保卡
	private Integer shebaoka;
	//入职时间
	private Date ingongtime;
	//职位性质
	private String zhiweixingzhi;
	//主营业务
	private String zhuyingyewu;
	//月收入
	private Integer yueshouru;
	
	

	public String getGongsiid() {
		return gongsiid;
	}

	public void setGongsiid(String gongsiid) {
		this.gongsiid = gongsiid;
	}

	public String getGongname() {
		return gongname;
	}

	public void setGongname(String gongname) {
		this.gongname = gongname;
	}

	public String getGongnumber() {
		return gongnumber;
	}

	public void setGongnumber(String gongnumber) {
		this.gongnumber = gongnumber;
	}

	public String getGonghang() {
		return gonghang;
	}

	public void setGonghang(String gonghang) {
		this.gonghang = gonghang;
	}

	public String getGonggui() {
		return gonggui;
	}

	public void setGonggui(String gonggui) {
		this.gonggui = gonggui;
	}

	public String getGongphone() {
		return gongphone;
	}

	public void setGongphone(String gongphone) {
		this.gongphone = gongphone;
	}

	public String getGongaddress() {
		return gongaddress;
	}

	public void setGongaddress(String gongaddress) {
		this.gongaddress = gongaddress;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getGongsixingzhi() {
		return gongsixingzhi;
	}

	public void setGongsixingzhi(String gongsixingzhi) {
		this.gongsixingzhi = gongsixingzhi;
	}

	public String getBumen() {
		return bumen;
	}

	public void setBumen(String bumen) {
		this.bumen = bumen;
	}

	public String getZhiwei() {
		return zhiwei;
	}

	public void setZhiwei(String zhiwei) {
		this.zhiwei = zhiwei;
	}

	public Integer getGongshouru() {
		return gongshouru;
	}

	public void setGongshouru(Integer gongshouru) {
		this.gongshouru = gongshouru;
	}

	public Integer getShebaoka() {
		return shebaoka;
	}

	public void setShebaoka(Integer shebaoka) {
		this.shebaoka = shebaoka;
	}

	public Date getIngongtime() {
		return ingongtime;
	}

	public void setIngongtime(Date ingongtime) {
		this.ingongtime = ingongtime;
	}

	public String getZhiweixingzhi() {
		return zhiweixingzhi;
	}

	public void setZhiweixingzhi(String zhiweixingzhi) {
		this.zhiweixingzhi = zhiweixingzhi;
	}

	public String getZhuyingyewu() {
		return zhuyingyewu;
	}

	public void setZhuyingyewu(String zhuyingyewu) {
		this.zhuyingyewu = zhuyingyewu;
	}

	public Integer getYueshouru() {
		return yueshouru;
	}

	public void setYueshouru(Integer yueshouru) {
		this.yueshouru = yueshouru;
	}
	
}
