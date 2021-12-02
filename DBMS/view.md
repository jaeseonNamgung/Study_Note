# View
- 기존 테이블에는 존재하지 않는 정보를 추가하거나 제거해서 원하는 정보만 검색이 가능하도록 제작한 가상의 테이블

```SQL
SELECT EMPLOYEE_ID, FIRST_NAME, SALARY, COMMISSION_PCT, COMMISSION_PCT*SALARY FROM EMPLOYEES;
```
- 위의 다섯가지 정보만을 조회할 수 있도록 하는 가상의 테이블(View)을 만들자

```SQL
CREATE OR REPLACE VIEW 뷰 이름 AS 뷰를 만들 칼럼;
```
```SQL
-- CREATE OR REPLACE VIEW 는 필수 작성 코드!
-- MY_JOB 이라는 이름의 VIEW를 생성
CREATE OR REPLACE VIEW MY_JOB AS
SELECT EMPLOYEE_ID, FIRST_NAME, JOB_ID
FROM EMPLOYEES WHERE JOB_ID = 'ST_CLERK';
```

- 예제
  - 급여를 많이 받는 순서대로 순위를 매겨서 순위가 낮은 순으로 순위, 이름, 급여 순서로 조회하는 VIEW를 생성

```SQL
CREATE OR REPLACE VIEW EMP_RANK AS 
SELECT RANK() OVER(ORDER BY SALARY DESC) RANK, FIRST_NAME, SALARY FROM EMPLOYEES; 
```
- ```RANK() OVER()``` 함수 란 순위를 정해주는 함수이다. 