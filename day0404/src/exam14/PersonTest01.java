package exam14;

//생성자를 만들지 않으면 자바가 기본 생성자를 만들어줌. 
class Person{
	private String name;
	int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}

public class PersonTest01 {
	public static void main(String[] args) {
		Person p= new Person();
		System.out.println("기본생성자로 객체를 생성할 수 있습니다.");
		System.out.println("이름: "+ p.getName());
		System.out.println("나이: "+ p.getAge());
	}

}
