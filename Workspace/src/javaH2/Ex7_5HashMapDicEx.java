package javaH2;

import java.util.*;

public class Ex7_5HashMapDicEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap <String, String> dic = new HashMap <String, String>();
		//���� �ܾ�� �ѱ� �ܾ��� ���� �����ϴ� HashMap �÷��� ����
		
		
		//key, value
		dic.put("baby", "�Ʊ�");
		dic.put("love",  "���");
		dic.put("apple", "���");
		
		
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("ã����� �ܾ��?");
			String eng = scanner.next();
			if(eng.equals("exit")) {
				System.out.println("�����մϴ�");
				break;
			}
			String kor = dic.get(eng);
			if(kor==null) { //�ؽøʿ��� ã�� �� ���� Ű�� null�� �����Ѵ�.
				System.out.println(eng + "�� ���� �ܾ� �Դϴ�.");
			}else {
				System.out.println(kor);
			}
		}
		scanner.close();
		

	}

}
