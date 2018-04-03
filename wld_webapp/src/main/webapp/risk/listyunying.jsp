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
.kehu-div{
border:1px solid red;
position:absolute;
top:90%;
display:none;
}
body{
position:relative;
}

</style>
<script type="text/javascript">
$(function(){
	
		$(".kehu-div").css({
			"width":window.innerWidth/1.2,
			"height":window.innerHeight*1.2,
		})
	
})
function kehu_kehudivshow(){
	//点击客户信息
	
	$("#kehu-div").css("display","block");
	$("#fengkong-div").css("display","none");
	$("#hetong-div").css("display","none");
	
	
}
function fenkong_divshow(){
	//点击风控资料
	$("#kehu-div").css("display","none");
	$("#fengkong-div").css("display","block");
	$("#hetong-div").css("display","none");
	
}
function hetong_divshow(){
	//点击合同
	$("#kehu-div").css("display","none");
	$("#fengkong-div").css("display","none");
	$("#hetong-div").css("display","block");
	
}

</script>
<body>


<!--风控资料DIV  -->
<div style="background:#E3E3E3" id="fengkong-div" class="kehu-div">
 
   <!--工作信息查询  -->
   <table border="0.5px" width="900px" height="150px">
    <th>公司信息：</th>
	<tr>
		<td>公司全称:</td>
		<td id="gong1">

		</td>
		<td>公司性质:</td>
		<td id="gong2"></td>
		<td>公司电话：</td>
		<td id="gong3"></td>
	</tr> 
	
	<tr>
		<td>公司地址：:</td>
		<td id="gong4"></td>
		<td>部门：</td>
		<td id="gong5"></td>
		<td>职位：</td>
		<td id="gong6"></td>
	</tr>
	
	<tr>
		<td>月收入水平：</td>
		<td id="gong7"></td>
		<td>社保卡:</td>
		<td id="gong8"></td>
		<td>入职时间:</td>
		<td id="gong9"></td>
	</tr>
	
		<tr>
		<td>职业性质：</td>
		<td id="gong10"></td>
		<td>主营特务:</td>
		<td id="gong11"></td>
		<td>月收入水平:</td>
		<td id="gong12"></td>
	</tr>
	
	
	</table>

	<!-- 房产表单表查询 -->
	<table border="0.5px" width="900px" height="150px" style="background:#7C7C7C">
    <th>工作信息：</th>
	<tr>
		<td>房产:</td>
		<td id="house1"></td>
		<td>房产数量:</td>
		<td id="house2"></td>
		<td>购买时间：</td>
		<td id="house3"></td>
	</tr> 
	
	<tr>
		<td>购买方式:</td>
		<td id="house4"></td>
		<td>购买价格：</td>
		<td id="house5"></td>
		<td>房产地址：</td>
		<td id="house6"></td>
	</tr>
	
	<tr>
		<td>房产归属人:</td>
		<td id="house7"></td>
	
	</tr>
	
	</table>
		<p></p>
		<p></p>

<!-- 汽车表单表查询 -->
	<table border="0.5px" width="900px" height="150px" style="background:#BFBFBF">
    <th>工作信息：</th>
	<tr>
		<td>汽车:</td>
		<td id="car1"></td>
		<td>汽车数量:</td>
		<td id="car2"></td>
		<td>购买时间：</td>
		<td id="car3"></td>
	</tr> 
	
	<tr>
		<td>购买方式:</td>
		<td id="car4"></td>
		<td>购买价格：</td>
		<td id="car5"></td>
		<td>汽车归属人：</td>
		<td id="car6"></td>
	</tr>
	
	
		</table>
			<p></p>
			<p></p>
	
	<!-- 担保人单表查询 -->
		<table border="0.5px" width="900px" height="150px" style="background:#8F8F8F">
	    <th>担保人信息：</th>
		<tr>
			<td>担保人:</td>
			<td id="dan1"></td>
			<td>身份证</td>
			<td id="dan2"></td>
			<td>地址：</td>
			<td id="dan3"></td>
		</tr> 
		
		<tr>
			<td>手机号:</td>
			<td id="dan4"></td>
		
		</tr>
		
		</table>
<p></p>
<p></p>

		<!-- 联系人单表查询 -->
			<table border="0.5px" width="900px" height="150px"  style="background:#4C4C4C">
		    <th>联系人信息：</th>
			<tr>
				<td>配偶姓名:</td>
				<td id="lian1"></td>
				<td>关系</td>
				<td id="lian2"></td>
				<td>联系电话：</td>
				<td id="lian3"></td>
			</tr> 
			
			</table>
		<p></p>
		<p></p>
			 	
		  <!-- 评审结论 -->
			<!--  <form id="ll">
			<table border="0.5px" width="900px" height="100px" style="background:#7C7C7C">
			  
			    <tr>
			      <td>评审结论：</td>
			      <td id="zz">
			         <input type="radio" value="0"  name="ordershen"/>通过
			         <input type="radio" value="1"  name="ordershen"/>打回
			         <input type="radio" value="2"  name="ordershen"/>结束订单
			      </td>
			      <br>
			      <td>备注：</td>
			      <td id="ss"><textarea name="ordercause" rows="" cols=""></textarea></td>
			     
			  </tr>
			  
			</table>
			<input type="button" value="提交"/><br>
		    <input type="button" value="退出" />
			</form> -->
		    

</div>
<!--合同DIV  -->
<div style="background:#E3E3E3" id="hetong-div" class="kehu-div">合同资料</div>



<!--客户信息DIV  -->
<div id="kehu-div" style="display:block;background:#E3E3E3" class="kehu-div">
<!-- 基本信息 -->
  <table border="0.5px" width="900px" height="150px">
		<th>基本信息：</th>
		<tr>
			<td>用户名:</td>
			<td id="aa"></td>
			<td>手机号:</td>
			<td id="bb"></td>
			<td>身份证号：</td>
			<td id="cc"></td>
		</tr>

		<tr>
			<td>户口地址：:</td>
			<td id="dd"></td>
			<td>学历：</td>
			<td id="ee"></td>
			<td>婚姻状况：</td>
			<td id="ff"></td>
		</tr>

		<tr>
			<td>现居住地址：</td>
			<td id="tt"></td>
			<td>性别:</td>
			<td id="gg"></td>
			<td>时间:</td>
			<td id="nn"></td>
		</tr>

	</table>
				<p></p>
				<p></p>
				<p></p>
				<p></p>
<!-- 借款基本信息 -->
<table border="0.5px" width="900px" height="150px" style="background:#BFBFBF">

<tr>
<th>借款信息</th>
</tr>

		<tr>
			<td>借款个体:</td>
				<td id="a1">
				    <select name="borrowway" >
				       <option value="1">个人</option>
				       <option value="2">车主</option>
				    </select>
				</td>
			<td>产品名称:</td>
			<td id="b1">
			     <select name="productname">
				       
				       <option value="车主贷">车主贷</option>
				       <option value="社保贷">社保贷</option>
				    </select>
			</td>
			<td>借款金额小写:</td>
			<td id="c1"></td>
		</tr>
		<tr>
			<td>还款方式:</td>
			<td id="d1"></td>
			<td>借款期限:</td>
			<td id="e1">
			 		<select name="borrowtime">
				       <option>--请选择期限--</option>
				       <option value="3">3</option>
				       <option value="6">6</option>
				       <option value="9">9</option>
				       <option value="12">12</option>
				       <option value="18">18</option>
				       <option value="24">24</option>
				       <option value="36">36</option>
				    </select>月
			</td>
			<td>借款用途:</td>
			<td id="f1"></td>
		</tr>
		<tr>
			<td>月利率:</td>
			<td id="q1"></td>
			<td>服务标准利率:</td>
			<td id="w1"></td>
			<td>本息共计还款:</td>
			<td id="r1"></td>
		</tr>
		<tr>
			<td>利息:</td>
			<td id="o1"></td>
			<td>服务费:</td>
			<td id="p1"></td>
			<td>还款来源:</td>
			<td id="l1"></td>
		</tr>
		</table>

<p></p>
<p></p>
<!-- 企业基本信息 -->
<table border="0.5px" width="900px" height="150px" style="background:#8F8F8F">
		<th>企业基本信息：</th>
		  <tr>
		      <td>公司名称：</td>
		      <td id="a"></td>
		      <td>工商注册号：</td>
		      <td id="b"></td>
		      <td>行业：</td>
		      <td id="c"></td>
		  </tr>
		
		  <tr>
		      <td>公司规模：</td>
		      <td id="d"></td>
		      <td>联系方式：</td>
		      <td id="e"></td>
		      <td>地址：</td>
		      <td id="f"></td>
		  </tr>
		
		</table>
		<p></p>
		<p></p>

<!-- 银行基本信息 -->
<table border="0.5px" width="900px" height="100px" style="background:#4C4C4C">
   <th>银行卡信息</th>
    <tr>
      <td>卡类型：</td>
      <td id="ii"></td>
      <td>银行卡卡号：</td>
      <td id="pp"></td>
      <td>预留手机号：</td>
      <td id="ll"></td>
  </tr>
  

</table>
<p></p>
<p></p>
<!-- 评审结论 -->
<form id="rr">
<table border="0.5px" width="900px" height="100px" style="background:#7C7C7C">
  
    <tr>
      <td>评审结论：</td>
      <td id="pp">
         <input type="radio" value="0" name="ordershen"/>通过
         <input type="radio" value="1" name="ordershen"/>打回
         <input type="radio" value="2" name="ordershen"/>结束订单
      </td>
      <br>
      <td>备注：</td>
      <td id="ss"><textarea name="ordercause" rows="" cols=""></textarea></td>
     
  </tr>
  
 <tr> 
 <td>
    <input type="button" value="提交" id="updateshen" />
     <input type="button" value="退出"/>
     </td>
		 </tr>
</table>
		 
</form>
		   
		 
		</div>
		
			<%String qwe= request.getParameter("userphone");%>
			
			<div style="display: none" id="uu">
			<%=qwe%>
			</div>
		
		
		<%String userid= request.getParameter("userid");%>
		
		<div style="display: none" id="vv">
		<%=userid%>
		</div>

<div style="width:1300px;height:30px;background-color:#C0C0C0;padding:20px 10px 15px 10px;">
<b>订单号</b>：<%=request.getParameter("orderno")%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<b>账号</b>：<%=request.getParameter("userphone")%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<b>渠道ID</b>：<%=request.getParameter("channelid")%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<b>审核状态</b>：<%=request.getParameter("orderstatus")%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

</div>

<div style="display: none;">
<b>用户id</b>：<%=request.getParameter("userid")%>
</div>



<div id="pic_list">
  <ul>
    <li onclick="kehu_kehudivshow()"><b>客户信息</b></li>
    <li onclick="fenkong_divshow()"><b>风控资料</b></li>
    <li onclick="hetong_divshow()"><b>合同</b></li>

  </ul>
</div>

	<script type="text/javascript">
		/* 基本信息查询 */
		userphone=$("#uu").html();
		
		userid=$("#vv").html();
		 
		 $(function (){
			 /*  用户信息表传*/
			  $.ajax({
					
					url:"<%=request.getContextPath()%>/listuserinfobyid.htm",
					type:"post",
					data:{"userphone":userphone},
					success:function(result){
						
						 var json = eval(result)
							
						    
						 for (var i = 0; i < json.length; i++) {
							$("#aa").html(json[i].username);
							$("#bb").html(json[i].userphone);
							$("#cc").html(json[i].cardnumber);
							$("#dd").html(json[i].accountlocation);
				            $("#ee").html(json[i].education);
				            $("#ff").html(json[i].maritalstatus);
				            $("#tt").html(json[i].nowaddress);
				            $("#gg").html(json[i].sex);
				            $("#nn").html(json[i].submissiontime);
				           
						} 
					 
					}
					
				})
		         /* 企业信息表查询 */
				$.ajax({
		
					url:"<%=request.getContextPath()%>/listgongsibyuserid.htm",
					type:"post",
				
					data:{"userphone":userphone},
					success:function(result){
						 var json = eval(result)
						  
						 for (var i = 0; i < json.length; i++) {
							$("#a").html(json[i].gongname);
							$("#b").html(json[i].gongnumber);
							$("#c").html(json[i].gonghang);
							$("#d").html(json[i].gonggui);
				            $("#e").html(json[i].gongphone);
				            $("#f").html(json[i].gongaddress);
				          
				           
						}
					}
					
				}) 
				/* 银行卡表查询 */
				$.ajax({
		
					url:"<%=request.getContextPath()%>/listyinhangbyphone.htm",
					type:"post",
				    data:{"userid":userid},
					success:function(result){
						 var json = eval(result)
						  
						 for (var i = 0; i < json.length; i++) {
							$("#ii").html(json[i].branktypename);
							$("#pp").html(json[i].banknumber);
							$("#ll").html(json[i].bankphone);
							
				          
				           
						}
					}
					
				}) 
				/* 借款表查询 */
				$.ajax({
			
			url:"<%=request.getContextPath()%>/listjiekuanbyid.htm",
			type:"post",
			asyn:true,
			data:{"userphone":userphone},
			success:function(result){
				
				var json = eval(result)
				 for (var i = 0; i < json.length; i++) {
					
					 $("[name='borrowway']").val(json[i].borrowway);
					 $("[name='productname']").html(json[i].productname);
					 //获取文本的值 等于查询出的数值   会被默认选中;
					 $("#c1").html(json[i].borrowmoney);
					 $("#d1").html(json[i].repayway);
					 $("[name='borrowtime']").val(json[i].borrowtime);
					 $("#f1").html(json[i].borrowuse);
					 $("#q1").html(json[i].borrowmonth);
					 $("#w1").html(json[i].borrowinterest);
					 $("#r1").html(json[i].repaymoney);
					 $("#o1").html(json[i].interest);
					 $("#p1").html(json[i].borrowservice);
					 $("#l1").html(json[i].repaysource);
		          
				}
				
			}
			
		})
		
		
	
 		/* 风控信息 汽车表查询查询 */
		$.ajax({

			url:"<%=request.getContextPath()%>/listcarbyuserid.htm",
			type:"post",
		    data:{"userid":userid},
			success:function(result){
				 var json = eval(result)
			
				 for (var i = 0; i < json.length; i++) {
					//定义全局变量    获取车的 信息 
					var car1 = $("#car1").html(json[i].carstatus);
					 if(car1==0){
						
						  $("#car1").html("无");
						}
						else{
							
							 $("#car1").html("有"); 
							
						}
					var car4 =	$("#car4").html(json[i].carbuytype);

						if(car4==0){
							  $("#car4").html("一次性");
							
						}
						else{
							 $("#car4").html("分期付");
							
						}
						
					var car6=	$("#car6").html(json[i].carpeople);
					
					if(car6==0){
						
						$("#car6").html("名人名下");
					}else{
						$("#car6").html("配偶");
						
					}

					$("#car2").html(json[i].carcount);
					$("#car3").html(json[i].carbuytime);
					$("#car5").html(json[i].carprice);
			
				}
			}
			
		}) 
	//初审页面  风控 公司信息	
		$.ajax({
	
	url:"<%=request.getContextPath()%>/listgongsibyuserphone.htm",
	type:"post",
	asyn:true,
	data:{"userphone":userphone},
	success:function(result){
		
     	var json = eval(result)
		
	    for (var i = 0; i < json.length; i++) {
	    
	    	var  gong8= $("#gong8").html(json[i].shebaoka)

	    	if(gong8==1){
	    		
	    		$("#gong8").html("有")
	    	}else{
	    		
	    		$("#gong8").html("无")
	    	}
	    	 $("#gong1").html(json[i].gongname)
	    	 $("#gong2").html(json[i].gongsixingzhi)
	    	 $("#gong3").html(json[i].gongphone)
	    	 $("#gong4").html(json[i].gongaddress)
	    	 $("#gong5").html(json[i].bumen)
	    	 $("#gong6").html(json[i].zhiwei)
	    	 $("#gong7").html(json[i].gongshouru)
	    	 $("#gong9").html(json[i].ingongtime)
	    	 $("#gong10").html(json[i].zhiweixingzhi)
	    	 $("#gong11").html(json[i].zhuyingyewu),
	    	 $("#gong12").html(json[i].yueshouru)
	    }
	}
})

		/* 担保人查询 */
				$.ajax({
		
					url:"<%=request.getContextPath()%>/listdanbaorenbyuserid.htm",
					type:"post",
				    data:{"userid":userid},
					success:function(result){
						 var json = eval(result)
						  
						 for (var i = 0; i < json.length; i++) {
							$("#dan1").html(json[i].guaranteename);
							$("#dan2").html(json[i].registerednum);
							$("#dan3").html(json[i].guaranteeaddress);
							$("#dan4").html(json[i].guaranteephone);
							
				          
				           
						}
					}
					
				})
				
				/* 联系人查询 */
				$.ajax({
		
					url:"<%=request.getContextPath()%>/listuseridbylianxi.htm",
					type:"post",
				    data:{"userid":userid},
					success:function(result){
						 var json = eval(result)
						  
						 for (var i = 0; i < json.length; i++) {
							$("#lian1").html(json[i].peoplename);
							$("#lian2").html(json[i].peoplerelation);
							$("#lian3").html(json[i].peoplephone);
				
						}
					}
					
				})
				
				/* 风控信息 房屋表表查询查询 */
				$.ajax({

					url:"<%=request.getContextPath()%>/listhousebyuserid.htm",
					type:"post",
				    data:{"userid":userid},
					success:function(result){
						 var json = eval(result)
					
						 for (var i = 0; i < json.length; i++) {
							//定义全局变量    获取车的 信息 
							var house1 = $("#house1").html(json[i].house);
							 if(house1==1){
								
								  $("#house1").html("无");
								}
								else{
									
									 $("#house1").html("有"); 
									
								}
							var house4 =	$("#house4").html(json[i].housebuytype);

								if(house4==1){
									  $("#house4").html("一次性");
									
								}
								else{
									 $("#house4").html("分期付");
									
								}
								
							var house7=	$("#house7").html(json[i].houseaffiliation);
							
							if(house7==1){
								
								$("#house7").html("本人名下");
							}else{
								$("#house7").html("配偶");
								
							}

							$("#house2").html(json[i].housecount);
							$("#house3").html(json[i].housebuytime);
							$("#house5").html(json[i].housebuyprice);
							$("#house6").html(json[i].houseaddress);
					
						}
					}
					
				}) 
				
			 
		 })
		
		</script>
		
	
		<script type="text/javascript">
		//修改审核状态   单击提交   修改 订单的状态为复审 审核状态为通过
		 $("#updateshen").click(function(){
			 
		 ordershen=$("[name='ordershen']:checked").val()
		 alert(ordershen)
		 if (ordershen==0) {
			orderstatus="";
		}else if(ordershen==1){
			orderstatus="";
			ordershen=1;
		}else if (ordershen=2){
			orderstatus="";
			ordershen=2;
		}
	
		  $.ajax({
			  
			  url:"<%=request.getContextPath()%>/updateshen.htm?orderstatus="+orderstatus+"&ordershen="+ordershen,
				type:"post",
			    data:{"userid":userid},
				success:function(result){
					 var json = eval(result)
						
					 if (json) {
						location.href="listlisk.jsp";
					}else{
						alert("请给出审评结论")
					} 
					 
				} 
		
		  })
		 
		 
	 })
		</script>


</body>
</html>