package abstractTest;

public class Main extends Player {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m = new Main(); //main�� ��üȭ
		String songName = "�﷼��";
		m.play(songName);
		m.pause();
		m.stop();	

	}

	@Override
	void play(String song) {
		// TODO Auto-generated method stub
		System.out.println(song + " ���");
	}

	@Override
	void pause() {
		// TODO Auto-generated method stub
		System.out.println("�Ͻ�����");
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("����");
	}

}
