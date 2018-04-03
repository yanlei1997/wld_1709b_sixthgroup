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

	<div>
		<font size="5px">产品中心</font>&nbsp;&nbsp;&nbsp;&nbsp;
		<a class="easyui-linkbutton" data-options="iconCls:'icon-add'" href=javascript:addProduct()>添加</a>
	</div>

	<table id="table"  class="easyui-datagrid">
     <thead>   
        <tr>   
        <th data-options="field:'productid'"  style="width:13%">产品编号</th>   
        <th data-options="field:'productname'" style="width:13%">产品名称</th>   
        <th data-options="field:'producttype',formatter:type" style="width:13%">产品类型</th>   
        <th data-options="field:'productstatus',formatter:status" style="width:13%">产品状态</th>   
        <th data-options="field:'productsource'" style="width:13%">产品来源</th>   
        <th data-options="field:'productdate'" style="width:13%">开通日期</th>   
        <th data-options="field:'     ',formatter:opreatrion1" style="width:13%">操作</th>   
        </tr>   
     </thead>
	</table>
	
	<script type="text/javascript">
	
		$('#table').datagrid({
			
			url:'<%=request.getContextPath()%>/queryProduct.htm',
			pagination:true,
			pageNumber:1,
		    pageSize:2,
		    pageList:[2,4,6],
		    onLoadSuccess:function(){
		    	
		    	$(".deleteProduct").linkbutton({
		    	    iconCls: 'icon-remove'
		    	});  
		    	
		    	$(".updateProduct").linkbutton({
		    	    iconCls: 'icon-edit'
		    	});
	
		    }
		})
		
		function  opreatrion1(value,row,index){
				  
			return   " <a  class='updateProduct'  href=javascript:updateProduct(\""+row.productid+"\",\""+row.productname+"\",\""+row.producttype+"\",\""+row.productstatus+"\",\""+row.productsource+"\",\""+row.productdate+"\") >编辑</a><a  class='deleteProduct' href='javascript:deleteProduct(\""+row.productid+"\")' >删除</a>"
				  
		}
		
		function type(value,row,index){
			
			if(row.producttype==1){
				
				return "开通";
			}if(row.producttype==2){
				
				return "未开通";
			}
			
		}
		
		function status(value,row,index){
			
			if(row.productstatus==1){
				
				return "渠道";
			}if(row.productstatus==2){
				
				return "app";
			}
			
		}
		
		function updateProduct(productid,productname,producttype,productstatus,productsource,productdate){
			
			location.href="<%=request.getContextPath()%>/product/productlist.jsp?productid="+productid+"&&productname="+productname+"&&producttype="+producttype+"&&productstatus="+productstatus+"&&productsource="+productsource+"&&productdate="+productdate;
			
		}
	
	</script>
	
</body>
</html>