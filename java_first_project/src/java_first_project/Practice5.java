package java_first_project;

import java.util.Scanner;

public class Practice5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 두개를 입력하세요.");
		double a = sc.nextInt();
		double b = sc.nextInt();
		
		
		System.out.println("덧셈결과: "+ (a+b));
		System.out.println("뺄셈결과: "+ (a-b));
		System.out.println("나눗셈결과: "+ (a/b));
		System.out.println("곱셈결과: "+ (a*b));
		
	}

}
