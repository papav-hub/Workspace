package javaH;
import javaH.Ex5_2Person;

public class Ex5_2Student extends Ex5_2Person {
	public void set() {
		age = 30; // ���� Ŭ������ ����Ʈ ��� ���� ���ɤ�
		name = "ȫ�浿"; // ���� Ŭ������ public ��� ���� ����
		height = 175;
		setWeight(99); //private ��� weight�� setWeight()���� ���� ����!
		
		//Ȯ���� ��¹�
		System.out.println("age : " + age);
		System.out.println("name : " + name);
		System.out.println("height : " + height);
		System.out.println("weight : " + getWeight());
	}
}
