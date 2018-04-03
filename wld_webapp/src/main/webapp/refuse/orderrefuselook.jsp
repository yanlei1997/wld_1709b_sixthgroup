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
<style>
 
#refuse
{
display:block;
white-space:nowrap;
width:500px;
overflow:auto;
margin-left: -10px;
}
#refuse li
{
width:80px;
height:30px;
margin:3px;
background:#C0C0C0;
display:inline-block;
text-align: center;

}
</style>
<div style="background-color: #D3D3D3 ;height: 750px">
<%String qwe= request.getParameter("userphone");%>

<div style="display: none" id="uu">
<%=qwe%>
</div>

<!-- 抬头 -->
<div style=" height:30px;padding-left: 10px;text-align: left;padding-top: 10px" >
订单号：<%= request.getParameter("orderno")%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
账号：<%= request.getParameter("userphone")%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
渠道id：<%= request.getParameter("channelid")%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
业务员：狗子
</div>

<!-- 客户信息 风控资料 合同 div -->

<div id="refuse">
  <ul>
    <li class="kehuxinxi" onclick="kehuxinxi()">客户信息</li>
    <li class="fengkongziliao" onclick="fengkong()">风控资料</li>
    <li class="hetong" onclick="hetong()">合同</li>

  </ul>
</div>
<div id="kehu">
<!--基本信息表格  -->
<table  width="800px" height="150px">
<tr>
<th>基本信息</th>
</tr>

<tr>
<td>账号：</td>
<td id="bb"></td>
<td>用户名：</td>
<td id="aa"></td>
<td>手机号：</td>
<td ><%= request.getParameter("userphone")%></td>
</tr>

<tr>
<td>身份证号：</td>
<td id="cc"></td>
<td>性别：</td>
<td id="gg"></td>
<td>学历：</td>
<td id="ee"></td>
</tr>

<tr>
<td>婚姻状况：</td>
<td id="ff"></td>
<td>户口所在地：</td>
<td id="dd"></td>
<td>现居住地址：</td>
 <td id="tt"></td>
</tr>

<tr>
<td>提交时间：</td>
<td id="nn"></td>
</tr>

</table>
<p></p>
<!-- 借款信息表格 -->

<table  width="800px" height="150px">

<tr>
<th>借款信息</th>
</tr>

<tr>
<td>借款个体：</td>
	<td>
	    <select>
	       <option>--请选择个体--</option>
	       <option>个人</option>
	       <option>企业</option>
	    </select>
	</td>
<td>产品名称：</td>
<td>
     <select>
	       <option>--请选择产品--</option>
	       <option>车主贷</option>
	       <option>社保贷</option>
	    </select>
</td>
<td>借款金额小写：</td>
<td id="a"></td>
</tr>
<tr>
<td>还款方式：</td>
<td id="b"></td>
<td>借款期限:</td>
<td>
 		<select>
	       <option>--请选择期限--</option>
	       <option>3</option>
	       <option>6</option>
	       <option>9</option>
	       <option>12</option>
	       <option>18</option>
	       <option>24</option>
	       <option>36</option>
	    </select>
</td>
<td>借款用途：</td>
<td id="e"></td>
</tr>
<tr>
<td>月利率：</td>
<td id="c"></td>
<td>服务标准利率：</td>
<td id="d"></td>
<td>本息共计还款：</td>
<td id="g"></td>
</tr>
<tr>
<td>利息：</td>
<td>服务费：</td>
<td>还款来源：</td>
<td id="f"></td>
</tr>
</table>
<p></p>

<!-- 企业信息 -->

<table  width="800px" height="100px">
<tr>
<th>企业基本信息：</th>
</tr>
<tr>
<td>公司名称：</td>
<td id="aaa"></td>
<td>工商注册号：</td>
<td id="bbb"></td>
<td>行业：</td>
<td id="ccc"></td>
</tr>
<tr>
<td>公司规模：</td>
<td id="ddd"></td>
<td>联系方式：</td>
<td id="eee"></td>
<td>地址：</td>
<td id="fff"></td>
</tr>
</table >
<p></p><p></p>

<!-- 银行卡 -->
<table width="800px" height="50px">
<tr>
<th>银行卡信息：</th>
</tr>
<tr>
<td>卡类型：</td>
<td >
<input  type="text"  style="border: 0px;background:#D3D3D3 "  name="branktypename"/>
</td>
<td>银行卡号：</td>
<td >
<input  type="text"  style="border: 0px;background:#D3D3D3 "  name="banknumber"/>
</td>
<td>预留手机号：</td>
<td >
<input  type="text"  style="border: 0px;background:#D3D3D3 "  name="bankphone"/>
</td>
</tr>
</table>
</div>

<!-- 风控DIV -->
<div id="fengkong"  style="display: none">
<table  width="800px" height="150px">
<tr>
<th>工作信息</th>
</tr>
<tr>
	<td>公司全称：</td>
	<td id="a1"></td>
	<td>公司性质：</td>
	<td id="a2"></td>
	<td>公司电话：</td>
	<td id="a3"></td>
</tr>
<tr>
	<td>公司地址：</td>
	<td id="a4"></td>
	<td>部门：</td>
	<td id="a5"></td>
	<td>职位：</td>
	<td id="a6"></td>
</tr>
<tr>
	<td>月收入水平：</td>
	<td id="a7"></td>
	<td>社保卡：</td>
	<td id="a8"></td>
	<td>入职时间：</td>
	<td id="a9"></td>
</tr>
<tr>
	<td>职业性质：</td>
	<td id="a10"></td>
	<td>主营业务：</td>
	<td id="a11"></td>
	<td>月收入水平：</td>
	<td id="a12"></td>
</tr>
</table>
<p></p><p></p>

<!-- 资产信息表 -->
<table  width="800px" height="150px">
<tr>
<th>资产信息</th>
</tr>
<tr>
<td>房产：</td>
<td id="b1"></td>
<td>房产数量：</td>
<td id="b2"></td>
<td>购买时间：</td>
<td id="b3"></td>
</tr>
<tr>
<td>购买方式：</td>
<td id="b4"></td>
<td>购买价格：</td>
<td id="b5"></td>
<td>房产地址：</td>
<td id="b6"></td>
</tr>
<tr>
<td>房产归属人：</td>
<td id="b7"></td>
</tr>
<tr>
<td>汽车</td>
<td id="b8"></td>
<td>汽车数量</td>
<td id="b9"></td>
<td>购买时间</td>
<td id="b10"></td>
</tr>
<tr>
<td>购买方式</td>
<td id="b11"></td>
<td>购买价格</td>
<td id="b12"></td>
<td>汽车归属人</td>
<td id="b13"></td>
</tr>
</table>

<!-- 担保人表 -->
<table>
<tr>
<th>担保人信息</th>
</tr>
<tr>
<td>配偶姓名：</td>
<td id="c1"></td>
<td>手机号：</td>
<td id="c2"></td>
<td>公司电话：</td>
<td id="c3"></td>
</tr>
<tr>
<td>直系亲属：</td>
<td id="c4"></td>
<td>关系：</td>
<td id="c5"></td>
<td>手机号：</td>
<td id="c6"></td>
</tr>
<tr>
<td>其他联系人：</td>
<td id="c7"></td>
<td>关系：</td>
<td id="c8"></td>
<td>手机号：</td>
<td id="c9"></td>
</tr>
</table>

</div>


<!--合同div  -->
<div id="hetong"  style="display: none">
合同
</div>

</div>
<script type="text/javascript">

/* 风控信息担保人信息 */

$.ajax({
	
	url:"<%=request.getContextPath()%>/orderrefusedanbao.htm",
	type:"post",
	asyn:true,
	data:{"userphone":$("#uu").html()},
	success:function(result){
	
		var json = eval(result)
		
	    for (var i = 0; i < json.length; i++) {
	    	 $("#c1").html(json[i].peoplename)
	    	 $("#c2").html(json[i].peoplephone)
	    	 $("#c3").html(json[i].peoplephone)
	    	 
	    	/*  $("#c4").html(json[i].peoplename)
	    	 $("#c5").html(json[i].peoplename)
	    	 $("#c6").html(json[i].peoplename)
	    	 $("#c7").html(json[i].peoplename)
	    	 $("#c8").html(json[i].peoplename)
	    	 $("#c9").html(json[i].peoplename) */
	    	
	    }
	}
	
})


/* 风控资料  的资产信息 */

$.ajax({
	
	url:"<%=request.getContextPath()%>/orderrefusezichan.htm",
	type:"post",
	asyn:true,
	data:{"userphone":$("#uu").html()},
	success:function(result){
		
		var json = eval(result)
		
	    for (var i = 0; i < json.length; i++) {
	    	
	   	
	    	 if ( json[i].houseid!=null) {
			
			 $("#b1").html("有")
		   }else{
			   
			   $("#b1").html("无")
		   } 
	    	 
	    	 if (json[i].houseaffiliation==1) {
	    		 $("#b7").html("本人")
	    		 
			}
	    	 if (json[i].houseaffiliation==2) {
	    		 $("#b7").html("配偶")
			}
	    	 if (json[i].houseaffiliation==3) {
	    		 $("#b7").html("父母")
			}
	    	 
	    	 if (json[i].carid!=null) {
	    		 $("#b8").html("有")
			}else{
				$("#b8").html("无")
			}
	    	 
	    	 if (json[i].carpeople==1) {
	    		 $("#b13").html("本人")
			}	
	    	 if (json[i].carpeople==2) {
	    		 $("#b13").html("配偶")
			}
	    	 if (json[i].carpeople==3) {
	    		 $("#b13").html("父母")
			}
	    	 if (json[i].housebuytype==1) {
	    		 
	    		 $("#b4").html("贷款")
			}
			if (json[i].housebuytype==2) {
	    		 
	    		 $("#b4").html("一次付清")
			}
			if (json[i].carbuytype==1) {
				$("#b11").html("贷款")
			}
			if (json[i].carbuytype==0) {
	    		 
	    		 $("#b11").html("一次付清")
			}
	   	 $("#b2").html(json[i].housecount)
	   	 $("#b3").html(json[i].housebuytime)
	   	
	   	 $("#b5").html(json[i].housebuyprice)
	   	 $("#b6").html(json[i].houseaddress)
	   	 
	   	 $("#b9").html(json[i].carcount)
	   	 $("#b10").html(json[i].carbuytime)
	   	 
	   	 $("#b12").html(json[i].carprice)
	   	 
	    }
	}
	
})



/* 风控资料得工作信息查询   方法和企业信息方法相同*/


/* 点击客户  显示客户div */
function kehuxinxi(){
	
	$("#kehu").css("display","block");
	$("#fengkong").css("display","none");
	$("#hetong").css("display","none")
}
/* 点击风控  显示风控div */
function fengkong(){
	
	$("#fengkong").css("display","block");
	$("#kehu").css("display","none");
	$("#hetong").css("display","none");
}
/* 点击合同  显示合同div */
function hetong(){
	$("#fengkong").css("display","none");
	$("#kehu").css("display","none");
	$("#hetong").css("display","block");
	
}
/* 银行卡 */

$.ajax({
	
	url:"<%=request.getContextPath()%>/orderrefusebrankcard.htm",
	type:"post",
	asyn:true,
	data:{"userphone":$("#uu").html()},
	success:function(result){
		
		var json = eval(result)
		
	    for (var i = 0; i < json.length; i++) {
			 $("[name='branktypename']").val(json[i].branktypename)
			 $("[name='banknumber']").val(json[i].banknumber)
			 $("[name='bankphone']").val(json[i].bankphone)
			 
		}
	}
})


/* 企业信息 */

$.ajax({
	
	url:"<%=request.getContextPath()%>/orderrefusegongsi.htm",
	type:"post",
	asyn:true,
	data:{"userphone":$("#uu").html()},
	success:function(result){
		
		var json = eval(result)
	    for (var i = 0; i < json.length; i++) {
	    	
			 $("#aaa").html(json[i].gongname)
			 $("#bbb").html(json[i].gongnumber)
			 $("#ccc").html(json[i].gonghang)
			 $("#ddd").html(json[i].gonggui)
			 $("#eee").html(json[i].gongphone)
			 $("#fff").html(json[i].gongaddress)
			 
			  $("#a1").html(json[i].gongname)
	    	 $("#a2").html(json[i].gongsixingzhi)
	    	 $("#a3").html(json[i].gongphone)
	    	 $("#a4").html(json[i].gongaddress)
	    	 $("#a5").html(json[i].bumen)
	    	 $("#a6").html(json[i].zhiwei)
	    	 $("#a7").html(json[i].gongshouru)
	    	 $("#a8").html(json[i].shebaoka)
	    	 $("#a9").html(json[i].ingongtime)
	    	 $("#a10").html(json[i].zhiweixingzhi)
	    	 $("#a11").html(json[i].zhuyingyewu)
	    	 $("#a12").html(json[i].yueshouru)
          
		}
	}
})


/* 借款信息 */
$.ajax({
	
	url:"<%=request.getContextPath()%>/orderrefuseborrow.htm",
	type:"post",
	asyn:true,
	data:{"userphone":$("#uu").html()},
	success:function(result){
		
		var json = eval(result)
	    
		 for (var i = 0; i < json.length; i++) {
			 $("#a").html(json[i].borrowmoney)
			 $("#b").html(json[i].repayway)
			 $("#c").html(json[i].borrowmonth)
			 $("#d").html(json[i].borrowservice+"%")
			 $("#e").html(json[i].borrowuse)
			 $("#f").html(json[i].repaysource)
			 $("#g").html(json[i].repaymoney)
          
		}
	}
	
})


/* 用户基本信息查询 */
$.ajax({
	
	url:"<%=request.getContextPath()%>/orderrefuselook.htm",
	type:"post",
	asyn:true,
	data:{"userphone":$("#uu").html()},
	success:function(result){
		
		 var json = eval(result)
			
		    
		 for (var i = 0; i < json.length; i++) {
			 $("#aa").html(json[i].username)
			$("#bb").html(json[i].userphone)
			$("#cc").html(json[i].cardnumber)
			$("#dd").html(json[i].accountlocation)
            $("#ee").html(json[i].education)
            $("#ff").html(json[i].maritalstatus)
         $("#tt").html(json[i].nowaddress)
           $("#gg").html(json[i].sex)
            $("#nn").html(json[i].submissiontime)
           
		}
	}
	
})

</script>

</body>
</html>