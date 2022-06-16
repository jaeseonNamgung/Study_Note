# fs 모듈(File System)

- fs 모듈은 파일을 처리하는 모듈이다. 파일을 읽거나 파일을 쓸때 처리하고 이외에 다양한 메서드로 파일을 관리할 수 있는 모듈이다.

```javascript
const fs = require('fs');
```

fs 모듈을 사용하기 위해 require 함수를 사용해서 모듈을 가져와야 한다.

## 파일 읽기

1.  `fs.readFile(filename, [options], callback))`  비동기적

	- filename : 저장된 폴더에 파일을 작성
	- options : 주로 파일에 인코딩 방식을 작성 예) utf-8
	- callback : 파일이 정상적으로 작동하는지 판단한는 콜백 함수

```javascript
fs.readFile('./data/text.txt', 'utf-8', (err, data)=>{
    if(err)console.error(err);
    console.log(data);
});
// data 폴더에 text.txt 파일을 읽어온다.
```

2. fs.readFileSync(filename, [options]) 동기적

```javascript
const file = fs.readFileSync('./data/lorem.txt', 'utf-8');
console.log(file);
```

- 동기적(synchronous) : 프로그램이 위에서 아래로 샐행되는 특징으로 부터 특정 코드 수행이 완료후 그 다음 코드를 실행하는 방식
- 비동기적(Asynchronous) : 특정 코드 실행 완료와 상관없이 아래로 계속 내려가면서 다른 코드를 실행하는 방식

파일은 대부분 많은 양의 용량을 가지고 있다. 만약 동기적으로 실행할 경우 많은 양의 파일을 읽은 후 실행이 완료 될때까지 아래의 코드들은 모두 대기 상태에 빠지게 된다. 비동기적으로 실행하면 파일을 다 읽은 후 실행 완료와 상관없이 아래 코드를 실행 시킬 수 있다. 파일을 관리할 때는 동기적 보다는 비동기적 실행을 하는 것이 더 바람직하다.



## 파일 쓰기

1. ```fs.writeFile(filename, data, [options], callback)``` (비동기적)

	- filename : 저장하려는 폴더와 파일 이름
	- data : 저장하려는 값
	- options : 주로 파일에 인코딩 방식을 작성 예) utf-8
 - callback : 파일이 정상적으로 작동하는지 판단한는 콜백 함수

```javascript
fs.writeFile('./data/lorem.txt','data','utf-8', (err)=>{
    if(err) console.error(err)
});
```

2. `fs.writeFileSync(filename, data, [options])` (동기적)

```javascript
fs.writeFileSync('./data/lorem.txt','data','utf-8');
```

### 동기적 에러처리

동기적으로 에러 처리 하기 위해서는 try-catch문을 사용하면 된다. (비동기 에로 처리는 콜백함수를 이용해서 처리하면 된다.)

```javascript
try {
    const file = fs.readFileSync('./data/lorem.txt', 'utf-8');
    console.log(file);
} catch (error) {
    console.error(error);
}
```



## 여러가지 fs 메서드

1. `fs.exits('파일경로', callback)` : 파일 존재 여부 확인 -> 있으면 true, 없으면 false를 반환

2. fs.open('파일경로', option, callback) : 파일 생성

   - option 종류 : 

   - r : 파일을 읽기로 열며 해당 파일이 없다면 에러발생
   - r+ : 읽기/쓰기 상태로 파일을 열며 파일이 없다면 에러발생
   - w:  쓰기로 파일을 열며 존재하지 않으면 파일 생성, 존재하면 내용을 지우고 새로 글 작성
   - w+ : 읽기/쓰기로 열며 파일이 존재 하지 않으면 생성, 파일이 존재하면 내용을 지우고 새로 글 작성
   - a :  추가 쓰기로 열며 파일이 존재 하지 않으면 새로 파일 생성
   - a+ : 추가 읽기/쓰기로 열며 파일이 존재 하지 않으면 새로 파일 생성 

3. fs.rename('현재 파일 경로', '변경하려는 파일 이름', callback) : 파일 이름 변경
4. fs.appendFile('파일 경로', '추가하려는 글', callback) : 파일 이어쓰기
