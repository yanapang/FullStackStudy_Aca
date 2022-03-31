package day0330;

public class WhileAndDoWHile {

	public static void main(String[] args) {
		int i=10;
		//처음부터 조건을 만족하지 않은 상황일때에
		//while문으 반복문을 한번도 실행하지 않아요.
		while(i<=5) {
			System.out.println("hello");
			i++;
		}
		
		System.out.println("------------------");
		//처음부터 조건을 만족하지 않는 상황이라도
		//적어도 반복문을 한번 실행.
		int j=10;
		do {
			System.out.println("hello");
			j++;
		} while(j<=5);
	}

}
