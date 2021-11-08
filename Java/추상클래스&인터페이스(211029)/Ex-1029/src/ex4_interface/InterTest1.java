package ex4_interface;

public interface InterTest1 {

	// 추상클래스와 유사하지만, 서비스의 요청에 따른 중개자 역활을 하는 클래스
	// 인터페이스에는 '상수'와 '추상메서드 이외에는 아무것도 정의할 수 없다.
	// 인터페이스에서는 final, abstract를 지정하지 않아도 동작한다. (인터페이스는 모든 값은 상수, 메서드를 추상메서드로 취급한다.)
	int VALUE = 100; // 상수는 변수명을 대문자로 작성하는것을 권장한다.

	abstract int gettest();

}
