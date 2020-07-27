package arrayTest;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[] = new int[11]; //È¦Â¦ ´Ù °¡´É
		
		for(int i = 0 ; i < array.length ; i++) {
			array[i] = (int)(Math.random() * 100) + 1;
		}
		
		for(int i = 0 ; i < array.length ; i++) {
			System.out.print(array[i] + " ");
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		for(int i = 0 ; i < array.length/2 ; i++) {
			int temp = array[i];
			array[i] = array[(array.length) - i - 1];
			array[(array.length) - i - 1] = temp;
		}
		
		for(int i = 0 ; i < array.length ; i++) {
			System.out.print(array[i] + " ");
		}

	}

}
