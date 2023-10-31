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
		<th>작성자</th>
		<th>제목</th>
		<th>날짜</th>
		<th>조회수</th>
	</tr>
<c:choose> 
	<c:when test = "${board != null}">
		<c:forEach items="${board}" var="data">
	<tr>
		<td>${data.userId}</td>
		<td onclick="location.href='detail?boardNo=${data.boardNo}'" style="cursor:pointer">${data.boardTitle}</td>
		<td><fmt:formatDate pattern="yyyy/MM/dd" value="${data.boardDate}"/></td>
		<td>${data.boardCount}</td>
		<br>
	</tr>
	</c:forEach>	
	</c:when>
	<c:otherwise>
	<tr>
		<td colspan="4">내용이 없습니다.</td>
	</tr>
	</c:otherwise>

</c:choose>
</table>
<div><br>
<button onclick="location.href='insert'">글쓰기</button>
</div>
</body>
</html>