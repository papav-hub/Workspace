package javaH2;

import java.util.*;

public class Ex7_3ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <String> a = new ArrayList<String>();
		//var a = new ArrayList<String>(); ����!
		
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0 ; i<4 ; i++) {
			System.out.println("�̸��� �Է��ϼ���>>");
			String s = scanner.next();
			a.add(s);
		}
		
		for(int i=0 ; i<a.size(); i++) {
			String name = a.get(i);
			System.out.println(name + " ");
		}
		
		int longestIndex = 0;
		for(int i=1;i<a.size();i++) {
			if(a.get(longestIndex).length() < a.get(i).length()) {
				longestIndex = i;			
			}
		}
		
		System.out.println("���� �� �̸��� : " + a.get(longestIndex));
		scanner.close();
	}

}
