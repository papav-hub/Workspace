package javaH2;

import javax.swing.*;
import java.awt.*;

public class Ex9_2ContentPaneEx extends JFrame{
	
	public Ex9_2ContentPaneEx() {
		setTitle("ContentPane�� JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ������ â ����� ���μ������� ����ϰ� ������ �� �ִ�.
		
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
