package hw2;

//dog class
class Dog {
	private String name;
	private String breed;
	private int age;
	
	//method
	public Dog (String name, int age){
		this.name = name;
		breed = "none";
		this.age = age;
	}
	public Dog (String name, String breed, int age) {
		this.name = name;
		this.breed = breed;
		this.age = age;
	}
	public String barking() {
		return "warf warf";
	}
	
	public String toString() {
		return "강아지 이름: " + name + "\t" +
				"종류: "+ breed + "\t"+
				"나이: "+ age;
	}
}

//main
public class Program04 {
	public static void main(String[] args) {
		Dog d1 = new Dog("Yoki", "Yorkshire", 3);
		Dog d2 = new Dog("Tori", "Husky", 5);
		
		System.out.println(d1.barking());
		System.out.println(d2.barking());
		
		System.out.println(d1.toString());
		System.out.println(d2.toString());
	}
}
