package javaH2;

import java.awt.*;
import javax.swing.*;
//레이블 여러개 만들어서 해보기

class TimerThread extends Thread{
	private JLabel timerLabel;
	private int time;
	
	public TimerThread(JLabel timerLabel, int time) {
		this.timerLabel = timerLabel;
		this.time = time;
	}
	
	public void run() {
		int n= 0;
		while(true) {
			timerLabel.setText(Integer.toString(n));
			n++;
			try {
				Thread.sleep(time);
			}catch(InterruptedException e) {
				return;
			}
		}
	}
}
public class Ex13_1 extends JFrame {

	public Ex13_1() {
		setTitle("Thread를 상속받은 타이머 스레드 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		c.add(timerLabel);
		
		TimerThread th = new TimerThread(timerLabel, 100);
		
		
		JLabel timerLabelone = new JLabel();
		timerLabelone.setFont(new Font("Gothic", Font.ITALIC, 80));
		c.add(timerLabelone);
		
		TimerThread thone = new TimerThread(timerLabelone, 200);
		
		
		setSize(300, 170);
		setVisible(true);
		
		th.start();
		thone.start();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex13_1();

	}

}
