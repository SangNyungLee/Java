package java_first_project;

import java.util.Scanner;

public class ArrayPractice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int [] intArray = new int[5];
		int sum =0;
		System.out.print("5개의 정수를 입력하세요 : ");
		for(int i=0; i<intArray.length; i++) {
			intArray[i] = sc.nextInt();
		}
		System.out.println("평균은 "+ (double)sum/5);

	}

}
