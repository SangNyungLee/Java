package java_first_project;

import java.util.Scanner;

public class Practice6 {
	public double pi(int a) {
		return a*a*Math.PI;
	}
	public double pi(int a, int b) {
		return a*b;
	}
	public double pi(double a, int b) {
		return a*b/2;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Practice6 calc = new Practice6();
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름의 길이를 입력해주세요 : ");
		int a = sc.nextInt();
		System.out.println("반지름이 "+a+ "인 원의 넓이 : "+ calc.pi(a));
		System.out.print("직사각형의 가로, 세로 길이를 입력해주세요 : ");
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println("가로 "+b+", 세로 "+c+"인 직사각형의 넓이: "+ calc.pi(b,c));
		System.out.print("삼각형의 밑변과 높이의 길이를 입력해주세요 : ");
		double d = sc.nextInt();
		int e = sc.nextInt();
		System.out.println("밑변 "+d+", 높이"+e+"인 삼각형의 넓이 : " + calc.pi(d,e));
	}

}
