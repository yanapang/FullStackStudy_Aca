package exam09;
//ArithmeticException은 RuntimeException의 후손이다.
//RuntimeException은 따로 예외처리를 하지 않아도 컴파일이 되고실행됨.
//필요하다면 사용자가 따로 예외처리 가능.
public class DivTest09 {
	//호출하는 쪽으로 예외처리 맡겨버림 throws 사용.
	public static void calcDiv(int a, int b) throws ArithmeticException{
			int div = a/b;
			System.out.println("나누기결과:"+div);
	}
	
	public static void main(String[] args) {
		calcDiv(9,0);
	}
}
