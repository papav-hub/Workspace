package arrayTest;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[] = new int[100];
		
		for(int i = 0 ; i < array.length ; i++) {
			array[i] = (int)(Math.random() * 100) + 1;
		}
		
		int all = 0;
		for(int i = 0 ; i<array.length ; i++) {
			all += array[i];
		}
		
		System.out.println("√— «’ : " + all);
		
		int ave;
		ave = all/100;
		
		System.out.println("∆Ú±’ : " + ave);
		
		int min = array[0], max = array[0];
		
		for(int i = 0 ; i < array.length ; i++) {
			if(array[i] < min) {
				min = array[i];
			}
			if(array[i] > max) {
				max = array[i];
			}
		}
		System.out.println("√÷¥Î : " + max + " \n√÷º“ : " + min);

	}

}
