<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	success
	<br>
	<br>
	<br>
	<shiro:hasRole name="root">
    这是admin角色登录：<shiro:principal></shiro:principal>
</shiro:hasRole>

	  <shiro:hasRole name="超级管理员">
		这是root角色登录:<shiro:principal>超级管理员角色登录成功</shiro:principal>
	</shiro:hasRole>	
	<shiro:hasRole name="用户">
		这是用户角色登录:<shiro:principal>用户角色登录成功</shiro:principal>
	</shiro:hasRole>	
	<shiro:hasRole name="公司管理员">
		这是用户角色登录:<shiro:principal>公司管理员角色登录成功</shiro:principal>
	</shiro:hasRole>	 
</body>
</html>