# Json(Javascript Object Notation)

- Json는 {key:value}로 구문된다.

- 텍스트 기반으로한 언어이다.

- 보통 서버와 데이터를 주고 받을 때 사용한다.

- 특정 프로그램과 상관없이 모든 언어에 사용 가능하다.

- Json은 순수 데이터 포맷이다. 오직 프로퍼티만 담을 수 있고, 메서드는 담을 수 없다.

- Json은 문자열과 프로퍼티 작석시 큰 따옴표만 작성 가능하다. (작은 따옴표 사용X)

- Json은 모든 데이터 타입을 취할 수 있다. 배열이나 오브젝트 외에 단일 문자열이나, 숫자 또한 Json형으로 변환이 가능하다.



##  stringify( ) 메서드 , parse()

- stringfy( ) 메서드는 Json으로 형 변환할 때 사용하는 메서드이다.
- parse() 메서드는 Json형에서 Object 형으로 변환하는 메서드이다.

```javascript
let json = JSON.stringify(변환하려는 value);
```



```javascript
// JSON
// JavaScript Object Notation

// 1. Object to Json
// stringify(obj)
let json = JSON.stringify(true);
console.log(json);

json  = JSON.stringify(['apple', 'banana']);
console.log(json);


const rabbit = {
    name : 'tori',
    color: 'white',
    size: null,
    birthDate : new Date(),

    // 함수는 json에 포함되지 않는다.
    jump : () =>{
        console.log(`${this.name} can jump!`);
    },
};

json = JSON.stringify(rabbit);
console.log(json);

// 특정 값만 전달하고 싶을때 배열을 이용해 값을 받을 수 있다.
json = JSON.stringify(rabbit, ["name"]);
console.log(json);


// 좀더 세밀하게 통제하고 싶을 때 콜백 함수를 사용할 수 있다.
json = JSON.stringify(rabbit, (key, value)=>{
    console.log(`key: ${key}, value: ${value}`);
    return key === 'name' ? 'namgung':value;
});

console.log(json);

//2. Json to Object
// parse(json)
console.clear();
json = JSON.stringify(rabbit);
const obj = JSON.parse(json);
console.log(obj);
rabbit.jump();
// rabbit 객체에서 JSON으로 변환할 경우 함수는 포함되지 않는다, 그렇기 때문에 jump함수는 json에 포함되지 않고 Object로 다시 변환할 경우 json에 포함되지 않기 때문에 변환된 obj에 jump 함수는 존재하지 않는다.
// obj.jump();
console.log(rabbit.birthDate.getDate());

// json으로 받은 obj는 스트링으로 받기 때문에 함수를 사용할 수 없다.
console.log(typeof obj.birthDate);

{
    const obj = JSON.parse(json, (key, value)=>{
        console.log(`key: ${key}, value: ${value}`);
        return key === 'birthDate' ? new Date(value) : value;
    });

    console.log(obj.birthDate.getDate());
}
```



### replacer로 원하는 프로퍼티만 직렬화 하는 방법

```javascript
let json = Json.stringify(value,[replacer],space );
// or
let json = Json.stringify(value, callback, space);
```

- value : 인코딩 하려는 값
- replacer : json으로 인코딩 하길 원하는 프로퍼티 또는 함수 (null 이거나 아무것도 작성하지 않으면 모든 값을 포함한다.)
- space : 공백 문자 수, 가독성 목적

``` javascript
const anotherObj = {
    alive:true,
    age:20,
    hobbies : ['Coffee', 'Sleep', 'Working'],
    beverage : {
        morning : 'Coffee',
        afternoon : 'Apple Tea'
    },
    action:function(){
        return "Hello Javascript Object";
    },
    reBeverage:function(){
        return `Time for ${this.beverage.morning}`;
    }
};

function filter(key, value){
    return typeof value === "number" ? undefined : value;
}
// 함수를 이용한 방법
const jsonFilterObj = JSON.stringify(anotherObj, filter, 4);
// 출력 결과 
{
  alive: true,
  hobbies: [ 'Coffee', 'Sleep', 'Working' ],
  beverage: { morning: 'Coffee', afternoon: 'Apple Tea' }
}

// 배열을 이용한 방법
const jsonArrayObj = JSON.stringify(anotherObj, ['alive', 'hobbies'], 4);
// 출력 결과 
{
    "alive": true,
    "hobbies": [
        "Coffee",
        "Sleep",
        "Working"
    ]
}
```

