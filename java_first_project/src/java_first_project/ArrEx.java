package java_first_project;

import java.util.Arrays;
import java.util.Scanner;

public class ArrEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] intArray = new int[5];	//크기가 5인 int 배열추가
		
		System.out.println("숫자 5개인 배열을 입력해주세요.");
		for(int i=0; i<intArray.length ; i++) {
			intArray[i] = sc.nextInt();
		}
		//방법2 : Arrays.toString 배열의 요소를 문자열로 변환
		System.out.print(Arrays.toString(intArray));
		System.out.println(intArray);
		
		//방법3 : for-each 문 사용
		int sum = 0;
		for(int arr: intArray) {
			System.out.print(arr+" ");
			sum += arr;
		}
		System.out.println(sum);
	}
}
