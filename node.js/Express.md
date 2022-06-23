# Express

Express는 Node.js를 위한 **하나의 프레임 워크** 로 웹 애플리케이션, API 개발을 학 위한 프레임 워크이다.

### 준비 

```javascript
npm i express
```

Node.js에서 express 프레임워크를 사용하기 위해서는 *터미널 창의* `npm i express `를 입력해 설치해 줘야 한다.

### 사용 방법

```javascript
const express = require('express'); // express를 사용하기 위한 기본 설정
const app = express();
```



## 라우팅

- 라우팅은 URI(또는 경로) 및 특정한 HTTP 요청 메서드 (GET, POST)인 특정 엔트 포인트에 대한 클라이언트 요청에 애플리케이션이 응답하는 방법을 결정하는 것을 의미한다.
- 각 라우팅은 하나 이상의 핸들러 함수를 가질 수 있으며, 이러한 함수는 라우팅이 true 일 때 실행된다.

#### express 라우팅 메서드

1. get : getting data (파라미터 존재 O)
2. post : creating data (파마미터 존재 X)
3. put : updating data(파라미터 존재 O)
4. DELETE : deleting data(파라미터 존재 O)

```javascript
const express = require('express');
const app = express();

app.get('url 경로', 핸들러 함수);
// get, post, put, delete 모두 동일
```



#### 라우팅 메서드에서 사용되는 메서드

```javascript
response.send('문자열'); // 클라이언트에게 응답하는 메서드
response.sendFile(파일); // 클라이언트에게 응답하는 메서드 (파일로 전달)
```

## 미들웨어

- 미들웨어 함수는 클라이언트에게 요청이 오고 그 요청을 보내기 위해 응답하려는 중간(미들)에 목적에 맞게 처리하는 함수이다.
- 미들웨어 함수는 request(요청), response(응답) 객체 그리고 애플리케이션 요청-응답 사이클 도중 그다음의 미들웨어 함수에 대한 에센스 권한을 갖는 함수이다.
- **next** 함수를 이용해서 다음 미들웨어로 현재 미들웨어를 넘길 수 있다.
- **next** 함수를 통해 순차적으로 처리된다.
- express 미들웨어는 req, res, next를 매개변수로 받는다. 에러 처리 미들웨어는 예외적으로 err, req, res, next 4개의 매개변수를 받는다. 
- express 미들웨어는 app.use, app.get, , app.post 등으로 로드한다. 특정 메서드와 특정 path에서 작동시킬 수 있다.

### 1. static 미들웨어

정적 파일(static file) : Javascript, CSS, Image 등 웹 서비스에서 사용하기 위해 미리 서버에 저장해 놓은 파일이다. 파일 자체가 고정되어 있고, 서비스 중에도 추가되거나 변경되지 않는다. (express 내장 객체이기 때문에 따로 설치할 필요가 없다.)

```javascript
const express = require('express');
const app = express();
app.use(express.static('경로'));
```

### 2. morgan 미들웨어

morgan 미들웨어는 요청과 응답에 대한 정보를 콘솔에 기록하는 미들웨어이다. 매개변수로는 `dev, common, combined, short, tiny` 등이 있다.

```
combined :
:remote-addr - :remote-user [:date[clf]] ":method :url HTTP/:http-version" :status :res[content-length] ":referrer" ":user-agent"

common :
:remote-addr - :remote-user [:date[clf]] ":method :url HTTP/:http-version" :status :res[content-length

dev
:method :url :status :response-time ms - :res[content-length]

short :
:remote-addr :remote-user :method :url HTTP/:http-version :status :res[content-length] - :response-time ms

tiny :
:method :url :status :res[content-length] - :response-time ms
```



```javascript
const express = require('express');
const app = express();
const morgan = require('morgan');

app.use(morgan('dev'));
```

### 3. body-parser 미들웨어

요청 본문을 parsing 해서 req.body, 객체로 만들어 조는 미들웨어이다. `<form>` 데이터나 `ajax`로 요청이 오는 데이터를 담당한다. ( express 4.16.0 버전부터는 body-parser가 express에 내장되어 있어 따로 설치할 필요 없다.)

```javascript
const express = require('express');
const app = express();
app.use(express.json());
app.use(express.urlencoded({extended:false}));
```

만약 Raw나 Text 형식의 데이터를 Parsing 할 경우 body-parser 미들웨어를 추가로 설치해야 한다.

```javascript
const express = require('express');
const app = express();
const bodyPaser = require('body-parser');

app.use(bodyPaser.raw());
app.user(bodyPaser.text());
```

### 4. cookie-parser 미들웨어

cookie-parser 미들웨어는 요청과 함께 전송되는 쿠키를 해석하고 req.cookie 객체를 생성한다. 해석된 쿠키들은 req.cookie에 저장된다. 유효기간이 지난 쿠키는 자동으로 필터링 된다.

```javascript
const express = require('express');
const app = express();
const cookieParser = require('cookie-parser');
app.use(cookieParser(SECRET_KEY));
```

첫 번째 매개변수로 비밀키를 받는다. 서명된 쿠키가 존재하면 제공한 비밀키를 통해 해당 쿠키가 생성된 곳이 자신의 서버임을 검증할 수 있게 된다.

쿠키를 생성하기 위해서는 `res.cookie(key, value, option)`을 사용하고 제거하기 위해서는 `res.clearCookie(key, value, option)` 메서드를 사용한다. (쿠키를 제거하기 위해서는 전달된 옵션 모두 일치해야 한다.)

```javascript
res.cookie('key', 'value', {
    expires : new Date(Date.now() + 1000000),
    httpOnly : true,
    secure : true
});
```

#### 쿠키 생성 옵션

- maxAge : 만료 시간을 미리 초 단 위러 설정
- expires : 만료 날짜를 GMT 시간으로 설정
- path : cookie의 경로 ( default -> "/" )
- domain : 도메인 네임 ( default -> "loaded" )
- secure : https 에서만 cookie에 접근할 것인 자 지정
- httpOnly : 웹 서버를 통해서만 cookie에 접근할 것인지 지정
- signed : cookie가 서명되어야 할지를 지정

### 5. express- session 미들웨어

세션을 관리하기 위한 미들웨어, 로그인을 위해 세션을 구현하거나 특정 사용자를 위한 데이터를 임시적으로 저장하기 위해 사용한다.

세션은 사용자 별로 req.session 객체에 저장한다.

```javascript
const express = require('express');
const app = express();
const session = require('express-session');

app.use( session({
    resave : false,
    saveUninitialized : false,
    secret : process.env.COOKIE_SCRET,
    cookie{
    httpOnly ; true,
    secure : false
}
}));
```



#### express-session 옵션

- resave : 요청이 오는 경우 세션에 수정 사항이 생기지 않더라도 세션을 다시 저장할지 지정

- saveUninitialized : 세션에 저장할 내용이 없더라도 처음부터 세션을 생성할지 지정
- secret : 세션 관리 시 클라이언트에게 보내는 쿠키, 즉 세션 쿠키를 의미, 쿠키를 안전하게 전송하기 위해 서명을 추가해야 하고 쿠키를 서명하는데 필요한 secret 값이 사용된다. 세션 쿠키의 이름은 connet.sid를 기본 설정된다.
- cookie : 세션 쿠키에 대한 설정, cookie의 일반적인 옵션 제공
- store : 세션을 저장할 저장소 설정, 일반적으로 레디스를 사용

#### 추가 설명

```javascript
const express = require('express');
const app = express();

app.set("PORT", process.env.port || 3000) // 보통 포트를 지정하기 위해 설정

app.listen(app.get("PORT"), ()=>{
    //서버 구동
});
```

