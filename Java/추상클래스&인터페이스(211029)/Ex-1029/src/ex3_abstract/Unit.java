package ex3_abstract;

public abstract class Unit {

	String name;
	int energy;
	boolean fly;

	// 자식 클래스가 공격을 당했을 때 사용하도록
	// 체력을 관리하는 메서드를 추상메서드로 정의했다.
	abstract public void decEnergy();

}
