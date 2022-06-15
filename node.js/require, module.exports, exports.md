# require

- Node.js에서 require 메서드는 외부 모듈을 가져올 때 사용된다.
- require 메서드는 module.exports를 리턴한다.
- require 메서드에서 확장자를 생략할 수 있다.

`모듈 :  모듈은 독립적인 스코프를 갖기 때문에 선언한 모든 것들은 기본적으로 해당 모듈 내부에서만 사용 가능하다.`

​			`만약 외부에서 모듈을 사용하려면 exports 객체를 사용해야 한다.`

​			`--> 모듈 : 내부모듈(기본모듈), 외부모듈(npm), 사용자 모듈`





# module.exports /  exports

- module.exports /  exports는 자신이 만든 모듈은 외부로 공개할 때 사용된다.
- module.exports 와 exports는 같은 기능을 가진다. (차이점이 존재한다.)
- exports :  exports 객체는 값을 할당 할 수 없고 공개할 대상을 exports 객체에 프로퍼티 또는 메서드로 추가한다.
- module.exports : 객체는 하나의 값 (원시타입, 함수, 객체)만을 할당한다.



```javascript
// 계산기 메서드
// math.js
function add(a, b){
    return a + b; 
}

const sub = (a, b)=>{
    return a-b;
}
const mul = (a,b)=> a*b;
const div = (a,b)=> a/b;

// module.exports 사용법
// 1.
module.exports = add; // 원시변수
// 2.
module.exports = { add, sub, mul, div }; // 객체


// 3. 
module.exports = function add(a, b){ // 함수로 값을 전달 (add 함수)
    return a + b; 
}
// 3-1.
module.exports = (a, b) => a + b;

// ---------------------------------------------------------------------------------------------------

// exports 사용법
// exports를 사용할 경우 외부로 전달된 값은 object 타입으로 전달된다.
// 1. 
exports.add = (a, b) => a + b; 
// 1-1.
exports.sub = function sub(a, b){
    return a - b;
}


```



```javascript
// module.exports = add exports를 원시 타입으로 값을 정의했을 경우
const math = require('./math.js'); 
console.log(math(2, 5)); // 7

// module.exports = { add, sub, mul, div } exports를 객체로 값을 정의했을 경우
// 함수로 받기
const math = require('./math.js'); // 하나의 변수를 받을 경우 변수는 함수가 된다.
console.log(math.add(2, 5)); // 7
console.log(math.sub(2, 5)); // -3
console.log(math.mul(2, 5)); // 10
console.log(math.div(2, 5)); // 0.4

//--------------------------------------------------------------------------------------------------------

// 특정 변수만 받기 
const {add, sub} = require('./math.js'); 
// 특정 변수만 받기 위해서는 변수 선언 자리에 {} 중괄호를 이용해 중괄호 안에 받을 변수를 적는다. 단 모듈의 정의된 함수 이름과 같아야한다.
console.log(add(2, 5)); // 7
console.log(mul(2, 5)); // 10
```


### 요약

- **exports** 

1. exports는 객체에 프로퍼티 또는 메서드로 추가한다.
2. 값을 할당 할 수 없다.
3. exports를 사용할 경우 외부로 전달된 값은 object 타입으로 전달된다.

- **module.exports**

1.  module.exports는 원시변수, 객체, 함수로 전달할 수 있다.
2.  module.exports에 전달된 데이터 타입은 원시변수, 객체, 함수 타입으로 값을 받는다.

- **require**

1.  변수를 선언하는 자리에 {}를 사용해서 각각의 변수로  정의할 수 있다.  단 모듈의 이름과 변수의 이름이 같아야한다.



