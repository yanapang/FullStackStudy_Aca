package exam10;

public class ThrowTest {
	public static void main(String[] args) {
		System.out.println("hello");
		
		throw new ArithmeticException();
		//강제로 예외발생시킴, 더이상 진행되지 않음.
		//System.out.println("java");
	}
	
}
