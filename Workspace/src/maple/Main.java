package maple;

import java.util.Scanner;
import java.util.InputMismatchException;
import classTest.Student;

public class Main {
	
	static Security array[] = new Security[10];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = 0;
		
		while(true) {
			
			int number = printMenu(); // �޴� ��� �� ��ȣ ����
								
			if(number == 1) { // ȸ������
				
				System.out.print("Id : "); // ID �Է�
				String id = sc.next();
				
				boolean check = true;

				for(int i = 0 ; i < n ; i++) { // ID �ߺ� Ȯ��
					if(array[i].getId().equals(id)) {
						check = false;
					}
				}
				
				if(check) { // �ߺ� �ȵǸ� password �Է¹ޱ�
					System.out.print("Password : ");
					String password = sc.next();
					array[n] = new Security(id, password);
					n++;
				}else { // �ߺ� ����ó��
					System.out.println("�̹� �����ϴ� ID�Դϴ�.");
				}
				
				
			}else if(number == 2) { // ĳ���� ����
				System.out.println("ȸ������ ���θ� Ȯ���ϰڽ��ϴ�."); // ȸ������ Ȯ��
				System.out.print("Id : ");
				String id = sc.next();
				
				int checkNumber = -1;
				for(int i = 0 ; i < n ; i++) {
					if(array[i].getId().equals(id)) { // ID Ȯ��
						checkNumber = i;
					}
				}
				
				if(checkNumber < 0) { // ID ����  X
					System.out.println("ID�� �������� �ʽ��ϴ�.");
					continue;
				}else { // ID, Password ��ġ Ȯ��
					System.out.print("Password : ");
					String password = sc.next();
					
					boolean check = true;
					if(array[checkNumber].getPassword().equals(password)) { // Ȯ�� �Ϸ�
						System.out.println("Ȯ���� �Ϸ�Ǿ����ϴ�.");
					}else { // ����ġ
						System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
						continue;
					}
				}
			
				System.out.print("Name : "); // �г� �Է¹ޱ�
				String name = sc.next();
				
				boolean check = true; // �г� �ߺ�Ȯ��
				for(int i = 0 ; i < n - 1 ; i++) {
					if(array[i].getName().equals(name)||array[i].getName().equals("")) {
						check = false;
					}
				}
				
				if(check) {// �г� ���� �Ϸ� ���� �Է¹ޱ�
					ShowJob();
					System.out.print("���� : ");
					String job = sc.next();
					array[checkNumber].setName(name);
					array[checkNumber].setJob(job);
				}else { // �г� �ߺ� ����ó��
					System.out.println("�̹� �����ϴ� �г����Դϴ�.");
					continue;
				}
				
			}else if(number == 3) {
				System.out.println("���� Ȯ���ϱ�!");
				for(int i = 0 ; i < n ; i++) {
					System.out.println("ID : " + array[i].getId() + "\npassword : " + array[i].getPassword() + "\nName : " + array[i].getName() + "\nJob : " + array[i].getJob() + "\n");
				}
				
			}else if(number == 4) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}else {
				System.out.println("�߸��Է��ϼ̽��ϴ�.");
			}

			

		}

	}
	
	static int printMenu() { // �޴� ��� �� ��ȣ ����
		System.out.println("--------------------");
		System.out.println("1. ȸ������");
		System.out.println("2. ĳ���� ����");
		System.out.println("3. ĳ���� ���� Ȯ��");
		System.out.println("4. exit");
		System.out.println("--------------------");
		
		System.out.print("�Է� : ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		return number;
	}
	
	static void ShowJob() {
		System.out.println("���谡");
		System.out.println("�ñ׳ʽ� ����");
		System.out.println("����������");
		System.out.println("����");
		System.out.println("���");
		System.out.println("����");
		System.out.println("����");
		System.out.println("�ƴϸ�");
		System.out.println("����");
		System.out.println("Ű�׽ý�");
		System.out.println("�Ƶ�");
	}
	
}
