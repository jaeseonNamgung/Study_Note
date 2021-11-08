package ex5_window_adapter;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameMain {
	public static void main(String[] args) {
	   
		Frame f = new Frame("에딥터 활용");
		
		f.setBounds(500, 400, 300, 200);
		
//		WindowAdapter wa = new WindowAdapter() {
//			public void windowClosing(WindowEvent e) {
//				System.exit(0);
//
//			}
//		};
//		
//		f.addWindowListener(wa);
		
		f.addWindowListener(new WindowAdapter() {

			public void windowClosing(WindowEvent e) {

				System.out.println("종료");
				System.exit(0);

			};

		});
		
		f.setVisible(true);
		
	}

}
