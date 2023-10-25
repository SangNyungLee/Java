package java_interface;

interface Controller{
	void powerOn();
	void powerOff();
	static void display() {
		System.out.println("DisplayOn");
	}
}

class TV implements Controller{

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("TV Power ON");
		
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("TV Power OFF");
	}
	
}
class Computer implements Controller{

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("Computer Power OFF");
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("Computer Power OFF");
	}
	
}
public class InterfaceExample {
	public static void main(String [] args) {
		TV tv = new TV();
		Computer computer = new Computer();
		
		tv.powerOn();
		tv.powerOff();
		computer.powerOn();
		computer.powerOff();
		Controller.display();
		
	}
}
