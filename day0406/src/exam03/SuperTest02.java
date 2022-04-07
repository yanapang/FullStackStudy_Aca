package exam03;

class Person {
	String name;
	int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
}

class Student extends Person{
	String major;
	public Student(String name, int age, String major) {
		//super(); 부모의 매개변수 없는 생성자가 생략되어 있어서 오류가 나옴.
		super(name, age); //부모의 매개변수를 갖는 생성자를 동작시킴.
		this.major = major;
	}
}
public class SuperTest02 {
	public static void main(String[] args) {
		
	}
}
