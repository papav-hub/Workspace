package javaH;

abstract class Calculator{
	public abstract int add(int a, int b);
	public abstract int subtract(int a, int b);
	public abstract double average(int [] a);
}

public class Ex5_7GoodCalc extends Calculator{
	
	public int add(int a, int b) { // 추상 메소드 구현
		return a+b;
	}
	
	public int subtract(int a, int b) { // 추상 메소드 구현
		return a-b;
	}
	
	public double average(int [] a) {
		double sum = 0.0;
		for(int i=0 ; i<a.length ; i++) { // 추상 메소드 구현
			sum += a[i];
		}
		return sum/a.length;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ex5_7GoodCalc c = new Ex5_7GoodCalc();
		// Calculator c = new Ex5_7GoodCalc(); 업캐스팅 / 이것도 가능하다.
		System.out.println(c.add(2,  3));
		System.out.println(c.subtract(2,  3));
		System.out.println(c.average(new int [] {2, 3, 4}));

	}

}
