package com.jk.risk.service;



import java.util.List;

import com.jk.common.util.PageUtil;

/**
 * 
 * <pre>项目名称：风控页面订单查询列表    
 * 类名称：RiskService    
 * 类描述：    
 * 创建人：王爽 cht_java@126.com    
 * 创建时间：2018年3月13日 上午10:47:00    
 * 修改人：王爽 cht_java@126.com  
 * 修改时间：2018年3月13日 上午10:47:00    
 * 修改备注：       
 * @version </pre>
 */
public interface RiskService {
/**
 * <pre>listrisk(风控订单页面)   
 * 创建人：王爽 cht_java@126.com     
 * 创建时间：2018年3月15日 下午4:16:02    
 * 修改人：王爽 cht_java@126.com      
 * 修改时间：2018年3月15日 下午4:16:02    
 * 修改备注： 
 * @param pageUtil
 * @param name
 * @param orderstatus
 * @return</pre>
 */
	PageUtil listrisk(PageUtil pageUtil, String name, String orderstatus);
/**
 * <pre>listuserinfobyid(初审页面  用户基本信息 查询)   
 * 创建人：王爽 cht_java@126.com     
 * 创建时间：2018年3月14日 下午10:07:14    
 * 修改人：王爽 cht_java@126.com      
 * 修改时间：2018年3月14日 下午10:07:14    
 * 修改备注： 
 * @param userphone
 * @return</pre>
 */
	List listuserinfobyid(String userphone);
	/**
	 * <pre>listgongsibyuserid(初审页面   用户基本信息  企业查询)   
	 * 创建人：王爽 cht_java@126.com     
	 * 创建时间：2018年3月15日 下午4:15:37    
	 * 修改人：王爽 cht_java@126.com      
	 * 修改时间：2018年3月15日 下午4:15:37    
	 * 修改备注： 
	 * @param userphone
	 * @return</pre>
	 */
List listgongsibyuserid(String userphone);
/**
 * <pre>listyinhangbyphone(初审页面  银行卡查询)   
 * 创建人：王爽 cht_java@126.com     
 * 创建时间：2018年3月15日 下午7:14:41    
 * 修改人：王爽 cht_java@126.com      
 * 修改时间：2018年3月15日 下午7:14:41    
 * 修改备注： 
 * @param userid
 * @return</pre>
 */
	List listyinhangbyphone(String userid);
	/**
	 * <pre>listjiekuanbyid(初审页面借款信息表查询)   
	 * 创建人：王爽 cht_java@126.com     
	 * 创建时间：2018年3月15日 下午8:36:57    
	 * 修改人：王爽 cht_java@126.com      
	 * 修改时间：2018年3月15日 下午8:36:57    
	 * 修改备注： 
	 * @param userphone
	 * @return</pre>
	 */
List listjiekuanbyid(String userphone);
/**
 * <pre>listcarbyuserid(风控资料  初审页面  车表查询)   
 * 创建人：王爽 cht_java@126.com     
 * 创建时间：2018年3月16日 下午6:38:01    
 * 修改人：王爽 cht_java@126.com      
 * 修改时间：2018年3月16日 下午6:38:01    
 * 修改备注： 
 * @param userid
 * @return</pre>
 */
	List listcarbyuserid(String userid);
	/**
	 * <pre>listgongsibyuserphone(风控资料 公司查询 )   
	 * 创建人：王爽 cht_java@126.com     
	 * 创建时间：2018年3月16日 下午8:32:07    
	 * 修改人：王爽 cht_java@126.com      
	 * 修改时间：2018年3月16日 下午8:32:07    
	 * 修改备注： 
	 * @param userphone
	 * @return</pre>
	 */
List listgongsibyuserphone(String userphone);
/**
 * <pre>listdanbaorenbyuserid(风控资料 担保人查询)   
 * 创建人：王爽 cht_java@126.com     
 * 创建时间：2018年3月16日 下午9:16:28    
 * 修改人：王爽 cht_java@126.com      
 * 修改时间：2018年3月16日 下午9:16:28    
 * 修改备注： 
 * @param userid
 * @return</pre>
 */
	List listdanbaorenbyuserid(String userid);
	/**
	 * <pre>listuseridbylianxi(风控资料 联系人查询)   
	 * 创建人：王爽 cht_java@126.com     
	 * 创建时间：2018年3月16日 下午9:40:03    
	 * 修改人：王爽 cht_java@126.com      
	 * 修改时间：2018年3月16日 下午9:40:03    
	 * 修改备注： 
	 * @param userid
	 * @return</pre>
	 */
List listuseridbylianxi(String userid);
/**
 * <pre>listhousebyuserid(风控资料房屋表查询)   
 * 创建人：王爽 cht_java@126.com     
 * 创建时间：2018年3月16日 下午10:03:00    
 * 修改人：王爽 cht_java@126.com      
 * 修改时间：2018年3月16日 下午10:03:00    
 * 修改备注： 
 * @param userid
 * @return</pre>
 */
	List listhousebyuserid(String userid);
/**
 * 	<pre>updateshen(修改审核状态)   
 * 创建人：王爽 cht_java@126.com     
 * 创建时间：2018年3月18日 下午9:03:09    
 * 修改人：王爽 cht_java@126.com      
 * 修改时间：2018年3月18日 下午9:03:09    
 * 修改备注： </pre>
 * @param orderstatus 
 * @param ordershen 
 * @param userid 
 */
void updateshen(String userid, Integer ordershen, String orderstatus);


}
