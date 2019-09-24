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
<h1><center>PAYMENT DETAILS!!!!</h1>
Total amount:${carttotal}
<%String userName=(String)session.getAttribute("userName"); %>
Email:<%out.println(userName); %>
</center>
<center>
<form method="post" action="add">
<input type='hidden' name='total value=${carttotal}'/> 
<table>
<tr>
Enter Payment Method:
<td><div id=flip">
<input type="radio" name="payment" value="card"/> Card
</div>
<div id="panel">
<input type='text' placeholder='Card no'/>
<input type='text' placeholder='CCV'/>

</div>
<input type="radio" name="paymenttype" value="Cash on Delivery"/>Cash on delivery<br>

</td>
</tr>
<br>
<tr>
<td>
Enter billing address
</td>
<td>
<input type="textarea" name="billingAddress" required></td>
</tr>
</table><br><br>
</body>
</html>
