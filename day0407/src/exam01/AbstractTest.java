package exam01;

abstract class A{
	public void test() {
		System.out.println("test 입니다.");
	}
	public abstract void pro();
	public abstract void hello();
}


public class AbstractTest {
	public static void main(String[] args) {
		A ob = new A() {//익명 클래스 
			@Override
			public void pro() {
				System.out.println("pro 입니다.");
			}
			public void hello() {
				System.out.println("hello 입니다.");
			}
		};
		//추상클래스 A를 상속받은 이름없는 클래스를 정의하면서 바로 객체를 생성.
		//추상 클래스 A에 있는 추상 메소드를 오버라이딩 해야 한다. 
		ob.pro();
		ob.hello();
		
	}
}
