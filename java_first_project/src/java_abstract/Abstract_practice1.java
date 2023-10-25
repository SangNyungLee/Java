package java_abstract;

abstract class Student{
	private String name;
	private String school;
	private int age;
	private int grade;
	

	abstract public void todo();
	abstract public String introduce();
//	public void introduce(String name, String school, int age, int grade) {
//		this.name = name;
//		this.school = school;
//		this.age = age;
//		this.grade = grade;
//	}
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSchool() {
		return school;
	}


	public void setSchool(String school) {
		this.school = school;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getGrade() {
		return grade;
	}


	public void setGrade(int grade) {
		this.grade = grade;
	}
	
}

class Kim extends Student{
	
	public Kim() {
		super.setName("김민재");
		super.setSchool("중앙대");
		super.setAge(20);
		super.setGrade(18);
	}
	@Override
	public void todo() {
		System.out.println("점심은 김가네 김밥");
	}
	
	@Override
	public String introduce() {
		return "이름은: " + getName() +" 학교는: " + getSchool() + " 나이는: " + getAge() + " 학번은: " + getGrade();
	}
}

class Baek extends Student{
	
	@Override
	public void todo() {
		System.out.println("점심은 백종원 피자");
	}
	
	public String introduce() {
		return "이름은: " + getName() +" 학교는: " + getSchool() + " 나이는: " + getAge() + " 학번은: " + getGrade();
	}
}
public class Abstract_practice1 {
	public static void main(String[] args) {
		Kim kim = new Kim();
		Baek baek = new Baek();
		kim.todo();
		System.out.println(kim.introduce());
		baek.todo();
		baek.setName("백종원");
		baek.setSchool("연세대학교");
		baek.setAge(24);
		baek.setGrade(21);
		System.out.println(baek.introduce());
	}
}
