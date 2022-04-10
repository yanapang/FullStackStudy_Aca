package exam03;

import java.util.InputMismatchException;
import java.util.Scanner;

//사용자 에게 두개의 정수를 입력받아 나누기 한 결과를 출
public class DivTest {
	public static void main(String[] args) {
		int a,b,div;
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("첫번째 수를 입력하세요: ");
			a = sc.nextInt();
			System.out.print("두번째 수를 입력하세요: ");
			b = sc.nextInt();
			div = a/b;
			System.out.println("나누기 결과: "+div);
		} catch(ArithmeticException e) {
			//잡을 에러 변수명 
			System.out.println("0으로는 나눌 수 없어요.");
			//에러가 날때 사용자에게 어떤 오류인지 알려주는 것.
		} catch(InputMismatchException e) {
			System.out.println("숫자형식에 맞지 않습니다.");
		}
	
	}
}
