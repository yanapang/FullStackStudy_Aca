package day0330;
//중첩반복문 이용해 구구단 출력.
public class Prac_GugudanLoop {

	public static void main(String[] args) {
		for (int dan=2; dan<=9; dan++) {
			System.out.println(dan+"단");
			for(int j=1; j<=9; j++) {
				System.out.println(dan+"*"+j+"="+(dan*j));
			}
			System.out.println("---------");
		}

	}

}
