<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<style>
 
#pic_list
{
display:block;
white-space:nowrap;
width:500px;
overflow:auto;
}
#pic_list li
{
width:80px;
height:30px;
margin:3px;
background: #E8E8E8;
display:inline-block;
margin-left:-5px;
margin-top:-8px;
padding:8px 15px 8px 10px;
}
</style>
<body>
<%-- <div style="width:1300px;height:30px;background-color:#C0C0C0;padding:20px 10px 15px 10px;">
<b>订单号</b>：<%=request.getParameter("orderno")%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<b>账号</b>：<%=request.getParameter("userphone")%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<b>渠道ID</b>：<%=request.getParameter("userphone")%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<b>审核状态</b>：<%=request.getParameter("orderstatus")%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
</div> --%>


<div id="pic_list">
  <ul>
    <li><a href="<%=request.getContextPath()%>">客户信息</a></li>
    <li>风控资料</li>
    <li>合同</li>


  </ul>
</div>
<table border="0.5px" width="1200px" height="200px">


<tr></tr>
    <tr>
        <td>1</td>
        <td>2</td>
        <td>5</td>
   </tr>


    <tr>
     <td>3</td>
     <td>5</td>
     <td>5</td>
    </tr>


   <tr>
     <td>6</td>
     <td>6</td>
     <td>5</td>
   </tr>
</table>


</body>
</html>