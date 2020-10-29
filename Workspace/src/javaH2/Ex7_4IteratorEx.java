package javaH2;

import java.util.*;

public class Ex7_4IteratorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector <Integer> v = new Vector <Integer> (); // ���� ���� �ٷ�� ���׸� ���� ����
		
		v.add(5);
		v.add(4);
		v.add(-1);
		v.add(2, 100); // 4�� -1 ���̿� ���� 100 ����
		
		
		Iterator <Integer> it = v.iterator(); // iterator�� �̿��� ��� ���� ����ϱ�
		while(it.hasNext()) {
			int n = it.next();
			System.out.println(n);
		}
		
		int sum = 0; // iterator�� �̿��Ͽ� ��� ���� ���ϱ�
		it = v.iterator(); // iterator ��ü ���
		while(it.hasNext()){
			int n = it.next();
			sum += n;
		}
		
		System.out.println("���Ϳ� �ִ� ���� �� : " + sum);

	}

}
