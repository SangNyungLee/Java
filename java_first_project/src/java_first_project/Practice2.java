package java_first_project;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		if(age >= 1 && age <=7) {
			System.out.println("유아");
		} else if(age >= 8 && age <= 13) {
			System.out.println("초등학생");
		} else if(age >= 14 && age <= 16) {
			System.out.println("중학생");
		} else if(age >= 20) {
			System.out.println("성인");
		}
	}

}
