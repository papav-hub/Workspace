package function;

public class Max {
	
	static int function1(int a, int b, int c) {
		// min ã��
		int min = a;
		
		if(b>c) {
			if(c<min) {
				min = c;
			}
		}else {
			if(b<min) {
				min = b;
			}
		}
		
		
		// ���ϱ�
		int max = 0;
		for(int i=min;i>1;i--) {
			if((a%i==0)&&(b%i==0)&&(c%i==0)) {
				max = i;
				break;
			}
		}	
		return max;
		

	}

	public static void main(String[] args) { //main
		// TODO Auto-generated method stub
		int max = function1(20, 10, 30);
		System.out.println("�ִ����� : " + max);
	}

}
