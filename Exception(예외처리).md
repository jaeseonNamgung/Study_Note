**목차**
- [예외(Exception)란?](#예외(Exception)란?)
- [예외 처리(Exception Handling)란?](#예외-처리(Exception-Handling)란?)
  - [에러 종류](#예외-종류)
- [예외 처리 사용법](#예외-처리-사용법)
  - [try-catch](#try-catch)
  - [try-catch-finally](#try-catch-finally)
  - [예외 처리 종류](#예외-처리-종류)
  - [throws 예약어](#throws-예약어)
  - [사용자 정의 예외](#사용자-정의-예외)


# 예외(Exception)란?
예외란 프로그램 실행 도중 오류가 발생했을 때 처리가 가능한 것을 의미

# 예외 처리(Exception Handling)란? 
예외처리란 개발자가 오류가 발생할 것을 미리 인지해서 오류로 인해 프로그램이 비정상르로 종료된는 것을 막는 방법.

## 에러 종류

- 에러: 개발자가 조치를 취할 수 없는 수준 ex) 메모리 부족, JVM 동작 이상
- 컴파일 에러: 컴파일 시 발생하는 에러 ex) 오타, 잘못된 자료형 등
- 런타임 에러: 프로그램이 실행 도중에 발생하는 에러
- 로직 에러: 실행은 되지만 의도와는 다르게 동작하는 에러
- 예외: 다른 방식으로 처리 가능한 오류 ex) 입력 값 오류, 네트워크 문제

# 예외 처리 사용법
 **1.try-catch**
 
 ```java
 try{
예외가 발생할 만한 코드
}
catch(예외 클래스 변수){
예외 처리
}
 ```
1. try-catch는 같이 사용해야 된다. 단독으로 하나만 사용할 수 있다.
2. 하나의 try와 여러 개의 catch를 사용할 수 있다. (여러 개의 예외 처리 가능)
3. tr 안에 try-catch를 사용할 수 있다.

**2.try-catch-finally**
finally는 try-catch를 사용해서 예외가 발생해도 finally 안에 코드는 무조건 실행한다.

 ```java
 try{
예외가 발생할 만한 코드
}
catch(예외 클래스 변수){
예외 처리
}
finally{
 무조건 실행할 코드
}
 ```
 
 자바에서 모든 클래스의 최상위 클래스는 Object 클래스이다. 
 
 **예외 클래스의 상속 구조**
 
 예외 클래스들의 상속 구조는 아래 그림과 같다.
 ```
             Error
               ↓
 Object -> Throwable
               ↑
           Exception
	   
```
           
1. RunTimeException
런타임 Exception들은 프로그램이 실행 시 에러가 난다. 보통 개발자가 프로그램을 제대로 구현하지 않을
경우 에러가 난다. 
- 런타임 Exception 종류 : 
  - NullPointException: 레퍼런스 변수 값을 초기화하지 않고 해당 객체의 변수나 메서드를 호출할 경우 
    발생한다.
  - ArrayIndexOutOfBoundsException : 배열의 인덱스가 초과했을 때 발생한다.
  - ArithmeticException: 정수를 0으로 나누었을 때 발생한다.

2. RunTimeException이 아닌 일반 Exception들
일반 예외들은 반드시 예외 처리해 줘야 한다. 예외 처리를 안 해줄 경우 컴파일 실행 시 프로그램이 에러가 난다.

- 일반 Exception 종류:
  - FileNot-FoundException: 없는 파일을 찾을 경우 발생한다.
  - IOException: 입출력 시 예외 

**throws 예약어**
throws 예약어는 자신 메서드에서 예외 처리를 하는 게 아니라 자신을 호출한 메서드에서 예외를 처리하게끔 예외를 던지는 것을 의미한다.

``` java
public class Exception02 {

	public static void main(String[] args) {

		try {
			methodA();
		}catch(Exception e) {
			System.out.println("MethodA");
		}
	}
	public static void methodA() throws Exception{
		
		methodB();
		
	}
	public static void methodB() throws Exception{
		methodC();
	}
	public static void methodC() throws Exception{
		Exception e = new Exception();
		throw e;
	}

}
```
methodC -> methodB -> methodA -> main 순으로 예외를 던져진다.

**사용자 정의 예외**
사용자 정의 예외는 말 그대로 사용자가 정의한 예외이다. 사용자 정의 예외는 Throwable 클래스를 사용할 수 있지만 대부분 Exception 클래스를 많이 사용한다.

예제)
```java
class ArgsException extends Exception{  // Exception 클래스를 상속받아서 사용자 예외를 정의하는 부분
	
	private int argsNumber;

	public int getArgsNumber() {
		return argsNumber;
	}

	public void setArgsNumber(int argsNumber) {
		this.argsNumber = argsNumber;
	}
	public ArgsException(String msg) {
		super(msg);
	}

	
}
public class ExceptionTest {

	public static void main(String[] args) {

	 try {
		 if(args.length != 2) {
			 ArgsException ae = new ArgsException("인자를 두 개 입력해야 합니다.");
			 ae.setArgsNumber(args.length);
			 throw ae;  // 예외를 발생시킨다.
			 
		 }
		 else {
			 int num1 = Integer.parseInt(args[0]);
			 int num2 = Integer.parseInt(args[1]);
			 
			 System.out.println(num1 + " + " + num2 +" = "+(num1 + num2));
			 
		 }
	 }catch(ArgsException e) {
		 System.out.println(e.getMessage()); 
		 System.out.println("당신이 입력한 인자 수는 "+e.getArgsNumber() + "개입니다.");
	 }
	}

}

```

          
           



 

