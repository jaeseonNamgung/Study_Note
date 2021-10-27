package ex5_static;

public class BankMain {
	public static void main(String[] args) {
		
		Bank b1 = new Bank("홍대", "02-111-1111");
		Bank b2 = new Bank("이대", "02-222-2222");
		Bank b3 = new Bank("서강대", "01-333-3333");
		
		b1.interest = 0.1f;
		
		b1.bankInfo();
		b2.bankInfo();
		b3.bankInfo();
	}//main
}
