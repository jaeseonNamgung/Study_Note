package ex2_animal;

public class AnimalMain {
	public static void main(String[] args) {
		Cat c1 = new Cat();
		System.out.println("고양이");
		System.out.println("눈 : " + c1.getEye());
		System.out.println("다리 : " + c1.getLeg());
		System.out.println("특이사항 : " + c1.balance);
		
		System.out.println("---------------------------------------------");
		
		Bear b1 = new Bear();
		System.out.println("곰");
		System.out.println("눈 : " + b1.getEye());
		System.out.println("다리 : "+ b1.getLeg());
		System.out.println("특이사항 : " + b1.woong);
		
		System.out.println("----------------------------------------------");
		
		Snake s1 = new Snake();
		System.out.println("뱀");
		System.out.println("눈 : " + s1.getEye());
		System.out.println("다리 : " + s1.getLeg());
		System.out.println("특이사항 : " + s1.sensor);
		
	}
}
