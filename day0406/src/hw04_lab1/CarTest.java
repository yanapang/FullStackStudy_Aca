package hw04_lab1;

abstract class Vehicle {
	protected int speed;
	public abstract double getKiloPerLiter();
	//생성
	public void printSpeed() {
		System.out.println("현재속도: "+ speed);
	}
}

class Car extends Vehicle {
	@Override //리터당 갈 수 있는 거리 킬로미터 
	public double getKiloPerLiter() {
		return 13;
	};
}

public class CarTest {
	public static void main(String[] args) {
		//Vehicle v = new Vehicle(130);
		Car c = new Car();
		System.out.println(c.getKiloPerLiter());
		c.printSpeed();
	}
}
