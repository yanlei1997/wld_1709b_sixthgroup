package com.jk.refuse.dao.Impl;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.stereotype.Repository;

import com.jk.refuse.dao.OrderrefuseDao;
@Repository
public class OrderrefuseDaoImpl implements OrderrefuseDao{

	@Resource
	private SessionFactory sessionFactory;
	
	@Override
	public Integer orderrefusesum(String serachname) {
		
		String sql="select count(a.orderid) from t_order a ,t_user b,t_product c ,t_channel d where "
				  +"  a.userid=b.userid and a.productid=c.productid and a.channelid=d.id and a.ordershen=3 ";
		
		if (serachname!=null&& serachname.trim()!="") {
			
			sql+="  and ( a.orderno like '%"+serachname+"%'  or  b.username like '%"+serachname+"%'   or  b.userphone like '%"+serachname+"%')";
		}
		
		Session session = sessionFactory.getCurrentSession();
		
		List list = session.createSQLQuery(sql).list();
		
		return Integer.parseInt(list.get(0)+"");
	}

	@Override
	public List orderrefuselist(Integer start, Integer pageSize,String serachname) {

		String  sql="select a.orderno,b.userphone,b.username,d.channelid,a.orderdate,c.productname,c.producttype,a.orderid  "
				+ "from t_order a ,t_user b,t_product c ,t_channel d where "
				 +"  a.userid=b.userid and a.productid=c.productid and a.channelid=d.id and a.ordershen=3";;
		
		if (serachname!=null&&serachname.trim()!="") {
			
			sql+="  and  (a.orderno like '%"+serachname+"%'  or  b.username like '%"+serachname+"%'   or  b.userphone like '%"+serachname+"%')";
		}
		
		Session session = sessionFactory.getCurrentSession();
		
		List list = session.createSQLQuery(sql).setFirstResult(start).setMaxResults(pageSize).setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP).list();

		return list;
	}

	@Override
	public List queryorderuseranduserinfobyphone(String userphone) {

		String sql=" select a.userphone,a.username,b.cardnumber,b.accountlocation,b.education,b.maritalstatus,b.nowaddress,b.sex,b.status,b.submissiontime "
        +" from t_user a ,t_userinfo b where a.userid=b.userid and a.userphone="+userphone;
		
		Session session = sessionFactory.getCurrentSession();
		
		List list = session.createSQLQuery(sql).setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP).list();
		
		return list;
	}

	@Override
	public List orderrefuseborrow(String userphone) {

		String sql="select a.borrowway,a.borrowmoney,a.repayway,a.borrowtime,"
				+ "  a.borrowmonth,a.borrowservice,a.borrowuse,a.repaysource,a.repaymoney  "
				+ "  from t_borrow a , t_userinfo b, t_user c  "
				+ "   where  a.borrowid=b.borrowid and b.userid=c.userid and c.userphone="+userphone;

		Session session = sessionFactory.getCurrentSession();
		
		List list = session.createSQLQuery(sql).setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP).list();
		
		return list;
	}

	@Override
	public List orderrefusegongsi(String userphone) {

		String sql="select b.gongname,b.gongnumber,b.gonghang,"
				+ "  b.gonggui,b.gongphone,b.gongaddress,"
				+"b.gongsixingzhi,b.bumen,b.ingongtime,b.gongshouru,"
				+ "b.shebaoka,b.yueshouru,b.zhiwei,b.zhiweixingzhi,b.zhuyingyewu "
				+ "  from t_user a ,t_gongsi b where a.userid=b.userid and a.userphone="+userphone;

		Session session = sessionFactory.getCurrentSession();
		
		List list = session.createSQLQuery(sql).setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP).list();
		
		return list;
	}

	@Override
	public List orderrefusebrankcard(String userphone) {

		String sql="select c.branktypename,b.banknumber,b.bankphone "
				+ " from t_user a,t_bankcard b ,t_banktype c"
				+ "  where a.userid=b.userid and b.banktypeid=c.branktyprid  "
				+ "  and a.userphone="+userphone;
		
		Session session = sessionFactory.getCurrentSession();
		
		List list = session.createSQLQuery(sql).setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP).list();
		
		return list;
	}

	@Override
	public List orderrefusezichan(String userphone) {
		
		String sql="select  c.housecount,c.housebuytime,c.housebuytype,"
				+ " c.housebuyprice,c.houseaddress,c.houseaffiliation,c.houseid,a.carid,"
				+"  a.carcount,a.carbuytype,a.carbuytime,a.carprice,a.carpeople "
				+"   from t_car a,t_user b ,t_house c  where  a.userid=b.userid and c.userid=b.userid "
				+ "  and b.userphone="+userphone;
		
		Session session = sessionFactory.getCurrentSession();
		
		List list = session.createSQLQuery(sql).setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP).list();
		
		return list;
	}

	@Override
	public List orderrefusedanbao(String userphone) {

		String  sql ="select  p.peopleid,p.peoplename,p.peoplephone,p.peoplerelation  from "
				+ " t_people p,t_user u where p.userid=u.userid  and  u.userphone='"+userphone.trim()+"'";
		
		Session session = sessionFactory.getCurrentSession();

		 List list = sessionFactory.getCurrentSession().createSQLQuery(sql).setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP).list();
		
		return list;
	}


}
