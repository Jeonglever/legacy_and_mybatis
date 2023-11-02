<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
			<td>작성자 : ${board.userId}</td>
			<td>작성일 : <fmt:formatDate pattern="yyyy/MM/dd" value="${board.boardDate}"/></td>
		</tr>
		<tr>
			<td colspan="2">${board.boardTitle}</td>
		</tr>
		<tr>
			<td colspan="2">${board.boardContent}</td>
		</tr>
	</table><br>
	<button onclick="location.href='update?crudNo=${board.boardNo}'">수정</button>
	<button>삭제</button>
	<button onclick="location.href='board'">돌아가기</button>
	
</body>
</html>