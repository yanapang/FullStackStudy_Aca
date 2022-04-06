package exam12;

import java.util.Objects;

class Person{
	String name;
	int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
//	public String toString() {
//		return "name: " + name +", age: "+ age;
//	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	@Override //(마우스 우클릭 + source ->) generate toString 
	public int hashCode() {
		return Objects.hash(age, name);
	}
	@Override //(마우스 우클릭 + source ->) generate equals 
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
	
}

public class ToStringTest {
	public static void main(String[] args) {
		int age = 20;
		System.out.println(age);
		Person kim = new Person("김민혁", 28);
		Person kim2 = new Person("김민혁", 28);
		//System.out.println(kim); //메모리상의 주소값을 return 하고 있음 exam12.Person@5e91993f
		//객체를 구성하고 있는 속성을알고 싶으면, Object 의 toString()을 오버라이딩 	
		System.out.println(kim);
		System.out.println(kim2.toString());
		//toString() 써도 안써도 출력문에 객체를 표현하면 toString이 자동 출력된다.
		
		if (kim.equals(kim2)) {
			System.out.println("같아요");
		} else {
			System.out.println("달라요");
		}
		
	}
}
