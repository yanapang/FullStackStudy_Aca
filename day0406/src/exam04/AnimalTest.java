package exam04;

abstract class Animal {
	//모든 동물은 움직인다.
		//사자, 뱀, 새 움직이는 방법이 다름.
		
		//abstract라고 추상메소드를 선언 해주면, 자식 클래스들은 무조건 오버라이딩을 해야한다.
		public abstract void move();
		
		public void pro() {
			//자식 클래스가 오버라이딩 해도, 안해도 됨.
		}
}

class Lion extends Animal {
	public void move() {
		System.out.println("사자는 네발로 걷거나 뛰어서 움직입니다. ");
	}
}

class Snake extends Animal {
	@Override
	public void move() {
		System.out.println("뱀은 기어서 움직입니다.");
	}
}

class Bird extends Animal {
	@Override
	public void move() {
		System.out.println("새는 날아서 움직입니다.");
	}
	
}

public class AnimalTest {
	public static void main(String[] args) {	
		Lion lion = new Lion();
		Snake snake = new Snake();
		Bird bird = new Bird();
		
		lion.move();
		snake.move();
		bird.move();
		//객체에 동일한 메세지를 주었지만 객체마다 서로 동작하는 방식이 다름
		//다형성.
	}
}
