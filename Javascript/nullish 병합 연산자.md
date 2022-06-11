# nullish 병합연산자 ??

- `nullish 병합연산자`는(nullish coalescing operator) 값이 할당된 변수를 찾을 때 사용하는 연산자이다. 

```javascript
let c = a ?? b

// let c = (a !== null || a!== undefined)? a:b;
```

- a 가 **null** 또는 **undefined**가 아니면 a를 반환하고 **null** 또는 **undefined**일 경우 b를 반환한다. 

```javascript
// 1.
let id = '홍길동@naver.com';    
let result = id ?? '아이디없음';
console.log(result);
// 출력결과 -> 홍길동@naver.com

//2.
let id = null; // 또는 undefined
let result = id ?? '아이디없음';
console.log(result);
//  출력결과 -> 아이디없음
```



## ?? 와 ||의 차이점

- `||`는 0을 false로 간주
- `??`는 null, undefined를 제외한 값을 true로 간주

```javascript
let a = 0 ;
let b = 100
console.log(a ?? b); // 출력결과 -> 0
console.log(a || b); // 출력결과 -> 100
```



