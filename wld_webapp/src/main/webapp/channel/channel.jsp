<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<script type="text/javascript"  src="<%=request.getContextPath()%>/js/jquery.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/easyui/locale/easyui-lang-zh_CN.js"></script>
<link rel="stylesheet" href="<%=request.getContextPath()%>/easyui/themes/bootstrap/easyui.css" type="text/css"/>
<link rel="stylesheet" href="<%=request.getContextPath()%>/easyui/themes/icon.css" type="text/css"/>

</head>
<body>

	<input class="easyui-textbox" style="width:200px;height:35px" id="cn">
	<a class="easyui-linkbutton" data-options="iconCls:'icon-search'" href=javascript:where()>搜索</a>
	   &nbsp;&nbsp;&nbsp;
	<a class="easyui-linkbutton" data-options="iconCls:'icon-add'" href=javascript:addChannel()>添加</a><br><br>
	
	<table id="tab"  class="easyui-datagrid">
     <thead>   
        <tr>   
        <th data-options="field:'id'"  style="width:12.9%">序号</th>   
        <th data-options="field:'companyname'" style="width:12.9%">公司名称</th>   
        <th data-options="field:'channelid'" style="width:12.9%">渠道id</th>   
        <th data-options="field:'companyaddress'" style="width:12.9%">公司地址</th>   
        <th data-options="field:'people'" style="width:12.9%">联系人</th>   
        <th data-options="field:'linkphone'" style="width:12.9%">联系电话</th>   
        <th data-options="field:'channelsource',formatter:channelSou" style="width:12.9%">渠道来源</th>   
        <th data-options="field:'     ',formatter:opreatrion1" style="width:12.9%">管理</th>   
        </tr>   
     </thead>
	</table> 
	
	<div id="dia" style="padding:10px; width: 400px; height: 400px;display: none;">
	
		<form id="ff" method="post">   
		    <div>   
		        <label for="companyname">公司名称:</label>   
		        <input class="easyui-validatebox" type="text" name="channel.companyname" data-options="validType:'companyname'" />   
		    </div><br>  
		    <div>   
		        <label for="channelid">渠道ID:</label>   
		        <input class="easyui-validatebox" type="text" name="channel.channelid" data-options="validType:'channelid'" />   
		    </div><br>  
		    <div>   
		        <label for="companyaddress">公司地址:</label>   
		        <input class="easyui-validatebox" type="text" name="channel.companyaddress" data-options="validType:'companyaddress'" />   
		    </div><br>  
		    <div>   
		        <label for="people">联系人:</label>   
		        <input class="easyui-validatebox" type="text" name="channel.people" data-options="validType:'people'" />   
		    </div><br>  
		    <div>   
		        <label for="linkphone">联系电话:</label>   
		        <input class="easyui-validatebox" type="text" name="channel.linkphone" data-options="validType:'linkphone'" />   
		    </div><br>  
		    <div>   
		        <label for="channelsource">渠道来源:</label>   
		        <select class="easyui-combobox" name="channel.channelsource" style="width:200px;">   
				    <option value="1">合作</option>   
				    <option value="2">自营</option>
				</select>   
		    </div><br>  
		    <div>   
		        <label for="channelrank">渠道级别:</label>   
		        <input class="easyui-validatebox" type="text" name="channel.channelrank" data-options="validType:'channelrank'" />   
		    </div>   
		</form>
	
	</div>
	
	<script type="text/javascript">
	
		$('#tab').datagrid({
			
			url:'<%=request.getContextPath()%>/queryChannel.htm',
			pagination:true,
			pageNumber:1,
		    pageSize:2,
		    pageList:[2,4,6],
		    onLoadSuccess:function(){
		    	
		    	$(".deleteChannel").linkbutton({
		    	    iconCls: 'icon-remove'
		    	});  
		    	
		    	$(".updateChannel").linkbutton({
		    	    iconCls: 'icon-edit'
		    	});
	
		    }
		})
		
		
		function  opreatrion1(value,row,index){
				  
			return   " <a  class='updateChannel'  href=javascript:updateChannel(\""+row.id+"\") >编辑</a><a  class='deleteChannel' href='javascript:deleteChannel(\""+row.id+"\")' >删除</a>"
				  
		}
		
		function channelSou(value,row,index){
			
			if(row.channelsource==1){
				
				return "合作";
			}if(row.channelsource==2){
				
				return "自营";
			}
		}
		
		function updateChannel(id){
			
			location.href="<%=request.getContextPath()%>/upd.htm?id="+id;			
		}
		
		function addChannel(){
			
			$("#dia").toggle();
			
			$('#dia').dialog({  
		           title:'新增渠道',  
		           collapsible:true, //设置可折叠  
		           minimizable:true,  
		           maximizable:true,  
		           resizable:true,
		           buttons:[{ //设置下方按钮数组  
		               text:'提交',  
		               iconCls:'icon-ok',  
		               handler:function(){  
		             
		            	   $.ajax({
		            		   url:"<%=request.getContextPath()%>/addChannel.htm",
		            		   type:"post",
		            		   data:$("#ff").serialize(),
		            		   success:function(result){
		            			   
		            			   alert("新增成功")
		            			   location.href="<%=request.getContextPath()%>/updchan.htm";
		            		   }
		            		   
		            	   })
		               }  
		          },{  
		               text:'关闭', 
		               iconCls:'icon-no',
		               handler:function(){  
		               $('#dia').dialog('close');  
		               }  
		          }] 
			})
		}
		
		function deleteChannel(id){
			
			location.href="<%=request.getContextPath()%>/deleteChannel.htm?id="+id;
		}
		
		function  where (){
			
			 $('#tab').datagrid({
					queryParams: {
						cn:$("#cn").val(),
						 
					}
			 });


			 $('#tab').datagrid("load");
		   }
	 
	</script>
	
</body>
</html>