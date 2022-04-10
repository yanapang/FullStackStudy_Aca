package teamProgram07;

import java.util.HashMap;
import java.util.Scanner;

public class MapTest {

	public static void main(String[] args) {
		HashMap<String, String> capital = new HashMap<String,String>();
		capital.put("USA", "Washington");
		capital.put("Japan", "Tokyo");
		capital.put("China", "Beijing");
		capital.put("UK", "London");
		capital.put("Korea", "Seoul");
		
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("국가 이름을 입력하시오: ");
			String key = sc.next();
			if(key.equals(capital.get(key))) break;
			System.out.println(key+"의 수도: "+capital.get(key));
		}while(true);
		
	}
}
