package java_first_project;

import java.util.Iterator;
import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		String name = sc.nextLine();
		System.out.println("나이를 입력하세요");
		int age = sc.nextInt();
		System.out.printf("안녕하세요! %s님(%d세)!", name, age);

	}
}