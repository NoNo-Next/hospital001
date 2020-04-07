<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>辰轩医院欢迎您</title>
	<link href="${pageContext.request.contextPath}/plugin/css/login/login.css" rel="stylesheet">
	<!-- jsp包含指令 -->
	<%@ include file="../common/commoncss.jsp" %>
	<%@ include file="../common/commonjs.jsp" %>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery/jquery.md5.js"></script>
</head>
<body>
<div class="login">
	<div class="message">辰轩医院管理系统</div>
	<div id="darkbannerwrap"></div>

	<form method="post" action="#">
		<input name="action" value="login" type="hidden">
		<input id="userName" name="userName" placeholder="用户名" required="" type="text">
		<hr class="hr15">
		<input id="userPwd" name="userPwd" placeholder="密码" required="" type="password">
		<hr class="hr15">
		<img id="imgObj" alt="" src="${pageContext.request.contextPath}/code/getCode?random=0.14335069776783593" title="看不清，点击刷新">
		<hr class="hr15">
		<input id="code" name="code" placeholder="验证码" required="" type="text">
		<hr class="hr15">
		<input id="loginBtn" value="登录" style="width:100%;" type="button" onclick="login()" >
		<hr class="hr20">

	</form>
</div>
<script type="text/javascript">
	$(function(){//jquery加载事件  text()、attr()、val()、html()
		//按回车键的时候，触发登录按钮的点击事件
		$(document).keydown(function(event){
			event = event ? event : window.event;
			if (event.keyCode === 13){
				$("#loginBtn").trigger("click");
			}
		})

		// 切换验证码
		$("#imgObj").click(function(){
			$(this).attr("src","${pageContext.request.contextPath}/code/getCode?random="+Math.random());
		})
	})

	//更新验证码
	function getNewCode() {
		$("#imgObj").attr("src", "${pageContext.request.contextPath}/code/getCode?random=" + Math.random());
	}

	function login(){
		var username = $("#userName").val()
		var pwd = $("#userPwd").val()
		var code = $("#code").val()
		if ( !code){
			alert("验证码不能为空！！！")
			$("#code").focus()
		}else if(!username){
			alert("用户名不能为空！！！")
			$("#username").focus()
		}else if(!pwd){
			alert("密码不能为空!!!")
			$("#pwd").focus()
		}else {
			$.ajax({
				type: 'post',
				data: {
					userName:username,
					userPwd:$.md5(pwd),
					code : $("#code").val().trim()
				},
				url: "${pageContext.request.contextPath}/login",
				success: function (data) {
					var result = data.res;
					if ("登录成功" == result){
						window.location.href = "${pageContext.request.contextPath}/getMenu";
					} else {
						alert(result)
						getNewCode()
					}
				}
			})
		}
	}

</script>
</body>
</html>