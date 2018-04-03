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

<center>
<input type="text" name="username3" >


<input type="button" value="搜索" onclick="cha2()" class="easyui-linkbutton c4" style="width:120px">
</center>


<table   id="tb" class="easyui-datagrid" >
   <thead>
     <tr>
       <th data-options="field:'userphone'"  width="15%">账号</th>
       <th data-options="field:'username'"  width="15%">用户名</th>
       <th data-options="field:'cardnumber'"  width="15%">身份证号</th>
       <th data-options="field:'channelid'"  width="15%">渠道ID</th>
       <th data-options="field:'ordercause'"  width="15%">原因</th>
       <th data-options="field:'     ',formatter:bbb" style="width:15%">操作</th>   

                
     </tr>
   </thead>
   
   <tbody>
   
   </tbody >
   
 </table>



<script type="text/javascript">

 

 
$('#tb').datagrid({    
    url:'<%=request.getContextPath()%>/queryblacklist.htm',    
    pagination:true,
    pageNumber:1,
    pageSize:2,
    pageList: [2,4,6],
	onLoadSuccess:function(){
		
	
		
	}

})

function  bbb(val,row){	
	
	return   "<a  href=javascript:kan('"+row.orderno+"','"+row.userphone+"','"+row.username+"','"+row.cardnumber+"') class='delete' >查看</a>";
}

 function  kan(orderno,userphone,username,cardnumber){

 location.href="<%=request.getContextPath()%>/client/blackinfo.jsp?orderno="+orderno+"&&userphone="+userphone+"&&username="+username+"&&cardnumber="+cardnumber;

 } 
 



//条件查询

function  cha2(){
	 
	 $('#tb').datagrid({
			queryParams: {
				usern: $('[name="username3"]').val()
			
			}
	 })


	 $('#tb').datagrid("load");
}  
 
</script>

</body>

</html>