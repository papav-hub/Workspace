package javaH;
import java.util.Scanner;
public class BookEx110pg_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("��ȭ�� �Է��ϼ���(���� ��)");
		Scanner scanner = new Scanner(System.in);
		int won = scanner.nextInt();
		double dollar = won/1100;
		System.out.println(won + "���� " + "$" + dollar + "�Դϴ�.");
		scanner.close();

	}

}
