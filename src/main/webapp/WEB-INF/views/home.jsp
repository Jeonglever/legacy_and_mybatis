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
<h1 align="center">
	Hello world! <br/>
	마이바티스로 CRUD 하며 놀자~!
</h1>

<P align="center"><a href="board">게시판 바로가기</a></P>
<P align="center">현재 시각은 ${serverTime}.</P>
</body>
</html>
