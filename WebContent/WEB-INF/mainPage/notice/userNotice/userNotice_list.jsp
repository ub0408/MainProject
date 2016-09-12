<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	사용자 공지사항이에요~
<table border="1">
	<c:forEach var="dto" items="${list}">
		<tr>
			<td>${dto.num}</td>
			<td>${dto.subject}</td>
			<td>${dto.writer}</td>
			<td>${dto.reg_date}</td>
			<td>${dto.content}</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>