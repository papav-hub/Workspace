package javaH;

public class Ex3_12 {

	
	static int[] makeArray() {
		int temp[] = new int[4];
		for(int i=0 ; i<temp.length ; i++) {
			temp[i] = i;
		}
		return temp;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int intArray[];
		intArray = makeArray();
		for(int i=0 ; i<intArray.length ; i++) {
			System.out.print(intArray[i] + " ");
		}
		
		
		
		//��Ŭ�������� main() �޼ҵ��� �������� 3�� 44page
		System.out.println();
		System.out.println();
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);

	}

}
