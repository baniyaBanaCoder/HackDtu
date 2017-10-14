<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <style>
body{
    background-color:#ffcc99;
}

.background{
    background-color: white;
    position: relative;
    width: 30px;
    height: 95px;
    box-shadow: 10px 10px 5px grey;
    padding: 200px;
    margin-top: 100px;
    margin-left: 450px;
}

.heading{
    position: absolute;
    top: 50px;
    left: 175px;
}

#UserName{
    position:absolute;
    top: 150px;
    left: 50px;
    height: 50px;
    width: 325px;
    border-radius: 6px;
}

#AadharNo{
    position:absolute;
    top: 205px;
    left: 50px;
    height: 50px;
    width: 325px;
    border-radius: 6px;
}

#LoginButton{
    position:absolute;
    top: 300px;
    left: 50px;
    height: 50px;
    width: 325px;
    border-radius: 8px;
    background-color:#ffcc99;
}

#LoginButton:hover{
    background-color:#ffb366;
}

/*#RecoverPassword{
    position:absolute;
    top: 400px;
    left: 50px;	
}

#NewUser{
    position:absolute;
    top: 427px;
    left: 50px;	
}

#NewUser1{
    position:absolute;
    top: 427px;
    left: 145px;
}*/
        </style>
    <title>Login Page</title>
    </head>
    <body>
        <div class="background">
	<form action="http://localhost:8080/Lanvin/LoginServlet" method="post">
	<div class="heading" style="font-size:35px;weight:bold;font-family:Garamond;color:black">Login</div>
	<input id="UserName" type="text" name="username" style="font-size:15px;font-family:Bookman" placeholder=" Enter Username" required> 
	<input id="AadharNo" type="text" name="aadhar" style="font-size:15px;font-family:Bookman" placeholder=" Enter Aadhar" required>
	<input id="LoginButton" type="submit" style="font-size:15px;font-family:Arial Black;color:white" value="LOG IN">
	<!--<a href="" id="RecoverPassword" style="font-size:14px;color:#ff3399">Recover Password</a>
	<font id="NewUser" style="font-size:14px">New to Lanvin?</font>
	<a href="http://localhost:8080/Lanvin/RegisterServlet" id="NewUser1" style="font-size:14px;color:#ff3399">Create Account</a>-->
        </form>
        </div>
    </body> 
    <div>
    <%@include file="HeaderVote.jsp" %>
    </div> 
</html>
