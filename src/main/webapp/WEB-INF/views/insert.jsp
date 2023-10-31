<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script>

	
	function boardInsert() {
		var userId = $("#userId").val()
		var title = $("#boardTitle").val()
		var content = $("#boardContent").val()
		
		if(userId == null || userId == "") {
			alert('작성자를 입력 해주세요.');
			return;
		}
		
		if(title == null || title == "") {
			alert('제목을 입력해 주세요.');
			return;
		}
		
		if(content == null || content == "") {
			alert('내용을 입력해 주세요.');
			return;
		}
		$("#frm").submit();
		
	}
</script>
</head>
<body>
<h3>게시글 작성</h3>
<form:form action="/insert" method="post" id="frm" modelAttribute="board">
	작성자<br>
	<input type="text" name="userId" id="userId" placeholder="작성자" required><br>
	제목<br>
	<input type="text" name="boardTitle" id="boardTitle" placeholder="제목을 입력하세요." required><br>
	내용<br>
	<textarea name="boardContent" id="boardContent" placeholder="내용을 입력하세요." cols="30" rows="10"></textarea><br>
	<button type="button" onclick="boardInsert()">등록</button>
	<button onclick="location.href='board'">돌아가기</button>
	
</form:form>

</body>
</html>