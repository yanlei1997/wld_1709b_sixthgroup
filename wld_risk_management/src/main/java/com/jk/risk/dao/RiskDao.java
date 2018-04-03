package com.jk.risk.dao;

import java.util.List;

/**
 * 
 * <pre>项目名称：风控订单列表查询    
 * 类名称：RiskDao    
 * 类描述：    
 * 创建人：王爽 cht_java@126.com    
 * 创建时间：2018年3月13日 上午10:48:15    
 * 修改人：王爽 cht_java@126.com  
 * 修改时间：2018年3月13日 上午10:48:15    
 * 修改备注：       
 * @version </pre>
 */
public interface RiskDao  {

	Integer querycount(String orderno, String orderstatus);

	List querylist(Integer start, Integer pageSize, String name, String orderstatus);
/**
 * <pre>listuserinfobyid(初审页面 用户基本信息查询)   
 * 创建人：王爽 cht_java@126.com     
 * 创建时间：2018年3月14日 下午10:08:37    
 * 修改人：王爽 cht_java@126.com      
 * 修改时间：2018年3月14日 下午10:08:37    
 * 修改备注： 
 * @param userphone
 * @return</pre>
 */
	List listuserinfobyid(String userphone);
/**
 * <pre>listgongsibyuserid(初审页面  企业信息查询)   
 * 创建人：王爽 cht_java@126.com     
 * 创建时间：2018年3月15日 下午4:20:15    
 * 修改人：王爽 cht_java@126.com      
 * 修改时间：2018年3月15日 下午4:20:15    
 * 修改备注： 
 * @param userphone
 * @return</pre>
 */
List listgongsibyuserid(String userphone);
/**
 * <pre>listyinhangbyphone(初审页面  银行卡查询)   
 * 创建人：王爽 cht_java@126.com     
 * 创建时间：2018年3月15日 下午7:15:31    
 * 修改人：王爽 cht_java@126.com      
 * 修改时间：2018年3月15日 下午7:15:31    
 * 修改备注： 
 * @param userid
 * @return</pre>
 */
List listyinhangbyphone(String userid);
/**
 * <pre>listjiekuanbyid(初审页面  借款表查询)   
 * 创建人：王爽 cht_java@126.com     
 * 创建时间：2018年3月15日 下午8:37:42    
 * 修改人：王爽 cht_java@126.com      
 * 修改时间：2018年3月15日 下午8:37:42    
 * 修改备注： 
 * @param userphone
 * @return</pre>
 */
List listjiekuanbyid(String userphone);
/**
 * <pre>listcarbyuserid(初审页面  车表查询)   
 * 创建人：王爽 cht_java@126.com     
 * 创建时间：2018年3月16日 下午6:39:02    
 * 修改人：王爽 cht_java@126.com      
 * 修改时间：2018年3月16日 下午6:39:02    
 * 修改备注： 
 * @param userid
 * @return</pre>
 */

List listcarbyuserid(String userid);
/**
 * <pre>listgongsibyuserphone( 风控资料  公司表查询)   
 * 创建人：王爽 cht_java@126.com     
 * 创建时间：2018年3月16日 下午8:33:13    
 * 修改人：王爽 cht_java@126.com      
 * 修改时间：2018年3月16日 下午8:33:13    
 * 修改备注： 
 * @param userphone
 * @return</pre>
 */
List listgongsibyuserphone(String userphone);
/**
 * <pre>listdanbaorenbyuserid(风控信息  担保人查询)   
 * 创建人：王爽 cht_java@126.com     
 * 创建时间：2018年3月16日 下午9:17:34    
 * 修改人：王爽 cht_java@126.com      
 * 修改时间：2018年3月16日 下午9:17:34    
 * 修改备注： 
 * @param userid
 * @return</pre>
 */

List listdanbaorenbyuserid(String userid);

/**
 * <pre>listuseridbylianxi(风控资料  联系人单表查询)   
 * 创建人：王爽 cht_java@126.com     
 * 创建时间：2018年3月16日 下午9:40:40    
 * 修改人：王爽 cht_java@126.com      
 * 修改时间：2018年3月16日 下午9:40:40    
 * 修改备注： 
 * @param userid
 * @return</pre>
 */
List listuseridbylianxi(String userid);
/**
 * <pre>listhousebyuserid(风控资料  房屋表单表查询)   
 * 创建人：王爽 cht_java@126.com     
 * 创建时间：2018年3月16日 下午10:04:09    
 * 修改人：王爽 cht_java@126.com      
 * 修改时间：2018年3月16日 下午10:04:09    
 * 修改备注： 
 * @param userid
 * @return</pre>
 */

List listhousebyuserid(String userid);

void updateshen(String sql);


}
