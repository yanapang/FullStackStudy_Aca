package exam08;

public class CarTest {

	public static void main(String[] args) {
		Car c1 = new Car("K5", "Black");
		System.out.println(c1.getKilosPerLiter());
		c1.speedUp(100);
		c1.printSpeed();
		c1.speedDown(50);
		c1.printSpeed();
		c1.turnRight();
		System.out.println("-----------------------");
		Car c2 = new Car("람보르기니", "White");
		c2.speedUp(200);
		c2.printSpeed();
	}

}
