package abstractTest;

public class Main extends Player {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m = new Main(); //main을 객체화
		String songName = "울렐레";
		m.play(songName);
		m.pause();
		m.stop();	

	}

	@Override
	void play(String song) {
		// TODO Auto-generated method stub
		System.out.println(song + " 재생");
	}

	@Override
	void pause() {
		// TODO Auto-generated method stub
		System.out.println("일시정지");
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("정지");
	}

}
