<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Emp</title>
</head>
<body>
	<h1>사원정보 수정</h1>
	<form action="./updateGo" method="post">
		<table border="1">
			<tr>
				<th>name</th>
				<td><input type="text" name="name" required>이름</td>
			</tr>
			<tr>
				<th>empNum</th>
				<td><input type="number" name="empNum">사번</td>
			</tr>
			<tr>
				<th>salary</th>
				<td><input type="number" name="salary">봉급</td>
			</tr>
			<tr>
				<th>&nbsp;</th>
				<td><input type="submit" value="수정하기"> <input
					type="reset" value="취소"></td>
			</tr>
		</table>
	</form>
</body>
</html>

