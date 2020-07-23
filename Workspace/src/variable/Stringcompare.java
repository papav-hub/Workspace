package variable;

public class Stringcompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Hello World!";
		String b = "Hello World!";
		
		System.out.println(a==b);//주소값만 비교//사용(x)//자바 포인터 사용 x
		System.out.println(a.equals(b));//값 비교
	}
}