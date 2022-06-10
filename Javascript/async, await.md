# async, await

- `async, await`는 promise 객체를 좀 더 편하게 사용할 수 있도록 나온 문법이다.

```javascript
async function f(){
    await ....
}
```



### async 문법

```javascript
async function f(){
    return 'async';
}
    console.log(f());
// 출력결과 -> Promise {<fulfilled>: 'async'}
```

async 문법을 사용해서 console에 출력해 보면 Promise 객체로 출력되는 걸 알 수 있다. 

```javascript
f().then(console.log); // 출력결과 -> async
```

즉 Proise 객체와 같이 asyns를 사용하면 then() 함수를 사용할 수 있고 **async를 사용한 함수의 return 값이 resolve 값이 된다.**



### await 문법

```javascript
function delay(){
    return new Promise((resolve, reject)=>{
        setTimeout(()=>resolve(console.log('3초후 동작')), 3000);
    });
}
async function f(){
    delay();
    return 'async';
}
f().then(console.log);
// 출력결과->
// async
// index.html:15 3초후 동작
```

setTimeout() 함수는 비동기 적으로 동작하기 때문에 return 값인 async 문자열을 먼저 console창에 출력되고 3초 후 setTimeout 함수가   실행돼서 console 창에 실행된다.  만약 setTimeout() 함수를 3초 후 실행된 다음 return 값을 실행시키고 싶다면 **await** 를 사용하면 된다. await는 async가 붙여진 함수안에서 만 사용 가능하다.



```javascript
async function f(){
    await delay();
    return 'async';
}
// 출력 결과 -> 
// 3초후 동작
// async
```

이렇게 Promise 함수에 await를 사용할 경우 3초후 return 값인 async를 출력하는 것을 볼 수 있다.

