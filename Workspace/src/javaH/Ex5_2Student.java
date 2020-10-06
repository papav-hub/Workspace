package javaH;
import javaH.Ex5_2Person;

public class Ex5_2Student extends Ex5_2Person {
	public void set() {
		age = 30; // 슈퍼 클래스의 디폴트 멤버 접근 가능ㄴ
		name = "홍길동"; // 슈퍼 클래스의 public 멤버 접근 가능
		height = 175;
		setWeight(99); //private 멤버 weight은 setWeight()으로 간접 접근!
		
		//확인차 출력문
		System.out.println("age : " + age);
		System.out.println("name : " + name);
		System.out.println("height : " + height);
		System.out.println("weight : " + getWeight());
	}
}
