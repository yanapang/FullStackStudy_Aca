package exam14;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapTest02 {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String,String>();
		map.put("이름: ","홍길동");
		map.put("나이: ","20");
		map.put("주소: ","서울");
		System.out.println(map);
		//{나이: =20, 이름: =홍길동, 주소: =서울}
		//순서를 유지하지 않는다.
		
		LinkedHashMap<String, String> map2 = new LinkedHashMap<String,String>();
		map2.put("이름: ","홍길동");
		map2.put("나이: ","20");
		map2.put("주소: ","서울");
		System.out.println(map2);
		//{이름: =홍길동, 나이: =20, 주소: =서울}
		//순서를 유지한다.
		
		TreeMap<String, String> map3 = new TreeMap<String,String>();
		map3.put("이름: ","홍길동");
		map3.put("나이: ","20");
		map3.put("주소: ","서울");
		System.out.println(map3);
		//key를 기준으로 정렬한다.
		//{나이: =20, 이름: =홍길동, 주소: =서울}
	}

}
