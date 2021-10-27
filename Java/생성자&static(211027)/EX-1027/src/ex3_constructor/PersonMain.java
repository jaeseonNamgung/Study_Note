package ex3_constructor;

public class PersonMain {
	public static void main(String[] args) {
		
		Person p1 = new Person("홍길동", 25);  // 생성자를 오버로딩 했기 때문데 기본생성자를 자동으로 생성해주지 않는다.
		p1.myFriend();
	}
}
