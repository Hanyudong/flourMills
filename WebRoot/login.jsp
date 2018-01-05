<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>登录</title>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="stylesheet" href="css/bootstrap.min.css" />
    <link rel="stylesheet" href="css/bootstrap-responsive.min.css" />
    <link rel="stylesheet" href="css/us-bms-login.css" />
    <link rel="stylesheet" href="font-awesome/css/font-awesome.css" />

  </head>
  
  <body>
	<div id="loginbox">
		<form id="loginform" class="form-vertical clearfix"
			action="http://themedesigner.in/demo/matrix-admin/index.html">
			<div class="control-group normal_text">
				<h3>
					<img src="img/logo.png" alt="Logo" />大风车管理系统
				</h3>
			</div>
			<div class="control-group">
				<div class="controls">
					<div class="main_input_box">
						<span class="add-on bg_lg"><i class="icon-user"></i></span> <input
							name="username" class="username" type="text" placeholder="用户名" />
					</div>
				</div>
			</div>
			<div class="control-group">
				<div class="controls">
					<div class="main_input_box">
						<span class="add-on bg_ly"><i class="icon-lock"></i></span> <input
							name="password" class="password" type="password" placeholder="密码" />
					</div>
				</div>
			</div>
			<div class="control-group">
				<div class="controls">
					<div class="main_input_box">
						<span class="add-on bg_ly"><i class="icon-lock"></i></span> <input
							type="text" placeholder="验证码" /> <span class="main-safe-code">
							<img id="safecode" src="images/checkcode.jpg" onclick="reloadcode()" title="如果看不清，请点击本图片换一张">
						</span>
					</div>
				</div>
			</div>
			<a type="submit" href="index.jsp"
				class="btn btn-success pull-right btn-login">登录</a>
		</form>
	</div>
  <script type="text/javascript" src="js/jquery-1.11.3.min.js"></script>
  <script src="js/jquery.min.js"></script>
  <script src="js/jquery.validate.js"></script>
  <script src="js/matrix.login.js"></script>
  <script type="text/javascript">
  	function reloadcode() {
		var verify = document.getElementById("safecode");	
		verify.src = "images/checkcode.jpg?"+Math.random();
	}
  </script>
  </body>
</html>
