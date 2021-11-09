package ex_work;

import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex_Work {
	public static void main(String[] args) {

		Frame frame = new Frame("외부프레임");
		frame.setBounds(500, 400, 500, 400);

		frame.addWindowListener(new WindowAdapter() {

			public void windowClosing(WindowEvent e) {

				Frame innerFrame = new Frame("내부프레임");
				innerFrame.setBounds(550, 450, 400, 300);
				innerFrame.setLayout(null);
				innerFrame.setVisible(true);

				Font font = new Font("오이체", Font.PLAIN, 20);
				Label lb = new Label("정말로 종료하시겠습니까?");
				lb.setFont(font);
				lb.setBounds(10, 10, 400, 100);
				
				//확인버튼과 취소버튼
				Button btnYes = new Button("네");
				btnYes.setBounds(50, 120, 135, 150);
				
				Button btnNo = new Button("아니오");
				btnNo.setBounds(215, 120, 135, 150);
				
				//버튼들에게 이벤트 감지자 추가 
				
				btnYes.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						System.exit(0);
						
					}
				});
				
				btnNo.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						innerFrame.dispose();
						
					}
				});

				innerFrame.add(lb);
				innerFrame.add(btnYes);
				innerFrame.add(btnNo);
			};

		});

		frame.setVisible(true);

	}// main

}
