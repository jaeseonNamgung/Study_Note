<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name = "viewprot" content = "width = device-width, initial-scale=1">
<link rel = "stylesheet" href = "css/bootstrap.css">
<title>JSP AJAX</title>
</head>
<body>
	<br>
	<div class = "container">
		<div class = "form-group row pull-right">
			<div class = "col-xs-8">
				<input class = "form-control" type = "text" size="20">	
			</div>
			<div class = "col-xs-2">
				<button class= "btn btn-primary" type = "button">검색</button>
			</div>
		</div>
		<table class = "table" style = "text-align : center; border : 1px solid #dddddd">
			<thead>
				<th style = "background-color : #fafafa" text-align : center;">이름</th>
				<th style = "background-color : #fafafa" text-align : center;">나이</th>
				<th style = "background-color : #fafafa" text-align : center;">성별</th>
				<th style = "background-color : #fafafa" text-align : center;">이메일</th>
			</thead>
			
			<tbody>
				<tr>
					<td>남궁재선</td>
					<td>25</td>
					<td>남자</td>
					<td>sunnamgung8@naver.com</td>
				</tr>
			</tbody>
		</table>
	</div>
</body>
</html>