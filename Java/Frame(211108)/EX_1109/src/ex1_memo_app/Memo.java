package ex1_memo_app;

import java.awt.Button;
import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileWriter;

import javax.swing.JOptionPane;

public class Memo {
	public static void main(String[] args) {
		Frame frame = new Frame("간단 메모장");
		frame.setBounds(600,200,250, 400);
		frame.setLayout(null);
		
		Font font = new Font("궁서", Font.PLAIN, 20);
		
		//키보드의 값을 입력받기 위한 클래스
		TextField tf = new TextField();
		tf.setFont(font);
		tf.setBounds(10, 35, 150, 30);
		
		// 버튼
		Button btnOk = new Button("입력");
		btnOk.setBounds(165, 33, 75, 30);
		btnOk.setEnabled(false); // 버튼 클릭 비활성
		
		// TextField 처럼 키보드 값을 받을 수 있으나, 세로로 넓은 영역을 포함하는 클래스
		TextArea ta = new TextArea("", 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
		ta.setBackground(Color.LIGHT_GRAY);
		ta.setBounds(5, 70, 240, 275);
		ta.setEditable(false); // TextArea에 텍트스를 직접 입력받지 못한다.
		
		Button btnSave = new Button("저장");
		btnSave.setBounds(75, 353, 100, 30);
		
		frame.add(btnOk);
		frame.add(tf); // 프레임에 TextField 추가
		frame.add(ta); // 프레임에 TextArea 추가
		frame.add(btnSave); // 프레임에 Button 추가
		
	    //TODO : 이벤트 처리
		// tf에 값이 들어가 있는 경우에만 입력 버튼 활성화
		tf.addTextListener(new TextListener() {
			
			@Override
			public void textValueChanged(TextEvent e) {
				if(tf.getText().trim().equals("")) {
					btnOk.setEnabled(false);
				}else {
					btnOk.setEnabled(true);
				}
			}
		});
		
		//입력버튼 클릭시 tf의 값을 ta에 추가
		btnOk.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				// ta.setText(tf.getText());
				
				ta.append(tf.getText() + "\n");
				
				tf.setText("");
				tf.requestFocus(); //TextField로 커서가 이동
				
			}
		});
		
		// 엔터값 입력시 입력 버튼 클릭했을때와 같은 결과를 만들자
		
		tf.addKeyListener(new KeyAdapter() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				
				if(e.getKeyChar() == KeyEvent.VK_ENTER) {
					
					ta.append(tf.getText() + "\n");
					
					tf.setText("");
					tf.requestFocus(); //TextField로 커서가 이동
					
				}
			}
			
		});
		
		//저장버튼 클릭 이벤트 감지
		btnSave.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TextArea의 값(내용)
				String msg = ta.getText();
				try {
					//저장경로 지정
					FileDialog fd = 
							new FileDialog(frame, "저장", FileDialog.SAVE);
					fd.setVisible(true);
					
					String path = fd.getDirectory() + fd.getFile(); // 저장 폴더를 가지고 오는 메서드
					
					// 취소 버튼을 눌렀을 때
		
						FileWriter fw = new FileWriter(path);
						fw.write(msg);
						
						fw.close();
						
						if(fd.getFile() == "true") {	
							JOptionPane.showMessageDialog(frame, "저장취소");
					}else {
						JOptionPane.showMessageDialog(frame, "저장완료");
						
					}
					
					
				} catch (Exception e2) {
					// TODO: handle exception
				}
				
			}
		});
		//------------------------------------------------------------------
		frame.setResizable(false);  //프레임의 크기변경 불가 
		frame.setVisible(true);
		
		frame.addWindowListener(new WindowAdapter() {
			
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
		
		
	}//main

}
