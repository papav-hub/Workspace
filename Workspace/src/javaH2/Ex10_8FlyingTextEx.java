package javaH2;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Ex10_8FlyingTextEx extends JFrame {
	
	private final int FLYING_UNIT=10;
	private JLabel la = new JLabel("HELLO");
	
	static int xpos;
	static int ypos;
	
	public Ex10_8FlyingTextEx () {
		setTitle("상, 하, 좌, 우 키를 이용하여 텍스트 움직이기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		c.addKeyListener(new MyKeyListener());
		
		la.setLocation(50, 50);
		la.setSize(100, 20);
		c.add(la);
		
		setSize(300, 300);
		
		Dimension dimen1 = c.getSize();
		xpos = (int)dimen1.getWidth();
		ypos = (int)dimen1.getHeight();

		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
		
		c.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e) {
				Component com = (Component)e.getSource();
				com.setFocusable(true);
				com.requestFocus();
			}
		});
	}
	
	class MyKeyListener extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();
					
			
			switch(keyCode) {
			case KeyEvent.VK_UP:
				//if(la.getY()-FLYING_UNIT < 0) {
				//	la.setLocation(la.getX(), la.getY()-FLYING_UNIT + ypos);
				//}else {
					la.setLocation(la.getX(), la.getY()-FLYING_UNIT);
				//}
				break;
			case KeyEvent.VK_DOWN:
				//if(la.getY()-FLYING_UNIT > ypos) {
				//	la.setLocation(la.getX(), la.getY()-FLYING_UNIT - ypos);
				//}else {
					la.setLocation(la.getX(), la.getY()-FLYING_UNIT);
				//}
				break;
			case KeyEvent.VK_LEFT:
				//if(la.getX() < 0) {
				//	la.setLocation(la.getX() + xpos, la.getY()-FLYING_UNIT - ypos);
				//}else {
					la.setLocation(la.getX(), la.getY()-FLYING_UNIT);
				//}
				break;
			case KeyEvent.VK_RIGHT:
				//if(la.getX() > xpos) {
				//	la.setLocation(la.getX() - xpos, la.getY()-FLYING_UNIT - ypos);
				//}else {
					la.setLocation(la.getX(), la.getY()-FLYING_UNIT);
				//}
				break;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Ex10_8FlyingTextEx();

	}

}
