<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All EMPLOYEE LIST</title>
</head>
<body>
	<h1>사원 목록</h1>
	<a href="<c:url value='/insert'/>">신규 사원 정보 입력</a>
	<a href="<c:url value='/update'/>">사원 정보수정</a>
	<table border="1">
		<tr>
			<th>사원봉급정보</th>
			<th>name</th>
			<th>empNum</th>
			<th>salary</th>
			<th>삭제메뉴</th>
			<th>수정메뉴</th>
		</tr>
		<c:forEach var="emp" items="${empList}">
			<tr>
				<td><a href="<c:url value='/getEmp?empNum=${emp.empNum}'/>">사원번호 ${emp.empNum}의 정보</a></td>
				<td>${emp.name}</td>
				<td>${emp.empNum}</td>
				<td>${emp.salary}</td>
				<td><a href="<c:url value='/delete?empNum=${emp.empNum}'/>">사원번호 ${emp.empNum}삭제하기</a></td>
				
				 
			</tr>
		</c:forEach>
	</table>
</body>
</html>