package exam02;

class Person{
	String name = "Hong";
	int age = 20;
	final static String addr = "Seoul Mapogu seogyodong";
	
}

public class FinalTest01 {
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
		
		p1.age = 21;
		p2.age = 31;
		
		//p1.addr = "Jeju"; //final 변수는 바꿀 수 없다.
		//p2.addr = "gyunggi"; //final 변수는 상수이기때문에 접근해 값 변경불가.
		//final 의 값은 어차피 바꿀 수 없는데 객체마다 만들 필요 없음!
		//메모리 공간 낭비.
		//static을 같이 넣어주면 한 공간에 저장해 계속 사용가능.
		
	}
}
