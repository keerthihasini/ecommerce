<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
 body
{
margin: 0;
padding: 0;
background: url(peace.jpg);
background-size: cover;
background-position: center;
font-family:sans-serif;

}
.loginbox{
width:320px;
height:420px;
background:grey;
color:black;
top:50%;
left:40%;
position:absolute;
transform:translate(-10%,-50%);
box-sizing:border-box;
padding:70px 30px;
}
.Avatar{
width:100px;
height:100px;
border-radius:50%;
position:absolute;
top:-50px;
left: calc(50% - 50px);
}
h1
{
margin:0;
padding:0 0 20px;
text-align:center;
font-size:22px;
}
.loginbox p{
margin:0;
padding:0;
font-weight:bold;
}
.loginbox input
{
width:100%;
margin-bottom:20px;
}

.loginbox input[type="text"],input[type="password"]
{
border:none;
border-bottom:1px solid #fff;
background:transparent;
outline:none;
height:40px;
color:#fff;
font-size:16px;
}
.loginbox input[type="submit"]
{
border:none;
outline:none;
height:40px;
background:green;
color:#fff;
font-size:18px;
border-radius:20px
}
.loginbox input[type="submit"]:hover
{
cursor:pointer;
background:#ffc107;
color:#000;
}
.loginbox a
{
text-decoration:none;
font-size:12px;
line-height:20px;
color:white;
}
</style>
</head>
<body>
<div class="loginbox">
<img src="Avatar.png" class="Avatar">
<h1>Login Here</h1>
<form method="post" action="/controller/j_spring_security_check">
<p>Username</p>
<input type="text" name="j_username" placeholder="Enter User name">
<p>Password</p>
<input type="password" name="j_password" placeholder="Enter Password">
<center><input type="submit" name="" value="Login">

</form>
</div>
</body>

</html>
