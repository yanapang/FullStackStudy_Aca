package day0404;

public class PersonTest {

	public static void main(String[] args) {
		Person kim; //int a; 와 같은 수준.
		kim = new Person();//기본 자료형은 a=4; 와 같이 바로 사용가능하지만,클래스 객체는 생성 먼저 해줘야함.
		kim.name = "김민혁";
		kim.age = 28;
		kim.wash("샴푸");
		kim.eat("우유");
		
		Person park;
		park = new Person();
		park.name = "박정수";
		park.age = 30;
		park.eat("초밥");
		park.wash("바디워시");
	}

}
