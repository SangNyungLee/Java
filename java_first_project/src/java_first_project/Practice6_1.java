package java_first_project;

public class Practice6_1 {
	
	public double calc(double radius) {
		return Math.PI * radius * radius;
	}
	public double calc(double w, double h) {
		return w * h;
	}
	public double calc(double w, double h, boolean isT) {
		if(isT) {
			return w * h * 0.5;
		}else {
			return calc(w, h);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Practice6_1 calc = new Practice6_1();
				

	}

}
