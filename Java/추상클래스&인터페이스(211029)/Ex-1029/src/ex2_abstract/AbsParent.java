package ex2_abstract;

public abstract class AbsParent {
	
	//  추상 메서드를 한 개 이상 가지고 있는 클래스는 abscract를 통해 반드시 추상 클래스화 되어 있어야 동작한다.

	int value = 100;
	
	public int getValue() {
		return value;
	}
	
	// 추상 : 미완성의 개념
	//추상 메서드는 body가 없다. abstract 키워드를 사용한다.
	//abstract 키워드라 있어야 추상이라는 의미를 가질 수 있다. 
	abstract public void setValue(int n);  
}
