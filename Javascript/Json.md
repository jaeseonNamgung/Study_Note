# Json(Javascript Object Notation)

- json는 {key:value}로 구문된다.
- 텍스트 기반으로한 언어이다.
- 보통 서버와 데이터를 주고 받을 때 사용한다.
- 특정 프로그램과 상관없이 모든 언어에 사용 가능하다.



```javascript
//async & await
// clear style of using promise :)

// 1. async
async function fetchUser() {
    // return new Promise((resolve, reject) => {
    //     // do network request in 10 secs....
    //     resolve('namgung');
    // });

    return 'namgung';
}

const user = fetchUser();
user.then(console.log);
console.log(user);

// 2. await (async가 붙은 함수 안에서만 사용 가능하다.)
function delay(ms){
    return new Promise(resolve => setTimeout(resolve, ms));
}

async function getApple(){
    await delay(2000);
    return 'apple';
}

async function getBanana(){
    await delay(1000);
    return 'banana';
}

// function pickFruits(){
//     return getApple()
//     .then(apple => {
//         return getBanana()
//         .then(banana => `${apple} + ${banana}`);
//     })
// }
async function pickFruits(){
    const applePromise = getApple();
    const bananaPromise = getBanana();

    const apple = await applePromise;
    const banana = await bananaPromise;
    return `${apple} + ${banana}`;
}
pickFruits().then(console.log);

// 3. useful Promise APIs
function pickAllFruits(){
    return Promise.all([getApple(), getBanana()])
    .then(fruits => fruits.join(' + '));
}
pickAllFruits().then(console.log);

function pickOnlyOne(){
    // .race([]) : 가장 먼저 도달한 함수만 호출된다.
    return Promise.race([getApple(), getBanana()]);
}

pickOnlyOne().then(console.log)
```



