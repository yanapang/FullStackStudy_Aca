package exam02;

abstract class A{
	public void test() {
		System.out.println("test 입니다.");
	}
	public abstract void pro();
}

class B extends A {
	@Override
	public void pro() {
		System.out.println("B의 pro입니다.");
	}
	
}
public class AbstractTest {
	public static void main(String[] args) {
		//A ob = new A();
		//추상 클래스의 객체는 생성할 수 없다.
		
//		B ob = new B();
//		ob.pro();
		
		A ob = new B(); //부모 추상 클래스 변수에 자식 클래스를 만들어 넣을 수있다.
		ob.pro();
	}
}
