<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
 <!-- 引入JQuery -->
<script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery.min.js"></script>
 <!-- 引入EasyUI -->
<script type="text/javascript" src="<%=request.getContextPath() %>/easyui/jquery.easyui.min.js"></script>
<!-- 引入EasyUI的中文国际化js，让EasyUI支持中文 -->
 <script type="text/javascript" src="<%=request.getContextPath() %>/easyui/locale/easyui-lang-zh_CN.js"></script>
 <!-- 引入EasyUI的样式文件-->
<link rel="stylesheet" href="<%=request.getContextPath() %>/easyui/themes/bootstrap/easyui.css" type="text/css"/>
<!-- 引入EasyUI的图标样式文件-->
<link rel="stylesheet" href="<%=request.getContextPath() %>/easyui/themes/icon.css" type="text/css"/>


</head>
<body>

<table   id="dg" class="easyui-datagrid" >
   <thead>
     <tr>
       <th data-options="field:'orderid'"  width="15%">编号</th>
       <th data-options="field:'orderno'"  width="15%">订单号</th>
       <th data-options="field:'orderstatus'"  width="15%">状态</th>
       <th data-options="field:'orderdate'"  width="15%">订单提交时间</th>
       <th data-options="field:'orderdate'"  width="15%">订单完成时间</th>
       <th data-options="field:'productname'"  width="15%">金融产品</th>

                
     </tr>
   </thead>
   
   <tbody>
   
   </tbody >
   
 </table>

<script type="text/javascript">



$('#dg').datagrid({    
    url:'<%=request.getContextPath()%>/orderlist.htm',    
    pagination:true,
    pageNumber:1,
    pageSize:2,
    pageList: [2,4,6],
	onLoadSuccess:function(){
		
	
		
	}

    
});


	


</script>

</body>
</html>