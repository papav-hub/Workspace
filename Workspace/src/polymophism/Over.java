package polymophism;

public class Over {
	
	void print(int a) {
		System.out.println("�����Դϴ�.");
	}
	
	void print(int a, int b) {
		System.out.println("����2�Դϴ�.");
	}
	
	void print(String a) {
		System.out.println("�����Դϴ�.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Over o = new Over();
		
		o.print(1);
		o.print(1, 1);
		o.print("1");

	}

}