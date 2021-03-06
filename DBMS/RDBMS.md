# RDBMS(관계형 데이터베이스 관리 시스템)

```
Table A(USER)                          Table B(ORDER)    
번호(PK)   이름      아이디(UK)        구매번호(PK)     번호(FK)    날짜            상품
1         홍길동     hds1234           20211012001      1          20211012      공기청정기
2         김길동     lss1234           20211012002      2          20211013      노트북
3         이길동     dff1234           20211012003      3          20210912      세제
4         박길동     aee1234           20211012004      4          20210809      신발

```
** 이런한 구조를 가지는 것을 Table, Relation(오라클), Class라고 부른다.

- COLUMN(열, 속성, 필드) : 공통된 값들의 주제
- ROW(행, 레코드, 튜플) : 하나의 정보
- Primary Key
  - 고유한 값(각 행의 구분점으로 사용된다.)
  - 중복이 없고 NULL 값을 허용하지 않는다.
  - ※NULL : 아직 어떤 값을 넣을 지 모르겠다라는 뜻을 가진 값
- Foreign Key
  - 다른 테이블의 PK를 의미한다.
  - 보통 테이블끼리 관계를 맺을 때 사용된다.
  - 중복이 가능하다.
  - 위에 표 참고  : Table A에 없는 값을 Table B의 FK 컬럼에 사용할 수 없다. 

- Unique Key : NULL은 허용하지만 중복을 허용하지 않는 Key

# SQL문 - DDL(Data Definition Laguage)
 - DDL : 데이터 정의어, 테이블 조작, 제어 관련 쿼리문
<br/>
<br/>

 - CREAT : 테이블 생성
 - DROP : 테이블 삭제 
 - ALTER : 테이블 수정
   - 테이블명 수정 : RENAME TO [새로운 테이블명]
   - 컬럼 추가 : ADD([새로운 컬럼명][컬럼 타입])
   - 컬럼명 변경 : RENAME COLUMN[생성된 컬럼명] TO [새로운 컬럼명]
   - 컬럼 삭제 : DROP COLUMN[생성된 컬럼명]
- TRUNCATE : 테이블 내용 전체 삭제


# 자료형(TYPE)

1. 숫자
- NUMBER(precision) : 정수
- NUMBER(precision, 소수점 자리수) : 실수
- NUMBER : 생략 시 22byte까지 입력 가능(38자리 정수)

2. 문자열 
- CHAR(길이) : 고정형
  - CHAR(4)에 'A'를 넣으면 A^^^ 빈자리가 공백으로 채워진다.
  - 형식을 정한 날짜, 주민등록번호처럼 글자 수가 절대 변하지 않는 값을 넣는다. 
- VARCHAR(길이), VARCHAR2(길이) : 가변형
  - 값의 길이만큼 공간이 배정된다. 글자 수에 변화가 있는 값을 넣는다.
- DATE : FORMAT에 맞춰서 날짜를 저장하는 타입 




