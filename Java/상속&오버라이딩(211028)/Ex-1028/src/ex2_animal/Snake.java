package ex2_animal;

public class Snake extends Animal {
	
	String sensor = "감각";
	
	// 메서드의 오버라이딩 : 메서드의 '재정의'의 의미를 가진다.
    // 부모의 메서드를 자식이 가져와서 자식 사정에 맞도록 내용만 재정의 하는 것
	@Override
	public int getLeg() {
		return 0;
	}
}
