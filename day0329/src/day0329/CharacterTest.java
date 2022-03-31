package day0329;

public class CharacterTest {

	public static void main(String[] args) {
		char a = 'È«';
		String b = "È«±æµ¿";
		String c = "È«";
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		//char d = "È«"; char¿¡ " "»ç¿ëÀ¸·Î ¿À·ù ³².
		//String e = 'È«'; String¿¡ ' ' »ç¿ëÀ¸·Î ¿À·ù.
		
		String data = "hello";
		char first = data.charAt(0);
		System.out.println(first);
	}

}
