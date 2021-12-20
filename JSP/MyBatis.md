# DBCP(Data Base Connection Pool)
- 사용자 요청이 있을 때 마다 DB 연결을 한다면 코드가 복잡해지며, 많은 요청이 있을 때 연결 속도가 저하될 수 있다.
- 따라서 미리 Connection을 만들어 두고, 필요 시 저장된 공간에서 가져다 쓴 후 반환하는 기법이다.

# JNDI(Java Naming and Directory Interface)
- 디렉터리 서비스에서 제공하는 데이터 및 객체를 발견하고 참고하기 위한 자바 API이며, 외부에 있는 객체를 가져오기 위한 기술이다.

# MyBatis Framework
- 소스코드 안에 SQL문을 작셩하면 코드가 길어지고 섞여 있어서 유지보수 및 분업이 쉽지 않다.
- MyBatis는 기존 JDBC 방식과는 달리 SQL문을 XML 파일에 작성함으로써 코드가 줄어들고, SQL문 수정이 편해진다.
- 또한 DBCP를 사용하여 커넥션을 여러 개 생성하기 때문에 JDBC만 사용하는 것 보다는 작업 효율과 가독성이 좋아진다.

## MyBatis 작동 순서
1. 응용 프로그램이 SqlSessionFactorybuilder를 통해 SqlSessionFactory를 빌드하도록 요청한다.
2. SqlSessionFactoryBuilder는 SqlSessionFactory를 생성하기 위한 MyBatis Config(구성) 파일을 읽는다.
3. SqlSessionFactoryBuilder는 MyBatis 구성 파일의 정의에 따라 SqlSessionFactory를 생성한다.
4. 클라이언트가 응용 프로그램에 대한 프로세스를 요청한다.
5. 응용 프로그램은 SqlSessionFactoryBuilder를 사용하여 빌드된 SqlSessionFactory에서 SqlSession을 가져온다.
6. SqlSessionFactory는 SqlSession을 생성하고 이를 응용 프로그램에 반환한다.
7. 응용 프로그램이 SqlSession에서 매퍼 인터페이스의 구현 객체를 가져온다.
8. 응용 프로그램이 매퍼 인터페이스 메서드를 호출한다.
9. 매퍼 인터페이스의 구현 객체가 SqlSession의 메서드를 호출하고 SQL 실행을 요청한다.
10. SqlSession은 매핑 파일에서 실행할 SQL을 가져와 SQL을 실행한다.


## MyBatis 라이브러리 링크
```
blog.mybatis.org/p/products.html
```