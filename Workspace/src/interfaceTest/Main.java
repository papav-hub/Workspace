package interfaceTest;

public class Main implements Cat, Dog {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m = new Main();
		m.crying();
		m.print();
		//interface : 陥掻雌紗亜管, 析鋼五社球 災亜  蓄雌戚櫛 搾嘘廃陥檎 益係陥たたたたたたたたたたた
	}

	@Override
	public void crying() {
		// TODO Auto-generated method stub
		System.out.println("crying");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("壱丞戚");
	}


	@Override
	public void print2() {
		// TODO Auto-generated method stub
		System.out.println("悪焼走");
	}

	
	
}
