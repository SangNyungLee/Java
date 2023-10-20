package java_first_project;

import java.util.Arrays;
import java.util.Scanner;

public class ArrEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] intArray = new int[5];	//크기가 5인 int 배열
		
		System.out.println("숫자 5개인 배열을 입력해주세요.");
		for(int i=0; i<intArray.length ; i++) {
			intArray[i] = sc.nextInt();
		}
		//Arrays.toString 배열의 요소를 문자열로 변환
		System.out.print(Arrays.toString(intArray));
	}
}
