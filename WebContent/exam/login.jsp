<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>student testing system</title>
 
 
<script src="/skin/scripts/common.js"></script>
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
			
			<form id="loginForm"  action="/j_spring_security_check" method="post" >
				<div class="loginContent">
					<div class="title">请填写本人基本信息</div>
					<div class="inputArea">
						<div class="box user">
							<input type="text" id="name"  name="name" placeholder="请输入姓名" >
							<i class="icn icn-20 icnUser"></i>
						</div>
						<div class="box user">
							<input type="text" id="email"  name="email" placeholder="请输入邮件地址" >
							<i class="icn icn-20 icnUser"></i>
						</div>
						<div class="box user">
							<input type="text" id="phonenumber"  name="phonenumber" placeholder="请输入手机号码" >
							<i class="icn icn-20 icnUser"></i>
						</div>
					</div>
					
					 <div class="errorContent">
					<div id="message" class="errorAlert" style="display:none;"></div>
					</div>
					<div class="loginButton">
						<input class="login" type="submit" value="开始测试">
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