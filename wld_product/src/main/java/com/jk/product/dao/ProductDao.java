package com.jk.product.dao;

import java.util.List;

public interface ProductDao {

	/**
	 * <pre>queryProductCount(查询产品信息总条数)   
	 * 创建人：闫磊 1092204331@qq.com     
	 * 创建时间：2018年3月18日 下午9:54:28    
	 * 修改人：闫磊 1092204331@qq.com      
	 * 修改时间：2018年3月18日 下午9:54:28    
	 * 修改备注： 
	 * @return</pre>
	 */
	Integer queryProductCount();

	/**
	 * <pre>queryProductList(查询产品信息内容)   
	 * 创建人：闫磊 1092204331@qq.com     
	 * 创建时间：2018年3月18日 下午9:54:31    
	 * 修改人：闫磊 1092204331@qq.com      
	 * 修改时间：2018年3月18日 下午9:54:31    
	 * 修改备注： 
	 * @param start
	 * @param pageSize
	 * @return</pre>
	 */
	List queryProductList(Integer start, Integer pageSize);

}
