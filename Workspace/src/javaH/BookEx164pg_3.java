package javaH;
import java.util.Scanner;
public class BookEx164pg_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력하시오>>");
		int n = scanner.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}