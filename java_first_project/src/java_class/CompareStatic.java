package java_class;


//static변수 없는 경우

class WithoutStatic{
	private int registered = 0;
	private String name;
	
	public WithoutStatic(String name) {
		this.name = name;
		registered++;
	}
	
	public int getRegistered() {
		return registered;
	}
}

//static 변수가 있는 경우
class WithStatic{
	private static int registered = 0;
	private String name;
	
	public WithStatic(String name) {
		this.name = name;
		registered++;
	}
	
	public int getRegistered() {
		return registered;
	}
}
public class CompareStatic {
	public static void main(String[] args) {

		//static이 없는 경우
		WithoutStatic a = new WithoutStatic("홍길동");
		WithoutStatic b = new WithoutStatic("최배달");
		
		System.out.println("Without Static");
		System.out.println("홍길동 : " + a.getRegistered());
		System.out.println("최배달 : " + b.getRegistered());
		
		//static이 있는 경우
		WithStatic c = new WithStatic("홍길동v2");
		WithStatic d = new WithStatic("최배달v2");
		
		System.out.println("With Static");
		System.out.println("홍길동v2 : "+ c.getRegistered());
		System.out.println("최배달v2 : "+ d.getRegistered());
	}

}
