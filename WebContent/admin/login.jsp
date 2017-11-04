<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>student testing system</title>
 <script>

 <% if(((String)request.getAttribute("login_fail"))=="Y"){%>
 alert("用户名密码错误");
 <%}%>
 
function checkLogin(){
	var name = document.getElementById("name").value;
	var password = document.getElementById("password").value;
	if(name == ''|| password == ''){
		alert("用户名或密码不能为空！");
		return false;
	}else{
		return true;
	}
	
}
</script>
<link rel="stylesheet" href="/skin/css/login1.css">
	 
</head>
<body>

	<div class="header">
		<div class="main">
			<img class="logo" src="/skin/images/logo1.png">
		</div>
	</div>
	<div class="container">
		<div class="main">
			<div class="loginBox">
			
			<form id="loginForm"  action="/admin/login/AdminLoginController" method="post" >
				<div class="loginContent">
					<div class="title">admin登录<span>LOGIN</span></div>
					<div class="inputArea">
						<div class="box user">
							<input type="text" id="name"  name="name" placeholder="请输入账号" >
							<i class="icn icn-20 icnUser"></i>
						</div>
						<div class="box">
							<input   type="password" id="password"  name="password" placeholder="请输入密码">
							<i class="icn icn-20 icnpwd"></i>
						</div>
					</div>
					
					 <div class="errorContent">
					<div id="message" class="errorAlert" style="display:none;"></div>
					</div>
					
					
					<div class="loginButton">
						<input class="login" type="submit" value="登录" onclick="return checkLogin();">
					</div>
					
 
		
				</div>
				</form>
				
			</div>
		</div>
	</div>
	<div class="loginBoxShadow">
		<div class="main"></div>
	</div>
	<div class="footer">
		<div class="main">
			Copyright © 2015 student testing system project      版权所有
		</div>
	</div>
</body>
</html>