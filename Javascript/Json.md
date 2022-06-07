# Json(Javascript Object Notation)

- json는 {key:value}로 구문된다.

- 텍스트 기반으로한 언어이다.

- 보통 서버와 데이터를 주고 받을 때 사용한다.

- 특정 프로그램과 상관없이 모든 언어에 사용 가능하다.

  



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



