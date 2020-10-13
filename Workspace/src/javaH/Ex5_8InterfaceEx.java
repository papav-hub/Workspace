package javaH;

interface PhoneInterfacee{ //인터페이스 선언
	final int TIMEOUT = 10000; // 상수 필드 선언
	void sendCall(); // 추상 메소드
	void receiveCall(); // 추상 메소드
	default void printLogo() { // default 메소드
		System.out.println("**LOGO**");
	}
}

class SamsungPhone implements PhoneInterfacee{
	public void sendCall() {
		System.out.println("띠리리리링");
	}
	
	public void receiveCall() {
		System.out.println("전화가 왔습니다.");
	}
	
	// 메소드 추가 작성
	public void flash() {
		System.out.println("전화기에 풀이 켜졌습니다.");
	}
}

public class Ex5_8InterfaceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SamsungPhone phone = new SamsungPhone();
		phone.printLogo();
		phone.sendCall();
		phone.receiveCall();
		phone.flash();
		
		PhoneInterfacee PHONE = new SamsungPhone();
		PHONE.printLogo();
		PHONE.sendCall();
		PHONE.receiveCall();
		//PHONE.flash();//create flash method in PhoneInterface
	}

}
