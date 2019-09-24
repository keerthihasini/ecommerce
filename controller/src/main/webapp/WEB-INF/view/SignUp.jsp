<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<style type="text/css">
body
{
margin: 0;
padding: 0;
background: #efefef;
font-size:16px;
color:#777;
font-weight:300;
font-family: sans-serif;
}
#login
{
position: relative;
margins: 5% auto;
width:600px;
height: 400px;
background: white;
box-shadow: 0 2px 4px rgba(0, 0, 0, 0.8);
}

.leftbox
{
width: 300px;
height: 400px;
top: 0;
left: 0;
position:absolute;
box-sizing:border-box;
padding:40px;
}
h1
{
margin: 0 0 20px 0;
font-weight:300;
font-size:28px;
}

input[type="text"],
input[type="password"]
{
display:block;
width:220px;
height:32px;
margin-bottom:20px;
box-sizing:border-box;
padding:4px;
font-weight:400;
font-family: sans-serif;
outline: none;
border:  none;
transition:0.2s ease;
border-bottom:1px solid #aaa;
font-weight:15px;
}
input[type="submit"]
{
width:120px;
height:32px;
margin-bottom: 28px;
background: green;
font-weight:500;
font-family: sans-serif;
border-radius:2px;
border:  none;
transition:0.2s ease;
text-transform:uppercase;
cursor:pointer;
color:#fff;
}
.right-box
{
width: 300px;
height: 400px;
top: 0;
right:0;
position:absolute;
box-sizing:border-box;
padding:40px;
background-size:cover;
background-position:center;
}
.or
{
position:absolute
width: 40px;
height: 40px;
top: 180px;
left:280;
position:absolute;
background-radius:50%;
line-height:40px;
background: #efefef;
box-shadow: 0 2px 4px rgba(0, 0, 0, 0.8);
text-align:center;
}
.right-box .signinwith
{
display: block;
margin-bottom:40px;
font-size:30px;
color:black;
text-align:center;
text-shadow:0 2px 4px rgba(0, 0, 0, 0.6);
}
button.social
{
margin-bottom:20px;
width: 220px;
height: 36px;
border:none;
border-radius:2px;
color:#fff;
font-family: sans-serif;
font-weight:500;
transition:0.2s ease;
cursor:pointer;
}
.facebook
{
background:blue;
}
.twitter
{
background:green;
}
.google
{
background:red;
}
</style>


</head>
<body>
<div id="login">
<div class="leftbox">
<h1> Sign Up</h1>
<input type="text"name="username"placeholder="Username"/>
<input type="text"name="email"placeholder="Email"/>
<input type="password"name="password"placeholder="Password"/>
<input type="password"name="password2"placeholder="Retype password"/>
<input type="Submit" name="signupbutton" value="Sign up"/>
</div>
<div class="right-box">
<span class="signinwith">Sign in with<br>Social Network</span>
<button class="social facebook">Login with facebook</button>
<button class="social twitter">Login with Twitter</button>
<button class="social google">Login with Google+</button>

</div>
<div class="or">OR</div>
</div>
</body>
</html>