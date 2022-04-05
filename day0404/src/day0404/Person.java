package day0404;
/*
사람 Person

속성
	이름 String name “홍길동”
	나이 int age “20”
동작
	먹는다 void eat(String food)
	씻는다 void wash(String soap)
 */

public class Person { //설계도
	String name;
	int age;
	void eat(String food) {
		System.out.println(age+"살 "+name+"이(가) "+food+"를(을) 먹어요.");
	}
	void wash(String soap) {
		System.out.println(age+"살 "+name+"이(가) "+soap+"으로 씻어요.");
	}
}
//클래스 형의 변수: 객체
//설계도에 의한 사람을 만들어보자. 

