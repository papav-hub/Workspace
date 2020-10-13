package javaH;


interface PhoneInterface{ //�������̽� ����
	final int TIMEOUT = 10000; // ��� �ʵ� ����
	void sendCall(); // �߻� �޼ҵ�
	void receiveCall(); // �߻� �޼ҵ�
	default void printLogo() { // default �޼ҵ�
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
		System.out.println("������������~~"); //PhoneInterface (MobilePhoneInterface extends PhoneInterface)
	}
	public void receiveCall() {
		System.out.println("��ȭ �Ծ��"); //PhoneInterface (MobilePhoneInterface extends PhoneInterface)
	}
	public void sendSMS() {
		System.out.println("���ڰ��ϴ�."); //MobilePhoneInterface
	}
	public void receiveSMS() {
		System.out.println("���ڿԾ��"); //MobilePhoneInterface
	}
	public void play() {
		System.out.println("���� �����մϴ�."); //MP3Interface
	}
	public void stop() {
		System.out.println("���� �ߴ��մϴ�."); //MP3Interface
	}
	
	public void schedule() {
		System.out.println("���� �����մϴ�."); // �߰�
	}
}

public class Ex5_9InterfaceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone phone = new SmartPhone();
		phone.printLogo();
		phone.sendCall();
		phone.play();
		System.out.println("3�� 5�� ���ϸ�  " + phone.calculate(3,  5));
		phone.schedule();
	}

}
