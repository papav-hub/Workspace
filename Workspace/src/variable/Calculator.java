package variable;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in); // ctrl shift 'o'
		System.out.println("���� 1�� : ");
		int num1 = sc.nextInt();
		System.out.println("���ϱ�, ����, ���ϱ�, ������ �� �ϳ� : ");
		String b = sc.next();
		System.out.println("���� 2�� : ");
		int num2 = sc.nextInt();
		
		/*switch(b) {
		case "+":
			System.out.println("���ϱ� : " + num1 + " + "+ num2 + " = "+ (num1+num2));
			break;
		case "-":
			System.out.println("���� : " + num1 + " - "+ num2 + " = "+ (num1-num2));
			break;
		case "*":
			System.out.println("���ϱ� : " + num1 + " * "+ num2 + " = "+ (num1*num2));
			break;
		case "/":
			System.out.println("������ : " + num1 + " / "+ num2 + " = "+ ((double)num1/(double)num2));
			break;
		}*/

		if(b.equals("+")) {//b=="+"�ȵ�
			System.out.println("���ϱ� : " + num1 + " + "+ num2 + " = "+ (num1+num2));
		}else if(b.equals("-")) {
			System.out.println("���� : " + num1 + " - "+ num2 + " = "+ (num1-num2));
		}else if(b.equals("*")) {
			System.out.println("���ϱ� : " + num1 + " * "+ num2 + " = "+ (num1*num2));
		}else if(b.equals("/")){
			System.out.println("������ : " + num1 + " / "+ num2 + " = "+ ((double)num1/(double)num2));
		}else {
			System.out.println("�߸��Է�");
		}
	}
}