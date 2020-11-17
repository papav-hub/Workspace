package javaH2;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Ex10_2 extends JFrame{
	
	public Ex10_2() {
		setTitle("Action �̺�Ʈ ������ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JButton btn = new JButton("Action");
		btn.addActionListener(new MyActionListener());
		c.add(btn);
		
		
		setSize(350, 150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex10_2();
	}
	
	private class MyActionListener implements ActionListener{
		
		// Action �����ʸ� ���� Ŭ������ �ۼ�
		// private���� �����Ͽ� Innerclass�ܺο��� ����� �� ���� ��
		// �����ʿ��� InnerClass�������� ����� ���� ���� ����

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JButton b = (JButton)e.getSource();
			
			
			if(b.getText().equals("Action")) {
				b.setText("�׼�");
			}else {
				b.setText("Action");
			}
			
			Ex10_2.this.setTitle(b.getText()); // InnerClassLisetener(Ex10_2)�� ����� JFrame�� ����� ȣ���� �� ����
			// ������ Ÿ��Ʋ�� ��ư ���ڿ��� ����Ѵ�.
		}
	}

}