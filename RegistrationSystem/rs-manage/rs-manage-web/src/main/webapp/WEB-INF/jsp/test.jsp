<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	测试C标签：
	<hr/>
	
	<c:forEach items="${mylist}" var="mtype">
		${mtype.tmid} --- ${mtype.mname} <br/>
	</c:forEach>
	
	测试图片：
	<hr/>
	<img src="${imageAddr}"  alt="我的头像" />
</body>
</html>