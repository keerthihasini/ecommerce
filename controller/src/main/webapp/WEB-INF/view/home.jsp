<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
      <%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
    
 <!DOCTYPE html>
  <html>
  <head>
  
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
    <script type="text/javascript">
var arr=[]
arr.push(foo);
function cart()
{
var foo=document.getElementById('count').innerHTML;
foo++;
document.getElementById('count').innerHTML=foo;
}
</script>
  </head>
  <body><div class="well">
<div class="page header">
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      
    </div>
  </div>

      <ul class="nav navbar-nav">
        <li class="active"><a href="home"><span class="glyphicon glyphicon-home"></span>Home</a></li>  
        <ul class="nav navbar-nav navbar-left">
        
        <li><a href="Cart"><span class="glyphicon glyphicon-shopping-cart"></span>cart<span class="badge" id="count">0</span></a></li>
   </ul>

        
    
  <form class="navbar-form navbar-left" action="/action_page.php">
        <div class="input-group">
          <input type="text" class="form-control" placeholder="Search" name="search" size="100">
          <div class="input-group-btn">
            <button class="btn btn-default" type="submit">
              <i class="glyphicon glyphicon-search"></i>
            </button>
          </div>
        </div>
      </form>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="SignUp"><span class="glyphicon glyphicon-signup"></span>SignUp</a></li>
        <li><a href="login.html"><span class="glyphicon glyphicon-login"></span> Login</a></li>
        
      </ul>
    </div>
  </nav></div><br>
 
<center><ul class="list-inline" id="pack">
<li class="dropdown">
<a href="" class="dropdown-toggle"data-toggle="dropdown">Tvs & Appliances<span class="caret"></span></a>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
<ul class="dropdown-menu">
<li><a href="">SamSung</a></li>
<li><a href="">LG</a></li>
<li><a href="">JVC</a></li>
</ul>

<li class="dropdown">
<a href="" class="dropdown-toggle"data-toggle="dropdown">Home&Furniture<span class="caret"></span></a>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
<ul class="dropdown-menu">
<li><a href="">Home Lighting</a></li>
<li><a href="">Sofa</a></li>
<li><a href="">Dinning table &set</a></li>
</ul>

<li class="dropdown">
<a href="" class="dropdown-toggle"data-toggle="dropdown">Baby & Kids<span class="caret"></span></a>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
<ul class="dropdown-menu">
<li><a href="">Toys</a></li>
<li><a href="">Baby clothing</a></li>
<li><a href="">Baby care</a></li>
</ul>
<li class="dropdown">
<a href="" class="dropdown-toggle"data-toggle="dropdown">Books&Music<span class="caret"></span></a>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp

<ul class="dropdown-menu">
<li><a href="">Young Readers</a></li>
<li><a href="">Music Instruments</a></li>
<li><a href="">Acadamics</a></li>
</ul>
<li class="dropdown">
<a href="" class="dropdown-toggle"data-toggle="dropdown">Men<span class="caret"></span></a>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
<ul class="dropdown-menu">
<li><a href="">Footwear</a></li>
<li><a href="">Sports Wear</a></li>
<li><a href="">Watches</a></li>
</ul>
<li class="dropdown">
<a href="" class="dropdown-toggle"data-toggle="dropdown">Women<span class="caret"></span></a>
<ul class="dropdown-menu">
<li><a href="">Western wear</a></li>
<li><a href="">Jewellery</a></li>
<li><a href="">Accessories</a></li>
	</ul>
</ul><br><br>

  <c:url value="/resources/images/" var="image"/>
  <div class="container">
<div class="row">
        <c:forEach items="${productlist}" var="product">
       
          <div class="col-sm-4">
              
          <img src="${image}${product.id}.jpg" class="rounded" width="340" height="230"></br>
          ${product.productName}
          ${product.price}
           
 <f:form method="post" action="addcart" modelAttribute="myCart">
 

 <input type='hidden' name='productid' value='${product.id}'/>
 <input type='hidden' name='price' value='${product.price }'/> 

 
 <label><input type="submit" class="btn btn-sm" value="Add to cart"></label>
 
 </f:form>
  
       
  </div>
   </c:forEach></div></div>
  </body>
  </html>