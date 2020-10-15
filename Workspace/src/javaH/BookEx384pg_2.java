package javaH;

class Circleee{
	int x;
	int y;
	int radius;
	public Circleee(int x, int y, int radius){
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	public boolean equals(Object obj) {
		Circleee c = (Circleee)obj;
		if(x==c.x && y==c.y) {
			return true;
		}else {
			return false;
		}
	}
	public String toString() {
		return "Point(" + x + ", " + y + ")" + " 반지름 : " + radius;
	}
}

public class BookEx384pg_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circleee a = new Circleee(2, 3, 5);
		Circleee b = new Circleee(2, 3, 30);
		System.out.println("원 a : " + a);
		System.out.println("원 b : " + b);
		if(a.equals(b)) {
			System.out.println("같은 원");
		}else {
			System.out.println("서로 다른 원");
		}
	}
}
