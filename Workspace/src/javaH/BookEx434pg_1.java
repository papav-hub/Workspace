package javaH;

import java.util.Scanner;
import java.util.Vector;

public class BookEx434pg_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		Vector<Integer> v = new Vector<Integer>();
		
		System.out.print("����(-1�� �Էµ� ������) >> ");
		int n = scanner.nextInt();
		while(n!=-1) {
			v.add(n);
			n = scanner.nextInt();
		}
		
		
		int max = 0;
		for(int i = 0 ; i<v.size(); i++) {
			if(v.get(i) > max) {
				max = v.elementAt(i);				
				// max = v.get(i); �� ����
			}
		}
		
		System.out.println("���� ū ���� " + max);

		

	}

}
