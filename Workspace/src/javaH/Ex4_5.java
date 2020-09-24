package javaH;

public class Ex4_5 { // Ex4_5 = Book
	String title;
	String author;
	void show() {
		System.out.println(title + " " + author);
	}
	public Ex4_5() {
		this("비어있음", "비어있음");
		System.out.println("생성자 호출됨");
	}
	public Ex4_5(String title) {
		this(title, "작자미상");
	}
	public Ex4_5(String title, String author) {
		this.title = title;
		this.author = author;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex4_5 littlePrince = new Ex4_5("어린왕자", "생텍쥐페리");
		Ex4_5 loveStory = new Ex4_5("춘향전");
		Ex4_5 emptyBook = new Ex4_5(); // this("비어있음", "비어있음"); 수행하고, 생성자 호출됨 출력
		littlePrince.show();
		loveStory.show();
		emptyBook.show();
	}
}