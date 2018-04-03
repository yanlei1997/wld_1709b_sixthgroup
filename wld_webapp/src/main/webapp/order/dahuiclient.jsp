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
input{
border:none;
background: #eef3f7;
readonly="true"

}
</style>
<jsp:include page="comm.jsp" flush="true"></jsp:include>
<body>

<%String userphone = request.getParameter("userphone");%>
 <%String userid = request.getParameter("userid");%>
<%String orderno = request.getParameter("orderno");%>
<%String orderstatus = request.getParameter("orderstatus");%>
<d iv style="width:1300px;height:30px;background-color:#C0C0C0;padding:20px 10px 15px 10px;">
<b>订单号</b>：<%=request.getParameter("orderno")%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<b>账号</b>：<%=userphone%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<b>用户状态</b>：<%=orderstatus%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;



 <div id="divuserid" style="display: none";>
 <%=userid%>

</div>
<div id="divuserphone" style="display: none";>
<%=userphone%>
</div>
<div id="ordernodiv">
<%=orderno%>

</div>

 

<div id="pic_list">
  <ul>
    <li ><a  href=javascript:onclick:kehu()>客户信息</a></li>
    <li><a  href=javascript:onclick:fengkong()>风控资料</a></li>
    <li>合同</li>


  </ul>
</div>

    <!--风控资料DIV  -->
<div style="background:#E3E3E3;display: none"  id="fengkong-div" class="kehu-div">
风控资料
       <!--   查询对应的 房产信息 -->
      <div style="padding:8px; border:1px solid #C0C0C0;background:#eef3f7">

        <form method="post" action="" id="house">
	
     <table  border="0.5px" width="900px" height="150px">
     <tr>
		<td><h3>房产信息<h3></td>
		<td>
		 <select name="house" id="house1">
			<option value="1" >---有---</option>
			<option value="2">---无---</option>
		 </select>
		</td>
		<td><h3>房产数量<h3></td>
		<td>
		<input type="text" name="housecount"  id="housecount2">		
		</td>
		<td><h3>购买时间<h3></td>
		<td>
		<input type="text" name="housebuytime" id="housebuytime2">		
		</td>
     </tr>
     <tr>
		<td><h3>购买方式<h3></td>
		<td>
		 <select name="housebuytype" id="housebuytype3">
			<option value="1">---全款---</option>
			<option value="2">---分期---</option>
		 </select>
		</td>
		<td><h3>购买价格<h3></td>
		<td>
		<input type="text" name="housebuyprice" id="housebuyprice4">		
		</td>
		<td><h3>房产地址<h3></td>
		<td>
		<input type="text" name="houseaddress"  id="houseaddress5"> 		
		</td>
     </tr>
     <tr>
		<td><h3>房产归属人<h3></td>
		<td>
		<select name="houseaffiliation" id="houseaffiliation6">
			<option value="1">---本人---</option>
			<option value="2">---配偶---</option>
			<option value="2">---父母---</option>
		 </select>
		</td>
	
     </tr>
     </table>


</form>
      </div>      
            <!--   查询对应的 汽车信息 -->
      <div style="padding:8px; border:1px solid #C0C0C0;background:#eef3f7">
      
         
         <form method="post" action="" id="car">
	
       <table  border="0.5px" width="900px" height="150px">
         
         
         <tr>
		<td><h3>汽车信息<h3></td>
		<td>
		 <select name="carstatus" id="carstatus1">
			<option value="1" >---有---</option>
			<option value="2">---无---</option>
		 </select>
		</td>
		<td><h3>汽车数量<h3></td>
		<td>
		<input type="text" name="carcount"  id="carcount2">		
		</td>
		<td><h3>购买时间<h3></td>
		<td>
		<input type="text" name="carbuytime" id="carbuytime3">		
		</td>
     </tr>
     <tr>
		<td><h3>购买方式<h3></td>
		<td>
		 <select name="carbuytype" id="carbuytype4">
			<option value="1">---全款---</option>
			<option value="2">---分期---</option>
		 </select>
		</td>
		<td><h3>购买价格<h3></td>
		<td>
		<input type="text" name="carprice" id="carprice5">		
		</td>
	
   
		<td><h3>车辆归属人<h3></td>
		<td>
		<select name="carpeople" id="carpeople6">
			<option value="1">---本人---</option>
			<option value="2">---配偶---</option>
			<option value="2">---父母---</option>
		 </select>
		</td>
     </tr>
         
         
         
       </table>
       
        </form>

      </div>      
           
           
        
        
            <!--   查询对应的公司 -->
      <div style="padding:8px; border:1px solid #C0C0C0;background:#eef3f7">
          
         <form method="post" action="" id="car">
	
       <table  border="0.5px" width="900px" height="150px">
        
            <tr>
	<td><h3>公司全称<h3></td>
	<td>
	<input type="text" name="gongname" id="gongname1">
	</td>
	<td><h3>公司性质<h3></td>
	<td>
	<select name="gongsixingzhi"  id ="gongsixingzhi2">
		<option value="0">---请选择----</option>
		<option value="">---外企企业----</option>
		<option value="">---国企企业----</option>
		<option value="">---私营企业----</option>
		<option value="">---股份制企业----</option>

	</select>
	</td>
	<td><h3>公司电话<h3></td>
	<td>
	<input type="text" name="gongphone" id="gongphone3">
	</td>
</tr>
<tr>
	<td><h3>公司地址<h3></td>
	<td>
	<input type="text" name="gongaddress" id="gongaddress4">
	</td>
	<td><h3>部门<h3></td>
	<td>
	<input type="text" name="bumen" id="bumen5">
	</td>
	<td><h3>职位<h3></td>
	<td>
	<input type="text" name="zhiwei" id="zhiwei6">
	</td>
</tr>
<tr>
	<td><h3>月收入水平<h3></td>
	<td>
	<input type="text" name="gongshouru" id="gongshouru7">
	
	</td>
	<td><h3>有没有社保卡<h3></td>
	<td>
     	<select name="shebaoka" id="shebaoka8">
		<option value="">---请选择----</option>
		<option value="1">---有----</option>
		<option value="2">----无---</option>
	</select>	
	</td>

	<td><h3>入职时间<h3></td>
	<td>
	<input type="text" name="ingongtime" id="ingongtime9">
	</td>
</tr>
<tr>
	<td><h3>职业性质<h3></td>
	<td>
	<input type="text" name="zhiweixingzhi"  id="zhiweixingzhi10">
	</td>
	<td><h3>主要业务<h3></td>
	<td>
	<input type="text" name="zhuyingyewu" id="zhuyingyewu11">
	</td>
	<td><h3>员工月收入水平<h3></td>
	<td>
	<input type="text" name="yueshouru" id='yueshouru12'>
	</td>
</tr>
                          
        </table>                             
        </form>                      
     </div>   
    
    
    
    
    
       <!-- 担保人基本信息 -->
         <div style="padding:8px; border:1px solid #C0C0C0;background:#eef3f7">
     
        <table border="0.5px" width="900px" height="150px">
        <th>担保人基本信息</th>
      <tr>
      <td><h3>担保方名称<h3></td>
      <td >
      <input type="text"  name="guaranteename"   id="guaranteename1">
      </td>
      <td><h3>身份证/工商注册号<h3></td>
      <td >
        <input type="text"  name="registerednum"  id="registerednum2">
      </td>
      <td><h3>公司地址<h3></td>
      <td>
       <input type="text"  name="guaranteeaddress"  id="guaranteeaddress3">
      </td>
  </tr>

  <tr>     
      <td><h3>联系方式<h3></td>
      <td >
       <input type="text"  name="guaranteephone" id="guaranteephone4">
      
      </td>
      
  </tr>

</table>     
      </div>
    
     <!--联系人基本信息 -->
         <div style="padding:8px; border:1px solid #C0C0C0;background:#eef3f7">
     
  <table border="0.5px" width="900px" height="150px">
 <th>联系人基本信息</th>
  <tr>
      <td><h3>联系人姓名<h3></td>
      <td >
      <input type="text"  name="peoplename"   id="peoplename1">
      </td>
      <td><h3>关系<h3></td>
      <td >
       <input type="text"  name="peoplerelation" id="peoplerelation2">
      
      </td>
      <td><h3>联系方式<h3></td>
      <td >
       <input type="text"  name="peoplephone" id="peoplephone3">
      
      </td>
      
  </tr>

</table>
      
      </div>
    
    
      <input type="button" value="下单" onclick="down()">
    
    
    
    
               
</div>
<!--合同DIV  -->
<div style="background:#E3E3E3;display: none"  id="hetong-div" class="kehu-div">
合同资料

</div>

    




       <!-- 客户div -->
     <div >
      <div style="display: none"; id="table" >
      
      <div style="padding:8px; border:1px solid #C0C0C0;background:#eef3f7">
        
        <form method="post" action="">
        <table  border="0.5px" width="900px" height="150px">                    
         <tr>
		<td><h3>账号：<h3></td>
		<td >		
		<input type="text" name="" id="zh" >		
		</td>
		<td>  <h5>手机号：<h5></td>
		<td>
			<input type="text"  name="" id="phone">	
		</td>
		<td>  <h3>身份份证号<h3></td>
		<td> 		
		    <input type="text"  name=""  id="shen">	
		 </td>
    </tr>
    <tr>
		<td><h3>性别<h3></td>
		<td >
		
		<input type="text"  name=""  id="sex">	
		
		</td>
		<td> <h3> 学历<h3></td>
		<td >
		
		 <input type="text"  name="" id='xueli'>	 
		</td>
		
    </tr>
    <tr>
		<td><h3>婚姻<h3></td>
		<td >
		 <input type="text"  name="" id="marriage">	 		
		</td>
		<td><h3>户口所在地<h3></td>
		<td >
		<input type="text"  name="" id="Accountlocation">	 		
		</td>
		<td><h3>提交时间<h3></td>
		<td >
		<input type="text"  name=""  id="Submissiontime">	 	
		</td>
    </tr>
    </table>
    </form>
      </div><br><br><br>
      
       <div style="padding:8px; border:1px solid #C0C0C0;background:#eef3f7">
      <table  id="boow" border="0.5px" width="900px" height="150px">
  <tr>
	<td><h3>借款个体<h3></td>
	<td >
	      <select id="borrowway">
	    <option value="1">---个人---</option>
	    <option value="2">---企业---</option>
       </select>
	
	</td>
	<td> <h3>还款方式<h3></td>
	<td> 	
	<input type="text"  name=""   id="repayway">	
	</td>
	
	<td><h3>借款总金额<h3></td>
	<td >
	<input type="text"  name=""  id="repaymoney">		
	</td>
  </tr>
  <tr>
	<td><h3>借款期限<h3></td>
	<td >
	<input type="text"  name="" id="borrowtime">		
	</td>
	<td><h3>月利率<h3></td>
	<td>	
	<input type="text"  name="" id="borrowmonth">			
	</td>
	<td><h3>服务费利率<h3></td>
	<td >
	<input type="text"  name="" id="borrowinterest">		
	</td>
  </tr>
  <tr>
	<td><h3>借款用途<h3></td>
	<td>	
	<input type="text"  name=""  id="borrowuse">
	</td>
	<td><h3>还款来源<h3></td>
	<td>
	<input type="text"  name=""   id="repaysource">
	</td>
	<td><h3>利息<h3></td>
	<td><h3>服务费<h3></td>
	<td>总计还款</td>
	
  </tr>
  </table>
      </div>
       <div style="padding:8px; border:1px solid #C0C0C0;background:#eef3f7">
      <!-- 企业基本信息 -->
<table border="0.5px" width="900px" height="150px">
<th>企业基本信息：</th>
  <tr>
      <td><h3>公司名称<h3></td>
      <td >
      <input type="text"  name=""   id="a">
      </td>
      <td><h3>工商注册号<h3></td>
      <td >
        <input type="text"  name=""  id="b">
      </td>
      <td><h3>行业<h3></td>
      <td>
       <input type="text"  name=""  id="c">
      </td>
  </tr>

  <tr>
      <td><h3>公司规模<h3></td>
      <td >
       <input type="text"  name=""  id="d">
      </td>
      <td><h3>联系方式<h3></td>
      <td >
       <input type="text"  name="" id="e">
      
      </td>
      <td><h3>地址<h3></td>
      <td >
      <input type="text"  name="" id="f">
      </td>
  </tr>

</table>
      
      </div>
      
       <div style="padding:8px; border:1px solid #C0C0C0;background:#eef3f7">
      
            <!-- 银行卡基本信息 -->
<table border="0.5px" width="900px" height="150px">
<th>银行卡基本信息：</th>
  <tr>
      <td><h3>卡类型<h3></td>
        <td >
        <input type="text"  name="" id="branktypename">
        </td>
      <td><h3>银行卡账号<h3></td>
      <td>
       <input type="text"  name=""  id="banknumber">
      </td>
      <td><h3>预留手机号<h3></td>
      <td >
      <input type="text"  name="" id="bankphone">
      
      </td>
  </tr>

  
     
      
 

</table>
      
       </div>
      </div>

</div>





<script type="text/javascript">
  
  
  //点击下单 将用户状态修改为初审  
<%--  function down(){
	
	    $.ajax({
	    	url:"<%=request.getContextPath()%>/updateorder.htm",
	    	type:"post",
	    	data:{orderno:$("#ordernodiv").html()},
	    	success:function(result){
	    		
	    		alert(修改成功)
	    		
	    	}
	    	
	    	
	    })	 
 } --%>
  
  
  // 点击风控 使风控展示
  function fengkong(){
	    
	   $("#fengkong-div").toggle();  
       $("#table").css("display","none");
       
        //担保人详情
         $.ajax({
        	 
        	 url:'<%=request.getContextPath()%>/queryguaranteelist.htm',
      	      data:{useridhouse:$("#divuserid").html()},
      	      type:"post",
      	     success:function(result){
      	    	 
                 var guarantee= eval(result)				
				 
				 for (var i = 0; i < guarantee.length; i++) {
					 
					 $("#guaranteename").val(guarantee[i].guaranteename);
					 $("#registerednum2").val(guarantee[i].registerednum);					 
					 $("#guaranteeaddress3").val(guarantee[i].guaranteeaddress);
					 $("#guaranteephone4").val(guarantee[i].guaranteephone);
					 
					 
				 
				 }
      	    	
      	    	
      	    	 
      	    	 
      	     }
        	 
        	 
        	 
         })
      
       
       
         //查询联系人信息
          $.ajax({
        	  url:'<%=request.getContextPath()%>/querypeoplelist.htm',
       	      data:{useridhouse:$("#divuserid").html()},
       	      type:"post",
       	     success:function(result){
        	  

				 var peoplelist= eval(result)				
				 
				 for (var i = 0; i < peoplelist.length; i++) {
					 
					 $("#peoplename1").val(peoplelist[i].peoplename);
					 $("#peoplerelation2").val(peoplelist[i].peoplerelation);					 
					 $("#peoplephone3").val(peoplelist[i].peoplephone);
					 
					 
				 }
       	    	 
       	    	 
       	     }
          })
       
       
        //查询房产信息
       $.ajax({
    	   
    	   url:'<%=request.getContextPath()%>/queryhouselist.htm',
    	   data:{useridhouse:$("#divuserid").html()},
    	   type:"post",
    	   success:function(result){

				 var houselist= eval(result)				
				 
				 for (var i = 0; i < houselist.length; i++) {
    		           
					    
					  $("#house1").val(houselist[i].house);
					  $("#housecount2").val(houselist[i].housecount);
					  $("#housebuytime2").val(houselist[i].housebuytime);
					  $("#housebuytype3").val(houselist[i].housebuytype);
					  $("#housebuyprice4").val(houselist[i].housebuyprice);
					  $("#houseaddress5").val(houselist[i].houseaddress);
					  $("#houseaffiliation6").val(houselist[i].houseaffiliation);
					 
					 
				 }
				 
				 

    	   }
    	   
       })
      
         //查询车辆信息
       $.ajax({
    	   
    	   url:'<%=request.getContextPath()%>/carhouselist.htm',
    	   data:{useridhouse:$("#divuserid").html()},
    	   type:"post",
    	   success:function(result){
    		   
    		   var carlist =eval(result)
    		   
    		   
    		   for (var i = 0; i < carlist.length; i++) {
        		   
				   
					  $("#carstatus1").val(carlist[i].carstatus);
					  $("#carcount2").val(carlist[i].carcount);
					  $("#carbuytime3").val(carlist[i].carbuytime);
					  $("#carbuytype4").val(carlist[i].carbuytype);
					  $("#carprice5").val(carlist[i].carprice);
					
					  $("#carpeople6").val(carlist[i].carpeople);
					 
					 
				 } 
    		   
    		   
    		   
    	   }
    	   
    	   
    	   
       })
         //查询公司信息
         $.ajax({
    	   
    	   url:'<%=request.getContextPath()%>/gongsilist.htm',
    	   data:{useridhouse:$("#divuserid").html()},
    	   type:"post",
    	   success:function(result){
    		
    		    var gongsilist =  eval(result)
    		    
    			 
			  	 for (var i = 0; i < gongsilist.length; i++) {
			 		 		 			 		 			 			
				$("#gongname1").val(gongsilist[i].gongname);
			    $("#gongsixingzhi2").val(gongsilist[i].gongsixingzhi);
			    $("#gongphone3").val(gongsilist[i].gongphone);
			    $("#gongphone3").val(gongsilist[i].gongphone);
			    $("#gongaddress4").val(gongsilist[i].gongaddress);
			    $("#bumen5").val(gongsilist[i].bumen);
			    $("#zhiwei6").val(gongsilist[i].zhiwei);
			    $("#gongshouru7").val(gongsilist[i].gongshouru);
			    $("#shebaoka8").val(gongsilist[i].shebaoka);
			    $("#ingongtime9").val(gongsilist[i].ingongtime);
			    $("#zhiweixingzhi10").val(gongsilist[i].zhiweixingzhi);					 
			    $("#zhuyingyewu11").val(gongsilist[i].zhuyingyewu);
			    $("#yueshouru12").val(gongsilist[i].yueshouru);														 
			 		 
				} 					
    		
    		   
    		   
    		   
    	   }
    	   
    	   
    	   
       })
      
      
  }
      
      
  // 点击客户 使客户显示
  function kehu(){
	  
	  $("#table").toggle();
	  
	  $("#fengkong-div").css("display","none");
	  $.ajax({
			 
			 url:"<%=request.getContextPath()%>/queryinfoByinfoid.htm",
			 data:{userphone:$("#divuserphone").html(),orderno:$("#ordernodiv").html()},
			 type:"post",
			 dataType : "json",
			 success:function(result){
							
				 
				 var json = eval(result)
					
			    
				 for (var i = 0; i < json.length; i++) {
					
					
					$("#zh").val(json[i].username)
					$("#phone").val(json[i].userphone)
					$("#shen").val(json[i].cardnumber)
					$("#sex").val(json[i].sex)
					$("#xueli").val(json[i].Education)
					$("#marriage").val(json[i].Maritalstatus)
					$("#Accountlocation").val(json[i].Accountlocation)
					$("#Submissiontime").val(json[i].Submissiontime)
					
				}
			     
				 
			 }
			 
			 
			 
		 })
		 
	  
		 $.ajax({
			 
			 url:"<%=request.getContextPath()%>/queryborrowByUserid.htm",
			 data:{userid:$("#divuserid").html()},
			 type:"post",
			 dataType : "json",
			 success:function(result){
				 
				 
				 var list = eval(result)
					
			    
				 for (var i = 0; i < list.length; i++) {
					 
					 $("#borrowway").val(list[i].borrowway);
					
					 $("#repayway").val(list[i].repayway);
					 $("#repaymoney").val(list[i].repaymoney);
					 $("#borrowtime").val(list[i].borrowtime);
					 $("#borrowmonth").val(list[i].borrowmonth);
					 $("#borrowinterest").val(list[i].borrowinterest);
					 $("#repaysource").val(list[i].repaysource);
					 $("#borrowuse").val(list[i].borrowuse);
					 
					 
					 
					  
					 
					 
					 
				 }
				 
				 
				 $.ajax({

						url:"<%=request.getContextPath()%>/companylist.htm",
						type:"post",
					
						data:{userid:$("#divuserid").html()},
						success:function(result){
							 
							 var gongsi = eval(result)
							
						 	 for (var i = 0; i < gongsi.length; i++) {
								$("#a").val(gongsi[i].gongname)
								$("#b").val(gongsi[i].gongnumber)
								$("#c").val(gongsi[i].gonghang)
								$("#d").val(gongsi[i].gonggui)
					            $("#e").val(gongsi[i].gongphone)
					            $("#f").val(gongsi[i].gongaddress)
					          
					           
							} 
							 
							 
							 
							 $.ajax({

									url:"<%=request.getContextPath()%>/bankinglist.htm",
									type:"post",								
									data:{useridbrank:$("#divuserid").html()},
									success:function(result){
										 
										 var banking = eval(result)
										  
									 	 for (var i = 0; i < banking.length; i++) {
									 		$("#branktypename").val(banking[i].branktypename)
									 		$("#banknumber").val(banking[i].banknumber)
									 		$("#bankphone").val(banking[i].bankphone)
								          
								           
										} 
									}
									
								}) 
							  
							 
							 
							 
							 
							 
						}
						
					}) 
				  
				 
				 
				 
				 
				 
			   
			 }
		 })
		 
			
  }
	 
	
	 


</script> 
</body>
</html>