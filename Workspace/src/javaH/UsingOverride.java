package javaH;

import javaH.Ex5_5MethodOverridingEx;

public class UsingOverride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shapee start, last, obj; // ��ũ�� ����Ʈ�� ���� �����Ͽ� ����
		
		start = new Linee();
		last = start;
		
		obj = new Rectt();
		last.next = obj;
		last = obj;
		
		obj = new Linee();
		last.next = obj;
		last = obj;
		
		obj = new Circlee();
		last.next = obj;
		
		Shapee p = start;
		while(p!=null) {
			p.draw();
			p = p.next;
		}

	}

}
