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

     <select name="ordercause">
	<option value="">---请选择---</option>
	<option value="待重新提交客户资料">待重新提交客户资料</option>
	<option value="待重新提交风控资料">待重新提交风控资料</option>
	<option value="待重新签订合同">待重新签订合同</option>

       </select>
  
     <input type="button" value="查询" onclick="where()">
   
   <table  id="dahui" class="easyui-datagrid" >   
          <thead>   
             <tr>   
              <th data-options="field:'    ',checkbox:true"  style="width:10%"></th>  
              <th data-options="field:'orderno'"  style="width:10%"  align="center" >编码</th>   
               <th data-options="field:'username'"  style="width:10%"  align="center" >用户名称</th>   
              <th data-options="field:'channelid'"  style="width:10%"  align="center" >渠道id</th>   
              <th data-options="field:'productname'"  style="width:10%"  align="center" >金融产品</th>   
              <th data-options="field:'producttype'"  style="width:10%"  align="center" >产品类型</th>   
              <th data-options="field:'orderdate'"  style="width:10%"  align="center" >创建时间</th>   
              <th data-options="field:'ordercause'"  style="width:10%"  align="center" >打回原因</th>              
              <th data-options="field:'userphone'"  style="width:10%"  align="center" >手机号码</th>              
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

location.href="<%=request.getContextPath()%>/order/dahuiclient.jsp?userid="+userid+"&&userphone="+userphone+"&&orderno="+orderno+"&&orderstatus="+orderstatus;

}

 
function where(){
	
	 $('#dahui').datagrid({
			queryParams: {
				ordercause:$("[name='ordercause']").val(),
				 
			}
	 });


	 $('#dahui').datagrid("load");
	
}


//条件查询
function  chaxun (){

	 $('#dahui').datagrid({
			queryParams: {
				users:$("[name='zhanghao']").val(),
				 
			}
	 });


	 $('#dahui').datagrid("load");
} 

//分页
$('#dahui').datagrid({
	

    url:'<%=request.getContextPath()%>/dahuiorderlist.htm',    
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