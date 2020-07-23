package shape;

public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 1; i <= 3; i++) {
			for(int j = (3-i)*2; j >= 1; j--) {
				System.out.print(" ");
			}
			for(int j = 1; j <= i*4-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = 3; i >= 1; i--) {
			for(int j = (3-i)*2; j >= 1; j--) {
				System.out.print(" ");
			}
			for(int j = 1; j <= i*4-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
