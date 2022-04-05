package exam01;

public class Person {
	private String name;
	private int age;
	
	//멤버에 접근하여 값을 변경시키는 메소드 => setter(설정자)
	//name에 접근하여 값을 설정하는 메소드를 만들어요. 
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
