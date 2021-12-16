<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// EL(Expression Language) : jsp에서 사용하는 출력코드를 간결하게 사용하기 위한 표현언어
	// EL을 사용하려면 아래의 네가지 영역에서만 가능(jsp의 내장객체)
	
	//1. page영역 : 현재 페이지에서만 값을 공유
	//2. request영역(가장 많이 쓰이는 영역) : 두개의 페이지에서 값을 공유
	//3. session영역(두 번째로 많이 쓰이는 영역 ) : 웹 브라우저의 모든 페이지가 값을 공유
	//4. application영역 : 하나의 프로젝트끼리만 값을 영역
	
	String msg = "안녕";

	// 리퀘스트 스코프에 값을 저장
	// requst가 session보다 우선순위가 더 높다.
	request.setAttribute("abc", "나는 request");
	
	session.setAttribute("bbb", "세션");
	session.setAttribute("abc", "나는 세션입니다.");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%=msg %> : 일반적인 jsp의 출력 코드<br>
	${requestScope.abc}<br>
	${abc}<br>
	${sessionScope.abc}<br>
	${bbb}<br>
	
	<!-- ex01_el.jsp?hi=안녕 -->
	<!-- 위와 같이 url에 등록되어 있는 파라미터값(hi)을 가지고 오고 싶다면 -->
	${param.hi}
</body>
</html>