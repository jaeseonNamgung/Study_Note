# 파라미터(parameter)란?
- 클라이언트가 서버에게 전달하는 데이터 
- '이름-값' 쌍의 형태(map 구조)
- 서버 측에서는 전달받은 파라미터를 해당 파라미터의 '이름'을 통해 실제 '값'을 얻어오는 형식
- 문자열만 처리 가능

## 파라미터 전달 방법
- ```<form>``` 태그 안에 전달할 파라미터를 나열
- ex)
```jsp
<form action = "파라미터를 전달할 페이지" method = "전송방식">
    <input type = "형식" name = "파라미터명" value = "기본값">
    <textarea name = "파라미터명">기본값</textarea>

    <select name = "파라미터명">
        <option value = "값1">보여줄 텍스트1</option>
        <option value = "값1">보여줄 텍스트1</option>
        <option value = "값1">보여줄 텍스트1</option>
    </select>
    <inout type = "hidden" name = "파라미터명" value = "값">
</form>
```

## 파라미터 받는 방법
- (자바) String request.getParameter(String 파라미터명)
    - [파라미터명]을 가진 파라미터의[값]을 반환(String)
- 스크립트릿(<% %>)이나 표현식(<%=%>)을 사용

## 파라미터 관련된 메서드
- ```request.getParameter("파라미터명")``` : 파라미터값을 얻음(리턴자료형 : String)
- ```request.getParameterValue("파라미터명")``` : 파라미터 값들을 얻음(리턴자료형 : String[])
- ```request.getParameterMap()``` : 전달된 모든 파라미터를 얻음(리턴자료형 : Map)
  - key : 파라미터명 (자료형 : Stirng)
  - value : 파라미터값(들) (자료형 : String[])
- ```request.getParameterNames()``` : 전달된 모든 파라미터들의 이름을 얻음 (리턴자료형 : Enumeration)
