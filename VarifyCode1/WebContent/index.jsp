<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
	<script type="text/javascript">
		function change() {
			var myimg = document.getElementById("myimg");
			myimg.src = myimg.src + "?a="+new Date().getTime();
		}
	</script>
</head>
<body>
	<form action="<c:url value='/LoginServlet'/>">
		用户名:<input type="text" name="username"/><br />
		密码:<input type="text" name="password"/><br />
		验证码:<input type="text" name=""verifycode"/>
		<img id="myimg" src="<c:url value='/VerifyCodeServlet'/>"/>
		 <a href="javascript:change()">看不清楚换一张</a><br />
		<input type="submit" value="登录"/>
	</form>
</body>
</html>