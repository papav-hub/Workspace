package javaH;
import java.util.Scanner;
public class Ex2_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("�̸�, ����, ����, ü��, ���� ���θ� ��ĭ���� �и��Ͽ� �Է��ϼ���.");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		System.out.print("�̸��� " + name + ", ");
		String city = scanner.next();
		System.out.print("���ô� " + city + ", ");
		int age = scanner.nextInt();
		System.out.print("���̴� " + age + ", ");
		double weight = scanner.nextDouble();
		System.out.print("ü�ߴ� " + weight + ", ");
		boolean single = scanner.nextBoolean();
		System.out.print("���ſ��δ� " + single + "�Դϴ�.");
		scanner.close();

	}

}
