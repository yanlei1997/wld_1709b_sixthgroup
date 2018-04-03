package com.jk.common.dao;

import java.util.List;

import com.jk.common.entity.Menu;

public interface MenuDao {

	/**
	 * <pre>queryMenu(递归查询树信息)   
	 * 创建人：闫磊 1092204331@qq.com     
	 * 创建时间：2018年3月16日 下午8:09:35    
	 * 修改人：闫磊 1092204331@qq.com      
	 * 修改时间：2018年3月16日 下午8:09:35    
	 * 修改备注： 
	 * @param i
	 * @return</pre>
	 */
	List<Menu> queryMenu(int i);


}
