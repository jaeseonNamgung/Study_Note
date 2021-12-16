<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- JSTL (javascript tag library)
	: jsp영역에서 for, if문등을 사용할 수 있도록 해 주는 문법  --> 
<!--forEach, if등 제어문을 사용하기 위한 라이브러리 사용  -->   
<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src = "js/httpRequest.js"></script>
<script>
	function del(idx){
		
		if(!confirm("정말 삭제하시겠습니까?")){
			return;
		}
		
		//삭제를 원하는 idx를 Ajax를 통해 서블릿으로 전달
		var url = "member_del.do";
		var param = "idx="+idx;
		
		sendRequest(url, param, resultFn, "GET");
		
	}
	
	function resultFn(){
		if( xhr.readyState == 4 && xhr.status == 200){
			
			// data = "";
			var data = xhr.responseText;
			
			// data변수에 담긴 값을 실제 사용 가능한 JSON 형식으로 변환
			var json = eval(data);
			
			if( json[0].p == 'yes'){
				alert("삭제완료");
			}else{
				alert("삭제실패");
			}
			
			location.href="list.do";
		}
	}
	

	
	
</script>
</head>
<body>
	
	${ my_list.get(0).getName() }<br>
	${my_list.get(0).id}<br>
	
	<table border = "1">
		<caption>:::회원목록:::</caption>
		
		<tr>
			<td colspan="7">
				<input type = "button" value = "회원가입" 
					onclick = "location.href = 'member_insert_form.jsp'">
			</td>
		</tr>
		<tr>
			<th>번호</th>
			<th>이름</th>
			<th>아이디</th>
			<th>비밀번호</th>
			<th>이메일</th>
			<th colspan="2">주소</th>
		</tr>
		
		<!-- forEach의 문법
		forEach var = "변수 or 객체" items="포워딩 받은 객체" >-->
		
		<c:forEach var = "vo" items="${my_list}">
		<tr>
			<td>${ vo.idx }</td>
			<td>${ vo.name }</td>
			<td>${ vo.id }</td>
			<td>${ vo.pwd }</td>
			<td>${ vo.email }</td>
			<td>${ vo.addr }</td>
			<td>
			<form name = "f" action = "list.do">
				<input type = "button" value="삭제" onclick = "del('${vo.idx}')">
			</form>	
			</td>
		</tr>
		</c:forEach>
		
	</table>
	
</body>
</html>