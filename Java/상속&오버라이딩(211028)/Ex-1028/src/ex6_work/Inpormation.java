package ex6_work;

import java.util.Scanner;

public class Inpormation {

	private String[][] actor = { { "[송강호]", "박쥐", "괴물", "관상" }, { "[김수현]", "도둑들", "수상한 그녀", "은밀하게 위대하게" },
			{ "[이병헌]", "지아이조", "레드", "광해" } };;

	public void isActor() {

		Scanner sc = new Scanner(System.in);

		System.out.print("검색할 배우 : ");
		String str = sc.next();
		boolean n = true;
		
		for (int i = 0; i < actor.length; i++) {
			if (str.equals(actor[i][0].substring(1, 4))) {
				System.out.println(actor[i][0]);
				System.out.println(actor[i][1]);
				System.out.println(actor[i][2]);
				System.out.println(actor[i][3]);
				break;
			} else {
				n = false;
			}
		}

		if (!n) {
			System.out.println("해당 배우가 존재하지 않습니다.");
		}

	}

}
