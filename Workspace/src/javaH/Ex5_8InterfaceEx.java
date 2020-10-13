package javaH;

interface PhoneInterfacee{ //�������̽� ����
	final int TIMEOUT = 10000; // ��� �ʵ� ����
	void sendCall(); // �߻� �޼ҵ�
	void receiveCall(); // �߻� �޼ҵ�
	default void printLogo() { // default �޼ҵ�
		System.out.println("**LOGO**");
	}
}

class SamsungPhone implements PhoneInterfacee{
	public void sendCall() {
		System.out.println("�츮������");
	}
	
	public void receiveCall() {
		System.out.println("��ȭ�� �Խ��ϴ�.");
	}
	
	// �޼ҵ� �߰� �ۼ�
	public void flash() {
		System.out.println("��ȭ�⿡ Ǯ�� �������ϴ�.");
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
