package javaH;
import java.util.Scanner;
public class Ex2_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���(0~100) : ");
		int score = scanner.nextInt();
		char grade;
		switch(score/10) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
		}
		
		System.out.println("������ " + grade + "�Դϴ�.");

	}

}
