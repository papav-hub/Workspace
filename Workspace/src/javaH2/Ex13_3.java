package javaH2;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.*;

class FlickeringLabel extends JLabel implements Runnable{
	private long delay;
	public FlickeringLabel(String text, long delay) {
		super(text);
		
		this.delay = delay;
		setOpaque(true);
		Thread th = new Thread(this);
		th.start();
	}
	
	public void run() {
		int n = 0;
		int nn = 0;
		while(true) {

			if(n==0) {
				setBackground(Color.yellow);
				setLocation(0, 0);
			}else {
				setBackground(Color.green);
				setLocation(0, 100);
			}
			
			if(n==0) {
				n = 1;
			}else {
				n=0;
			}
			
			try {
				Thread.sleep(delay);
			}catch(InterruptedException e) {
				return;
			}
		}
	}
}

class FlickeringLabelone extends JLabel implements Runnable{
	private long delay;
	public FlickeringLabelone(String text, long delay) {
		super(text);
		this.delay = delay;
		setOpaque(true);
		Thread th = new Thread(this);
		th.start();
	}
	
	public void run() {
		int n = 0;
		while(true) {
			if(n==0) {
				setBackground(Color.yellow);
				setLocation(150, 0);
			}else {
				setBackground(Color.green);
				setLocation(220, 0);
			}
			
			if(n==0) {
				n = 1;
			}else {
				n=0;
			}
			
			try {
				Thread.sleep(delay);
			}catch(InterruptedException e) {
				return;
			}
		}
	}
}

public class Ex13_3 extends JFrame{
	
	private JLabel la = new JLabel("¾È±ôºý");
	
	public Ex13_3() {
		setTitle("FlickeringLabelEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		FlickeringLabel fLabel = new FlickeringLabel("±ôºý", 500);
		c.addKeyListener(new Mykey());
		FlickeringLabelone fLabel2 = new FlickeringLabelone("¿©±âµµ ±ôºý", 300);
		
		c.add(fLabel);

		c.add(la);
		c.setFocusable(true);
		c.requestFocus();
		
		c.add(fLabel2);
		
		setSize(300, 150);
		setVisible(true);
	}
	
	class Mykey extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			int k = e.getKeyCode();
			
			if(k=='w') {
				la.setLocation(la.getX(), la.getY() - 10);
			}else if(k=='s') {
				la.setLocation(la.getX(), la.getY() + 10);
			}else if(k=='a') {
				la.setLocation(la.getX()-10, la.getY());
			}else if(k=='d') {
				la.setLocation(la.getX()+ 10, la.getY());
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex13_3 ();
	}

}
