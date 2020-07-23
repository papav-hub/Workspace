package control;

public class Java {
	public static void main(String[] args) {
		int result = 0;
		for(int i = 1 ; i <= 1000 ; i++) {
			result += i;
		}
		System.out.println("결과 : " + result);
		
		
		int result2 = 0;
		int j = 0;
		while(j < 1001) {
			result2 += j;
			j++;
		}
		System.out.println("결과 : " + result2);
	}
}