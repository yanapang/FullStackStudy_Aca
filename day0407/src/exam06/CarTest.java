package exam06;


public class CarTest {
	public static void main(String[] args) {
		//Vehicle v = new Vehicle();
		//anonymous inner Type, Error. 생성 불가.
		//추상 클래스의 객체는 생성할 수 없다.
		Car c = new Car();
		System.out.println(c.getKilosPerLiter());
		c.printSpeed();
	}
}
