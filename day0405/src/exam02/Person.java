package exam02;

class Person01 {
	String name;
	int age;
	static String addr;	
	
	public void sayHello() { //객체의 메소드를 사용하려면 객체를 생성해야 한다.
		System.out.println("안녕, "+ name);
	}
	public static void pro() { //객체와 무관하게 동작하고 싶음. static붙임. 
		System.out.println("Person의 pro입니다.");
	}
}



public class Person {	
	public static void main(String[] args) {
		Person01.pro();
		//static 메소드는 객체 생성과 무관하게 호출 할 수 있다.
		//클래스 이름으로 접근한다.
		
		Person01.addr ="서울시 마포구 서교동";
		System.out.println(Person01.addr);
		//객체 없이 생성해야 하므로, 클래스 이름으로 접근한다. 
		
		
		Person01 kim = new Person01();
		Person01 lee = new Person01();
		kim.name = "김민혁";
		kim.age = 28;
		lee.name = "이진주";
		lee.age = 26;
		
		kim.sayHello();
		lee.sayHello();
		
		System.out.println(kim.name + ","+kim.age+","+kim.addr);
		System.out.println(lee.name + ","+lee.age+","+lee.addr);
		
		kim.addr = "제주도 서귀포시 애월읍"; //kim의 addr를 바꾸면 모든 addr가 바뀜.
		System.out.println(kim.addr);
		System.out.println(lee.addr);
		System.out.println(Person01.addr);
		
	}
}
