package java_interface;

abstract class Vehicle{
	private String name;
	private int maxSpeed;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	abstract void move(String name, int speed);
	
}
interface Flyables{
	void fly();
}
class Cars extends Vehicle{
	@Override
	public void move(String name, int maxSpeed) {
		this.setName("AUDI");
		this.setMaxSpeed(240);
		System.out.println(this.getName()+"의 속도는 : "+this.getMaxSpeed());
		System.out.println("도로를 따라 이동중"); 
	}
}

class Airplanes extends Vehicle implements Flyables{
	
	@Override
	public void move(String name, int maxSpeed) {
		this.setName("보잉747");
		this.setMaxSpeed(9999);
		System.out.println(this.getName() +"의 속도는 : "+this.getMaxSpeed());
		System.out.println("하늘을 날아가는 중");
	}

	@Override
	public void fly() {
		System.out.println("고도 10,000피트에서 비행중");
		
	}
}

public class ClassPrac {
	public static void main(String []args) {
		Cars cars = new Cars();
		Airplanes air = new Airplanes();
		Vehicle[]  vehicles= {cars, air};
		for(Vehicle vehicle: vehicles) {
			vehicle.move(vehicle.getName(), vehicle.getMaxSpeed());
			//instanceof : 객체가 특정 클래스나 인터페이스의 인스턴스인지 확인하는 연산자
			if(vehicle instanceof Flyables) {
				Flyables flyingvehicle = (Flyables) vehicle;
				flyingvehicle.fly();
			}
		}
	}

}
