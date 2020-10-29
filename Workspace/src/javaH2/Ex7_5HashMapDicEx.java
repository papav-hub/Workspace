package javaH2;

import java.util.*;

public class Ex7_5HashMapDicEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap <String, String> dic = new HashMap <String, String>();
		//영어 단어와 한글 단어의 쌍을 저장하는 HashMap 컬렉션 생성
		
		
		//key, value
		dic.put("baby", "아기");
		dic.put("love",  "사랑");
		dic.put("apple", "사과");
		
		
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("찾고싶은 단어는?");
			String eng = scanner.next();
			if(eng.equals("exit")) {
				System.out.println("종료합니다");
				break;
			}
			String kor = dic.get(eng);
			if(kor==null) { //해시맵에서 찾을 수 없는 키는 null을 리턴한다.
				System.out.println(eng + "는 없는 단어 입니다.");
			}else {
				System.out.println(kor);
			}
		}
		scanner.close();
		

	}

}
