package javaH;


class Point{
	private int x, y; // �� ���� �����ϴ� x, y ��ǥ
	public Point() {
		this.x = this.y = 0;
	}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void showPoint() { // ���� ��ǥ ���
		System.out.println("(" + x + ", " + y + ")");
	}
}

class ColorPoint extends Point{
	private String color; // ���� ��
	public ColorPoint(int x, int y, String color) {
		super(x, y);// ������� �ʾҴٸ� showPoint()���� (0, 0)�� ���� ���̴�.
		this.color = color;
	}
	public void showColorPoint() {
		System.out.println(color);
		showPoint();
	}
}

public class Ex5_3SuperEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ColorPoint cp = new ColorPoint(5, 6, "blue");
		cp.showColorPoint();

	}

}
