package javaH;


interface PhoneInterface{ //인터페이스 선언
	final int TIMEOUT = 10000; // 상수 필드 선언
	void sendCall(); // 추상 메소드
	void receiveCall(); // 추상 메소드
	default void printLogo() { // default 메소드
		System.out.println("**LOGO**");
	}
}

interface MobilePhoneInterface extends PhoneInterface{
	void sendSMS();
	void receiveSMS();
}

interface MP3Interface{
	public void play();
	public void stop();
}

class PDA{
	public int calculate(int x, int y) {
		return x+y;
	}
}

class SmartPhone extends PDA implements MobilePhoneInterface, MP3Interface{
	public void sendCall() {
		System.out.println("따르릉따르릉~~"); //PhoneInterface (MobilePhoneInterface extends PhoneInterface)
	}
	public void receiveCall() {
		System.out.println("전화 왔어요"); //PhoneInterface (MobilePhoneInterface extends PhoneInterface)
	}
	public void sendSMS() {
		System.out.println("문자갑니다."); //MobilePhoneInterface
	}
	public void receiveSMS() {
		System.out.println("문자왔어요"); //MobilePhoneInterface
	}
	public void play() {
		System.out.println("음악 연주합니다."); //MP3Interface
	}
	public void stop() {
		System.out.println("음악 중단합니다."); //MP3Interface
	}
	
	public void schedule() {
		System.out.println("일정 관리합니다."); // 추가
	}
}

public class Ex5_9InterfaceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone phone = new SmartPhone();
		phone.printLogo();
		phone.sendCall();
		phone.play();
		System.out.println("3과 5를 더하면  " + phone.calculate(3,  5));
		phone.schedule();
	}

}
