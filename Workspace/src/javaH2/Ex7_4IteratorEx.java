package javaH2;

import java.util.*;

public class Ex7_4IteratorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector <Integer> v = new Vector <Integer> (); // 정수 값만 다루는 제네릭 벡터 생성
		
		v.add(5);
		v.add(4);
		v.add(-1);
		v.add(2, 100); // 4와 -1 사이에 정수 100 삽입
		
		
		Iterator <Integer> it = v.iterator(); // iterator를 이용한 모든 정수 출력하기
		while(it.hasNext()) {
			int n = it.next();
			System.out.println(n);
		}
		
		int sum = 0; // iterator를 이용하여 모든 정수 더하기
		it = v.iterator(); // iterator 객체 얻기
		while(it.hasNext()){
			int n = it.next();
			sum += n;
		}
		
		System.out.println("벡터에 있는 정수 합 : " + sum);

	}

}
