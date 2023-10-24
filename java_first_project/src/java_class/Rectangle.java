package java_class;

public class Rectangle {
	
	//private 변수 추가
	private static int count = 0;
	
	private int width;
	private int height;
	
	public static int getCount() {
		return count;
	}
	public Rectangle(int width) {
		this.width = width;
	}
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		count++;
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int area() {
		return width*height;
	}
}
