# 심볼
- 심볼(symbol)은 유일한 식별자(unique identifier)를  만들 때 사용한다.
- ```Symbol()```을 사용하면 심볼값을 만들 수 있다.
```javascript
// id로 새로운 심볼을 만든다.
let id = Symbol();
--------------------------------------
// 심볼 id에는 "id"라는 설명을 줄 수 있다. (디버깅 시 유용하다.)
let id = Symbol("id");
```
- 심볼은 유일성이 보장되는 자료형이기 때문에, 설명이 동일한 심볼을 여러 개 만들어도 각 심볼값은 다르다.
- 심볼은 문자형으로 자동 형 변환되지 않는다. 

## 숨긴 프로퍼티 
- 심볼을 이용하면 숨긴(hidden) 프로퍼티를 만들 수 있다. 
- 숨긴 프로퍼티는 외부 코드에서 접근이 불가능하고 값도 덮어쓸 수 없다. 

```javascript
const id = Symbol("id");
const user = {
    name : "Hong",
    age : 25,
    [id] : "symbol"
};

for(key in user){
    alert(user[key]);  // for..in 반복문을 통해 user 프로퍼티 값을 출력하면 심볼형 프로퍼티 값은 출력되지 않는다.
}
alert(user[id]);  // 심볼형 프로퍼티 값을 출력하기 위해서는 심볼로 직접 접근해야 한다.



```
 user 객체 안에 하나의 심볼형을 선언하고 user의 keys 값을 출력해 보면 name, age만 출력된다. 즉 심볼은 숨긴 처리된 것이다.  심볼형 프로퍼티를 사용하기 위해서는 심볼로 직접 접근해야 한다.

## 전열 심볼
- 이름이 같은 심볼이 같은 개체를 가리키길 원하는 경우 전역 심볼을 사용해야 한다. 
- 전열 심볼을 사용하기 위해서는 ```Symbol.for(key)를 사용하면 된다.

```javascript
let id = Symbol.for("id"); // 심볼이 존재하지 않으면 새로운 심볼을 만든다.

let idAgain = Symbol.for("id"); // 동일한 이름을 이용해 심볼을 다시 읽는다. 

alert(id === idAgain);  // 두 심볼을 같은 심볼이기 때문에 true를 반환한다.
```

- ```Symbol.keyFor()```를 사용하면 이름을 얻을 수 있다.
```javascript
let id = Symbol.for("심볼 이름"); // 심볼이 존재하지 않으면 새로운 심볼을 만든다.

alert(Symbol.keyFor(id)); // 심볼 이름
```

