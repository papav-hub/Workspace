package javaH;

class Pointtt{
	int x, y;
	public Pointtt(int x, int y) {
		this.x = x;
		this.y = y;
	}
	/*public String toString() {
		return "Point(" + x + ", " + y + ")";
	}*/ // 이거 주석처리하면 해시코드 값이 나옵니다용!
}

public class Ex6_2ToStringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pointtt p = new Pointtt(2, 3);
		System.out.println(p.toString());
		System.out.println(p);
		System.out.println(p+ "입니다.");
		
		Pointtt pp = new Pointtt(2, 3);
		System.out.println(pp.toString());
		
		Pointtt ppp = new Pointtt(10, 10);
		System.out.println(ppp.toString());
	}

}
