<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
   <%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit supplier</title>
</head>
<body>
Supplier details
<f:form method="post" action="updateSupplier" modelAttribute="addSupplier">
<table>
<tr>
<td>
<f:input path="id" value="${currSupplier.id}"/>
</td>
<td>
Enter Supplier name
</td>
<td>
<f:input path="supplierName" value="${currSupplier.supplierName}"/>
</td>
</tr>
<tr>
<td>
Enter Address
</td>
<td>
<f:input path="address"/>
</td>
</tr>
<tr>
<td>
<input type="submit" value="save"/>
</td>
</tr>

</table>
</f:form>
</body>
</html>