# SELECT 명령어
- ```LIKE``` 연산자 
  - 검색하는 값이 명확하지 않을 때 사용한다.
  - LIKE 명령어에서 ```%```, ```_``` 두 개의 기호를 사용한다.
  - ```%``` : 모든 문자
  - ```_``` : 한 개의 문자, 언더바의 갯수를 통해 몇 개의 문자의 값을 검색할 지 알 수 있다.
    - EX) ```A%``` : A로 시작하는 모든 값
    - EX) ```%A``` : A로 끝나는 모든 값
    - EX) ```%A%``` : 값이 어디든 A가 포함된 모든 값
- 비교 연산자 
  - ```>, <, >=, >= , = , !=, <>```
  - ```!=, <>``` : NOT 연산자
  - ```=``` :  자바에서 ```==```연산자와 같다.
- ```AND, OR``` 연산자
  - ```AND``` : 두 개의 조건이 무조건 일치해야 한다.
  - ```OR``` : 두 개의 조건 중 하나만 일치해도 된다.
- ```IN, BETWEEN``` 연산자 
  - ```IN``` : 해당 속성에서 찾고자 하는 값을 정확히 알고 싶을때 복수로 사용, ```IN()```안에 값을 넣는 형태이다
    - EX) ```IN(찾고자 하는값,....)```
  - ```BETWEEN``` : ~ 사이의 값을 검색할 때 사용, ```AND``` 연산자와 같이 사용된다. BETWEEN 연산자는 A 이상 B이하 연산만 사용 가능하다.
    - EX) 5만원에서 10만원 - > ```BETWEEN 50000 AND 100000```
 
- ```ORDER BY``` 정렬
  - ```SELECT``` 명령어로 검색되는 데이터들을 순차적으로 정렬할 때 사용 (오름차순, 내림차순)
  - ```ORDER BY```절은 ```SELECT``` 명령어에서 가장 마지막 줄에 사용해야 한다.
  - ```ASC``` : 오름차순 정렬
  -```DESC``` : 내림차순 정렬
    - EX) ```ORDER BY PRICE ASC``` -> 가격을 오름차순으로 정렬

- ```GROUP BY```
  - 집계함수 : ```COUNT(), SUM(), AVG(), MAX(), MIN() ```
  - 집계함수를 ```SELECT```문에 사용할 때 ```GROUP BY``` 명령어를 사용하여 속성별로 그룹화 할 수 있다.
  - ```GROUP BY절 + ORDER BY절``` 사용 가능
  - ```GROUP BY절 + WHERE절 + HAVING절``` 사용가능

- ```HAVING```
  - ```GROUP BY + HAVING```절로 같이 사용된다.
  - ```WHERE``` 절 뒤에는 집계함수를 사용할 수 없기 때문에 그렇기 때문에 ```GROUP BY```절을 사용할 경우 집계함수를 이용하여 조건식을 세울 때는 ```HAVING```절을 사용한다.
  - ```HAVING```절은 반드시 ```GROUP BY```절 다음에 와야하며 순서가 변경되면 안된다.
  
  