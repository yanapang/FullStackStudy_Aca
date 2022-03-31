package day0329;

public class ConditionalOperator {

	public static void main(String[] args) {
		int a = 5;
		int b = (a>0)?1:0;
		System.out.println(b);
		String c = (a>0)?"OK":"NO";
		System.out.println(c);
		//항2와 항3에는 문장이 올수 없다.
		//수식이나 변수, 상수가 올 수 있다.
		System.out.println((a>0)?"OK":"NO");
	}

}
