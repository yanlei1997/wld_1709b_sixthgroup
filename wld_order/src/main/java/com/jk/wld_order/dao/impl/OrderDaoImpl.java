package com.jk.wld_order.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.stereotype.Repository;

import com.jk.wld_order.dao.OrderDao;

@Repository
public class OrderDaoImpl implements OrderDao{
	 @Resource
	 private  SessionFactory  sessionFactory;
	 
	
	 public List queryorder() {
		
		String  hql  = "from  Order";
     	Session session = sessionFactory.getCurrentSession();
		
         Query query = session.createQuery(hql);
		
         List list = query.list();
		
		return list;
	}


	@Override
	public Integer getorderSum(Integer producttype,String zhanghao) {
		
		   
			
		
		   String sql ="select  count(1) from t_order o"
	        		+ " ,t_user u,t_channel c,t_product p , t_userinfo i where "
	        		+ " o.channelid=c.id and o.userid=u.userid and o.productid = p.productid "
	        		+ "and  o.userinfoid = i.userinfoid  and  o.orderstatus=''";
		
		/* String  sql="select  count(1)  from   Order";*/
 		   
		   
		   if(producttype!=null){
		    	
			   sql+= " and p.producttype= "+producttype+" ";
		    	
		    }
		   
		   if (zhanghao!=null && zhanghao.trim()!="") {
				sql+="  and ( o.orderno like '"+zhanghao+"'  or  u.username like '"+zhanghao+"'   or  u.userphone like '"+zhanghao+"' )";
		}
		   
	       Session session = sessionFactory.getCurrentSession();
			
			List list = session.createSQLQuery(sql).list();
			
			return Integer.parseInt(list.get(0)+"" );
	}


	@Override
	public List getorderlist(Integer start, Integer pageSize,Integer producttype,String zhanghao) {
		
		
        String  sql= "select u.userphone,u.username,u.userid,o.orderno,o.orderid,c.channelid,p.productname,i.userinfoid,"
        		+ "p.producttype,o.orderdate,o.orderstatus from t_order o"
        		+ " ,t_user u,t_channel c,t_product p , t_userinfo i where "
        		+ " o.channelid=c.id and o.userid=u.userid and o.productid = p.productid "
        		+ "and  o.userinfoid = i.userinfoid  and  o.orderstatus=''";
				
        if(producttype!=null){
	    	
			   sql+= " and o.orderstatus= "+producttype+" ";
		    	
		    }
        
        if (zhanghao!=null && zhanghao.trim()!="") {
			sql+="  and ( o.orderno like '"+zhanghao+"'  or  u.username like '"+zhanghao+"'   or  u.userphone like '"+zhanghao+"' )";
	}
	   
		Session session = sessionFactory.getCurrentSession();
		
		        List list = session.createSQLQuery(sql).
				setFirstResult(start).setMaxResults(pageSize).
				//转化为Map集合 ，用来获取键值对的值
				setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP).
				list();
		
		
		return list;
	}


	@Override
	public List queryinfoByinfoid(String userphone,String orderno) {
	
	 String  sql ="select   u.userphone,u.username,i.Accountlocation,i.Education,"
	 		+ "i.cardnumber,i.Maritalstatus,i.sex,i.Submissiontime  from  t_userinfo i ,t_user u  "
	 		+ "where i.userid=u.userid ";
	 	
	 
	 if(userphone!=null && !userphone.equals(userphone.trim())){
		 
		 sql +=  " and  u.userphone= '"+userphone.trim()+"' ";
	 }
	 

	 
	 
        Session session = sessionFactory.getCurrentSession();
		
		List list = session.createSQLQuery(sql).setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP).list();
		
		return list;
	}


	@Override
	public List queryborrowByUserid(String userid) {
		

		 String  sql ="select w.borrowid,w.borrowmoney,w.borrowmonth,"
		 		+ "w.borrowtime,w.borrowuse,w.borrowinterest,w.borrowway,w.repaymoney,"
		 		+ "w.repaysource,w.repayway  from  t_userinfo u,t_borrow"
		 		+ " w  where u.borrowid = w.borrowid";
		 	
		 
		 if(userid!=null && !userid.equals(userid.trim())){
			 
			 sql +=  "  and  u.userid ='"+userid.trim()+"' ";
		 }
		 	 	 
	        Session session = sessionFactory.getCurrentSession();
			
			List list = session.createSQLQuery(sql).setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP).list();
			
			return list;
	}


	@Override
	public List companylist(String userid1) {
	
		
		String sql=" select a.userphone,b.gongaddress,b.gonggui,b.gonghang,b.gongname,b.gongnumber,b.gongphone "
				+ " from t_user a,t_gongsi b where  a.userid=b.userid and a.userid=  '"+userid1.trim()+"' ";
		
		List list = sessionFactory.getCurrentSession().createSQLQuery(sql).setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP).list();
		
		return list;
		
		
		
	}


	@Override
	public List bankinglist(String useridbrank) {
		
		
		String sql="select  b.banknumber,b.bankphone,t.branktypename"
				+ " from t_bankcard b,t_banktype t,t_user u where"
				+ " b.userid=u.userid and  b.banktypeid =t.branktyprid"
				+ "  and  u.userid='"+useridbrank.trim()+"'";
		
		List list = sessionFactory.getCurrentSession().createSQLQuery(sql).setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP).list();
		
		return list;
	}


	@Override
	public List queryhouselist(String useridhouse) {
		String sql="select  h.house,h.houseaddress,h.houseaffiliation,h.housebuyprice,"
				+ "h.housebuytime,h.housebuytype,h.housecount,h.houseid   from t_house "
				+ "h , t_user u where  h.userid= u.userid "
				+ " and u.userid='"+useridhouse.trim()+"'";
		
		List list = sessionFactory.getCurrentSession().createSQLQuery(sql).setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP).list();
		
		return list;
	}


	@Override
	public List querycarlist(String useridhouse) {
		
		String sql="select  c.carbuytime,c.carbuytype,c.carcount,c.carid,c.carpeople,c.carprice,c.carstatus from  "
				+ "t_car c, t_user u where c.userid = u.userid   and u.userid='"+useridhouse.trim()+"'";
		
		List list = sessionFactory.getCurrentSession().createSQLQuery(sql).setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP).list();
		
		return list;
	}


	@Override
	public List querygongsilist(String useridhouse) {
		
		String  sql ="select  g.bumen,g.gongaddress,g.gonggui,"
				+ "g.gongsixingzhi,g.gongname,g.gongnumber,g.gongphone,"
				+ "g.gongshouru,g.gongsiid,g.ingongtime,g.shebaoka,g.yueshouru,"
				+ "g.zhiwei,g.zhiweixingzhi,g.zhuyingyewu from  t_user  u, "
				+ "t_gongsi g where u.userid=g.userid  and  u.userid='"+useridhouse.trim()+"'";
		
	    List list = sessionFactory.getCurrentSession().createSQLQuery(sql).setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP).list();
		
		return list;
	}


	@Override
	public List querypeoplelist(String useridhouse) {
		
		String  sql ="select  p.peopleid,p.peoplename,p.peoplephone,p.peoplerelation  from "
				+ " t_people p,t_user u where p.userid=u.userid  and  u.userid='"+useridhouse.trim()+"'";
		
		
		
		  List list = sessionFactory.getCurrentSession().createSQLQuery(sql).setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP).list();
			
			return list;
		
		
	}


	@Override
	public List queryguaranteelist(String useridhouse) {
		
		String sql  ="select g.guaranteeaddress,g.guaranteename,g.guaranteephone,g.registerednum"
				+ " from  t_guarantee g, t_user u where g.userid= u.userid  and  u.userid='"+useridhouse.trim()+"'";

		  List list = sessionFactory.getCurrentSession().createSQLQuery(sql).setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP).list();
			
			return list;
	}


	@Override
	public void updateorder(String orderno) {
		
		String  sql="update   t_order o set o.orderstatus='初审'  where  o.orderno='"+orderno.trim()+"'";
		
		sessionFactory.getCurrentSession().createSQLQuery(sql).executeUpdate();
		
	}


	@Override
	public Integer getdahuiorder(String ordercause, String users) {
		
		
		   String sql ="select  count(1) from t_order o"
	        		+ " ,t_user u,t_channel c,t_product p , t_userinfo i where "
	        		+ " o.channelid=c.id and o.userid=u.userid and o.productid = p.productid "
	        		+ "and  o.userinfoid = i.userinfoid  and  o.ordershen=1";
		
		/* String  sql="select  count(1)  from   Order";*/
		   
		   
		   if(ordercause!=null){
		    	
			   sql+= " and o.ordercause= '"+ordercause.trim()+"' ";
		    	
		    }
		   
		   if (users!=null && users.trim()!="") {
				sql+="  and ( o.orderno like '"+users+"'  or  u.username like '"+users+"'   or  u.userphone like '"+users+"' )";
		}
		   
	       Session session = sessionFactory.getCurrentSession();
			
			List list = session.createSQLQuery(sql).list();
			
			return Integer.parseInt(list.get(0)+"" );
	}
	


	@Override
	public List getdahuiorderList(Integer start, Integer pageSize,
			String ordercause, String users) {
		

        String  sql= "select u.userphone,u.username,u.userid,o.orderno,o.orderid,c.channelid,p.productname,i.userinfoid,"
        		+ "p.producttype,o.orderdate,o.orderstatus,o.ordercause from t_order o"
        		+ " ,t_user u,t_channel c,t_product p , t_userinfo i where "
        		+ " o.channelid=c.id and o.userid=u.userid and o.productid = p.productid "
        		+ "and  o.userinfoid = i.userinfoid  and  o.ordershen=1";
        
        if(ordercause!=null){
	    	
			   sql+= " and o.ordercause= '"+ordercause.trim()+"'";
		    	
		    }
		   
		   if (users!=null && users.trim()!="") {
				sql+="  and ( o.orderno like '"+users+"'  or  u.username like '"+users+"'   or  u.userphone like '"+users+"' )";
		}
		   
		   
			Session session = sessionFactory.getCurrentSession();
			
	        List list = session.createSQLQuery(sql).
	        		setFirstResult(start).setMaxResults(pageSize).
			//转化为Map集合 ，用来获取键值对的值
			setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP).list();
	
	
	      return list;
		   
	}
	   

	}
		
	

	

