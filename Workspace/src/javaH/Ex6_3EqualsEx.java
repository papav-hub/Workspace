package javaH;

class ppPoint{
	int x, y;
	public ppPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	/*public boolean equals(Object obj) {
		ppPoint p = (ppPoint)obj;
		if(x==p.x && y==p.y) {
			return true;
		}
		else {
			return false;
		}
	}*/ // �̰� �ּ�ó���ϸ� �ƹ��͵� �ȳ��� ������ �ּҰ��� �� �ٸ��� �����̴پƾƤ�

}

public class Ex6_3EqualsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ppPoint a = new ppPoint(2, 3);
		ppPoint b = new ppPoint(2, 3);
		ppPoint c = new ppPoint(3, 4);
		
		if(a==b) {
			System.out.println("a==b");
		}
		if(a.equals(b)) {
			System.out.println("a is equal to b");
		}
		if(a.equals(c)) {
			System.out.println("a is equal to c");
		}
		
		

	}

}
