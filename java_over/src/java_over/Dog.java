package java_over;

public class Dog extends Animal{

	public Dog(String species, String name, int age) {
		super(species, name, age);
		
	}
	@Override
	public String makeSound() {
		return "종류 : " +super.getSpecies() + " 이름 : " +super.getName() + " 나이 : " + super.getAge() +"\n 멍멍소리낸다";
	}
}
