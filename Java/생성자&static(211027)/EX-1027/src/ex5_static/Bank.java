package ex5_static;

public class Bank {
	
	//static : 해당 클래스를 통한 객체가 아무리 많이 생성되어도
	// 메모리에 오직 한 개만 만들어지게 하기 위한 키워드 
	
	private String point;
	private String tel;
	static float interest;  // 수시로 이자가 변하기 때문에 private로 설정하지 않는다.
	
	
	public Bank(String point, String tel) {
		this.point = point;
		this.tel = tel;
		interest = 10.0f;
	}
	
	public void bankInfo() {
		System.out.println("지점 : " + point);
		System.out.println("전화 : " + tel);
		System.out.println("이자율 : " + interest);
		System.out.println("------------------------------------------");
	}
	
}
