package javaH;

public class BookEx166pg_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int all = 0;
		int[] intArray = new int[10];
		for(int i=0 ; i<intArray.length ; i++) {
			intArray[i] = (int)(Math.random()*10 + 1);
			all += intArray[i];
		}
		
		System.out.print("·£´ýÇÑ Á¤¼öµé : ");
		for(int i=0 ; i<intArray.length ; i++) {
			System.out.print(intArray[i] + " ");
		}
		System.out.println();
		System.out.println("Æò±ÕÀº " + (float)all/intArray.length);
		
	}
	
}
