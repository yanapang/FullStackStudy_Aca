package exam03;

interface A{
	//only constant, abstract method; 상수와, 추상 메소드만으로 구성됨.
	public /*final*/ int a = 10;
	public /*abstract*/ void pro();
	//완전 추상의 개념이므로, body가 있는 메소드가 올수가 없다.
}

interface B{
	public int b = 20;
	public void test();
}

class C implements A,B {
	@Override
	public void test() {
		System.out.println("test");
	}
	@Override
	public void pro() {
		System.out.println("pro");
	}
}

public class InterfaceTest {
	public static void main(String[] args) {
		C ob = new C();
		ob.pro();
		ob.test();

	}
}
