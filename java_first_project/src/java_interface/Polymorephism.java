package java_interface;

//다형성
//하나의 인터페이스나 클래스를 여러가지 방식으로 동작하게 하는 것을 말한다.

//1. 일반 클래스를 사용한 다형성

class Animal{
	public void sound() {
		System.out.println("동물은 소리를 냅니다.");
	}
}
class Dog extends Animal {
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}
class Cat extends Animal{
	@Override
	public void sound() {
		System.out.println("야옹");
	}
}

//2. 추상클래스를 사용한 다형성
abstract class Shape{
	abstract double area();
}
class Circle extends Shape{
	private double radius;
	public Circle(double r) {
		this.radius = r;
	}
	
	@Override
	double area() {
		return Math.PI * radius * radius;
	}
	
}
class Rectangle extends Shape {
	private double width;
	private double height;
	
	public Rectangle(double w, double h) {
		this.width = w;
		this.height = h;
	}
	
	@Override
	double area() {
		return width * height;
	}
	
}

//인터페이스를 사용한 다형성
interface Flyable {
	void fly();
	
}
class Bird implements Flyable{

	@Override
	public void fly() {
		System.out.println("새가 날아간다.");
	}
	
}

class Airplane implements Flyable{

	@Override
	public void fly() {
		System.out.println("비행기가 날아간다. 쓩~");
		
	}
	
}
public class Polymorephism {
	public static void main(String []args) {
		
		
		//다형성을 활용하여 Animal 타입의 참조 변수로 Dog와 Cat 객체를 참조
		Animal dog = new Dog();
		Animal cat = new Cat();
		
		dog.sound();
		cat.sound();
		
		Shape s1 = new Circle(3.3);
		Shape s2 = new Rectangle(3, 6.1);
		Shape[] s3 = { new Circle(3.4), new Rectangle(4,7)};
		for(Shape s: s3) {
			System.out.printf("%.2f", s.area()).println();
		}
		
//		System.out.printf("%.2f", s1.area()).println();
//		System.out.printf("%.2f", s2.area()).println();
		
		Flyable fly = new Bird();
		Flyable fly2 = new Airplane();
		fly.fly();
		fly2.fly();
		
	}
}
