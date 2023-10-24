package java_class;

public class Car {

	//접근제어자
	//public : 같은클래스O, 같은 패키지O, 자식클래스O, 전체O
	//protected : 같은클래스O, 같은 패키지O, 자식클래스O
	//default : 같은클래스O, 같은 패키지O
	//private : 같은클래스O
	
	//멤버 변수
	private int speed;
	
	//생성자
	//클래스 명과 동일해야 한다.
	public Car(int speed) {
		this.speed = speed;
	}
	
	public void start() {
		System.out.println("Car Start");
//		System.out.println(speed); 잘못된 코드
	}

	public void increseSpeed(int speed) {
		this.speed = this.speed + speed;
	}
	//setter 메서드
	public void setSpeed(int speed) {
		//유효성 검사
		if(speed > 0) {
			this.speed = speed;			
		}
		
	}
	
	//getter 메서드
	public int getSpeed() {
		return this.speed;
	}
	
	
}
