package com.jk.refuse.dao;

import java.util.List;

public interface OrderrefuseDao {
/**
 * <pre>orderrefusesum(订单管理得已拒订单查询总条数)   
 * 创建人：李烨卿897846548@qq.com      
 * 创建时间：2018年3月13日 上午11:49:11    
 * 修改人： 李烨卿     
 * 修改时间：2018年3月13日 上午11:49:11    
 * 修改备注： 
 * @param serachname 
 * @return</pre>
 */
	Integer orderrefusesum(String serachname);
/**
 * <pre>orderrefuselist(订单管理得已拒订单查询每页数据)   
 * 创建人：李烨卿897846548@qq.com      
 * 创建时间：2018年3月13日 上午11:49:29    
 * 修改人： 李烨卿     
 * 修改时间：2018年3月13日 上午11:49:29    
 * 修改备注： 
 * @param start
 * @param pageSize
 * @param serachname 
 * @return</pre>
 */
	List orderrefuselist(Integer start, Integer pageSize, String serachname);
	/**
	 * <pre>queryorderuseranduserinfobyphone(查询用户详细页基本信息)   
	 * 创建人：李烨卿897846548@qq.com      
	 * 创建时间：2018年3月14日 下午6:56:35    
	 * 修改人： 李烨卿     
	 * 修改时间：2018年3月14日 下午6:56:35    
	 * 修改备注： 
	 * @param userphone
	 * @return</pre>
	 */
List queryorderuseranduserinfobyphone(String userphone);
/**
 * <pre>orderrefuseborrow(查询用户详细页借款信息)   
 * 创建人：李烨卿897846548@qq.com      
 * 创建时间：2018年3月15日 下午7:05:18    
 * 修改人： 李烨卿     
 * 修改时间：2018年3月15日 下午7:05:18    
 * 修改备注： 
 * @param userphone
 * @return</pre>
 */
	List orderrefuseborrow(String userphone);
	/**
	 * <pre>orderrefusegongsi(查询用户详情页得企业信息)   
	 * 创建人：李烨卿897846548@qq.com      
	 * 创建时间：2018年3月15日 下午9:03:49    
	 * 修改人： 李烨卿     
	 * 修改时间：2018年3月15日 下午9:03:49    
	 * 修改备注： 
	 * @param userphone
	 * @return</pre>
	 */
List orderrefusegongsi(String userphone);
/**
 * <pre>orderrefusebrankcard(查询用户详情页得银行卡)   
 * 创建人：李烨卿897846548@qq.com      
 * 创建时间：2018年3月15日 下午9:30:35    
 * 修改人： 李烨卿     
 * 修改时间：2018年3月15日 下午9:30:35    
 * 修改备注： 
 * @param userphone
 * @return</pre>
 */
	List orderrefusebrankcard(String userphone);
	/**
	 * <pre>orderrefusezichan(风控资料得资产信息查询)   
	 * 创建人：李烨卿897846548@qq.com      
	 * 创建时间：2018年3月16日 下午9:21:20    
	 * 修改人： 李烨卿     
	 * 修改时间：2018年3月16日 下午9:21:20    
	 * 修改备注： 
	 * @param userphone
	 * @return</pre>
	 */
List orderrefusezichan(String userphone);
/**
 * <pre>orderrefusedanbao(风控资料得担保人查询)   
 * 创建人：李烨卿897846548@qq.com      
 * 创建时间：2018年3月17日 上午11:07:18    
 * 修改人： 李烨卿     
 * 修改时间：2018年3月17日 上午11:07:18    
 * 修改备注： 
 * @param userphone
 * @return</pre>
 */
	List orderrefusedanbao(String userphone);


}
