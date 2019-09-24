<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin</title>
</head>
<body>
<nav>
<table>
<tr>
<td>
<c:url value="productdetails" var="Product"/>
<c:url value="supplierdetails" var="Supplier"/>
<c:url value="Categorydetails" var="Category"/>
<a href="${Product}">Product</a>
</td>
<td>
<a href="${Category}">Category</a>
</td>
<td>
<a href="${Supplier}">Supplier</a>
</td>
</tr>


</table>


</nav>
</body>
</html>