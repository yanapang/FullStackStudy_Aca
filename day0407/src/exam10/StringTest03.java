package exam10;

public class StringTest03 {

	public static void main(String[] args) {
		char []data = {'a', 'b','c','d','e','f','g'};
		
		String data1 = new String(data);
		String data2 = new String(data, 1, 3); // 1 부터 3까지 String으로 변형하여 출력.
		System.out.println(data1);
		System.out.println(data2);
	}

}
