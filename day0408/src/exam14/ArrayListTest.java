package exam14;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("사과");
		list.add("포도");
		list.add("수박");
		list.add("포도");
		list.add("오렌지");
		System.out.println(list);
		//중복을 허용하며, 자료를 넣은 순서대로 저장됨.
		System.out.println(list.get(0));
		list.remove(1);
		System.out.println(list);
		list.add(0,"체리");
		System.out.println(list);
	}

}
