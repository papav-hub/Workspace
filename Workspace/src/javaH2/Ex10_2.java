package javaH2;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Ex10_2 extends JFrame{
	
	public Ex10_2() {
		setTitle("Action 이벤트 리스너 예제");
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
		
		// Action 리스너를 내부 클래스로 작성
		// private으로 선언하여 Innerclass외부에서 사용할 수 없게 함
		// 리스너에서 InnerClass리스너의 멤버에 대한 접근 용이

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JButton b = (JButton)e.getSource();
			
			
			if(b.getText().equals("Action")) {
				b.setText("액션");
			}else {
				b.setText("Action");
			}
			
			Ex10_2.this.setTitle(b.getText()); // InnerClassLisetener(Ex10_2)의 멤버나 JFrame의 멤버를 호출할 수 있음
			// 프레임 타이틀에 버튼 문자열을 출력한다.
		}
	}

}