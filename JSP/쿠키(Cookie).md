# 쿠키(Cookie)
- 웹 브라우저가 보관하고 있는 데이터로, 웹 서버에 요청에 보낼 때 헤더로 담아서 전송한다.
- 웹 브라우저는 쿠키가 삭제되기 전까지 웹 서버에 쿠키를 전송한다.

## 쿠키 장단점
- 클라이언트의 일정 폴더에 정보를 저장하기 때문에 서버의 부하를 줄일 수 있다.
- 정보가 사용자 컴퓨터(로컬)에 저장되기 때문에 보안에 위협받을 수 있다.
- 데이터 저장 용량에 한계가 있다.
- 일반 사용자 브라우저 내의 기능인 "쿠키 차단"을 사용했을 경우 쿠키가 무용지물이 된다.

## 쿠키 동작 방식
- 쿠키 생성 : 웹 서버에서 쿠키를 생성하고 쿠키에 응답 데이터를 담아서 웹 브라우저에 전송한다.
- 쿠키 저장 : 웹 브라우저는 응답 데이터를 담고 있는 쿠키를 메모리나 파일로 저장한다.
- 쿠키 전송 : 웹 브라우저는 쿠키 요청이 있을 때마다 웹 서버에 전송한다. 웹 서버는 쿠키를 사용해서 필요한 작업을 수행할 수 있다.

## 쿠키 생성 및 사용 방식
1. 쿠키 생성 후 response 객체에 담아준다(이미 쿠키 이름이 존재하면, 값 수정)
```jsp
Cookie cookie = new Cookie("쿠키이름", 쿠키값);
response.addCookie(cookie);
```
2. 쿠키 유무를 확인하고 쿠키의 값을 얻어온다.
```jsp
String cookieCheck = request.getHeader("Cookie");
if(cookieCheck !== null){
    Cookie[] cookies = request.getCookies();
    for(cookie cookie:cookies){
        cookie.getName();
        cookie.getValue();
    }
}
```
3. 쿠키를 삭제한다.
```jsp
String cookieCheck = request.getHeader("Cookie");
if(cookieCheck != null){
    Cookie[] cookies = request.getCookie();
    for(Cookie cookie : cookies){
        cookie.setMaxAge(0);
        response.addCookie(cookie);
    }
}
```
