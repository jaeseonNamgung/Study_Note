package ex4_choice;

import java.awt.Choice;
import java.awt.Frame;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex1_Choice {

	static String res = "일요일";

	public static void main(String[] args) {

		Frame f = new Frame("choice 선택 상자");
		f.setLayout(null);// 자동배치 끄기
		f.setBounds(500, 300, 300, 100);

		// choice 객체 생성
		Choice day = new Choice();
		// choice 객체의 높이는 안에 있는 요소(월, 화, 수,...)의 사이즈로 결정되므로
		// 0으로 세팅해도 무방하다.
		day.setBounds(50, 50, 150, 0);

		day.add("일요일");
		day.add("월요일");
		day.add("화요일");
		day.add("수요일");
		day.add("목요일");
		day.add("금요일");
		day.add("토요일");

		// choice에 이벤트 감시자 등록
		day.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				
				System.out.println(day.getSelectedItem());
				// getSelectedItem(): choice에 값을 반환하는 메서드

			}

		});

		f.add(day);

		f.setVisible(true);

		f.addWindowListener(new WindowAdapter() {

			public void windowClosing(WindowEvent e) {
				System.exit(0); // 열려있는 모든 프레임을 종료
			};

		});
	}

}
