package javaH;

class pPoint{
	private int x, y; // �� ���� �����ϴ� x, y ��ǥ
	public void set(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void showPoint() { // ���� ��ǥ ���
		System.out.println("(" + x + ", " + y + ")");
	}
}

class cColorPoint extends pPoint{
	private String color; // ���� ��
	public void setColor(String color) {
		this.color = color;
	}
	public void showColorPoint() { // �÷� ���� ��ǥ ���
		System.out.println(color);
		showPoint(); // Point Ŭ������ showPoint() ȣ��
	}
}

public class Ex5_1 { //Ex5_1 = ColorPointEx
	public static void main(String [] args) {
		pPoint p = new pPoint(); //Point ��ü ����
		p.set(1,  2); // Point Ŭ������ set() ȣ��
		p.showPoint();
		
		System.out.println();
		
		cColorPoint cp = new cColorPoint(); // ColorPoint ��ü ����
		cp.set(3,  4); //Point�� set() ȣ��
		cp.setColor("red"); // ColorPoint��  setColor() ȣ��
		cp.showColorPoint(); // �÷��� ��ǥ ���
	}

}
