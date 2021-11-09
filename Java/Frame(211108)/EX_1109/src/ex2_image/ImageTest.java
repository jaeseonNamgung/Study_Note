package ex2_image;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class ImageTest {
	public static void main(String[] args) {
		Frame frame = new Frame();
		frame.setBounds(600, 200, 400, 600);
		frame.setLayout(null);

		// 버튼으로 사용할 이미지 가져오기
		ImageIcon img2 = new ImageIcon("img2.png");
		JButton btn = new JButton();
		btn.setIcon(img2);
		btn.setBounds(20, 300, 150, 150);

		frame.add(btn);

		// 배경으로 이미지 가져오기
		ImageIcon img = new ImageIcon("img.png");
		JLabel jl = new JLabel(img);
		jl.setBounds(0, 0, 400, 600);

		frame.setVisible(true);

		frame.add(jl);
		// ------------------------

		// ----------------------------------------------------------
		// x버튼 눌렀을 때 종료
		frame.addWindowListener(new WindowAdapter() {

			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}

		});
	}

}
