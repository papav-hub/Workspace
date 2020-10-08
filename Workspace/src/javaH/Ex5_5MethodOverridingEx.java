package javaH;

class Shapee{
	public Shapee next;
	public Shapee() {
		next = null;
	}
	public void draw() {
		System.out.println("Shape");
	}
}

class Linee extends Shapee{
	public void draw() {
		System.out.println("Line");
	}
}

class Rectt extends Shapee{
	public void draw() {
		System.out.println("Rect");
	}
}

class Circlee extends Shapee{
	public void draw() {
		System.out.println("Circle");
	}
}

public class Ex5_5MethodOverridingEx {
	
	static void paint(Shapee p) {
		p.draw();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Linee line = new Linee();
		paint(line);
		paint(new Shapee());
		paint(new Linee());
		paint(new Rectt());
		paint(new Circlee());

	}

}
