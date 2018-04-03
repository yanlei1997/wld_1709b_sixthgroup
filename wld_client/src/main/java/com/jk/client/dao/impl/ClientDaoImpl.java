package com.jk.client.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.transform.Transformers;
import org.springframework.stereotype.Repository;

import com.jk.client.dao.ClientDao;
import com.jk.common.entity.Order;
import com.jk.common.entity.Userinfo;
@Repository
public class ClientDaoImpl implements ClientDao{

	@Resource
	private SessionFactory sessionfactory;
	
	
	
//订单记录的条数
	@Override
	public Integer getcountorder() {

		String sql2="select count(1) from t_order o,t_product p where o.productid=p.productid ";
		
		Session session = sessionfactory.getCurrentSession();
		
		int count = Integer.parseInt(session.createSQLQuery(sql2).list().get(0)+ "");
	
		return count;
	}

//订单记录的数据
	@Override
	public List orderlist(Integer start, Integer pageSize) {
		    
		    String sql="select o.orderid,o.orderno,o.orderstatus,o.orderdate,p.productname from t_order o,t_product p where o.productid=p.productid";
					    		    
			Session session = sessionfactory.getCurrentSession();
							          
			List list = session.createSQLQuery(sql).setFirstResult(start).setMaxResults(pageSize).setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP).list();
  
				System.out.println(list+"订单记录");		
			return list;
	}

//客户列表的数据条数	
	@Override
	public Integer getcountcustomer( String usern,String status) {

		String sql4="select count(1) from t_order o,t_channel c,t_user u,t_product p,t_salesman s,t_userinfo f,t_borrow b,t_bankcard bb,t_banktype ee where o.manid=s.manid "
        		+ "and o.channelid=c.id and o.productid=p.productid and o.userid=u.userid and o.userinfoid=f.userinfoid and f.borrowid=b.borrowid and u.userid= bb.userid"
        		+ " and bb.banktypeid=ee.branktyprid ";
	
		
        if (usern!=null&&!"".equals(usern.trim() )) {
        	
        	sql4+="  and  (u.username  like   '%"+usern.trim()+"%' or u.userphone like '%"+usern.trim()+"%' )";
        	
        }
        if (status!=null&&!"".equals(status.trim() )) {
			
			sql4+="  and  f.status  like   '%"+status.trim()+"%' ";

			
		}
        
		Session session = sessionfactory.getCurrentSession();
		
		int count = Integer.parseInt(session.createSQLQuery(sql4).list().get(0)+ "");
	
		return count;
		
	}

	
	//客户列表的数据以及根据用户名和状态条件查询	
	@Override
	public List querycustomer(Integer start, Integer pageSize, String usern,String status) {

		 String sql3="select b.borrowmonth,b.borrowinterest,b.repayway, f.cardnumber,f.sex,f.Education,f.Maritalstatus,f.Accountlocation,f.nowaddress,o.orderid,"
        		+ "c.companyname, u.userphone,u.username,bb.banknumber,bb.bankphone,ee.branktypename,o.channelid,p.productname,p.producttype,o.orderdate,f.status,s.manname "
        		+ "from t_order o,t_channel c,t_user u,t_product p,t_salesman s,t_userinfo f,t_borrow b,t_bankcard bb,t_banktype ee where o.manid=s.manid "
        		+ "and o.channelid=c.id and o.productid=p.productid and o.userid=u.userid and o.userinfoid=f.userinfoid and f.borrowid=b.borrowid and u.userid= bb.userid"
        		+ " and bb.banktypeid=ee.branktyprid ";


        if (usern!=null&&!"".equals(usern.trim() )) {
        	
        	sql3+="  and  (u.username  like   '%"+usern.trim()+"%' or u.userphone like '%"+usern.trim()+"%' )";
        	
        }
        
       if (status!=null&&!"".equals(status.trim() )) {
			
			sql3+="  and  f.status  like   '%"+status.trim()+"%' ";

			
		}
        
        Session session = sessionfactory.getCurrentSession();
        
		List list = session.createSQLQuery(sql3).setFirstResult(start).setMaxResults(pageSize).setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP).list();

		System.out.println(list+"客户列表");		
		return list;
	}

	
  //查询黑名单客户的数据条数
	@Override
	public Integer getcountblack(String usern) {


		  String sql7="select count(1) from t_user u,t_userinfo f,t_order o "
	        		+ "where o.userid=u.userid and o.userinfoid=f.userinfoid and o.ordercause not like  '审核通过'";


        if (usern!=null&&!"".equals(usern.trim() )) {
        	
        	sql7+="  and  (u.username  like   '%"+usern.trim()+"%' or u.userphone like '%"+usern.trim()+"%' )";
        	
        }
        
		Session session = sessionfactory.getCurrentSession();
		
		int count = Integer.parseInt(session.createSQLQuery(sql7).list().get(0)+ "");
	
		return count;
	}

  //查询黑名单客户的数据
	@Override
	public List queryblacklist(Integer start, Integer pageSize, String usern) {

	    String sql6="select u.userphone,u.username,f.cardnumber,o.channelid,o.ordercause "
        		+ "from t_user u,t_userinfo f,t_order o "
        		+ "where o.userid=u.userid and o.userinfoid=f.userinfoid "
        		+ "and o.ordercause not like  '审核通过'";
		  
        if (usern!=null&&!"".equals(usern.trim() )) {
        	
        	sql6+="  and  (u.username  like   '%"+usern.trim()+"%' or u.userphone like '%"+usern.trim()+"%' )";
        	
        }
    
        
        Session session = sessionfactory.getCurrentSession();
        
		List list = session.createSQLQuery(sql6).setFirstResult(start).setMaxResults(pageSize).setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP).list();

			System.out.println(list+"黑名单客户");		
		return list;
	}
     



	

	

}
