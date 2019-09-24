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
<th>ID</th>
<th>Image</th>
<th>Price</th>
<c:url value="/resources/images/" var="image"/>
  <table>
   
   <c:forEach items="${cartlist}" var="cart">
     <tr>
        <td>
           ${cart.id}
           </td>
           <td>
           <img src="${image}${cart.productid}.jpg" height="50px" width="50px"/>
         </td> 
          <td>
             ${cart.price}
          </td>
          <td>
           <a href='deletecart?id=${cart.id}'>delete</a>
          </td>
      </tr></table>
      <c:url value="payment" var="payment"/>
      <label><center>Total amount:${carttotal} </center>
      </label>
   </c:forEach>
   


<a href="Paymentdetails">payment</a>
</body>
</html>