package ex4_static;

public class StaticTest {

	String str1 = "멤버변수";
	static String str2 = "스테틱 변수";
	
	public void test() {
		str1 = "값 변경 가능";
		
		// 일반적인 메서드에서는 static 변수를 언제든지 가져다 사용할 수 있다. 
		str2 = "나는 변경 되지롱";
		
	}
	
	public static void test2() {
		
		//static 메서드에서는 일반 멤버변수를 참조해서 쓸 수 없다.
        //str1 = "나는 어쩌지?";
		
		str2 = "값이 변경 될까?";
		
	}
}
