package ex2_abstract;

public class AbsChild extends AbsParent {

	// 부모인 추상클래스는 미완성된 추상메서드를 가지고 있으므로
	// 이 미완성의 메서드를 자식이 상속받아서 완성시키는 것을 조건으로 둔다.
	
	@Override
	public void setValue(int n) {
		// 부모의 미완성 메서드를 자식이 받아서
		// 자식 사정에 맞도록 내용을 재정의 할 수 있다.
		value = n;
	}

	
}
