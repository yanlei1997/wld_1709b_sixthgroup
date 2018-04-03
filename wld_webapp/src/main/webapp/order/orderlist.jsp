<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<jsp:include page="comm.jsp" flush="true"></jsp:include>
</head>
<body>
 <div style="border:1px solid #000;width:600px;height:50px" >
 
全部潜客 ，意向客户
  
       
  
 
 
 
 
 
 </div> 

  关键词：<input name="zhanghao" placeholder="订单号，账号，用户名 " style="margin-bottom:10px;"/>
<input type="button"   value="搜索"  onclick="chaxun()" />

     <select name="producttype">
	<option value="">---请选择---</option>
	<option value="1">意向客户</option>
	<option value="2">跟进中</option>
	<option value="3">新增订单</option>
	<option value="4">大数据风控</option>
	<option value="5">待完善客户信息</option>
	<option value="6">待完善风控信息</option>
	<option value="7">风控审核</option>
	<option value="8">待签订合同</option>
	<option value="9">合规审核</option>
	<option value="10">募资中</option>
       </select>
  
     <input type="button" value="查询" onclick="where()">
   
   <table  id="order" class="easyui-datagrid" >   
          <thead>   
             <tr>   
              <th data-options="field:'    ',checkbox:true"  style="width:10%"></th>  
              <th data-options="field:'orderno'"  style="width:10%"  align="center" >编码</th>   
               <th data-options="field:'username'"  style="width:10%"  align="center" >用户名称</th>   
              <th data-options="field:'channelid'"  style="width:10%"  align="center" >渠道id</th>   
              <th data-options="field:'productname'"  style="width:10%"  align="center" >金融产品</th>   
              <th data-options="field:'producttype'"  style="width:10%"  align="center" >产品类型</th>   
              <th data-options="field:'orderdate'"  style="width:10%"  align="center" >创建时间</th>   
              <th data-options="field:'orderstatus'"  style="width:10%"  align="center" >订单状态</th>              
              <th data-options="field:'userphone'"  style="width:10%"  align="center" >订单状态</th>              
              <th data-options="field:' ',formatter:aaa"      style="width:360px"  align="center" >操作</th>      
             </tr>   
         </thead>   
    
    </table> 
 
</body>
<script type="text/javascript">


function  aaa(val,row){
	
	
	return   "<a  href=javascript:check('"+row.userid+"','"+row.userphone+"','"+row.orderno+"','"+row.orderstatus+"') class='delete' >编辑</a>";
}

 function  check(userid,userphone,orderno,orderstatus){

 location.href="<%=request.getContextPath()%>/order/client.jsp?userid="+userid+"&&userphone="+userphone+"&&orderno="+orderno+"&&orderstatus="+orderstatus;
 }
 

//条件查询
function  where (){

	 $('#order').datagrid({
			queryParams: {
				producttype:$("[name='producttype']").val(),
				 
			}
	 });


	 $('#aa').datagrid("load");
} 
//条件查询
function  chaxun (){

	 $('#order').datagrid({
			queryParams: {
				zhanghao:$("[name='zhanghao']").val(),
				 
			}
	 });


	 $('#aa').datagrid("load");
} 

//分页
$('#order').datagrid({
	

    url:'<%=request.getContextPath()%>/queryorder.htm',    
    pagination:true,
    pageNumber:1,
    pageSize:1,
    pageList: [1,2,3],
    checkbox:true,
    
    onLoadSuccess:function(){
		
		$('.yuding').linkbutton({    
		    iconCls: 'icon-edit',
		   
		}); 
		
	 	$('.update').linkbutton({    
		    iconCls: 'icon-edit',
		   
		}); 
	 	
	
	 	
	}
    
})





</script>



</html>