package classTest;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node one = new Node(10, 20);
		Node two = new Node(30, 40);
		
		Node three = one.center(two);
		
		System.out.println("X : " + three.getX() + "\nY : " + three.getY());

	}

}
