package javaH2;

import javax.swing.*;
import java.awt.*;

public class Ex9_2ContentPaneEx extends JFrame{
	
	public Ex9_2ContentPaneEx() {
		setTitle("ContentPane과 JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 윈도우 창 종료시 프로세스까지 깔끔하게 종료할 수 있다.
		
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.pink);
		contentPane.setLayout(new FlowLayout());
		
		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JButton("Ignore"));
		
		setSize(500, 150);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex9_2ContentPaneEx();

	}

}
