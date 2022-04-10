package exam04;

//하나의 클래스를 상속받고 두개의 인터페이스를 구현하는 클래스를 만들어 본다.
class A {
	String title;
	int year;
	public void pro() {
		System.out.println("pro입니다.");
	}
}

interface B {
	public void testB();
}
interface C{
	public void testC();
}

class D extends A implements B, C{

	@Override
	public void testC() {
		System.out.println("test C입니다.");
	}

	@Override
	public void testB() {
		System.out.println("test B입니다.");
	}
	//A 클래스를 상속받고, B, C 인터페이스를 구현한다.
	
}
public class InterfaceTest {

	public static void main(String[] args) {
		D ob = new D();
		ob.title = "Java";
		ob.year = 2022;
		ob.pro();
		ob.testB();
		ob.testC();
	}

}
