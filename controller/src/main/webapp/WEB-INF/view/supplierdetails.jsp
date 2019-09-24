<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
   <%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Supplier Details</title>
</head>
<body>
Supplier Details
<f:form method="post" action="addSupplier" modelAttribute="addSupplier">
<table>
<tr>
<td>
Enter Supplier Name
</td>
<td>
<f:input path="supplierName" value="${currsupplier.supplierName}" />
</td>
</tr>
<tr>
<td>
Enter Address
</td>
<td>
<f:input path="address" value="${currsupplier.address}"/>
</td>
</tr>
</table>
<tr>
<td>
<input type='submit' value="save"/>
</td>
</tr>
</f:form>
<table border="2">
<th>
supplier Name
</th>
<th>
address
</th>
<c:forEach items="${supplierlist}" var="supplier">
<tr>
<td>
${supplier.supplierName}
</td>
<td>
${supplier.address}
</td>
<td>
<a href="supplierdetails?id=${supplier.id}">edit</a>
</td>
<td>
<a href="deleteSupplier?id=${supplier.id}">delete</a>
</td>
</tr>
</c:forEach>
</body>
</html>