package ex3_constructor;

public class Person {
	
	private String name;
	private int age;
	
	// 생성자가 오버로딩되어 있을 때
	// 기본생성자를 만들어두지 않으면 기본생성자를 자동으로 만들지어 주지 않는다.
	public Person() {
		
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void myFriend() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : "+ age);
		System.out.println("------------------------");
	}
	
}
