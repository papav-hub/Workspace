package classTest;

import java.util.Scanner;

public class Abcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student abcd[] = new Student[5];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0 ; i < abcd.length ; i++) {
			System.out.print("�̸� : ");
			String name = sc.next();
			System.out.print("\n���� : ");
			String gender = sc.next();
			System.out.print("\nŰ : ");
			double height = sc.nextDouble();
			System.out.print("\n������ : ");
			double weight = sc.nextDouble();
			
			abcd[i] = new Student(name, i+1, gender, height, weight);
		}
		
		for(int i = 0 ; i < abcd.length ; i++) {
			System.out.println(abcd[i].getName() + " : " + abcd[i].getNumber() + " : " + abcd[i].getGender() + " : " + abcd[i].getHeight() + " : " + abcd[i].getWeight());
		}
		
		Student CJH = new Student("������", 1, "����", 181.7, 123.0);
		Student CHM = new Student("������", 2, "����", 167.5, 123.0);

	}

}
