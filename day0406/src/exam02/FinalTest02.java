package exam02;

/*final*/ class A {
	public void pro() {
		System.out.println("A의 pro 입니다.");
	}
	 
	public final void hello() { //상속 받은 자식 클래스에서 오버라이딩 막음.
		System.out.println("Hello.");
	}
}

class B extends A {
	public void pro() {
		System.out.println("B의 pro입니다.");
	}
//	public void hello() {
//		//부모로부터 물려받은 final메소드는 오버라이딩 불가.
//	}
}

public class FinalTest02 {
	public static void main(String[] args) {
		A a= new A();
		
	}
}
