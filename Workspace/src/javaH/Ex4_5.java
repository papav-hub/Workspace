package javaH;

public class Ex4_5 { // Ex4_5 = Book
	String title;
	String author;
	void show() {
		System.out.println(title + " " + author);
	}
	public Ex4_5() {
		this("�������", "�������");
		System.out.println("������ ȣ���");
	}
	public Ex4_5(String title) {
		this(title, "���ڹ̻�");
	}
	public Ex4_5(String title, String author) {
		this.title = title;
		this.author = author;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex4_5 littlePrince = new Ex4_5("�����", "�������丮");
		Ex4_5 loveStory = new Ex4_5("������");
		Ex4_5 emptyBook = new Ex4_5(); // this("�������", "�������"); �����ϰ�, ������ ȣ��� ���
		littlePrince.show();
		loveStory.show();
		emptyBook.show();
	}
}