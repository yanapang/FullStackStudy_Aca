package exam08;

public abstract class Vehicle {
	protected int speed; 
	public abstract double getKilosPerLiter();
	public void printSpeed() {
		System.out.println("현재속도: "+ speed);
	}
	public Vehicle(int speed) {
		super();
		this.speed = speed;
	}
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
