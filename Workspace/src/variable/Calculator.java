package variable;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in); // ctrl shift 'o'
		System.out.println("숫자 1번 : ");
		int num1 = sc.nextInt();
		System.out.println("더하기, 빼기, 곱하기, 나누기 중 하나 : ");
		String b = sc.next();
		System.out.println("숫자 2번 : ");
		int num2 = sc.nextInt();
		
		/*switch(b) {
		case "+":
			System.out.println("더하기 : " + num1 + " + "+ num2 + " = "+ (num1+num2));
			break;
		case "-":
			System.out.println("빼기 : " + num1 + " - "+ num2 + " = "+ (num1-num2));
			break;
		case "*":
			System.out.println("곱하기 : " + num1 + " * "+ num2 + " = "+ (num1*num2));
			break;
		case "/":
			System.out.println("나누기 : " + num1 + " / "+ num2 + " = "+ ((double)num1/(double)num2));
			break;
		}*/

		if(b.equals("+")) {//b=="+"안됨
			System.out.println("더하기 : " + num1 + " + "+ num2 + " = "+ (num1+num2));
		}else if(b.equals("-")) {
			System.out.println("빼기 : " + num1 + " - "+ num2 + " = "+ (num1-num2));
		}else if(b.equals("*")) {
			System.out.println("곱하기 : " + num1 + " * "+ num2 + " = "+ (num1*num2));
		}else if(b.equals("/")){
			System.out.println("나누기 : " + num1 + " / "+ num2 + " = "+ ((double)num1/(double)num2));
		}else {
			System.out.println("잘못입력");
		}
	}
}