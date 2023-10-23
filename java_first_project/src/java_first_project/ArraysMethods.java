package java_first_project;
import java.util.Arrays;

public class ArraysMethods {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		
		//copyOf : 특정길이 만큼 복사한 새 배열을 반환한다.
		int[] newArr = Arrays.copyOf(arr, 5);
		System.out.println(Arrays.toString(newArr));
		
		
		//copyOfRange : 시작 인덱스부터 종료 인덱스 전까지의 부분을 복사한 새 배열을 반환한다.
		int[] newArray2 = Arrays.copyOfRange(arr, 2, 5);
		System.out.println(Arrays.toString(newArray2));
		
		//fill : 배열의 모든 요소를 주어진 값으로 채운다.
		Arrays.fill(arr, 10);
		System.out.println(Arrays.toString(arr));
		int[] arr2 = new int[5];
		arr2[0] = 1;
		arr2[1] = 2;
		arr2[2] = 3;
		Arrays.fill(arr2, 3, arr2.length, 100);
		System.out.println(Arrays.toString(arr2));
		
		//sort : 배열을 오름차순으로 정렬한다.
		int[] arr3 = {3,2,4,5,1};
		Arrays.sort(arr3);
		System.out.println(Arrays.toString(arr3));
		
		//내림차순 정렬
		int[] reverseArr = new int[5];
		for(int i= arr3.length-1, j =0; i>=0 ; i--, j++) {
			reverseArr[j] = arr3[i];
		}
		System.out.println(Arrays.toString(reverseArr));
		
		//equals : 두 배열이 같은지 여부확인
		int[] arr4 = {1,2,3,4,5};
		System.out.println(Arrays.equals(arr3, arr4));
		
		//deepEquals : 다차원 배열
		int[][] arrs1 = {{1,2},{3,4}};
		int[][] arrs2 = {{1,2},{3,4}};
		System.out.println(Arrays.deepEquals(arrs1, arrs2));
		
		//binarySearch : 
		int index = Arrays.binarySearch(arr3, 2);
		System.out.println(index);
	}

}
