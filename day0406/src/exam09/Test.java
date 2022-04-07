package exam09;

import java.util.ArrayList;

abstract class A{
	public abstract void pro();
}

class B extends A {
	public void pro() {
		System.out.println("B의 pro 입니다.");
	}
	public void testB() {
		System.out.println("test B입니다.");
	}
}

class C extends A {
	@Override
	public void pro() {
		System.out.println("C의 pro 입니다.");
	}
	public void testC() {
		System.out.println("testC입니다.");
	}
}

public class Test {
	public static void main(String[] args) {
//		A ob;
//		ob = new B();
//		ob.pro();
//		//ob.testB();
//		((B)ob).testB();//ob를 B로 캐스팅, 형변환.
//		
//		ob = new C();
//		ob.pro();
//		((C)ob).testC();
		
		ArrayList<A> list = new ArrayList<A>();
		list.add(new B());
		list.add(new C());
		
		for(int i=0; i<list.size();i++) {
			A ob = list.get(i);
			ob.pro();
			//만약 끄집어 내어 온 객체가 B의 자료형이면 B로 캐스팅
			if (ob instanceof B) {
				((B)ob).testB();
			} else if (ob instanceof C) {
				((C)ob).testC();
			}
			System.out.println("------------------------------");
		}
	}
}
