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

	<h2>渠道详情</h2>
	
	<div style="background: #ffffff;margin-left: 30px;float: left">
	<div style="float: left">
		<div style="background: #ff0000;width:5px;height: 25px;float: left"></div>
		<div style="float: left;width:100px"><b>渠道基本信息</b></div>
	</div>
	
	<div>
	
		<form id="ff" action="">
			<input type="hidden" name="channel.id" value="${list[0].id}"/>
			<table>
				<tr>
					<td><h4>公司名称</h4></td>
					<td><input type="text" name="channel.companyname" value="${list[0].companyname}"/></td>
				</tr>
				<tr>
					<td><h4>公司地址</h4></td>
					<td><input type="text" name="channel.companyaddress" value="${list[0].companyaddress}"/></td>
				</tr>
				<tr>
					<td><h4>联系人</h4></td>
					<td><input type="text" name="channel.people" value="${list[0].people}"/></td>
				</tr>
				<tr>
					<td><h4>联系电话</h4></td>
					<td><input type="text" name="channel.linkphone" value="${list[0].linkphone}"/></td>
				</tr>
				<tr>
					<td><h4>渠道来源</h4></td>
					<td>
						<select name="channel.channelsource">
							<option value="1">合作</option>
							<option value="2">自营</option>
						</select>
					</td>
				</tr>
				<tr>
					<td><h4>渠道级别</h4></td>
					<td><input type="text" name="channel.channelrank" value="${list[0].channelrank}"/></td>
				</tr>
				<tr>
					<td><h4>渠道id</h4></td>
					<td><input type="text" name="channel.channelid" value="${list[0].channelid}"/></td>
				</tr>
			</table>
		</form>	
	
	</div>
	<input type="button" value="确定" onclick="qd()"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="button" value="取消" onclick="qx()"/>
	</div>
	
	<script type="text/javascript">
	
		function qd(){
			
			$.ajax({
				url:"<%=request.getContextPath()%>/updateChannel.htm",
				type:"post",
				data:$("#ff").serialize(),
				success:function(result){
					
					alert("修改成功")
					location.href="<%=request.getContextPath()%>/updchan.htm";
				}
			})
		}
			
		function qx(){
			
			alert("取消成功")
		
			location.href="<%=request.getContextPath()%>/updchan.htm";
		}	
		
		
	
	</script>
	
</body>
</html>