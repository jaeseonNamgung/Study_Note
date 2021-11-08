package ex3_check_box;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Check_RadioMain2 {

	static boolean female = false;
	static boolean male = false;

	public static void main(String[] args) {

		Frame f = new Frame("체크박스와 라디오 버튼");
		f.setBounds(500, 400, 800, 500);
		f.setLayout(null);

		// 폰트 설정
		// Font.ITALIC : 글자를 기울여서 보여준다.
		// Font.PLAIN : 두껍게도, 기울이지도 않은 기본 폰트
		// 글꼴, 글꼴속성, 폰트크기
		Font font = new Font("궁서체", Font.BOLD, 30);

		// Label : 텍스트를 보여주기 위한 객체
		Label q1 = new Label("당신의 성별은 무엇입니까?");
		q1.setBounds(10, 25, 380, 50);
		q1.setBackground(Color.green);
		q1.setFont(font);

		// 라디오 버튼 생성
		CheckboxGroup group = new CheckboxGroup();
		Checkbox c1 = new Checkbox("여자", group, false);
		Checkbox c2 = new Checkbox("남자", group, false);

		c1.setBounds(10, 80, 100, 50);
		c1.setFont(font);
		c2.setBounds(10, 140, 150, 50);
		c2.setFont(font);

		// 체크박스용 이벤트 감지자 생성
		ItemListener it = new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				
				switch(e.getItem().toString()) {
				case "여자" : 
					if(e.getStateChange()==1) {
						female = true;
						System.out.println("나는 여자");
					}//if
					else {
						female = false;
					}//else
					break;
				case "남자" : 
					if(e.getStateChange()==1) {
						male = true;
						System.out.println("나는 남자");
					}//if
					else {
						male = false;
					}//else
					break;
				}//switch
				
			}
		};

		// 체크박스에 이벤트 감지자 등록
		c1.addItemListener(it);
		c2.addItemListener(it);

		f.add(q1); // frame에 q1 레이블 추가
		f.add(c1);
		f.add(c2);
		f.setVisible(true);

		f.addWindowListener(new WindowAdapter() {

			public void windowClosing(WindowEvent e) {
				System.exit(0); // 열려있는 모든 프레임을 종료
			};

		});

	}

}
