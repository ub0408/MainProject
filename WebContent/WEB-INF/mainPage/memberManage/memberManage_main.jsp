<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ include file="/top.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<table>
	<tr>
		<td width="100" width="100">id</td>
		<td width="100" width="100">name</td>
		<td width="100" width="100">birth</td>
		<td width="100" width="100">passwd</td>
		<td width="100" width="100">phon</td>
		<td width="100" width="100">email</td>
		<td width="100" width="100">nickname</td>
		<td width="100" width="100">fva</td>
		<td width="100" width="100">member_grade</td>
		<td width="100" width="100">branch_id</td>
		<td width="100" width="100">win</td>
		<td width="100" width="100">lose</td>
	</tr>
	<c:forEach var="dto" items="${list }">
		<tr>
			<td width="100">${dto.id }</td>
			<td width="100">${dto.name }</td>
			<td width="100">${dto.birth }</td>
			<td width="100">${dto.passwd }</td>
			<td width="100">${dto.phon }</td>
			<td width="100">${dto.email }</td>
			<td width="100">${dto.nickname }</td>
			<td width="100">${dto.fva }</td>
			<td width="100">${dto.member_grade }</td>
			<td width="100">${dto.branch_id }</td>
			<td width="100">${dto.win }</td>
			<td width="100">${dto.lose }</td>
		</tr>
	</c:forEach>
</table>
<form name="f" action="membersearch.managePage" method="post">
<table>
	<tr>
		<td>
			아이디 검색
		</td>
		<td>
			이름 검색
		</td>
	</tr>
	<tr>
		<td>
			<input type="text" name="id">
		</td>
		<td>
			<input type="text" name="name">
		</td>
	</tr>
	<tr>
		<td colspan="2">
			<input type="submit" value="검색">
		</td>
	</tr>
</table>
</form>
<%@ include file="/bottom.jsp"%>