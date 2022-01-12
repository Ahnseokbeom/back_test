<%@ page language = "java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
<table border = "1">
<th>id</th> <th>번호</th> <th>이름</th> <th>이메일</th>
<tr>
<td>${student.id }</td>
<td>${student.studentNumber }</td>
<td>${student.studentName }</td>
<td>${student.email }</td>
</tr>

</table>
</body>
</html>