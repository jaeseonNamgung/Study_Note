package ex1_inheritance;

public class ExtendsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//상속관계의 객체에서 자식클래스는 부모가 가진 속성이나 메서드를
		//마음대로 가져다가 사용할 수 있다.
		Child c1 = new Child();
		System.out.println(c1.car);
		System.out.println(c1.money);
		System.out.println(c1.str);
		
		Parent p1 = new Parent();
		//부모클래스는 자식의 속성에 접근할 수 없다.
		System.out.println(p1.money);
		System.out.println(p1.str);
		
		//Child 클래스는 Parent를 상속받았으므로
		//Child가 생성될 때 Parent의 영역이 함께 생성된다.
		if(c1 instanceof Parent) {
			System.out.println("c1은 Parent의 자식");
		}
		
		
		
		

	}//main

}
