package javaH;
import java.util.Scanner;
public class BookEx110pg_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("���� 3�� �Է� >>> ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int result;
		
		if(((a>b)&&(b>c))||((c>b)&&(b>a))) {
			result = b;
		}else if(((b>a)&&(a>c))||((c>a)&&(a>b))) {
			result = a;
		}else {
			result = c;
		}
		System.out.println("�߰����� " + result);
		
		scanner.close();
		
		

	}

}
