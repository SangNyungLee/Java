package java_abstract;

//추상클래스
abstract class Animal{
	//추상 메서드
	abstract public void sound();
	
	//일반 메서드
	public void sleep() {
		System.out.println("동물이 자고 있습니다.");
	}
}

//추상클래스 Animal을 상속받는 Chicken 클래스
class Chicken extends Animal{
	
	@Override
	public void sound() {
		System.out.println("꼬꼬댁");
	}
}
public class AbstractExample {

	public static void main(String[] args) {
//		Animal animal = new Animal(); -> 추상클래스는 인스턴스화 할 수 없다.
		Chicken chicken = new Chicken();
		chicken.sound();
		chicken.sleep();

	}

}
