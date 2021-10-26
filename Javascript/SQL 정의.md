# SQL(Structured Query Language)
- 데이터베이스에 저장된 데이터를 사용하고 관리하기 위한 언어
- DBMS 제작회사와 독립적이며 다른 시스템과 호환성이 좋다.
- 대화식 언어로 여러줄에 걸쳐 작성이 가능하며, 쿼리문의 끝은 항상 세미콜론```(;)```으로 마무리 한다.

## SQL Query 문의 종류
- 데이터 정의어(DDL - Data Definition Language)
  - 사용자 또는 데이터베이스의 논리적 구조(테이블)를 정의하기 위한 언어
  - CREATE(생성), ALTER(변경), DROP(삭제)

## 데이터 조작어(DML - Data Manipulation Language)
  - 데이터베이스에 저장된 데이터를 조작하기 위해 사용하는 언어
  - SELECT(조회), INSERT(삽입), UPDATE(수정), DELETE(삭제)

## 데이터 제어어(DCL - Data Control Language)
  - 데이터에 대한 접근 권한 부여를 목적으로 사용되는 언어
  - GRANT(권한 승인), REVOKE(권한 취소)