package com.jk.channel.service;

import java.util.List;

import com.jk.common.entity.Channel;
import com.jk.common.util.PageUtil;

public interface ChannelService {

	/**
	 * 查询渠道信息
	 * @param pageUtil 
	 * @param cn 
	 * @return
	 */
	PageUtil queryChannel(PageUtil pageUtil, String cn);

	/**
	 * <pre>upd(根据序号查询对应的信息回显到页面)   
	 * 创建人：闫磊 1092204331@qq.com     
	 * 创建时间：2018年3月14日 下午1:30:25    
	 * 修改人：闫磊 1092204331@qq.com      
	 * 修改时间：2018年3月14日 下午1:30:25    
	 * 修改备注： 
	 * @param id
	 * @return</pre>
	 */
	List<Channel> upd(String id);

	/**
	 * <pre>updateChannel(修改渠道信息)   
	 * 创建人：闫磊 1092204331@qq.com     
	 * 创建时间：2018年3月14日 下午11:13:02    
	 * 修改人：闫磊 1092204331@qq.com      
	 * 修改时间：2018年3月14日 下午11:13:02    
	 * 修改备注： 
	 * @param channel</pre>
	 */
	void updateChannel(Channel channel);

	/**
	 * <pre>deleteChannel(根据序号删除一行数据)   
	 * 创建人：闫磊 1092204331@qq.com     
	 * 创建时间：2018年3月14日 下午11:13:16    
	 * 修改人：闫磊 1092204331@qq.com      
	 * 修改时间：2018年3月14日 下午11:13:16    
	 * 修改备注： 
	 * @param id</pre>
	 */
	void deleteChannel(String id);

	/**
	 * <pre>addChannel(新增渠道信息)   
	 * 创建人：闫磊 1092204331@qq.com     
	 * 创建时间：2018年3月15日 下午4:49:59    
	 * 修改人：闫磊 1092204331@qq.com      
	 * 修改时间：2018年3月15日 下午4:49:59    
	 * 修改备注： 
	 * @param channel</pre>
	 */
	void addChannel(Channel channel);

}
