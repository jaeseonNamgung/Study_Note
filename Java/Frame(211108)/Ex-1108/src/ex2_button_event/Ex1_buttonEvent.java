package ex2_button_event;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex1_buttonEvent {
	public static void main(String[] args) {

		Frame f = new Frame();
		f.setLayout(null); // 프레임에 자동배치를 끈다.
		f.setBounds(500, 400, 800, 500);
		Button btn1 = new Button("버튼1");
		// 프레임에 자동배치가 꺼져있는 상태라면 프레임에 추가될 자식 클래스들은
		// 개별적인 위치값과(location) 크기값(size)을 가지고 있어야 한다.
		btn1.setBounds(50, 100, 200, 300);

		Button btn2 = new Button("버튼2");
		btn2.setBounds(300, 100, 200, 300);

		Button btn3 = new Button("버튼3");
		btn3.setBounds(550, 100, 200, 300);

		f.add(btn1);
		f.add(btn2);
		f.add(btn3);

		// 버튼들에게 이벤트 감지자 추가
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼 1번을 클릭함");
			}
		});

		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼 2번을 클릭함");
			}
		});

		btn3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼 3번을 클릭함");
			}
		});

		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {

			public void windowClosing(WindowEvent e) {
				System.exit(0); // 열려있는 모든 프레임을 종료
			};

		});

	}

}
