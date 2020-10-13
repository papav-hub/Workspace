package javaH;

interface Shape{
	final double PI = 3.14; //���
	void draw(); //�߻� �޼ҵ�
	double getArea(); //�߻� �޼ҵ�
	default public void redraw() { //����Ʈ �޼ҵ�
		System.out.print("---�ٽ� �׸��ϴ�.");
		draw();
	}
}

class Circle implements Shape{
	private int n;
	Circle(int n){
		this.n = n;
	}
	public void draw() {
		System.out.println("�������� " + n + "�� �� �Դϴ�.");
	}
	public double getArea() {
		return Shape.PI * n * n;
	}
}

public class BookEx321pg_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape donut = new Circle(10); //�������� 10�� �� ��ü
		donut.redraw();
		System.out.println("������ " + donut.getArea());
	}

}
