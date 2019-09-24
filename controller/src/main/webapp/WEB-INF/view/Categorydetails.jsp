<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
   <%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>category Details</title>
</head>
<body>
category Details
<f:form method="post" action="addCategory" modelAttribute="addCategory">


<tr>
<td>
Enter category name
</td>
<td>
<f:input path="categoryName" value="${currCategory.categoryName}"/>
</td>
</tr>

<tr>
<td>
<input type='submit' value="save"/>
</td>
</tr>
</f:form>
<table border="2">
<th>
category Name
</th>
<c:forEach items="${categorylist}" var="category">
<tr>
<td>
${catergory.categoryName}
</td>
<td>
<a href="Categorydetails?id=${category.id}">edit</a>
</td>
<td>
<a href="deleteCategory?id=${catgory.id}">delete</a>
</td>
</tr>
</c:forEach>
</table>
</body>
</html>