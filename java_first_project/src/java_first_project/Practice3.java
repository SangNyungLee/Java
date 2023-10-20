package java_first_project;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		String name = sc.next();
		
		switch(name) {
		case "홍길동":
			System.out.println("남자");
			break;
		case "성춘향":
			System.out.println("여자");
			break;
		default:
			System.out.println("모르겟어요");
		}

	}

}
