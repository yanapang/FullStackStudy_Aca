package exam13;

import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
		//String data = "홍길동,이순신,유관순,김유신";
		//String data = "홍길동:이순신:유관순:김유신";
		String data = "홍길동 이순신 유관순 김유신";
//		StringTokenizer st = new StringTokenizer(data, ",");
//		StringTokenizer st = new StringTokenizer(data, ":");
		StringTokenizer st = new StringTokenizer(data, " ");
		
		while(st.hasMoreTokens()) { //다음 토큰이 있는 동안 
			String name = st.nextToken();
			System.out.println(name);
		}
		
		
//		String a = st.nextToken(); //하나씩 꺼내오는 메소드.
//		String b = st.nextToken();
//		String c = st.nextToken();
//		String d = st.nextToken();
//		
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//		System.out.println(d);
		
	}

}
