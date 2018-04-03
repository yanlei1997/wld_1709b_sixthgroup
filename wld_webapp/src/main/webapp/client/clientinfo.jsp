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

<style type="text/css">


input{
   border: none;
   background:#eef3f7;
   font-size:18px;
   font-weight:700;
}
</style>
</head>
<body>


<%String companyname = request.getParameter("companyname");%>
<%String channelid = request.getParameter("channelid");%>
<%String userphone = request.getParameter("userphone");%>
<%String sex = request.getParameter("sex");%>
<%String username = request.getParameter("username");%>
<%String cardnumber = request.getParameter("cardnumber");%>
<%String Education = request.getParameter("Education");%>
<%String Maritalstatus = request.getParameter("Maritalstatus");%>
<%String orderdate = request.getParameter("orderdate");%>
<%String Accountlocation = request.getParameter("Accountlocation");%>
<%String nowaddress = request.getParameter("nowaddress");%>
<%String borrowmonth = request.getParameter("borrowmonth");%>
<%String borrowinterest = request.getParameter("borrowinterest");%>
<%String repayway = request.getParameter("repayway");%>
<%String banknumber = request.getParameter("banknumber");%>
<%String bankphone = request.getParameter("bankphone");%>
<%String branktypename = request.getParameter("branktypename");%>

<div style="width:1300px;height:30px;background-color:#C0C0C0;padding:20px 10px 15px 10px;">
<b>渠道</b>：<%=request.getParameter("companyname")%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<b>渠道ID</b>：<%=request.getParameter("channelid")%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<b>状态</b>：新增&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<b>业务员</b>：
     <select name="status2" id="zz" class="easyui-combobox" style="width:200px;"  >        
        <option value="">请选择</option>
        <option value="">杰克</option>
        <option value="">夏利</option>                 
     </select>;
   <input type="button" value="添加" onclick="addinfo()" class="easyui-linkbutton c4" style="width:120px"> 
</div>

<br>
<div  style="width:150px;height:20px;background-color:#C0C0C0;padding:20px 10px 15px 10px;">
<a href=''>客户信息</a>
<a href='<%=request.getContextPath()%>/client/orderhistory.jsp'>订单记录</a>
</div>
<br>
<div>
<div style="padding:8px; border:1px solid #C0C0C0;background:#eef3f7">

<blockquote style="padding:3px 2px;border-left:5px solid red;text-align:left;">
<span ><b>基本信息 <a href='<%=request.getContextPath()%>'>编辑</a></b></span>
</blockquote>

<table>
<tr>
<td>
<h4>账 号: <input type="text"  value="<%=userphone%>" ></h4>
<h4>身 份 证 号:<input type="text"  value="<%=cardnumber%> " ></h4>
<h4>婚 姻 状 况:<input type="text"  value="<%=Maritalstatus%> " ></h4>
<h4>提 交 时 间:<input type="text"  value="<%=orderdate%> " ></h4>
</td>
<td>
<h4>用 户 名:<input type="text"  value="<%=username%> "></h4>
<h4>性 别:<input type="text"  value="<%=sex%> "></h4>
<h4>户 口 所 在 地:<input type="text"  value="<%=Accountlocation%> "></h4>
</td>
<td>
<h4>手 机 号:<input type="text"  value="<%=userphone%>"></h4>
<h4>学 历:<input type="text"  value="<%=Education%> "></h4>
<h4>现 住 地 址:<input type="text"  value="<%=nowaddress%> "></h4>
</td>
</tr>
</table>

</div>
<br>
<div style="padding:8px; border:1px solid #C0C0C0;background:#eef3f7">

<blockquote style="padding:3px 2px;border-left:5px solid red;text-align:left;">
<span ><b>借款信息 <a href='<%=request.getContextPath()%>'>编辑</a></b></span>
</blockquote>

<table>
<tr>
<td>
<h4>借 款 个 体: <select name="geti" id="gt" class="easyui-combobox" style="width:200px;"  >        
        <option value="">请选择</option>
        <option value="1">个体</option>
        <option value="2">企业</option>                 
     </select></h4>
<h4>还 款 方 式:<input type="text"  value="<%=repayway%>"></h4>
<h4>月 利 率:<input type="text"  value="<%=borrowmonth%> "></h4>
<h4>利 息 小 写:<input type="text" name="borrowinterest" style="border: 0px;background:white "></h4>
<h4>利 息 大 写:<input type="text" name="borrowinterest"style="border: 0px;background:white "></h4>
</td>
<td>
<h4>产 品 名 称:<select name="chanpin" id="cp" class="easyui-combobox" style="width:200px;"  >        
        <option value="">请选择</option>
        <option value="车主贷">车主贷</option>
        <option value="社保贷">社保贷</option>                 
     </select></h4>
<h4>借 款 期 限:<select name="qixian" id="qx" class="easyui-combobox" style="width:200px;"  >        
        <option value="">请选择</option>
        <option value="10">10</option>
        <option value="20">20</option>                 
        <option value="30">30</option>                 
     </select></h4>
<h4>服 务 费 标 准 利 率:<input type="text"  value="<%=borrowinterest%> "></h4>
<h4>服 务 费 小 写:<input type="text" name="borrowservice"style="border: 0px;background:white "></h4>
<h4>服 务 费 大 写:<input type="text" name="borrowservice"style="border: 0px;background:white "></h4>
</td>
<td>
<h4>借 款 总 金 额 小 写:<input type="text" name="borrowmoney"style="border: 0px;background:white "></h4>
<h4>借 款 总 金 额 大 写:<input type="text" name="borrowmoney"style="border: 0px;background:white "></h4>
<h4>借 款 用 途:<input type="text" name="borrowuse"style="border: 0px;background:white "></h4>
<h4>还 款 来 源:<input type="text" name="repaysource"style="border: 0px;background:white "></h4>
<h4>本 息 共 计 还 款:<input type="text" name="repaymoney"style="border: 0px;background:white "></h4>
</td>
</tr>
</table>

</div>
<br>
<div style="padding:8px; border:1px solid #C0C0C0;background:#eef3f7">

<blockquote style="padding:3px 2px;border-left:5px solid red;text-align:left;">
<span ><b>企业基本信息 <a href='<%=request.getContextPath()%>'>编辑</a></b></span>
</blockquote>

<table>
<tr>
<td>
<h4>公 司 名 称:<input type="text" name="gongname"style="border: 0px;background:white "></h4>
<h4>公 司 规 模:<input type="text" name="gonggui,"style="border: 0px;background:white "></h4>
</td>
<td>
<h4>工 商 注 册 号:<input type="text" name="username2"style="border: 0px;background:white "></h4>
<h4>联 系 方 式:<input type="text" name="username2"style="border: 0px;background:white "></h4>
</td>
<td>
<h4>行 业:<input type="text" name="username2"style="border: 0px;background:white "></h4>
<h4>地 址:<input type="text" name="username2"style="border: 0px;background:white "></h4>
</td>
</tr>
</table>

</div>
<br>
<div style="padding:8px; border:1px solid #C0C0C0;background:#eef3f7">

<blockquote style="padding:3px 2px;border-left:5px solid red;text-align:left;">
<span ><b>银行卡信息 <a href='<%=request.getContextPath()%>'>编辑</a></b></span>
</blockquote>

<table>
<tr>
<td>
<h4>卡 类 型: <input type="text"  value="<%=branktypename%> "></h4>
</td>
<td>
<h4>银 行 卡 卡 号:<input type="text"  value="<%=banknumber%> "></h4>

</td>
<td>
<h4>预 留手 机 号:<input type="text"  value="<%=bankphone%> "></h4>

</td>
</tr>
</table>

</div>
<input type="button" value="提交资料" class="easyui-linkbutton c4" style="width:120px"> 
<input type="button" value="退出" class="easyui-linkbutton c4" style="width:120px"> 
</div>

</body>
</html>