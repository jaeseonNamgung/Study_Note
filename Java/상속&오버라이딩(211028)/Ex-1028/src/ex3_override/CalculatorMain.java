package ex3_override;

public class CalculatorMain {
	public static void main(String[] args) {
		Plus p1 = new Plus();
		int res = p1.getResult(5, 2);
		System.out.println(res);
		
		System.out.println("--------------------------");
		Minus m1 = new Minus();
		res = m1.getResult(5, 2);
		System.out.println(res);
		
		System.out.println("--------------------------");
		
		Multi m2 = new Multi();
		res = m2.getResult(5, 2);
		System.out.println(res);
				
	}
}
