package java_interface;

interface Move {
	void moveForward();
	void moveBackward();
}

interface Power{
	void powerOn();
	void powerOff();
}

//인터페이스는 인터페이스를 상속받을 수 있다.
interface Car extends Move, Power{
	void changeGear(int gear);
}

class Suv implements Car{

	@Override
	public void moveForward() {
		System.out.println("앞으로가기");
	}

	@Override
	public void moveBackward() {
		System.out.println("뒤로가기");
	}

	@Override
	public void powerOn() {
		System.out.println("전원켜기");
		
	}

	@Override
	public void powerOff() {
		System.out.println("전원끄기");
		
	}

	@Override
	public void changeGear(int gear) {
		System.out.println("기어 " + gear+"단으로 변경");
		
	}
	
}
public class InterfaceExample2 {
	public static void main(String [] args) {
		Suv suv = new Suv();
		
		suv.moveForward();
		suv.moveBackward();
		suv.changeGear(4);
	}

}
