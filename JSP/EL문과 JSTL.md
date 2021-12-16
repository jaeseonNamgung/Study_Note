# EL문과 JSTL
- 페이지 가독성 상승
- 자바 구문을 라이브러리 형태로 만들어 놓고 필요할 때마다 태그로 꺼내 쓰는 기술이다.
- JSP 페이지 내에서 자바코드와 HTML 코드가 섞여 있으면 가독성이 떨어지고 복잡해진다.
- EL문과 JSTL문을 사용하면 HTML과 태그로만 구성된 일관된 소스코드를 볼 수 있다는 장점이 있다.

# EL(Expression Language)
- 값을 간결하고 간편하게 출력할 수 있도록 해주는 기술
```jsp
// 자바
<%= name%>
<%= member.getName()%>
-------------------------------------------------
// EL
${name}
${member.getName()}
```
- 값을 찾을 때에는 작은 Scope에서 큰 Scope로 찾는다.
  - page -> request -> session -> application
- 원하는 스코프의 변수를 찾을 때 아래와 같이 사용한다.
```jsp
${param.name}  // GET방식, 쿼리 스트링으로 전달된 파라미터를 받을 때 사용한다.
${reqeustScope.name}  // request.setAttribute(key, value)를 통해 저장된 파라미터를 받을 때 사용한다.
${sessionScope.name} // session.setAttribute(key,value)를 통해 저장된 파라미터를 받을 때 사용한다.
```

# JSTL(JSP Standard Tag Library)
- 연산이나 조건문, 반복문, 등을 편하게 처리할 수 있으며, JSP페이지 내에서 자바 코드를 사용하지 않고 로직을 구현할 수 있도록 효율적인 방법을 제공한다.

```jsp
// 자바
<%
    for(자료형 변수명:iterator){
     %>
            HTML 코드
    <%
    }>%
%>
-----------------------------------------------------------
// JSTL
<c:forEach var = "변수명" items = "${iterator}">
    HTML코드
</c:forEach>


```

```jsp
// 자바
<%
    for(초기식; 조건식; 증감식){
     %>
            HTML 코드
    <%
    }>%
%>
-----------------------------------------------------------
// JSTL
<c:forEach var = "변수명" begin="초기값" end="끝값">
    HTML코드
</c:forEach>
```

## jsp에서 JSTL 추가
```jsp
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
```
## core태그의 종류
- ```<c:set>``` : 변수에 값 대입
- ```<c:out>``` : 값 출력
- ```<c:if>``` : 조건문(if문)
- ```<c:choose>``` : 조건문(switch문 시작을 알림)
- ```<c:when>```:swich문에서 case의 역할(break 사용할 필요 없다.)
- ```<c:otherwise>``` : swich문에서 default의 역할  
- ```<c:forEach>``` : 박복문(for문)

### 출력 시 <c:out>, ${}의 차이
- EL문만 사용하게 되면, html이나 스크립트가 실행될 수 있기 때문에 보안상 c:out의 escapeXml옵션을 사용하기 위해서 c:out을 사용한다. escapel은 default가 true이며, 값에 html이나 스크립트가 작성되어도 실행 가능한 명령어가 아닌 문자열 값으로 인식하게 된다.
- 엄격한 태그 규칙을 위해 c:out이 사용되기도 하며, 모든 표현은 태그 안에 작성하는 것을 원칙으로 한다.