 # DML(Data Manipulation Language)
- 데이터베이스에 저장된 데이터를 조작하기 위해 사용하는 언어 
- SELECT(조회), INSERT(삽입), UPDATE(변경), DELETE(삭제)
- DML 구문이 사용되는 대상은 테이블의 행이다.
- DML을 사용하기 위해서는 이전에 테이블이 정의(DDL) 되어 있어야 한다.

```SQL
INSERT INTO 테이블 명(속성1, 속성2,..) VALUES('속성1 값', '속성2 값',...);
```
**만약 속성을 지정하지 않을 경우 VALUES에는 모든 속성 값을 지정해 줘야 한다.**

```SQL
UPDATE 테이블명 SET 변경할 속성 명 = '변경할 값' WHERE 변경할 위치 속성 = '변경할 위치에 값';
```
**WHERE 조건식을 사용하지 않고 값을 변경할 경우 어디에 값을 변경할지 지정을 하지 않았기 때문에 모든 변경할 속성에 값이 변경되는 일이 생긴다. 그래서 WHERE 조건식을 사용해 변경할 위치를 지정해 줘야 한다.**

```SQL
DELETE FROM 테이블명 WHERE ID = '변경할 위치';
```

**DELETE 구문도 마찬가지로 WHERE 조건식을 사용해 삭제할 위치를 지정해 줘야 한다.**


## SELECT
- 테이블(TABLE)이나 뷰(VIEW)에서 원하는 튜플이나 속성을 검색하는 명령어이다.
- 기본 형식 : 
```SQL
SELECT[* / DISTINCT] FROM 테이블명;
```
1. ```*```: ALL(전체)
2. ```DISTINCT``` : 중복 제거

```SQL
SELECT[* / DISTINCT] FROM 테이블명 [WHERE 조건식];
                                    [GROUP BY];
                                    [HAVING 조건식];
                                    [ORDER BY ASC / DESC];
```
### SELECT 기본 함수 
- ```COUNT(속성)``` : 해당 열(COLUNM)이 있는 행(ROW)의 총개수
- ```SUM(속성)``` : 해당 열(COLUNM)이 있는 데이터들의 합
- ```AVG(속성)``` : 해당 열(COLUNM)이 있는 데이터들의 평균
- ```MAX(속성)``` : 해당 열(COLUNM)이 있는 데이터 중 최댓값
- ```MIN(속성)``` : 해당 열(COLUNM)이 있는 데이터 중 최솟값

**SUN(), AVG(), MAX(), MIN() 속성의 데이터 형식은 반드시 숫자 형태(NUMBER, INT)이어야 한다**
