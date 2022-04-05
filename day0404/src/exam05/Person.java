package exam05;

public class Person {
	private String name;
	private int age;
	
	//생성자가 매개변수를 가질 수 있다.
	public Person(String n, int a) {
		name = n;
		age = a;
	}
	//생성자 함수가 중복 될 수 있다.**overload**
	public Person() {
		name = "홍길동";
		age= 20;
	}
	public Person(String n) {
		name = n;
		age = 20;
	}
	public Person(int a) {
		name = "홍길동";
		age = a;
	}
	//_________________________________________________
	
	//생성자 값 외에 다른 값으로 바꾸고 싶을때 setter 사용해야함으로 keep.
	public void setName(String n) {
		name = n;
	}
	//age에 접근하여 값을 설정하는 메소드를 만든다.
	public void setAge(int a) {
		age = a;
	}
	
	//멤버에 접근하여 값을 읽어오는 기능들 => getter(접근자)
	//name 반환하는 메소드. 
	public String getName()	{
		return name;
	}
	//age반환하는 메소드.
	public int getAge() {
		return age;
	}
	
	public void eat(String food) {
		System.out.println(age+"살 "+name+"이(가) "+food+"를(을) 먹어요! ");
	}
	public void wash(String soap) {
		System.out.println(age+"살 "+name+"이(가) "+soap+"(으)로 씻어요! ");
	}

}
