package javaH2;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


class up extends JPanel{
	public JLabel title = new JLabel("수식입력");
	public JLabel text = new JLabel("");
	public JTextField field = new JTextField(13);
	public up() {
		setBackground(Color.pink);
		add(title);
		add(text);
		addKeyListener(new Mykey());
		setLayout(new FlowLayout());
		
		setFocusable(true);
		requestFocus();
	}
	
	class Mykey extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			char keyChar = e.getKeyChar();// 문자키이면 유니코드 리턴
			int keyCode = e.getKeyCode(); // 모든 키에 대해 작동 
			
			
			if(keyCode==10) { // enter
				ScriptEngineManager mgr = new ScriptEngineManager();
				ScriptEngine engine = mgr.getEngineByName("JavaScript");
				String fomula = text.getText();
				try {
					int r = (int) engine.eval(fomula);
					title.setText(Integer.toString(r));
				} catch (ScriptException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}else if (keyCode==27) {// esc
				text.setText("");
			
			}else {
				String a = text.getText();
				String b = Character.toString(keyChar);
				String c = a + b;
				text.setText(c);
			}
		}
	}
}

class center extends JPanel{
	
	public JButton[] number = new JButton[10];
	public JButton CE = new JButton("CE");
	public JButton cal = new JButton("계산");
	public JButton b[] = {new JButton("+"), new JButton("-"), new JButton("*"), new JButton("/")};
	public JButton c[] = {new JButton("^"), new JButton("."), new JButton("!"), new JButton("<-")};
	
	public center() {		
		setLayout(new GridLayout(5, 4, 2, 2));
		
		for(int i=0 ; i<10 ; i++){
			String a = String.valueOf(i);
			number[i] = new JButton(a);
			add(number[i]);
		}
		
		add(CE);
		add(cal);		
		
		for(int i=0 ; i<b.length ; i++) {
			b[i].setBackground(Color.green);
			add(b[i]);
		}
				
		for(int i=0 ; i<c.length ; i++) {
			c[i].setBackground(Color.CYAN);
			add(c[i]);
		}
	}
	
}

class down extends JPanel{
	public JTextField field = new JTextField(13);
	public down(){
		setBackground(Color.yellow);
		Font f = new Font("맑은 고딕", Font.BOLD, 15);
		
		
		JLabel l = new JLabel("계산결과");
		l.setFont(f);
		l.setForeground(Color.RED);
		add(l);
		add(field);
		setLayout(new FlowLayout());
		
	}
}

public class Book533pg_7 extends JFrame{
	
	public Book533pg_7() {
		setTitle("2019156037 최혜민");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		Container c = getContentPane();
		
		c.add(new up(), BorderLayout.NORTH);
		c.add(new center(), BorderLayout.CENTER);
		c.add(new down(), BorderLayout.SOUTH);
				
		setSize(300, 250);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Book533pg_7();

	}

}
