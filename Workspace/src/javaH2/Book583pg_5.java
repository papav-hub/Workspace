package javaH2;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Book583pg_5 extends JFrame{
	private JLabel la = new JLabel("Love Java");
	
	public Book583pg_5() {
		setTitle("+,-키로 폰트 크기 조절");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		la.setFont(new Font("Arial", Font.PLAIN, 10));
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.addKeyListener(new Mykey());
		c.addMouseListener(new MyMouse());
		c.add(la);
		
		
		setSize(300, 200);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Book583pg_5();

	}

	class Mykey extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			
			Font f = la.getFont();
			int size = f.getSize();
			if(e.getKeyChar() == '+') {
				la.setFont(new Font("Arial", Font.PLAIN, size+5));
			}else if((e.getKeyChar() == '-')&&(size>=10)) {
				la.setFont(new Font("Arial", Font.PLAIN, size-5));
			}
		}
	}
	
	class MyMouse extends MouseAdapter{
		public void mouseClicked(MouseEvent e) {
			if(e.getClickCount()==2) {
				int r = (int)(Math.random()*256);
				int g = (int)(Math.random()*256);
				int b = (int)(Math.random()*256);
				
				Font f = la.getFont();
				la.setForeground(new Color(r, g, b));
			}
		}
	}
}
