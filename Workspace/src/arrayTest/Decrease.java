package arrayTest;

public class Decrease {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[] = new int[10];
		
		for(int i = 0 ; i < array.length ; i++) {
			array[i] = (int)(Math.random() * 100) + 1;
		}
		
		for(int i = 0 ; i < array.length ; i++) {
			System.out.print(array[i] + " ");
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		for(int i = 0 ; i < array.length ; i++) {
			for(int j = 0 ; j < array.length - 1  ; j++) {
				if(array[j] < array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		
		for(int i = 0 ; i < array.length ; i++) {
			System.out.print(array[i] + " ");
		}

	}

}
