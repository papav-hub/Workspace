import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.*;
import java.awt.event.*;
import java.awt.geom.Ellipse2D;
import java.awt.*;
import java.util.Calendar;
import java.awt.Toolkit;


public class Book533pg_7 extends JFrame{
	public JLabel title = new JLabel("수식입력 ");
	public JLabel text = new JLabel(" ");
	
	public class RoundButton extends JButton { // 동그라미 버튼 만들기
		 public RoundButton(String label) { 
			 super(label); 
	 
			 Dimension size = getPreferredSize(); 
			 size.width = size.height = Math.max(size.width, size.height); 
			 setPreferredSize(size); 
	 
			 setContentAreaFilled(false); 
		 } 

		 protected void paintComponent(Graphics g) { 
			 if (getModel().isArmed()) { 
			  g.setColor(Color.black); 
			 } else { 
			  g.setColor(getBackground()); 
			 } 
			 g.fillOval(0, 0, getSize().width-1, getSize().height-1); 		 
			 super.paintComponent(g); 
		 } 

		 protected void paintBorder(Graphics g) { 
			 g.setColor(getForeground()); 
			 g.drawOval(0, 0, getSize().width-1, getSize().height-1); 
		 } 

		 Shape shape; 
		 public boolean contains(int x, int y) { 
			 if (shape == null || !shape.getBounds().equals(getBounds())) { 
			  shape = new Ellipse2D.Float(0, 0, getWidth(), getHeight()); 
			 } 
			 return shape.contains(x, y); 
		 } 
	}
	
	class up extends JPanel{
		public up() {
			setBackground(Color.black);

			Font tt = new Font("맑은 고딕", Font.BOLD, 20);
			title.setFont(tt);
			title.setForeground(Color.white);
			add(title);
			
			Font t = new Font("맑은 고딕", Font.BOLD, 50);
			text.setFont(t);
			text.setForeground(Color.white);
			text.setHorizontalAlignment(JLabel.RIGHT);
			add(text);			
			
			addKeyListener(new Mykey());
			setLayout(new GridLayout(2, 1));
			
			setFocusable(true);
			requestFocus();
		}
		
		class Mykey extends KeyAdapter{ // 키보드키보드키보드키보드키보드키보드키보드키보드키보드키보드키보드키보드키보드키보드키보드키보드키보드키보드
			public void keyPressed(KeyEvent e) {
				
				char keyChar = e.getKeyChar();// 문자키이면 유니코드 리턴
				int keyCode = e.getKeyCode(); // 모든 키에 대해 작동 
								
				if(keyCode==10) { // enter
					title.setText(text.getText());
					ScriptEngineManager mgr = new ScriptEngineManager();
					ScriptEngine engine = mgr.getEngineByName("JavaScript");
					String fomula = text.getText();
					try {
						int r = (int) engine.eval(fomula);
						text.setText(Integer.toString(r));
					} catch (ScriptException e1) {
						e1.printStackTrace();
					}
				}else if (keyCode==27) {// esc
					title.setText("수식 입력 ");
					text.setText(" ");	
				}else if (keyCode == 8) {// backspace
					String sub = text.getText();
					int length = sub.length();
					text.setText(sub.substring(0, length-1));
				}else {
					title.setText("수식을 계산중입니다.");
					String a = text.getText();
					String b = Character.toString(keyChar);
					String c = a + b;
					text.setText(c);
				}
				if(title.getText().equals(text.getText())) {
					title.setText("수식을 계산할 수 없습니다.");
					text.setText(" ");
				}
			}
		}
	}
	
	public JButton[] number = new JButton[10];
	public JButton a[] = {new RoundButton("C"), new RoundButton("+/-"), new RoundButton("enter"), new RoundButton("<-")};
	public JButton b[] = {new RoundButton("7"), new RoundButton("8"), new RoundButton("9"), new RoundButton("/")};
	public JButton c[] = {new RoundButton("4"), new RoundButton("5"), new RoundButton("6"), new RoundButton("*")};
	public JButton d[] = {new RoundButton("1"), new RoundButton("2"), new RoundButton("3"), new RoundButton("-")};
	public JButton ee[] = {new RoundButton("0"), new RoundButton("."), new RoundButton("="), new RoundButton("+")};

	class center extends JPanel{
		
		public center() {
			
			setLayout(new GridLayout(5, 4, 5, 5));
			setBackground(Color.BLACK);
			
			Font aa = new Font("맑은 고딕", Font.BOLD, 20);
			
			for(int i=0 ; i<4 ; i++) {
				a[i].setFont(aa);
				a[i].setForeground(Color.black);
				a[i].setBackground(Color.white);
				a[i].addActionListener(new MyAction());
				add(a[i]);
			}
			a[3].setForeground(Color.white);
			a[3].setBackground(Color.orange);
			for(int i=0 ; i<4 ; i++) {
				b[i].setFont(aa);
				b[i].setForeground(Color.white);
				b[i].setBackground(Color.gray);
				b[i].addActionListener(new MyAction());
				add(b[i]);
			}
			b[3].setBackground(Color.orange);
			for(int i=0 ; i<4 ; i++) {
				c[i].setFont(aa);
				c[i].setForeground(Color.white);
				c[i].setBackground(Color.gray);
				c[i].addActionListener(new MyAction());
				add(c[i]);
			}
			c[3].setBackground(Color.orange);
			for(int i=0 ; i<4 ; i++) {
				d[i].setFont(aa);
				d[i].setForeground(Color.white);
				d[i].setBackground(Color.gray);
				d[i].addActionListener(new MyAction());
				add(d[i]);
			}
			d[3].setBackground(Color.orange);
			for(int i=0 ; i<4 ; i++) {
				ee[i].setFont(aa);
				ee[i].setForeground(Color.white);
				ee[i].setBackground(Color.gray);
				ee[i].addActionListener(new MyAction());
				add(ee[i]);
			}	
			ee[3].setBackground(Color.orange);
		}
		
		class MyAction implements ActionListener{ // 버튼버튼버튼버튼버버튼버튼버튼튼버튼버튼버튼버튼버튼버튼버튼버튼버튼버튼버튼버튼버튼버튼버튼버튼버튼버튼버튼
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				String bb = b.getText();
				
				if(bb.equals("=")) { // enter
					title.setText(text.getText());
					ScriptEngineManager mgr = new ScriptEngineManager();
					ScriptEngine engine = mgr.getEngineByName("JavaScript");
					String fomula = text.getText();
					try {
						int r = (int) engine.eval(fomula);
						text.setText(Integer.toString(r));
					} catch (ScriptException e1) {
						e1.printStackTrace();
					}
				}else if (bb.equals("C")) {// esc
					title.setText("수식 입력 ");
					text.setText(" ");
				}else if (bb.equals("<-")) {// backspace
					String sub = text.getText();
					int length = sub.length();
					text.setText(" " + sub.substring(0, length-1));
				}else if (bb.equals("+/-")) {// +/-
					String sub = text.getText();
					int length = sub.length();
					if(sub.substring(0, 0).equals("-")) {
						sub = sub.substring(1, length);
					}else {
						sub = "-" + text.getText();
					}
					text.setText(sub);
				}else {
					title.setText("수식을 계산중입니다.");
					String a = text.getText();
					String bbb = bb;
					String c = a + bbb;
					text.setText(c);
				}
				if(title.getText().equals(text.getText())) {
					title.setText("수식을 계산할 수 없습니다.");
					text.setText(" ");
				}
				
			}
		}
	}
	
	class south extends JPanel implements Runnable{ // 시계
		private Thread thread;
		private JLabel label;
		public south() {
			//super("디지털 시계");
			setLayout(new FlowLayout());
			
			label = new JLabel();
			
			if(thread == null) {
				thread = new Thread(this);
				thread.start();
			}
			add(label);
		}
		@Override
		public void run() {
			while(true) {
				Calendar cal = Calendar.getInstance();
				String now = cal.get(Calendar.YEAR)+"년"+(cal.get(Calendar.MONTH)+1)+"월"+cal.get(Calendar.DATE)+"일"+cal.get(Calendar.HOUR)+"시"+cal.get(Calendar.MINUTE)+"분"+cal.get(Calendar.SECOND)+"초";
				label.setText(now);
				label.setForeground(Color.white);
				setBackground(Color.black);
				try {
					Thread.sleep(1000);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}

			}
			
		}
	}
	
	
	public Book533pg_7() {
		setTitle("2019156037 최혜민");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		
		up u = new up();
		c.add(u, BorderLayout.NORTH);
		center cc = new center();
		c.add(cc, BorderLayout.CENTER);
		
		south s = new south();
		c.add(s, BorderLayout.SOUTH);
				
		setSize(300, 500);
		setVisible(true);
	}

	public static void main(String[] args) {
		//JFrame.setDefaultLookAndFeelDecorated(true); // 엥 창 위에 바 이상한걸로 나옴,,,
		new Book533pg_7();

	}
}
