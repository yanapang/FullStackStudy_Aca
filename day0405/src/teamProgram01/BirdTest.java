package teamProgram01;
//Problem no.2 (Page 275)
class Animal {
	void walk() {
		System.out.println("걸을 수 있음");
	}

	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
class Bird extends Animal {
	void fly() {
		System.out.println("날을 수 있음");
	}
	void sing() {
		System.out.println("노래 부를 수 있음");
	}
	
	public Bird() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}

public class BirdTest {

	public static void main(String[] args) {
		Bird bird = new Bird();
		bird.walk();
		bird.fly();
		bird.sing();

	}

}
