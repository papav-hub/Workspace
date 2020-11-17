package javaH2;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Ex10_1 extends JFrame{
	
	public Ex10_1() {
		setTitle("Action �̺�Ʈ ������ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JButton btn = new JButton("Action");
		btn.addActionListener(new MyActionListener());
		c.add(btn);
		
		
		JButton btn2 = new JButton("�׼�");
		btn2.addActionListener(new MyActionListener());
		c.add(btn2);
		
		
		setSize(350, 150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex10_1();

	}

}


class MyActionListener implements ActionListener{ // ���� class

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton b = (JButton)e.getSource();
		
		
		if(b.getText().equals("Action")) {
			b.setText("�׼�");
		}else {
			b.setText("Action");
		}
	}
}
