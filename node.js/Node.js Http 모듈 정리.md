# http 모듈

**HTTP(Hyper Text Transfer Protocol)**은 TCP/IP 기반 프로토콜로, HTML 페이지를 전달하는데 주로 사용한다.

node.js에서 HTTP 모듈을 웹 서버를 구동하기 위해서 사용되는 기본 내부 모듈이다.

```javascript
const http = require("http"); // http 모듈 사용
```



1. http 모듈은 각종  Server 객체가 존재한다. Server 객체를 사용하기 위해서는 `createServer()` 함수를 사용해야 한다. ( `close() 종료`)

```javascript
const server = http.createServer();
```

2. `createServer()` 메서드를 이용해 server 객체를 사용할 수 있게 되었다면 listen() 함수를 이용해 포트를 할당받아야 한다.

```javascript
const PORT = 3000;
server.listen(PORT, function(){
    console.log('server start: ',PORT);
}); 
// $ node server00.js
// server start:  3000

```

3. node.js  event 객체인 on 메서드를 이용해 request, response를 실행한다.
   - `writeHead(statusCode, statusMessage)` : response 객체의 메서드에서 헤더 정보를 응답해서 내보내는 기능
   - `write('')` : body 부분의 콘텐츠 작성
   - `end()` : 응답 완료

``` javascript
// server.on('request', function(request, response){}); 
server.on('request', (request, response)=>{
    response.writeHead(200, {'Content-Type':'text/plain;charset=utf-8'});
    response.write('응답성공');
    response.end();
});
```



## request 와 response

1. request(요청) : 클라이언트가 요청한 정보를 제공하는 기본 객체
   - 클라이언트와 관련된 정보 읽기
   - 서버와 관련된 정보 읽기
   - 클라이언트가 전송한 파라미터, 헤더, 쿠키 읽기
   - 속성 처리 기능

	2. response(응답) : 클라이언트가 요청에 대한 정보를 웹브라우저에 응답하는 객체

 - 전송방식
   - get : 요청 url에 파라미터를 붙여서 전송, 읽기 기능이나 삭제 기능에 주로 사용
   - post : 요청 url에 파라미터가 없이 전송, 생성 기능이나 업데이트 기능에서 주로 사용, 정보에 대한 보안이 필요할 때 사용