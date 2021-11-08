package ex3_abstract;

public class UnitMain {
	public static void main(String[] args) {
		
		Terran t1 = new Terran("해병", 100, false);
		t1.decEnergy(); // 한 방 맞았다.
		t1.decEnergy();// 한 방 맞았다
		System.out.println(t1.energy);
		
		Protoss p1 = new Protoss("셔틀", 150, true);
		p1.decEnergy();
		System.out.println(p1.energy);
		
		Zerg z1 = new Zerg("저글링", 200, false);
		z1.decEnergy();
		System.out.println(z1.energy);
	}//main2
}
