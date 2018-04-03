<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<!-- 引入 JQuery -->
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery.min.js"></script>
<!-- 引入 EasyUI -->
<script type="text/javascript" src="<%=request.getContextPath()%>/easyui/jquery.easyui.min.js"></script>
<!-- 引入 EasyUI 的中文国际化 js，让 EasyUI 支持中文 -->
<script type="text/javascript" src="<%=request.getContextPath()%>/easyui/locale/easyui-lang-zh_CN.js"></script>

<!-- 引入 EasyUI 的风格样式文件-->
<link rel="stylesheet" href="<%=request.getContextPath()%>/easyui/themes/bootstrap/easyui.css" type="text/css"/>
<!-- 引入 EasyUI 的图标样式文件-->
<link rel="stylesheet" href="<%=request.getContextPath()%>/easyui/themes/icon.css" type="text/css"/>


</head>
<body class="easyui-layout">

	<div data-options="region:'north',title:'North Title',split:true" style="height:100px;">
		<h1>网利贷管理系统</h1>
	</div>
	
    <div data-options="region:'west',title:'West',split:true" style="width:150px;">
   		<div id="tree"></div>	
    </div>
       
    <div data-options="region:'center',title:'center title'" style="padding:5px;background:#eee;">
    
    	<div id="tabs" class="easyui-tabs" data-options="fit:true" >
    	
    	</div>
    
    </div>
    
    <script type="text/javascript">
	
		$(function(){
		    	
		    	//ajax  请求controller
		    	$.ajax({
		    		url:'<%=request.getContextPath()%>/queryMenu.htm',
		    		type:'get',
		    		success:function(result){
		    			
		    			$('#tree').tree({
		    				data: eval(result),
		    				animate:true,
		    				onLoadSuccess:function(){
		    					
		    					var nodes = $('#tree').tree('getChecked');
		    					
		    				},
		    				onClick: function(node){
		    				 
		    					
		    					//判断点击的节点是否包含子节点
		    					
		    				   var   children=	$('#tree').tree('getChildren', node.target);
		    					
		    				   if(node.url!=""&&node.url!=undefined){
		    					
		    					
		    						//没有子节点   打开选项卡
		    						$('#tabs').tabs('add',{
		    						    title:node.text,    
		    						    content:"<iframe frameborder='0'  width='100%'  height='100%'  src = '"+node.url+"' />",    
		    						    closable:true,
		    						    tools:[{    
		    						        iconCls:'icon-mini-refresh',    
		    						        handler:function(){    
		    						            alert('refresh');    
		    						        }    
		    						    }]    
		    						}); 
		    						
		    					}
		    				   }
		
		    			});
		    		}
		    		
		    	})
		    	
		    })
  
  
  
  
  </script>
	
	<%-- </script>--%>

</body>
</html>