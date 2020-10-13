package javaH;

interface Shape{
	final double PI = 3.14; //상수
	void draw(); //추상 메소드
	double getArea(); //추상 메소드
	default public void redraw() { //디폴트 메소드
		System.out.print("---다시 그립니다.");
		draw();
	}
}

class Circle implements Shape{
	private int n;
	Circle(int n){
		this.n = n;
	}
	public void draw() {
		System.out.println("반지름이 " + n + "인 원 입니다.");
	}
	public double getArea() {
		return Shape.PI * n * n;
	}
}

public class BookEx321pg_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape donut = new Circle(10); //반지름이 10인 원 객체
		donut.redraw();
		System.out.println("면적은 " + donut.getArea());
	}

}
