package day0331;

public class GugudanAll {

	public static void main(String[] args) {
		int dan = 2;
		while(dan<=9) {
			int i=1; //안쪽 while값에서 사용하는 변수의 초기값은, 바깥 while문 안에 써줘야 다시 초기값reset.
			System.out.println(dan+"단");
			while(i<=9) {
				System.out.println(dan+"*"+i +"="+dan*i);
				i++;
			}
			dan++;
			System.out.println("------------");
		}
	}

}
