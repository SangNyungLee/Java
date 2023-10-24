package java_over;

public class Cat extends Animal{

	public Cat(String species, String name, int age) {
		super(species, name, age);
	}
	
	@Override
	public String makeSound() {
		return "종류 : " +super.getSpecies() + " 이름 : " +super.getName() + " 나이 : " + super.getAge()+"\n 야옹소리를 낸다.";
	}

}
