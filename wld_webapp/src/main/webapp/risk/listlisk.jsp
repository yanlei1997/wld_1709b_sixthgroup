<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<jsp:include page="aaa.jsp" flush="true"></jsp:include>
</head>
<body>


<table border=1px height="100px" width="1030px">
<b><tr><td colspan="4">全部订单:</td></tr></b>
<h></h>
   <tr>
     <td>初审(3)&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
     复审(4)&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
     法务审核(2)&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
     运营转运审核(1)</td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
   </tr>

</table>
<!-- 条件查询- -->
<form  style="text-align:center;padding:20px 20px   0  0;margin-left:100px">
关键词：<input name="name" placeholder="订单号，账号，用户名 " style="margin-bottom:10px;"/>
<input type="button"   value="搜索"  onclick="chaxun()" />
<select name="orderstatus">
   <option value="">--请选择--</option>
   <option value="初审">初审</option>
   <option value="复审">复审</option>
   <option value="合规审核">合规审核</option>
   <option value="运营专员审核">运营专员审核</option>
</select>
<input type="button"   value="搜索"  onclick="sousuo()" />
<input type="reset"   value="重置" />
<br>

</form>
<table  id="aa" class="easyui-datagrid" height="400px" >   
    <thead>   
        <tr>
          <th data-options="field:'    ',checkbox:true"  style="width:25%">id</th>  
                     <th data-options="field:'userid'"  width="8%">订单号</th> 
           
          <th data-options="field:'orderno'"  width="8%">订单号</th> 
          <th data-options="field:'userphone'" width="8%">账号</th>
          <th data-options="field:'username'" width="8%">用户名</th>
          <th data-options="field:'channelid'" width="8%">渠道ID</th>
          <th data-options="field:'orderdate'" width="8%">创建时间</th>
          <th data-options="field:'productname'" width="8%">金融产品</th>
          <th data-options="field:'producttype' ,formatter:aa"  width="10%">产品类型</th>
          <th data-options="field:'orderstatus'"  width="10%">状态</th>
          <!--  ,formatter:dd -->
          <th data-options="field:' caozuo   ' ,formatter:rr"  width="10%">操作</th>   
        </tr>   
    </thead>   
    <tbody>   
        
    </tbody>   
</table>
   <script type="text/javascript">
   
  function  rr(val,row){
	
	  if(row.orderstatus=="初审"){
	//前台页面展示为字符串   判断必须==字符串	
	//return返回 双引号里面 必须为 单引号   “ ‘’  ”
	//onclick中   传参数   字符串
		return  "<input type='button' value='初审' onclick='chu("+row.orderno+","+row.userphone+","+row.channelid+",\""+row.orderstatus+"\",\""+row.userid+"\")'>";
	}
	else if(row.orderstatus=="复审"){
		
		return  "<input type='button' value='复审' onclick='fu("+row.orderno+","+row.userphone+","+row.channelid+",\""+row.orderstatus+"\",\""+row.userid+"\")'>";
	}else  if (row.orderstatus=="合规审核"){
		
		return  "<input type='button' value='合规审核' onclick='fawu("+row.orderno+","+row.userphone+","+row.channelid+",\""+row.orderstatus+"\",\""+row.userid+"\")'>";
	}else{
		
		return  "<input type='button' value='运营专员审核' onclick='yunying("+row.orderno+","+row.userphone+","+row.channelid+",\""+row.orderstatus+"\",\""+row.userid+"\")'>";
	}
	
} 

     //点击按钮出发时间 跳转页面 （初审）
     function chu(orderno,userphone,channelid,orderstatus,userid){
   //
   
  location.href = "<%=request.getContextPath()%>/risk/listchushen.jsp?orderno="+orderno+"&userphone="+userphone+"&channelid="+channelid+"&orderstatus="+orderstatus+"&userid="+userid;
	
        }
     
     function fu(orderno,userphone,channelid,orderstatus,userid){
    	//点击按钮出发时间 跳转页面 （复审）
    	  location.href = "<%=request.getContextPath()%>/risk/listfushen.jsp?orderno="+orderno+"&userphone="+userphone+"&channelid="+channelid+"&orderstatus="+orderstatus+"&userid="+userid;
    		
    	        }
     function fawu(orderno,userphone,channelid,orderstatus,userid){
     	//点击按钮出发时间 跳转页面 （法务审核）
     	  location.href = "<%=request.getContextPath()%>/risk/listfawu.jsp?orderno="+orderno+"&userphone="+userphone+"&channelid="+channelid+"&orderstatus="+orderstatus+"&userid="+userid;
     		
     	        }

     function yunying(orderno,userphone,channelid,orderstatus,userid){
      	//点击按钮出发时间 跳转页面 （运营审核）
      	  location.href = "<%=request.getContextPath()%>/risk/listyunying.jsp?orderno="+orderno+"&userphone="+userphone+"&channelid="+channelid+"&orderstatus="+orderstatus+"&userid="+userid;
      		
      	        }

     //判断产品类型
     function  aa(val,row){
	    if(row.producttype==1){
		
		   return "线上";
	   }else{
		
		   return "线下";
	  }
	
}


//分页跳转方法
   $('#aa').datagrid({  
	 
      url:'<%=request.getContextPath()%>/listrisk.htm',  
      toolbar: '#tb',//把上面的批量和增加按钮  和table 成为一个整体
      pagination:true,
      pageNumber:1,
      pageSize:5,
      pageList: [5,10,15],
	  onLoadSuccess:function(){
		 //在数据加载成功的时候出发
	 
	},
 
});

    //多条件查询
    function  chaxun(){

         $('#aa').datagrid({
	       queryParams:{
			 name:$('[name="name"]').val(),
		    }
         }); 
 
             $('#aa').datagrid("load");
        }  
     //条件查询
      function  sousuo(){
     $('#aa').datagrid({
	      queryParams:{
		
			orderstatus:$('[name="orderstatus"]').val(),
	 	}
     }); 
 
     $('#aa').datagrid("load");
        }  

</script>
</body>
</html>