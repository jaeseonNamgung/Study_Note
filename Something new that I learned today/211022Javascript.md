# 코딩 스타일

## 중괄호
- 자바스크립트에서 여는 중괄호는 ```이집션(Egyptian)``` 스타일을 따라 줄이 아닌 상응하는 키워드와 같은 줄에 작성한다.
- 여는 중괄호 앞엔 공백이 하나 있어야 한다.
- 만약 코드가 짧다면 중괄호 없이 한 줄에 쓰는 방법도 사용해도 된다.
``` javascript
// 코드가 짧을 경우
if(condition) alert(내용...);
-------------------------------------
if(condition){
    내용...
    내용...
}
```

## 가로 길이
- 길이가 길다면 여러 줄로 나눠서 작성해야 한다.
## 함수의 위치 
- 함수를 위에 선언하고 함수 선언은 함수 밑에 선언하는 게 좋다.

# 객체 
- 여러 단어를 조합해 프로퍼티 키를 만든 경우엔, 점 표기법을 사용해 프로퍼티 값을 읽을 수 없다. 
```javascript
user.likes birds = true; // 에러 발생

user["likes birds"] = true; // 프로퍼티 키가 두 단어 이상으로 이루어질 경우 대괄호 표기법으로 사용해야 한다.
```

- 대괄호 표기법을 사용하면 아래 예시와 같이 변수를 사용하여 프로퍼티 키를 지정할 수 있다.
```javascript
let key = "likes birds";

// user["lieks birds"] = true; 와 같다.
user[key] = true;
```
- 객체를 만들 때 객체 프로퍼티 안의 프로퍼티 키가 대괄호로 둘러싸여 있는 경우, 이를 ```계산된 프로퍼티(computed property)```라고 한다.
```javascript
 let result = prompt("학생 이름을 입력하세요.");
        let user = {
            [result] : 25
        };

        alert(user[result]);
```
- 프로퍼티 키를 지정할 때 문자형이나 심볼형에 속하지 않은 값은 문자열로 자동 형 변환된다.

- ```in```연산자로 프로퍼티 존재 여부 확인하기 
  - ```in```연산자 왼쪽에는 반드시 프로퍼티 이름이 와야 한다.
```javascript
 let user = {
        name : "Jone",
        age : 25,
     };

alert("name" in user);  // user 객체 안에는 name 프로퍼티가 있기 때문에 true를 반환한다.
alert("gender" in user); // user 객체 안에는 gender 프로퍼티가 없기 때문에 false를 반환한다.
 
```

## for...in 사용하기

```javascript
 
     let user = {
        name : "Jone",
        age : 25,
     };

     

     for(key in user){
       alert(key) // name, age
       alert(user[key]); //Jone, 25
   }
```

### 정수 프로퍼티란? 
  - 정수 프로퍼티란 변형 없이 정수에서 왔다 갔다 할 수 있는 문자열을 의미한다. 
    - 자바스크립트에서 정수 프로퍼티는 정수 숫자에 의해 자동으로 정렬되고 그 외의 프로퍼티는 객체에 추가한 순서 그대로 정렬된다.

# 가비지 컬렉션(garbage collector) 
- 도달 가능한(reachable) 값이란? 
  - 도달 가능한(reachable) 값이란 어떻게든 접근 가능하거나 사용할 수 있는 값을 의미한다.
  - 도달 가능한 값 예시 : 
    - 현재 함수의 지역변수와 매개변수
    - 중첩 함수의 체인에 있는 함수에서 사용되는 변수와 매개변수
    - 전역변수
    - 기타 등등 
    - **이런 값들을 루트(root)라고 부른다.**
- 외부로 나가는 참조는 도달 가능한 상태에 영향을 주지 않는다.


# this 
- 자바스크립트에 ```this```는 런타임 시에 결정된다.
- 자바스크립트에 ```this```는 자유로운 ```this```이기 때문에 메서드 밖에서도 사용 가능하다.
  - 함수를 선언할 때 ```this```를 사용할 수 있다. 
- 화살표 함수는 자신만의 ```this```를 가지지 않는다. 화살표 안에서 ```this```를 사용하면 외부에서 ```this``` 값을 가져온다.


# new 연산자와 생성자 함수
## 생성자 함수 
1. 함수 이름의 첫 글자는 대문자로 시작한다.
2. 반드시 ```new``` 연산자를 붙여 실행한다.

```javascript
function User(name) {
  // this = {};  (빈 객체가 암시적으로 만들어짐)
  this.name = name;
  this.isAdmin = false;

  // return this;  (this가 암시적으로 반환됨)
}

let user = new User("보라");

alert(user.name); // 보라
alert(user.isAdmin); // false
```

- 재사용할 필요가 없는 복잡한 객체를 만들어야 할 경우 익명 함수를 사용할 수 있다.

```javascript
let user = new function(){
    내용...
    내용...

    // 사용자 객체를 만들기 위한 여러 코드
    // 지역 변수, 복잡한 로직, 구문 등의
    // 다양한 코드가 여기에 들어간다.
}
```
- ```return``` 뒤에 객체가 오면 생성자 함수는 해당 객체를 반환해 주고, 이외의 경우는 ```this```가 반환된다.
