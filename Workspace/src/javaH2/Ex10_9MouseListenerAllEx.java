package javaH2;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Ex10_9MouseListenerAllEx extends JFrame {
	
	private JLabel la = new JLabel("No Mouse Event");
	
	public Ex10_9MouseListenerAllEx() {
		setTitle("MouseListener & MouseMotionListener Ex");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		MyMouseListener l = new MyMouseListener();
		c.addMouseListener(l);
		c.addMouseMotionListener(l);
		
		c.add(la);
		
		setSize(300, 200);
		setVisible(true);
	}
	
	class MyMouseListener implements MouseListener, MouseMotionListener{

		@Override
		public void mouseDragged(MouseEvent e) {
			// TODO Auto-generated method stub
			la.setText("MouseDragged (" + e.getX() + ", " + e.getY() + ")");
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub
			la.setText("MouseMoved (" + e.getX() + ", " + e.getY() + ")");
		}

		@Override
		public void mouseClicked(MouseEvent e) {}

		@Override
		public void mousePressed(MouseEvent e) {
			la.setText("MousePressed (" + e.getX() + ", " + e.getY() + ")");
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			la.setText("MouseReleased (" + e.getX() + ", " + e.getY() + ")");
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			Component c = (Component)e.getSource();
			c.setBackground(Color.cyan);
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			Component c = (Component)e.getSource();
			c.setBackground(Color.yellow);
			
		}
		//10 13
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex10_9MouseListenerAllEx();

	}

}
