package java_class;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Rectangle> rects = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("사각형의 가로와 세로 길이를 띄어쓰기 기준으로 입력해주세요");
			int width = sc.nextInt();
			int height = sc.nextInt();
			
			if(width == 0 && height == 0) {
				break;
			}else {
				Rectangle rect= new Rectangle(width);
				rect.setHeight(height);
				rects.add(rect);	
			}
		}
		
		for(Rectangle value: rects) {
			System.out.printf("가로 길이는 : %d", value.getWidth()).println();
			System.out.printf("세로 길이는 : %d", value.getHeight()).println();
			System.out.printf("넓이는 : %d", value.area()).println();
			
		}
		System.out.println("Rectangle 인스턴스 개수는 : " + Rectangle.getCount());
	}

}
