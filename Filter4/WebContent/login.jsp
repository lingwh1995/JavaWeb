<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>登录</h1>
	<form action="${pageContext.request.contextPath }/login" method="post">
		账户:<input type="text" name="username"/><br />
		密码:<input type="text" name="username"/><br />
		<input type="submit" value="登录"/>
	</form>
</body>
</html>