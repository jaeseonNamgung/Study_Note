package ex3_window_listenner;

import java.awt.*;
public class EventMain {
	public static void main(String[] args) {
		
		Frame f = new Frame("이벤트 감지자");
		f.setBackground(Color.YELLOW);
		
		//f.setSize(400,300);
		//f.setLocation(500, 400);
		
		f.setBounds(400, 300, 500, 400); // 너비, 높이, x좌표, y좌표
		
		//f에 이벤트 감지자 등록
		f.addWindowListener(new MyEvent());
		
		f.setVisible(true);
	}

}
