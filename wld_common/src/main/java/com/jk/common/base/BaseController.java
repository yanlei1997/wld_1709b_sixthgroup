/** 
 * <pre>项目名称:wld_common 
 * 文件名称:BaseController.java 
 * 包名:com.jk.common.base 
 * 创建日期:2018年3月10日上午8:40:16 
 * Copyright (c) 2018, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.jk.common.base;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;


/** 
 * <pre>项目名称：wld_common    
 * 类名称：BaseController    
 * 类描述：    
 * 创建人：李聪聪 cong66990@qq.com    
 * 创建时间：2018年3月10日 上午8:40:16    
 * 修改人：李聪聪 cong66990@qq.com  
 * 修改时间：2018年3月10日 上午8:40:16    
 * 修改备注：       
 * @version </pre>    
 */
public class BaseController {
	
	public void toJson(Object obj){
		HttpServletResponse response=ServletActionContext.getResponse();
		
		response.setCharacterEncoding("UTF-8");
		
		response.setContentType("text/json;charset=utf-8");		
		
		JSONObject.DEFFAULT_DATE_FORMAT="yyyy-MM-dd";
		
		PrintWriter writer=null;
		
		try {

			String jsonString = JSON.toJSONString(obj,SerializerFeature.WriteDateUseDateFormat);
			
			writer = response.getWriter();
			
			writer.write(jsonString);

			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			
			//关流操作
			writer.close();
		}
		
		
	}

}
