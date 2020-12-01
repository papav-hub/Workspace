package javaH2;

import java.awt.*;
import javax.swing.*;

class TimerRunnable implements Runnable {
	private JLabel timerLabel;
	private int temp;
	
	public TimerRunnable(JLabel timerLabel, int temp) {
		this.timerLabel = timerLabel;
		this.temp = temp;
		
	}
	
	public void run() {
		int n = 0;
		while(true) {
			timerLabel.setText(Integer.toString(n));
			n++;
			try {
				Thread.sleep(temp);
			}catch(InterruptedException e) {
				return;
			}
		}
	}
}

public class Ex13_2RunnableTimerEx extends JFrame{
	
	public Ex13_2RunnableTimerEx() {
		setTitle("Runnable을 구현한 타이머 스레드 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		c.add(timerLabel);		
		TimerRunnable r = new TimerRunnable(timerLabel, 10);
		Thread th = new Thread(r);
		
		JLabel timerLabelone = new JLabel();
		timerLabelone.setFont(new Font("Gothic", Font.ITALIC, 80));
		c.add(timerLabelone);		
		TimerRunnable rone = new TimerRunnable(timerLabelone, 100);
		Thread thone = new Thread(rone);
		
		JLabel timerLabeltwo = new JLabel();
		timerLabeltwo.setFont(new Font("Gothic", Font.ITALIC, 80));
		c.add(timerLabeltwo);		
		TimerRunnable rtwo = new TimerRunnable(timerLabeltwo, 1000);
		Thread thtwo = new Thread(rtwo);
		
		setSize(500, 500);
		setVisible(true);
		
		th.start();
		thone.start();
		thtwo.start();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex13_2RunnableTimerEx();
	}

}
