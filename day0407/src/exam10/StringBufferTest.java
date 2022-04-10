package exam10;

public class StringBufferTest {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("hello");
		//sb = sb+" Java";
		sb.append(" java");
		System.out.println(sb);
	}
}
