package ex5_work;

import java.util.Scanner;

public class UpDown {

	private int ran;

	public int randomSet() {
		return this.ran = (int) (Math.random() * 50 + 1);
	}

	public void discrimination() {
		Scanner sc = new Scanner(System.in);
		int flag = 0;
		int count = 0;
		
		while (flag != 1) {

			int num = sc.nextInt();

			System.out.println(this.ran);
			if (ran > num) {
				System.out.println("Up!");
				++count;
				System.out.println("count : " + count);
				
			}

			else if (ran < num) {
				System.out.println("Down");
				++count;
				System.out.println("count : " + count);
			}

			else {
				System.out.println("맞았습니다!");
				System.out.println("최종 count : " + count);
				flag = 1;
			}
		}

	}
}
