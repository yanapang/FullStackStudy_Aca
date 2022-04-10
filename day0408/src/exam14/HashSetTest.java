package exam14;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("사과");
		set.add("포도");
		set.add("수박");
		set.add("딸기");
		set.add("포도");
		System.out.println(set);
	}

}
