package java_first_project;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionPractice2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			int result = 0;
			System.out.print("배열의 크기를 입력해주세요 : ");
			int a = sc.nextInt();
			int [] arr = new int[a];
			System.out.print("배열의 요소를 입력해주세요 : ");
			for (int i=0; i<arr.length ; i++) {
				arr[i] = sc.nextInt();
			}
			for (int i=0; i<arr.length ; i++) {
				result += arr[i];
			}
			System.out.println("배열의 평균은 : "+result/arr.length);
		} catch (InputMismatchException e) {
			System.out.println("입력오류. 정수를 입력하세요");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 범위를 벗어났습니다.");
		} catch(NumberFormatException e) {
			System.out.println("숫자 변환오류 입니다.");
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}catch(NullPointerException e) {
			System.out.println("값을 입력해주세요");
		}catch(NegativeArraySizeException e) {
			System.out.println("배열의 값은 음수가 될 수 없습니다.");
		}
	}

}
