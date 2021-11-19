# Sequence(시퀀스)
- 번호표 붙이기 (인덱스) 담당자
- 레코드의 특정 컬럼에 대해 자동으로 인덱스를 부여할 수 있음
- ```NEXTVAL```을 사용하여 다음 인덱스로 넘어 감
- 한 번 넘어간 인덱스는 이전 인덱스로 돌아갈 수 없음
  - 중복 인덱스가 부여되지 않으므로 값의 고유```(UNIQUE)``` 성질을 지킬 수 있음

## Sequence 생성
```sql
CREATE SEQUENCE [시퀀스명] [옵션1][옵션2]...;
// 시퀀스명 까지만 사용해도 무관하다.
```
### Sequence 옵션
- ```START WITH n``` : n 부터 시작하겠다.
- ```INCREMENT BY n``` : n씩 증가시키겠다. (**음수면 감소) 
   - ```DEFAULT 1```
- ```MAXVALUE n``` : 최댓값을 n으로 지정 
  - DEFAULT : ```NOMAXVALUE``` -> 최댓값 없음 (무한대로 증가)
- ```MINVALUE n``` : 최솟값을 n으로 지정
  - DEFAULT : ```NOMINVALUE``` -> 최솟값 없음 (무한대로 감소)
- ```CYCLE``` : 최댓값/최솟값 도달 시 순환하겠다. (다시 최솟값/최댓값부터 시작)
  - DEFAULT ; ```NOCYCLE``` : 순환하지 않음(도달하면 더 이상 ```NEXTVAL```을 사용할 수 없음)
- ```CACHE``` : 미리 메모리에 생성 한다.
  - DEFAULT : 20
  - ```NOCACHE``` : 생성해두지 않겠다.


### EX

```sql
CREATE SEQUENCE st_seq; -- 을 수행하는 경우 적용되는 명령은 아래와 같다. (기본값)
CREATE SEQUENCE st_seq START WITH 1 INCREMENT BY 1 NOMAXVALUE NOCYCLE CACHE 20;
-- 1부터 시작해서 1씩 증가하며 사이클이 없고  20을 메모리에 생성한다.
```

```sql
CREATE SEQUENCE st_seq START WITH 3 INCREMENT BY 2 MAXVALUE 9999 CYCLE NOCACHE;
-- 3부터 시작해서 2씩 증가하고 최대 9999까지 값이 증가하고 사이클이 있고 캐쉬는 생성해두지 않는다.
```

## Sequence 적용 

```sql
-- 테이블 INSERT 수행 시 적용할 항목에
INSERT INTO [테이블명] VALUES (..., [시퀀스명].NEXTVAL, ...);
```
### EX

```sql
INSERT INTO student VALUES(st_seq.NEXTVAL, '홍길동', '010-1111-1111, 1, 89, SYSDATE);
INSERT INTO student VALUES(st_seq.NEXTVAL, '김길동', '010-2222-2222, 2, 100, SYSDATE);
INSERT INTO student VALUES(st_seq.NEXTVAL, '이길동', '010-3333-3333, 3, 59, SYSDATE);
```

### 시퀀스 현재 값 조회

```sql
SELECT st_seq.CURRVAL FROM DUAL;
-- 단, 한 번이라도 테이블 컬럼에 시퀀스 값이 추가 되어야한다.
```
### 현재 유저의 모든 시퀀스에 대한 모든 정보 조회
```sql
SELECT * FROM USER_SEQUENCES;
```

### 시퀀스 삭제 
```SQL
DROP [시퀀스명];
```