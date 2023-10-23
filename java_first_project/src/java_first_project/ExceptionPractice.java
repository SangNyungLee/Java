package java_first_project;

public class ExceptionPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[4];
		
		try {
			for (int i=0; i<5;i++) {
				arr[i] = i;
				System.out.println(i+1);
			}
		} catch (Exception e) {
			System.out.println("인덱스 범위를 벗어났습니다.");
		}
	}

}
