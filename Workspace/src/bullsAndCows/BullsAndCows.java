package bullsAndCows;

import java.util.Scanner;

public class BullsAndCows {
	
	static int result[] = new int[4];
	static int input[] = new int[4];
	
	static void setResult() { // 정답 정하기	
		result[0] = (int)(Math.random() * 9) + 1; // 첫번째 수는 0 안됨
		for(int i = 1 ; i < result.length ; i++) {
			result[i] = (int)(Math.random() * 10);
			for(int j = 0 ; j < i ; j++) { // 중복제거
				if(result[i] == result[j]) {
					i--;
				}
			}
		}
		
		for(int i = 0 ; i < result.length ; i++) { // 정답 출력 // 확인용
			System.out.print(result[i] + " ");
		}
		System.out.println();
	}
	
	static void userResult() {
		while(true) { // 사용자한테서 입력받기
			Scanner sc = new Scanner(System.in);
			System.out.print("숫자 : ");
			for(int i = 0 ; i < input.length ; i++) {
				input[i] = sc.nextInt();	
			}
			
			int check = 1;
			for(int i = 0 ; i < result.length ; i++) {// 정답 입력하면 break;
				if(result[i]!=input[i]) {
					check = 0;
				}
			}		
			if(check == 1) {
				System.out.println("정답입니다!");
				break;
			}
			
			printResult();
			
		}
	}
		
	static void printResult() {
		int strike = 0;
		int ball = 0;
		
		for(int i = 0 ; i < result.length ; i++) {
			for(int j = 0 ; j < input.length ; j++) {
				if(result[i] == input[j]) {
					if(i==j) {
						strike++;
					}else {
						ball++;
					}
				}
			}
		}
		
		if((strike == 0) && (ball == 0)) {
			System.out.println("Out");
		}else {
			System.out.println("strike : " + strike + "\nball : " + ball);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		setResult();
		userResult();
		
	}

}
