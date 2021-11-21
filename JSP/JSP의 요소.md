# JSP의 구성 요소
1. ```내용``` : 아무표시가 없으면 HTML로 인식
2. ```<%@ 내용 %>``` : 지시어(directive)
3. ```<%! 내용 %>``` : 선언부(declaration)
4. ```<% 내용 %>``` : 스트립트릿(scriptlet)
5. ```<%= 내용 %>``` : 표현식(expression)
6. ```<%-- 내용 --%>``` : 주석(comment)


## 지시어 (<%@ 내용 %>)
- 해당 페이지의 속성을 기술
  - page : 이 jsp 페이지에 대한 설정 정보 ```<%@page 설정할 내용 %>```
  - include : 다른 jsp 페이지를 이 페이지에 포함 ```<%@include file = "포함할 페이지" %>```
  - taglib : 이 jsp 페이지가 사용할 사용자 정의 태그를 선언 ```<%@taglib 사용자정의태그 선언 %>```
  
![화면 캡처 2021-11-21 214051](https://user-images.githubusercontent.com/84066249/142762344-f4cb4ee9-9893-4dcb-87cf-c6e3713dcfd7.png)
![image](https://user-images.githubusercontent.com/84066249/142762456-2533a177-c107-4eb9-8156-de8b69156071.png)

## 선언부 (<%! 내용 %>)
- 해당 jsp가 **변환될 클래스의 필드, 메소드**를 선언할 때 사용
- ex)

```jsp
<%!
  public void test(){
    System.out.println("test log");
  }
%>
```
## 스크립트릿 (<% 내용 %>)
- jsp 페이지 내부에 자바 코드 삽입
- ex)
```jsp
<%
  int a = 10;
  out.write(a + 100);
%>
```
## 표현식 (<%= 내용 %>)
- html 문서에 결과값(변수, 리턴값이 있는 메서드)을 출력할 때
- 주의사항 : 표현식 안에는 세미콜론(;)이 들어가지 않는다.
- ex)
```jsp
<%= a %>
<%= a + 20 %>
<%= sum(10,20) %>
```
## 주석 (<%-- 내용 --%>)
- jsp 페이지 상에서의 주석 (단 <% %>안에서는 //혹은 /* */ 사용)