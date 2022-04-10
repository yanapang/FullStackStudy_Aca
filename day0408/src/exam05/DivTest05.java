package exam05;

//프로그램 실행시 두개의정수를 전달받아 나누기 한 결과를 출력
//사용자 에게 두개의 정수를 입력받아 나누기 한 결과를 출
public class DivTest05 {
	public static void main(String[] args) {
		int a,b,div;
		
		try {
			//프로그램 실행시 입력 받음.
			//run -> run configuration
			a = Integer.parseInt(args[0]);
			b = Integer.parseInt(args[1]);
			div = a/b;
			System.out.println("나누기 결과: "+div);
		} catch(ArithmeticException e) {
			System.out.println("0 으로는 나눌 수 없어요.");
		} catch(Exception e) {
			System.out.println("나누기 할 두개의 정수를 전달 해 주세요!");
		} finally { //예외 발생 여부와 상관 없이 반드시 동작하는 부분!
			System.out.println("작업종료.");
		}
	}
}
