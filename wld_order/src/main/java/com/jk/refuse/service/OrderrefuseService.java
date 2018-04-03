package com.jk.refuse.service;

import java.util.List;

import com.jk.common.util.PageUtil;

public interface OrderrefuseService {
/**
 * <pre>orderrefuse(订单管理得已拒订单查询)   
 * 创建人：李烨卿897846548@qq.com      
 * 创建时间：2018年3月13日 上午11:48:22    
 * 修改人： 李烨卿     
 * 修改时间：2018年3月13日 上午11:48:22    
 * 修改备注： 
 * @param pageUtil
 * @param serachname 
 * @return</pre>
 */
	PageUtil orderrefuse(PageUtil pageUtil, String serachname);
/**
 * <pre>queryorderuseranduserinfobyphone(查询基本信息)   
 * 创建人：李烨卿897846548@qq.com      
 * 创建时间：2018年3月14日 下午6:55:57    
 * 修改人： 李烨卿     
 * 修改时间：2018年3月14日 下午6:55:57    
 * 修改备注： 
 * @param userphone
 * @return</pre>
 */
List queryorderuseranduserinfobyphone(String userphone);
/**
 * <pre>orderrefuseborrow(查询借款信息)   
 * 创建人：李烨卿897846548@qq.com      
 * 创建时间：2018年3月15日 下午7:04:35    
 * 修改人： 李烨卿     
 * 修改时间：2018年3月15日 下午7:04:35    
 * 修改备注： 
 * @param userphone
 * @return</pre>
 */
List orderrefuseborrow(String userphone);
/**
 * <pre>orderrefusegongsi(查询订单详情页得企业信息)   
 * 创建人：李烨卿897846548@qq.com      
 * 创建时间：2018年3月15日 下午9:03:06    
 * 修改人： 李烨卿     
 * 修改时间：2018年3月15日 下午9:03:06    
 * 修改备注： 
 * @param userphone
 * @return</pre>
 */
List orderrefusegongsi(String userphone);
/**
 * <pre>orderrefusebrankcard(查询订单详情页银行卡信息)   
 * 创建人：李烨卿897846548@qq.com      
 * 创建时间：2018年3月15日 下午9:29:59    
 * 修改人： 李烨卿     
 * 修改时间：2018年3月15日 下午9:29:59    
 * 修改备注： 
 * @param userphone
 * @return</pre>
 */
List orderrefusebrankcard(String userphone);
/**
 * <pre>orderrefusezichan(风控资料得资产信息查询)   
 * 创建人：李烨卿897846548@qq.com      
 * 创建时间：2018年3月16日 下午9:20:43    
 * 修改人： 李烨卿     
 * 修改时间：2018年3月16日 下午9:20:43    
 * 修改备注： 
 * @param userphone
 * @return</pre>
 */
List orderrefusezichan(String userphone);
/**
 * <pre>orderrefusedanbao(风控资料得担保人查询)   
 * 创建人：李烨卿897846548@qq.com      
 * 创建时间：2018年3月17日 上午11:06:34    
 * 修改人： 李烨卿     
 * 修改时间：2018年3月17日 上午11:06:34    
 * 修改备注： 
 * @param userphone
 * @return</pre>
 */
List orderrefusedanbao(String userphone);



}
