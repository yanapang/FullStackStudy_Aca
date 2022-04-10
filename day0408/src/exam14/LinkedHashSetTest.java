package exam14;

import java.util.LinkedHashSet;

public class LinkedHashSetTest {

	public static void main(String[] args) {
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		set.add("사과");
		set.add("포도");
		set.add("수박");
		set.add("포도");
		set.add("딸기");
		System.out.println(set);
	}

}
