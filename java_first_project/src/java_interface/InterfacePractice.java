package java_interface;

interface Playable{
	void play();
	void pause();
	void stop();
}

class MP3Player implements Playable{

	@Override
	public void play() {
		System.out.println("MP3 플레이어가 실행되었습니다.");
	}

	@Override
	public void pause() {
		System.out.println("Mp3 플레이어를 정지했습니다.");
	}

	@Override
	public void stop() {
		System.out.println("MP3 플레이어를 멈췄습니다.");
	}
	
}
class DVDPlayer implements Playable{

	@Override
	public void play() {
		System.out.println("DVD 플레이어 재생");
	}

	@Override
	public void pause() {
		System.out.println("DVD 플레이어 일시정지");
	}

	@Override
	public void stop() {
		System.out.println("DVD 플레이어 정지!");
	}
	
}
public class InterfacePractice {
	public static void main(String []args) {
		MP3Player mp3 = new MP3Player();
		DVDPlayer dvd = new DVDPlayer();
		
		System.out.println("====MP3 플레이어====");
		mp3.play();
		mp3.pause();
		mp3.stop();
		System.out.println("====DVD 플레이어====");
		dvd.play();
		dvd.pause();
		dvd.stop();
	}
}
