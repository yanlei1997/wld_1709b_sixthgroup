package com.jk.channel.dao;

import java.util.List;

import com.jk.common.entity.Channel;

public interface ChannelDao {

	/**
	 * 查询渠道信息条数
	 * @param cn 
	 * @return
	 */
	Integer queryChannelCount(String cn);

	/**
	 * 查询渠道信息内容
	 * @param start
	 * @param pageSize
	 * @param cn 
	 * @return
	 */
	List queryChannelList(Integer start, Integer pageSize, String cn);

	/**
	 * <pre>upd(根据序号查询到一条对应数据并回显到页面)   
	 * 创建人：闫磊 1092204331@qq.com     
	 * 创建时间：2018年3月14日 下午1:31:44    
	 * 修改人：闫磊 1092204331@qq.com      
	 * 修改时间：2018年3月14日 下午1:31:44    
	 * 修改备注： 
	 * @param id
	 * @return</pre>
	 */
	List<Channel> upd(String id);

	/**
	 * <pre>updateChannel(修改渠道信息)   
	 * 创建人：闫磊 1092204331@qq.com     
	 * 创建时间：2018年3月14日 下午9:41:32    
	 * 修改人：闫磊 1092204331@qq.com      
	 * 修改时间：2018年3月14日 下午9:41:32    
	 * 修改备注： 
	 * @param channel</pre>
	 */
	void updateChannel(Channel channel);

	/**
	 * <pre>deleteChannel(根据序号删除一条渠道信息)   
	 * 创建人：闫磊 1092204331@qq.com     
	 * 创建时间：2018年3月14日 下午11:14:07    
	 * 修改人：闫磊 1092204331@qq.com      
	 * 修改时间：2018年3月14日 下午11:14:07    
	 * 修改备注： 
	 * @param id</pre>
	 */
	void deleteChannel(String id);

	/**
	 * <pre>addChannel(新增渠道信息)   
	 * 创建人：闫磊 1092204331@qq.com     
	 * 创建时间：2018年3月15日 下午4:51:09    
	 * 修改人：闫磊 1092204331@qq.com      
	 * 修改时间：2018年3月15日 下午4:51:09    
	 * 修改备注： 
	 * @param channel</pre>
	 */
	void addChannel(Channel channel);

}
