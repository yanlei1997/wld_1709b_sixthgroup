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

<div style="padding:8px; border:1px solid #a5b6c8;background:#eef3f7">

全部潜客

</div>

<center>
<input type="text" name="username2"><input type="button" value="搜索" onclick="cha()" class="easyui-linkbutton c4" style="width:120px">
状态：<select name="status2" id="zz">
        
        <option value="">请选择</option>
        <option value="意向客户">意向客户</option>
        <option value="跟进中">跟进中</option>
        <option value="新增订单">新增订单</option>
        <option value="大数据风控">大数据风控</option>
        <option value="待完善客户信息">待完善客户信息</option>
        <option value="待完善风控信息">待完善风控信息</option>
        <option value="风控审核">风控审核</option>
        <option value="待签订合同">待签订合同</option>
            
     </select>
     <input type="button" value="搜索" onclick="chazz()" class="easyui-linkbutton c4" style="width:120px">
</center>

<table   id="dg2" class="easyui-datagrid" >
   <thead>
     <tr>
       <th data-options="field:'userphone'"  width="10%">账号</th>
       <th data-options="field:'username'"  width="10%">用户名</th>
       <th data-options="field:'channelid'"  width="10%">渠道ID</th>
       <th data-options="field:'productname'"  width="10%">金融产品</th>
       <th data-options="field:'producttype',formatter:tops"  width="10%">产品类型</th>
       <th data-options="field:'orderdate'"  width="10%">下单时间</th>
       <th data-options="field:'status'"  width="10%">状态</th>
       <th data-options="field:'manname'"  width="10%">业务员</th>
       <th data-options="field:'     ',formatter:ff" style="width:10%">操作</th>   

                
     </tr>
   </thead>
   
   <tbody>
   
   </tbody >
   
 </table>

<script type="text/javascript">




function  ff(val,row){	
	
	return   "<a  href=javascript:bian('"+row.userphone+"','"+row.channelid+"','"+row.companyname+"','"+row.sex+"','"+row.username+"','"+row.cardnumber+"','"+row.Education+"','"+row.Maritalstatus+"','"+row.orderdate+"','"+row.Accountlocation+"','"+row.nowaddress+"','"+row.borrowmonth+"','"+row.borrowinterest+"','"+row.repayway+"','"+row.banknumber+"','"+row.bankphone+"','"+row.branktypename+"') class='delete' >编辑</a>";
}

 function  bian(userphone,channelid,companyname,sex,username,cardnumber,Education,Maritalstatus,orderdate,Accountlocation,nowaddress,borrowmonth,borrowinterest,repayway,banknumber,bankphone,branktypename){

 location.href="<%=request.getContextPath()%>/client/clientinfo.jsp?userphone="+userphone+"&&channelid="+channelid+"&&companyname="+companyname+"&&sex="+sex+"&&username="+username+"&&cardnumber="+cardnumber+"&&Education="+Education+"&&Maritalstatus="+Maritalstatus+"&&orderdate="+orderdate+"&&Accountlocation="+Accountlocation+"&&nowaddress="+nowaddress+"&&borrowmonth="+borrowmonth+"&&borrowinterest="+borrowinterest+"&&repayway="+repayway+"&&banknumber="+banknumber+"&&bankphone="+bankphone+"&&branktypename="+branktypename;

 }

//返回字符串
function  tops(value,row,index){
	 
	  var tops =""
	 if(row.producttype==1){
		 
		 tops="线上"
	 }
	 if(row.producttype==2){
		 
		 tops="线下"
	 }
	
	  	  
	 return  tops
	 
}

$('#dg2').datagrid({    
    url:'<%=request.getContextPath()%>/querycustomer.htm',    
    pagination:true,
    pageNumber:1,
    pageSize:2,
    pageList: [2,4,6],
	onLoadSuccess:function(){
		
	
		
	}

    
});



//条件查询
function  cha(){
	 
	 $('#dg2').datagrid({
			queryParams: {
				usern: $('[name="username2"]').val(),

			}
	 });-


	 $('#dg2').datagrid("load");
}  

//条件查询
function  chazz(){
	 
	 $('#dg2').datagrid({
			queryParams: {
				status: $('[name="status2"]').val(), 
			}
	 });-


	 $('#dg2').datagrid("load");
}  



</script>


</body>
</html>