package exam08;

public class DivTest08 {
	//호출하는 쪽으로 예외처리 맡겨버림 throws 사용.
	public static void calcDiv(int a, int b) throws ArithmeticException{
			int div = a/b;
			System.out.println("나누기결과:"+div);
	}
	
	public static void main(String[] args) {
		//메소드 호출 부분에서 예외처리 맡김.
		try {
			calcDiv(9,0);
		} catch(ArithmeticException e) {
			System.out.println("0으로 나눌수 없어요.");
		}
	}
}
