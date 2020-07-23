package control;

public class Multiplication2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=9;i=i+2) {
			for(int j=1;j<=9;j++) {
				if((i+1)!=10) {
					System.out.print(i + " * " + j + " = " + i * j + "\t");
					System.out.println(i + 1 + " * " + j + " = " + (i + 1) * j + "\t");
				}else {
					System.out.println(i + " * " + j + " = " + i * j + "\t");
				}
			}
			System.out.println();
		}
	}
}