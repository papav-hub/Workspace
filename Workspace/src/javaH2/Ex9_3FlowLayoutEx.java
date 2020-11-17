package javaH2;

import javax.swing.*;
import java.awt.*;

public class Ex9_3FlowLayoutEx extends JFrame {
	
	public Ex9_3FlowLayoutEx() {
		setTitle("FlowLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		//c.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 50));
		c.setLayout(new BorderLayout(30, 40));
		
		//c.add(new JButton("add"));
		//c.add(new JButton("sub"));
		//c.add(new JButton("mul"));
		//c.add(new JButton("div"));
		//c.add(new JButton("Calculate"));
		
		
		c.add(new JButton("add"), BorderLayout.NORTH);
		c.add(new JButton("sub"), BorderLayout.SOUTH);
		c.add(new JButton("div"), BorderLayout.WEST);
		c.add(new JButton("mul"), BorderLayout.EAST);
		c.add(new JButton("Calculate"), BorderLayout.CENTER);
		
		
		
		setSize(300, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Ex9_3FlowLayoutEx();

	}

}
