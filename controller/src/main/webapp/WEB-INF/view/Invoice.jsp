<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
   <%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:url value="/resources/images/" var="image"/>
<center><h1>Billing Details</h1></center>
<table class="table table-borderless">
<thread class="table-dark">
<th>Image</th>
<th><center>Price</center></th>
</thread>
</table>
<table class="table table-borderless">
<c:forEach items="${cartlist}" var="cart">
<tr>
<td>
<img src="${image}${cart.productid}.jpg" height="250px" width="250"/>
</td>
<td>
<h3>${cart.price }
</h3>
</td>
</tr>
</c:forEach>
</table>
<label><h1><center>Total amount:${carttotal}</center></h1></label>
<c:forEach items="${paymentlist}" var="payment">
<label><h5><center>Billing Address:${payment.billingAddress }</center></h5></label></c:forEach>



</body>
</html>