package ex4_super;

public class Child extends Parent {

	public void setEye(int eye) {
		super.eye = eye;
	}
	public Child() {
		// super : 부모클래스
		super(2); // 부모클래스에 생성자 호출
		System.out.println("Child 생성자");
	}

	@Override
	public String test() {
		// 부모클래스이 test() 메서드를 호출하자
		return super.test();
	}
}
