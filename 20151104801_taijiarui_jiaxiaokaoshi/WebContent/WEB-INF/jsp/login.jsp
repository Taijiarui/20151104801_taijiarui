<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
function validate(){
	var username = document.getElementById("username").value;
	if(username==""){
		alert("用户名不能为空！");
		return false;
	}
	return true;
}

</script>
</head>
<body>
<h1>用户登陆</h1>
<font color="red">${errorlogin}</font>
<form:form modelAttribute="employee" action="/ssm02/user/loginForm" method="post" onsubmit="return validate()">
	用户名：<form:input path="name" id="username"/>
	<form:errors path="name"></form:errors>
	<br>
	出生日期:<form:input path="birthday"/>
	<form:errors path="birthday"></form:errors>
	<br>
	<input type="submit" value="提交">
</form:form>
</body>
</html>