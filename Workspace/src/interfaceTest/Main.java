package interfaceTest;

public class Main implements Cat, Dog {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m = new Main();
		m.crying();
		m.print();
		//interface : 다중상속가능, 일반메소드 불가  추상이랑 비교한다면 그렇다ㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏ
	}

	@Override
	public void crying() {
		// TODO Auto-generated method stub
		System.out.println("crying");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("고양이");
	}


	@Override
	public void print2() {
		// TODO Auto-generated method stub
		System.out.println("강아지");
	}

	
	
}
