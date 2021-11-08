package ex5_interface;

public interface Menu3 extends Menu1, Menu2{
	// 인터페이스들간에는 extends를 통해 상속을 받는다.
	// 인터페이스만 유일하게 다중상속이 가능하다.
	String boggembab();
}
