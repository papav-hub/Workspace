package javaH2;

import javax.swing.*;
import java.awt.*;

class up extends JPanel{
	public up() {
		setBackground(Color.pink);
		add(new JLabel("수식 입력"));
		add(new JTextField(20));
		setLayout(new FlowLayout());
	}
}

class center extends JPanel{
	public center() {
	
		setLayout(new GridLayout(5, 4, 2, 2));
		add(new JButton("0"));
		add(new JButton("1"));
		add(new JButton("2"));
		add(new JButton("3"));
		add(new JButton("4"));
		add(new JButton("5"));
		add(new JButton("6"));
		add(new JButton("7"));
		add(new JButton("8"));
		add(new JButton("9"));
		add(new JButton("CE"));
		add(new JButton("계산"));
		
		
		JButton b[] = {new JButton("+"), new JButton("-"), new JButton("*"), new JButton("/")};
		for(int i=0 ; i<b.length ; i++) {
			b[i].setBackground(Color.green);
			add(b[i]);
		}
		
		
		JButton c[] = {new JButton("ln"), new JButton("log"), new JButton("!"), new JButton("<-")};
		for(int i=0 ; i<c.length ; i++) {
			c[i].setBackground(Color.CYAN);
			add(c[i]);
		}
	}
}

class down extends JPanel{
	public down(){
		setBackground(Color.yellow);
		Font f = new Font("MD개성체 보통", Font.BOLD, 15);
		JLabel l = new JLabel("계산결과");
		l.setFont(f);
		l.setForeground(Color.RED);
		add(l);
		add(new JTextField(13));
		setLayout(new FlowLayout());
		
	}
}

class east extends JPanel{
	public east() {
		setLayout(new GridLayout(1, 1, 5, 5));
		add(new JButton("기록"));
	}
}

public class Book533pg_7 extends JFrame{
	
	public Book533pg_7() {
		setTitle("계산기 프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		
		Container c = getContentPane();
		c.add(new up(), BorderLayout.NORTH);
		c.add(new center(), BorderLayout.SOUTH);
		c.add(new down(), BorderLayout.CENTER);
		c.add(new east(), BorderLayout.EAST);
		
		
		setSize(300, 250);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Book533pg_7();

	}

}
