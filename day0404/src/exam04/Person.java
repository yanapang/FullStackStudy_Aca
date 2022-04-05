package exam04;

public class Person {
	private String name;
	private int age;
	
	//생성자 만들기
	public Person() {
		name = "김민혁";
		age = 28;
		System.out.println("생성자가 동작하였습니다.");
	}
	
	
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
