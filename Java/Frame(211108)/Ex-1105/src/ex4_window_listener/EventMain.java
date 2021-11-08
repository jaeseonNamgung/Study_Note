package ex4_window_listener;
import java.awt.Frame;
public class EventMain {
	public static void main(String[] args) {
		Frame f= new Frame("이벤트2");
		f.setBounds(500, 400, 300, 200);
		
		//f에 이벤트 감지자 추가
		f.addWindowListener(new XClickListener());
		
		f.setVisible(true);
	}

}
