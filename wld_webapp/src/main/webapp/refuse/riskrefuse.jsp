<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript"  src="<%=request.getContextPath() %>/js/jquery.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/easyui/locale/easyui-lang-zh_CN.js"></script>
<link rel="stylesheet" href="<%=request.getContextPath()%>/easyui/themes/bootstrap/easyui.css" type="text/css"/>
<link rel="stylesheet" href="<%=request.getContextPath()%>/easyui/themes/icon.css" type="text/css"/>
</head>
<body>

<input class="easyui-textbox" data-options="iconCls:'icon-search'" style="width:300px" id="searchname"> 
<button  onclick="serch()">搜索</button>
<table  id="aa" class="easyui-datagrid" height="300px"    >   
    <thead>   
        <tr>
          <th data-options="field:'    ',checkbox:true"  style="width:25%">id</th>   
          <th data-options="field:'orderno'"   width="15%">订单号</th> 
          <th data-options="field:'userphone'"  width="10%">账号</th>
          <th data-options="field:'username'"  width="10%">用户名</th>
          <th data-options="field:'channelid'"  width="10%">渠道ID</th>
            <th data-options="field:'orderdate'"  width="15%">创建时间</th>
          <th data-options="field:'productname'"  width="10%">金融产品</th>
        <th data-options="field:'producttype',formatter:type"  width="10%">产品类型</th>
          <th data-options="field:' caozuo ',formatter:rr"  width="10%">操作</th>   
        </tr>   
    </thead>   
    <tbody>   
        
    </tbody>   
</table>
<script type="text/javascript">
 
$('#aa').datagrid({  
	
    url:'<%=request.getContextPath()%>/orderrefuse.htm',  
    //toolbar: '#tb',//把上面的批量和增加按钮  和table 成为一个整体
    fit:true,
    pagination:true,
    pageNumber:1,
    pageSize:5,
    pageList: [5,10,15],
	onLoadSuccess:function(){
		 //在数据加载成功的时候出发
		 $('.delete').linkbutton({    
		    iconCls: 'icon-remove',  
		    plain:true
		}); 
	
		 $('.editor').linkbutton({    
		    iconCls: 'icon-edit',
		    plain:true
		});
		
	},
 
});

function  rr(val,row){
	
	return  "<a  href='javascript:look("+row.orderno+","+row.userphone+","+row.channelid+")' class='delete' >查看</a>";
}

function type(val,row){
	
	if (row.producttype==1) {
		return "线上";
	}if (row.producttype==2) {
		return "线下";
	}
}

function look(orderno,userphone,channelid){
	
	location.href="<%=request.getContextPath()%>/refuse/riskrefuselook.jsp?orderno="+orderno+"&userphone="+userphone+"&channelid="+channelid
	
}


function serch(){
	 
	var sname= $("#searchname").val();
	
$('#aa').datagrid({ 
	 
	 queryParams: {
		 
		 serachname:sname,
		 
	     }
	 
	 }); 
 }
</script>
</body>
</html>