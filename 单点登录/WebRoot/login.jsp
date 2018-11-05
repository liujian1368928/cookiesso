<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/SSHDemo/sso/login.action " method="post">
			帐号<input type="text" name="username">
			密码<input type="text" name="userpwd">
			<input type="hidden" value="${gotoUrl}" name="gotoUrl">
			<input type="submit" value="提交">
	</form>
</body>
</html>