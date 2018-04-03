package com.jk.risk.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jk.risk.dao.RiskDao;
/**
 * 
 * <pre>项目名称：风控列表订单查询    
 * 类名称：RiskDaoImpl    
 * 类描述：    
 * 创建人：王爽 cht_java@126.com    
 * 创建时间：2018年3月13日 上午10:49:08    
 * 修改人：王爽 cht_java@126.com  
 * 修改时间：2018年3月13日 上午10:49:08    
 * 修改备注：       
 * @version </pre>
 */
@Repository
public class RiskDaoImpl implements RiskDao {

	@Autowired
	private SessionFactory sessionFactory;

	//风控页面订单列表 条件查询
	@Override
	public Integer querycount(String name,String orderstatus) {
	
      String  sql=" select count(a.orderid) from t_order a,t_product b,t_channel c,t_user d "
        +" where a.channelid = c.id and a.productid = b.productid and a.userid = d.userid and a.orderstatus!= '' ";
      
      if (name!=null && name.trim()!="") {
			sql+="  and ( a.orderno like '%"+name+"%'  or  d.username like '%"+name+"%'   or  d.userphone like '%"+name+"%' )";
	}
   
      if (orderstatus!=null && orderstatus.trim()!="") {
  		sql+=" and a.orderstatus like '%"+orderstatus.trim()+"%'";
  	}
      
       List list = sessionFactory.getCurrentSession().createSQLQuery(sql).list();
      
		return Integer.parseInt(list.get(0) + "");
	}

	
	
	@Override
	public List querylist(Integer start, Integer pageSize,String name,String orderstatus) {
		
		String  sql=" select a.userid, a.orderno,d.username ,d.userphone,c.channelid,a.orderdate,b.productname,b.producttype ,a.orderstatus  from t_order a,t_channel c,t_user d, t_product b " 
				  +" where a.channelid = c.id and a.productid = b.productid  and a.userid = d.userid and a.orderstatus!= '' ";
		
		if (name!=null && name.trim()!="") {
			sql+="  and ( a.orderno like '%"+name+"%'  or  d.username like '%"+name+"%'   or  d.userphone like '%"+name+"%' )";
		}

		   if (orderstatus!=null && orderstatus.trim()!="") {
		  		sql+=" and a.orderstatus like '%"+orderstatus.trim()+"%'";
		  	}
          List list = sessionFactory.getCurrentSession().createSQLQuery(sql).setFirstResult(start).setMaxResults(pageSize).
        		  
        setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP).list();
		
       
		return list;
	}

	
	/**
	 * 初审页面  用户基本信息查询
	 */
	@Override
	public List listuserinfobyid(String userphone) {
		
		String sql=" select a.userid,a.userphone,a.username,b.cardnumber,b.accountlocation,b.education,b.maritalstatus,b.nowaddress,b.sex,b.status,b.submissiontime "
 +" from t_user a ,t_userinfo b where a.userid=b.userid and a.userphone="+userphone;
		
	List list = sessionFactory.getCurrentSession().createSQLQuery(sql).setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP).list();
		
		return list;
	}

	/**
	 * 初审页面   企业信息查询
	 */
	@Override
	public List listgongsibyuserid(String userphone) {
				
		String sql=" select a.userphone,b.gongaddress,b.gonggui,b.gonghang,b.gongname,b.gongnumber,b.gongphone "
				+ " from t_user a,t_gongsi b where  a.userid=b.userid and a.userphone=  '"+userphone.trim()+"' ";
		
		List list = sessionFactory.getCurrentSession().createSQLQuery(sql).setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP).list();
		
		return list;
	}
/**
 *  初审页面  银行卡查询
 */
	@Override
	public List listyinhangbyphone(String userid) {
		
		String sql=" select a.banknumber,b.branktypename,a.bankphone "
				+ " from t_bankcard a,t_banktype b,t_user c where a.userid=c.userid and b.branktyprid=a.banktypeid and c.userid= '"+userid.trim()+"' ";
		
	List list1 = sessionFactory.getCurrentSession().createSQLQuery(sql).setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP).list();
	
		return list1;
	}
	//初审页面   借款信息表查询
   @Override
    public List listjiekuanbyid(String userphone) {
	
	   String sql=" select a.borrowway,a.borrowmoney,a.repayway,a.borrowtime,a.borrowmonth,a.borrowservice,a.borrowuse,a.repaysource,a.repaymoney,a.borrowinterest,a.interest "
	   
	   		+ "from t_borrow a , t_userinfo b, t_user c   where  a.borrowid=b.borrowid and b.userid=c.userid  and c.userphone="+userphone ;
			
	   List list2 = sessionFactory.getCurrentSession().createSQLQuery(sql).setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP).list();
	   
	 
	  return list2;
   }


//风控表  车表查询
		@Override
		public List listcarbyuserid(String userid) {
			
			 String sql=" select  b.carbuytime,b.carbuytype,b.carcount,b.carpeople,b.carprice,b.carstatus"
			 		+ " from t_user a,t_car b where a.userid =b.userid  and a.userid='"+userid.trim()+"' ";
			
	   List list3 = sessionFactory.getCurrentSession().createSQLQuery(sql).setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP).list();
	   
			return list3;
		}

		
//风控表  公司表查询
		@Override
		public List listgongsibyuserphone(String userphone) {
			
			String sql="select b.gongname,b.gongnumber,b.gonghang, "
				+ " b.gonggui,b.gongphone,b.gongaddress, "
				+" b.gongsixingzhi,b.bumen,b.ingongtime,b.gongshouru, "
				+ " b.shebaoka,b.yueshouru,b.zhiwei,b.zhiweixingzhi,b.zhuyingyewu "
				+ " from t_user a ,t_gongsi b where a.userid=b.userid and a.userphone="+userphone;

			   List list4 = sessionFactory.getCurrentSession().createSQLQuery(sql).setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP).list();
			
			   System.out.println(list4);
			return list4;
		}



		@Override
		public List listdanbaorenbyuserid(String userid) {
			String  sql=" SELECT * FROM t_guarantee g "
					+ "WHERE g.userid = '"+userid.trim()+"' ";
			
			List list5 = sessionFactory.getCurrentSession().createSQLQuery(sql).setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP).list();

			
			return list5;
		}



		@Override
		public List listuseridbylianxi(String userid) {
			
			String  sql="select a.peoplename,a.peoplephone,a.peoplerelation "
					+ "from t_people a,t_user b where a.userid=b.userid  and a.userid='"+userid.trim()+"' ";
			
			List list6 = sessionFactory.getCurrentSession().createSQLQuery(sql).setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP).list();

			
			return list6;
		}

  //房屋表查询

	
		@Override
		public List listhousebyuserid(String userid) {
			 
			String sql="select  b.house,b.houseaddress,b.houseaffiliation,b.housebuyprice,b.housebuytime,b.housebuytype,b.housecount "
					+ " from t_user a,t_house b where a.userid=b.userid  and a.userid='"+userid.trim()+"' ";
			
			List list7 = sessionFactory.getCurrentSession().createSQLQuery(sql).setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP).list();

			return list7;
		}
	//修改初审页面状态为！=null 和将审核状态  由初审改为复审
		@Override
		public void updateshen(String sql) {
			
			Session session = sessionFactory.getCurrentSession();
			
			session.createSQLQuery(sql).executeUpdate();
			
		}
	
	

}
