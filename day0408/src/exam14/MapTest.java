package exam14;

import java.util.HashMap;

public class MapTest {

	public static void main(String[] args) {
		HashMap<String,String> data = new HashMap<String, String>();
		data.put("name", "홍길동");
		data.put("phone", "010-1234-5678");
		data.put("addr", "서울시 마포구 서교동");
		
		System.out.println("이름: "+data.get("name"));
		System.out.println("전화: "+data.get("phone"));
		System.out.println("주소: "+data.get("addr"));
		
		String oldPhone = data.put("phone", "010-1234-7777");
		System.out.println(oldPhone);
		System.out.println(data);
		//중복된 key에 값을 추가하면, 원래 값을 반환하고 value를 새로운 값으로 변경한다.
		
		String title=data.get("title");
		System.out.println(title);
		//존재하지 않는 key의 값을 요구하면 null을 반환한다. 
	
	}
	
}
