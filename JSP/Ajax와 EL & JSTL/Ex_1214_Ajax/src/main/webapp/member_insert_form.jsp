<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- httpRequest.js르 현재 jsp에서 사용하기 위한 코드 \
	자바스크립트(js)파일을 참조하는 script영역에는 내부에 어떤 코드도 추가할 수 없다.-->
<script src = "js/httpRequest.js"></script>
<script>
	let b_idCheck = false;
	function send(f){
		let id = f.id.value;
		let pwd = f.pwd.value;
		
		if(id == ''){
			alert("아이디는 필수입니다.");
			return;
		}
		//중복체크를 하지 않으면 DB에 값을 넣을 수 없도록 처리
		if( !b_idCheck ){  
			alert("아이디 중복체크를 하세요");
			return;
		}
		// f.method = "post";
		f.action = "insert.do";
		f.submit();
	}
	
	//아이디 중복체크를 위한 함수
	function check_id(){
		var id = document.getElementById("id").value.trim();
		if(id == ''){
			alert("아이디를 입력하세요");
			return;
		}
		//Ajax(Asynchronus Javascript & XML)
		// - 비동기 통신
		// - 자바스크립트를 이용한 백그라운드 통신 기술로써 하나의 웹 페이지 안에서
		// 변경사항이 발생한 특정 일부분만 갱신이 가능하도록 하는 기술
		//id를 Ajax를 통해 서버로 (DB)로 전달
		
		var url = "check_id.do";
		var param = "id="+id;
		
		// js/httpReqeust.js를 참조해둔 상태기 때문에 httpReques.js가 가지고 있는
		//sendRequest()메서드를 사용할 수 있다.
		sendRequest(url, param, resultFun, "GET");		
	}
	
	function resultFun(){
		//Ajax를 통해 완료된 결과를 가지고 돌아오는 메서드(콜백메서드)
		
		//xhr.readyState
		// 0:초기화 오류
		//1,2,3 :현재 페이지 로드중
		//4 : 로드완료
		
		// xhr.status
		// 404 : 경로없음
		// 505 : 서버, DB오류...
		// 200 : 이상없음!!
		
		if(xhr.readyState == 4 && xhr.status == 200){
		//서블릿에서 돌려준 최종 결과값
		//data = "[{'res' : 'yes'}]";
		var data = xhr.responseText;
		 // data 변수에 받아온 값은 json모양을 하고 있으나 
		 // 실제로는 단순 문자열일 뿐이다.
		 
		 var json = eval(data); // data값을 사용가능한 json구조로 변경
		 if(json[0].res == 'no'){
		 	alert("이미 사용중인 아이디 입니다.");
		 	return;
		 }
		else{
			alert("사용 가능한 아이디 입니다.")
			b_idCheck = true;
			
			//사용 가능한 아이디라면 변경이 불가하도록 읽기전용으로 처리해보자
			document.getElementById("id").readOnly = true;
		}
		}
	}
</script>
</head>
<body>
	<form>
		<table border = "1" align = "center">
			<caption>회원가입</caption>
			
			<tr>
				<th>아이디</th>
				<td>
					<input name = "id" id = "id">
					<input type = "button" value = "중복체크" onclick = "check_id()">
				</td>
			</tr>
			
			<tr>
				<th>비밀번호</th>
				<td>
					<input type ="password" name = "pwd">
				</td>
			</tr>
			
			<tr>
				<th>이름</th>
				<td>
					<input  name = "name">
				</td>
			</tr>
			
			<tr>
				<th>이메일</th>
				<td>
					<input  name = "email">
				</td>
			</tr>
			
			<tr>
				<th>주소</th>
				<td>
					<input  name = "addr">
				</td>
			</tr>
			<tr>
				<td colspan = "2" align = "center">
					<input type = "button" value = "가입" onclick = "send(this.form)">
					
					<input type = "button" value = "취소" onclick = "location.href ='list.do' ">
			</tr>
			
		</table>
	</form>
</body>
</html>