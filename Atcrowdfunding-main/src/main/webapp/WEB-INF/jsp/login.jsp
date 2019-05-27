<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-CN">
  <head>
    <meta charset="GB18030">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="keys" content="">
    <meta name="author" content="">
	<link rel="stylesheet" href="${contextPath }/bootstrap/css/bootstrap.min.css">
	<link rel="stylesheet" href="${contextPath }/css/font-awesome.min.css">
	<link rel="stylesheet" href="${contextPath }/css/login.css">
	<script type="text/javascript">
		function dologin() {
	    	/* $("#loginForm").submit(); */
	    	// 异步登录
	    	var $loginacct = $("#loginacct");
	    	var $userpswd = $("#userpswd");
	    	
	    	if($.trim($loginacct.val()) == ""){
	    		alert("用户名不能为空!");
	    		$loginacct.val("");
	    		return false;
	    	}
	    	
	    	jQuery.ajax({
	    			type : "POST",
	    			url: "${contextPath }/doLogin.do",
	    			data: {
	    				"loginacct": $loginacct.val(),
	    				"userpswd": $userpswd.val()
	    			},
	    			error: function(data){
	    				alert(data.msg);
	    			},
	    			success: function(data, textStatus, jqXHR){
	    				if(data.status == "200"){
		    				alert(data.msg);
		    				window.location.href = "${contextPath }/main.htm";
	    				}else{
	    					alert(data.msg);
	    				}
	    			}
	    	});
	    	
	    }
	</script>
  </head>
  <body>
    <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
      <div class="container">
        <div class="navbar-header">
          <div><a class="navbar-brand" href="index.html" style="font-size:32px;">尚筹网-创意产品众筹平台</a></div>
        </div>
      </div>
    </nav>

    <div class="container">

      <form id="loginForm" action="${contextPath }/doLogin.do" method="post" class="form-signin" role="form">
        <h2 class="form-signin-heading"><i class="glyphicon glyphicon-log-in"></i> 用户登录</h2>
		  <div class="form-group has-success has-feedback">
			<input type="text" class="form-control" id="loginacct" name="loginacct" placeholder="请输入登录账号" autofocus>
			<span class="glyphicon glyphicon-user form-control-feedback"></span>
		  </div>
		  <div class="form-group has-success has-feedback">
			<input type="password" class="form-control" id="userpswd" name="userpswd" placeholder="请输入登录密码" style="margin-top:10px;">
			<span class="glyphicon glyphicon-lock form-control-feedback"></span>
		  </div>
		  <div class="form-group has-success has-feedback">
			<select class="form-control" name="role" >
                <option value="member">会员</option>
                <option value="user">管理</option>
            </select>
		  </div>
        <div class="checkbox">
          <label>
            <input type="checkbox" value="remember-me"> 记住我
          </label>
          <br>
          <label>
            忘记密码
          </label>
          <label style="float:right">
            <a href="reg.html">我要注册</a>
          </label>
        </div>
        <a class="btn btn-lg btn-success btn-block" onclick="dologin()" > 登录</a>
      </form>
    </div>
    <script src="${contextPath }/jquery/jquery-2.1.1.min.js"></script>
    <script src="${contextPath }/bootstrap/js/bootstrap.min.js"></script>
    <script>
	    
    </script>
  </body>
</html>