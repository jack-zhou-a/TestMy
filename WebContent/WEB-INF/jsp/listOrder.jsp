<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>订单展示界面</title>
</head>
<body>
<table>
	
<c:forEach items="${allOrder }" var="ao1">

	<tr>
		<th>ID</th>
		<th>订单名称</th>
		<th>订单描述</th>			
	</tr>
	<tr>
		<th>${ao1.id }</th>
		<th>${ao1.ordername }</th>
		<th>${ao1.orderremark }</th>
	</tr>	
	<tr>
		<td>明细ID</td>
		<td>明细</td>
		<td>订单数量</td>
	</tr>		
	<c:forEach items="${ao1.orderdetails }" var="aod">	
		<tr>			
			<td>${aod.id }</td>
			<td>${aod.orderdetail }</td>
			<td>${aod.ordernum }</td>
		</tr>					
	</c:forEach>	
	
			
			
	
</c:forEach>
		

</table>
</body>
</html>