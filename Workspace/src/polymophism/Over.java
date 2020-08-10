package polymophism;

public class Over {
	
	void print(int a) {
		System.out.println("숫자입니다.");
	}
	
	void print(int a, int b) {
		System.out.println("숫자2입니다.");
	}
	
	void print(String a) {
		System.out.println("문자입니다.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Over o = new Over();
		
		o.print(1);
		o.print(1, 1);
		o.print("1");

	}

}