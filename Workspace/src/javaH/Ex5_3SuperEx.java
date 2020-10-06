package javaH;


class Point{
	private int x, y; // 한 점을 구성하는 x, y 좌표
	public Point() {
		this.x = this.y = 0;
	}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void showPoint() { // 점의 좌표 출력
		System.out.println("(" + x + ", " + y + ")");
	}
}

class ColorPoint extends Point{
	private String color; // 점의 색
	public ColorPoint(int x, int y, String color) {
		super(x, y);// 사용하지 않았다면 showPoint()에서 (0, 0)이 나올 것이다.
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
