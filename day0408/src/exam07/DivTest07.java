package exam07;

public class DivTest07 {
	//두개의 정수를 매개변수로 전달받아 나누기한 결과를 출력하는 메소드 
	public static void calcDiv(int a, int b) {
		//메소드 안에서 직접 예외처리.
		try {
			int div = a/b;
			System.out.println("나누기결과:"+div);
		} catch(ArithmeticException e) {
			System.out.println("0 으로 나눌 수 없어요.");
		}
	}
	
	public static void main(String[] args) {
		calcDiv(9,0);
	}

}
