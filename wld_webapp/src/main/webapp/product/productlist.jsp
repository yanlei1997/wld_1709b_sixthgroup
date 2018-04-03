<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	 <%String productid = request.getParameter("productid");%>
	 <%String productname = request.getParameter("productname");%>
	 <%String producttype = request.getParameter("producttype");%>
	 <%String productstatus = request.getParameter("productstatus");%>
	 <%String productsource = request.getParameter("productsource");%>
	 <%String productdate = request.getParameter("productdate");%>
	 
	 <input type="text" value="<%=productid%>"/>
	 <input type="text" value="<%=productname%>"/>
	 <input type="text" value="<%=producttype%>"/>
	 <input type="text" value="<%=productstatus%>"/>
	 <input type="text" value="<%=productsource%>"/>
	 <input type="text" value="<%=productdate%>"/>

</body>
</html>