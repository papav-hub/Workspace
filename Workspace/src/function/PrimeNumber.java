package function;

public class PrimeNumber {
	
	static int function1(int a) {
		boolean check;
		int i;
		for(i = a-1 ; i > 1 ; i--) {
			check = true;
			for(int j = i-1 ; j > 1 ; j--) {
				if(i % j == 0) {
					check = false;
				}
			}
			if(check) {
				break;
			}
		}
		
		return i;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(function1(10));

	}

}
