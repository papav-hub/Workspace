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
	}*/ // 이거 주석처리하면 아무것도 안나옴 각각의 주소값이 다 다르기 때문이다아아ㅏ

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
