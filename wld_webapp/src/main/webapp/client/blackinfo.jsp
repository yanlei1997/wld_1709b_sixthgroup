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

<%String userphone = request.getParameter("userphone");%>
<%String orderno = request.getParameter("orderno");%>
<%String username = request.getParameter("username");%>
<%String cardnumber = request.getParameter("cardnumber");%>



<div  style="width:1300px;height:30px;background-color:#C0C0C0;padding:20px 10px 15px 10px;">
<a href=''>客户信息</a>

</div>
<br>
<div>
<div style="padding:8px; border:1px solid #C0C0C0;background:#eef3f7">

<blockquote style="padding:3px 2px;border-left:5px solid red;text-align:left;">
<span ><b>基本信息</b></span>
</blockquote>

<table>
<tr>
<td>
<h4>账 号: <input type="text"  value="<%=userphone%>" ></h4>
<h4>身 份 证 号:<input type="text"  value="<%=cardnumber%>" ></h4>
<h4>婚 姻 状 况:<input type="text"  value="" ></h4>
<h4>提 交 时 间:<input type="text"  value="" ></h4>
</td>
<td>
<h4>用 户 名:<input type="text"  value=" <%=username%>"></h4>
<h4>性 别:<input type="text"  value=""></h4>
<h4>户 口 所 在 地:<input type="text"  value=" "></h4>
</td>
<td>
<h4>手 机 号:<input type="text"  value="<%=userphone%>"></h4>
<h4>学 历:<input type="text"  value=" "></h4>
<h4>现 住 地 址:<input type="text"  value=""></h4>
</td>
</tr>
</table>

</div>
<br>
<div style="padding:8px; border:1px solid #C0C0C0;background:#eef3f7">

<blockquote style="padding:3px 2px;border-left:5px solid red;text-align:left;">
<span ><b>借款信息</b></span>
</blockquote>

<table>
<tr>
<td>
<h4>借 款 个 体:<input type="text"  value=""></h4>
<h4>还 款 方 式:<input type="text"  value=""></h4>
<h4>月 利 率:<input type="text"  value=""></h4>
<h4>利 息 小 写:<input type="text" name="borrowinterest" style="border: 0px;background:white "></h4>
<h4>利 息 大 写:<input type="text" name="borrowinterest"style="border: 0px;background:white "></h4>
</td>
<td>
<h4>产 品 名 称:<input type="text"  value=" "></h4>
<h4>借 款 期 限:<input type="text"  value=""></h4>
<h4>服 务 费 标 准 利 率:<input type="text"  value=""></h4>
<h4>服 务 费 小 写:<input type="text" name="borrowservice"style="border: 0px;background:white "></h4>
<h4>服 务 费 大 写:<input type="text" name="borrowservice"style="border: 0px;background:white "></h4>
</td>
<td>
<h4>借 款 总 金 额 小 写:<input type="text" name="borrowmoney"style="border: 0px;background:white "></h4>
<h4>借 款 总 金 额 大 写:<input type="text" name="borrowmoney"style="border: 0px;background:white "></h4>
<h4>借 款 用 途:<input type="text"  value=" "></h4>
<h4>还 款 来 源:<input type="text"  value=" "></h4>
<h4>本 息 共 计 还 款:<input type="text" name="repaymoney"style="border: 0px;background:white "></h4>
</td>
</tr>
</table>

</div>
<br>
<div style="padding:8px; border:1px solid #C0C0C0;background:#eef3f7">

<blockquote style="padding:3px 2px;border-left:5px solid red;text-align:left;">
<span ><b>企业基本信息</b></span>
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
<span ><b>银行卡信息</b></span>
</blockquote>

<table>
<tr>
<td>
<h4>卡 类 型: <input type="text"  value=" "></h4>
</td>
<td>
<h4>银 行 卡 卡 号:<input type="text"  value=""></h4>

</td>
<td>
<h4>预 留手 机 号:<input type="text"  value=" "></h4>

</td>
</tr>
</table>

</div>
<br>
<div style="padding:8px; border:1px solid #C0C0C0;background:#eef3f7">

<blockquote style="padding:3px 2px;border-left:5px solid red;text-align:left;">
<span ><b>原因</b></span>
</blockquote>

<table>
<tr>
<td>
<h4> <input type="text"  value=" "></h4>
</td>

</tr>
</table>

</div>


<script type="text/javascript">




</script>

</body>
</html>