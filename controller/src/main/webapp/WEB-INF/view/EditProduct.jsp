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
Product Details
<f:form method="post" action="updateproduct" modelAttribute="addproduct" enctype="multipart/form-data">
<table>
<tr>
<td>
<f:input path="id" value="${currproduct.id}"/>

</td>
<td>
Enter Product Name
</td>
<td>
<f:input path="productName" value="${currproduct.productName}" />
</td>
</tr>
<tr>
<td>
Enter Price
</td>
<td>
<f:input path="price" value="${currproduct.price}"/>
</td>
</tr>
<tr>
<td>
Enter Quantity
</td>
<td>
<f:input path="quantity" value="${currproduct.quantity}"/>
</td>
</tr>
<tr>
<td>
Enter description
</td>
<td>
<f:textarea path="description" value="${currproduct.description}"/>
</td>
</tr>
<tr>
<td>
Select Category Id
</td>
<td>
<f:input path="categoryid"/>
</td>
</tr>
<tr>
<td>
Select Supplier Id
</td>
<td>
<f:input path="supplierid"/>
</td>
</tr>
<tr>
<td>
Select Product Image
</td>
<td>
<input type="file" name="file"/>
</td>
</tr>
</table>
<tr>
<td>
<input type='submit' value="save"/>
</td>
</tr>
</f:form>
</body>
</html>