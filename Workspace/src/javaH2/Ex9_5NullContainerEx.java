package javaH2;

import javax.swing.*;
import java.awt.*;

public class Ex9_5NullContainerEx extends JFrame{
	
	public Ex9_5NullContainerEx() {
		setTitle("Null Container Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		JLabel la = new JLabel("Hello, Press Buttons!");
		
		la.setLocation(130, 50);
		c.add(la);
		
		for(int i=1 ; i<=9 ; i++) {
			JButton b = new JButton(Integer.toString(i));
			b.setLocation(i*15, i*15);
			c.add(b);
		}
		
		setSize(300, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex9_5NullContainerEx();

	}

}
