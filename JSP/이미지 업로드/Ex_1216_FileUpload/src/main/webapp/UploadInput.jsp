<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script>
	function send(f){
		var title = f.title.value.trim();
		var photo = f.photo.value;
		
		if(title = ''){
			alert("제목을 입력하세요");
			return;
		}
		if(photo == ''){
			alert("사진을 선택하세요");
			return;
		}
		
		f.action="upload.do";
		f.submit();
	}
</script>
</head>
<body>
	<!-- 파일업로드 시 고려사항
		1. 반드시 form 태그 안에서 업로드 할 것
		2. form 전송방식은 POST
		3. enctype = "multipart/form-data" -->
		<form method="POST" enctype = "multipart/form-data">
			제목:<input name ="title"><br>
			첨부:<input type = "file" name="photo"><br>
			<input type = "button" value = "업로드" onclick="send(this.form)">
		</form>
</body>
</html>