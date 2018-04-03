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
   
   <table  id="order" class="easyui-datagrid" >   
          <thead>   
             <tr>   
              <th data-options="field:'    ',checkbox:true"  style="width:10%"></th>  
              <th data-options="field:'orderstatus'"  style="width:10%"  align="center" >编码</th>   
              <!-- <th data-options="field:'username'"  style="width:10%"  align="center" >用户名称</th>   
              <th data-options="field:'channelid'"  style="width:10%"  align="center" >渠道id</th>   
              <th data-options="field:'productname'"  style="width:10%"  align="center" >金融产品</th>   
              <th data-options="field:'producttype'"  style="width:10%"  align="center" >产品类型</th>   
              <th data-options="field:'orderdate'"  style="width:10%"  align="center" >创建时间</th>   
              <th data-options="field:'orderstatus'"  style="width:10%"  align="center" >订单状态</th>    -->
             
             </tr>   
         </thead>   
    
    </table> 
 
</body>
<script type="text/javascript">

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