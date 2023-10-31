<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!
</h1>

<P>  The time on the server is ${serverTime}. </P>
<c:choose>
	<c:when test = "${board != null}">
	<c:forEach items="${board}" var="data">
<h1> ${data.boardContent} ㅁㅁ</h1>
</c:forEach>
</c:when>
<c:otherwise>
${data.boardContent}
내용이 없습니다.
</c:otherwise>
</c:choose>
</body>
</html>
