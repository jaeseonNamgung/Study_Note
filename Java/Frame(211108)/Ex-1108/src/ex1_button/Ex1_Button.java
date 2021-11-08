package ex1_button;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class Ex1_Button {
	public static void main(String[] args) {
		
		Frame f = new Frame("버튼 테스트");
		f.setBounds(500, 400, 400, 300);
		
		// 프레임의 기본 배치 속성인 자식 객체를 화면에 가득 채우는
		// 자동배치 기능을 꺼준다.
		f.setLayout(null);// *중요*
		
		//프레임에 추가할 버튼 생성
		Button btnOk = new Button("확인");
		btnOk.setBounds(70, 90, 100, 50); // x좌표, y좌표, 넓이, 높이
		
		Button btnClose = new Button("닫기");
		btnClose.setBounds(230, 90, 100, 50);
		
		
		f.add(btnOk); // 프레임은 add가 됐을때 안에 들어가는 자식들을 모든 화면에 꽉 채울수 있게 자동으로 만들어 준다.
		              //그렇기 때문에 setLayout(null) 메서드를 사용해야 한다.
		
		f.add(btnClose);
		
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			};
			
		});
		
		
	}

}
