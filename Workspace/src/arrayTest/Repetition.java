package arrayTest;

public class Repetition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[] = new int[7];
		
		for(int i=0;i<array.length;i++) {
			array[i] = (int)(Math.random() * 10) + 1;
			for(int j=0;j<i;j++) {
				if(array[j]==array[i]) {
					i--;
				}
			}
		}
		
		for(int i = 0 ; i < array.length - 1 ; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.print("+ " + array[array.length - 1]);
		

	}

}
