<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
   <%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit category</title>
</head>
<body>
Category details
<f:form method="post" action="updateCategory" modelAttribute="addCategory">
<table>
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
Enter category id
</td>
<td>
<f:input path="id" value="${currCategory.id}"/>/>
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