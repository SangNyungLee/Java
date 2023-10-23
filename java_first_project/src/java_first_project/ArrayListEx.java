package java_first_project;
import java.util.ArrayList;
public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<>();
		
		//add(element)
		list.add("Google");
		System.out.println(list);
		
		//add(index, element); -> 메소드 오버로딩 이용했음 
		list.add(0, "Amazon");
		System.out.println(list);
		
		//addAll
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("Apple");
		list2.add("Samsung");
		list.addAll(list2);
		System.out.println(list);
		
		//size
		System.out.println(list.size());
		
		//contains(params) : ArrayList가 params를 포함하고 있는지 여부
		System.out.println(list.contains("Apple"));
		
		//get
		System.out.println(list.get(0));
		
		//set(index, element) : 특정한 위치에 있는 값을 교체
		list.set(2,  "Hyundai");
		System.out.println(list);
		
		//indexOf(params)
		System.out.println(list.indexOf("Google"));
		
		
		//isEmpty() 
		
		//remove(index)
		list.remove(3);
		System.out.println(list);
		
		//clear()
		list.clear();
		System.out.println(list);
	}

}
