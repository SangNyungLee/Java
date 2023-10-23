package java_first_project;

public class Array2Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//이차원 배열로 4년 평점 구하기(1~4학년까지)
		double[][] score = {{3.5, 3.7},{3.4, 2.7},{4.1, 4.2},{3.7, 4.3}};
		
		double sum = 0;
		for(int i=0; i< score.length; i++) {
			for(int j=0 ; j<score[i].length; j++) {
				sum += score[i][j]; 
			}
		}
		int n = score.length;
		int m = score[0].length;
		System.out.println(sum/(n*m));
	}

}
