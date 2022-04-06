package exam07;

class Person {
	public Person() {
		System.out.println("Person의 생성자 동작함!");
	}
}

class Customer extends Person{
	public Customer() {
		//super(); 부모의 기본 생성자를 요구하는 명령이 생략되어 있다.
		System.out.println("Customer의 생성자 동작함.");
	}
}

public class PersonTest {
	public static void main(String[] args) {
		Customer c = new Customer();
		//Person의 생성자 먼저 동작 후 Customer의 생성자가 동작함.
	}
}
