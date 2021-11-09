package frameWork;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FrameWork {
	public static void main(String[] args) {
		Frame f = new Frame("로그인");
		f.setBounds(521, 162, 500, 500);
		f.setLayout(null);

		f.setVisible(true);

		Button bLeft = new Button("입장");
		Button bRight = new Button("종료");

		bLeft.setBounds(50, 400, 150, 50);
		bRight.setBounds(300, 400, 150, 50);

		f.add(bLeft);
		f.add(bRight);
		
		ActionListener al = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String str = e.getActionCommand();
				
				if(str.equals("입장")) {
					
					Frame fn = new Frame("내부 프레임");
					fn.setBounds(621, 261, 300,300);
					
					fn.setVisible(true);
					
					fn.addWindowListener(new WindowAdapter() {
						
						@Override
						public void windowClosing(WindowEvent e) {
							fn.dispose();
						}
						
					});
				}
				
			}
		};
		
		bLeft.addActionListener(al); //버튼기능 연동

		f.addWindowListener(new WindowAdapter() {

			public void windowClosing(WindowEvent e) {

				System.exit(0);

			};

		});

	}
}
