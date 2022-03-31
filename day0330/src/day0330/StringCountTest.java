package day0330;

public class StringCountTest {

	public static void main(String[] args) {
		String data="hello java";
		
		for (int i=0; i<data.length(); i++) {
			char ch = data.charAt(i);
			System.out.print(ch);
			
		}
		
//		int cnt = data.length();
//		System.out.println(cnt);
//		
//		char ch = data.charAt(0);
//		System.out.println(ch);
//		
//		char ch2 = data.charAt(1);
//		System.out.println(ch2);
//		
//		char ch3 = data.charAt(5);
//		System.out.println("|"+ ch3+ "|");
//		//빈칸 문자(공백)도 엄연히 하나의 문자로 처리된다.
		
	}

}
