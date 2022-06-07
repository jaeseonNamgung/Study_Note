# Promise

- Promise는 자바스크립트에서 비동기(asynchronous)식 방법을 사용할 때 사용하는 객체이다.
- Promise 객체는 비동기 작업이 맞이할 미래의 성공 또는 실패와 그  결과값을 나타낸다. (즉 순차적으로 실행했을 때가 아닌 각자 자신에 주어진 동작을 실행했을 때의 결과가 성공 혹은 실패했을 때의 결과값을 나타낸다.)



## Promise의 3가지 상태

- pending( 대기) : 이행하지도, 거부하지도 않은 초기 상태 (대기 상태)
- fulfiled( 이행) : 연산이 성공적으로 완료된 상태
- reject(거부) : 연산이 실패한 상태

```javascript
new Promise((resolve, reject)=>{
    .....
});
```



Promise 객체를 사용하기 위해서는 `new 연산자를 통해 Promise 객체를 선언한 후` 콜백함수를 통해 Promise를 정의해준다.  Callback 함수의 파라미터는 일반적으로 resolve(성공), reject(실패)로 작성해준다.  **Promise 객체를 생성했을 때 Promise 객체는 자동으로 실행된다.**



```javascript
//1. Producer
const promise = new Promise((resolve, reject)=>{
    // doing some heavy work(network, read files)
    console.log('doing something...');
    setTimeout(()=>{
       resolve('namgung'); // 성공했을 경우
       //reject(new Error('no network')); // 실패 했을 경우
    } ,2000)
});
```

```javascript
// 2. Consumers: then, catch, finally
promise //
.then((value) => {
    console.log(value);
})
.catch(error => {
    console.log(error);
})
.finally(()=>{
    console.log('finally');
});

```

- then(callback) : resolve를 실행 했을 경우 처리 결과 함수. 
- catch(callback) : reject를 실행 했을 경우 처리 결과 함수.
- finally(callback): 성공, 실패와 상관 없이 무조건 실행 시키는 함수



### Promise Chaining

chaining은 연쇄(사슬)이란 뜻으로 사슬같이 묶여서 처리하는 방법이다.

```javascript
// 3. Promise chaining
const fetchNumber = new Promise((resolve, reject)=>{
    setTimeout(()=>resolve(1), 1000);
});

fetchNumber
.then(num => num * 2)
.then(num => num*3)
.then(num => {
    return new Promise((resolve, reject)=>{
        setTimeout(()=>resolve(num - 1), 1000);
    });
})
.then(num => console.log(num));
// 출력결과(2초후 값이 출력) : 5

```

then 함수를 여러번 묶어서 사용할 경우 위에서 처리한 결과 값을 밑에서 처리하고 밑에서 처리한 결과값을 또 그 밑에서 처리할 수 있다.

then 함수는 일반적인 값을return 할수 있고 Promise 객체를 생성해 Promise 타입으로 값을 return 할 수도 있다. 

