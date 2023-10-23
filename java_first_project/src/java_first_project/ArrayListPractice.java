package java_first_project;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<String> arr = new ArrayList<>();
		
		while(true) {
			System.out.print("문자를 입력해주세요 : ");
			String a = sc.nextLine();
			if(a.equals("exit")) {
				break;
			}
			arr.add(a);
		}
		for(int i=0 ; i<arr.size() ; i++) {
			System.out.println(arr.get(i));
		}
		
	}

}
