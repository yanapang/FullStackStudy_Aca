package exam08;

public class Car extends Vehicle implements Movable {
	private String model;
	private String color;
	
	
	public Car(String model, String color) {
		//super();
		this.model = model;
		this.color = color;
	}
	
	@Override
	public void speedUp(int amount) {
		speed+=amount;
		System.out.println(amount+ "큼 속도를 증가하였습니다.");
	}
	@Override
	public void speedDown(int amount) {
		speed-=amount;
		System.out.println(amount+ "큼 속도를 감소하였습니다.");
	}
	@Override
	public double getKilosPerLiter() {
		return 15;
	}
	public void turnRight() {
		System.out.println("우회전 합니다.");
	}
	public void turnLeft() {
		System.out.println("좌회전 합니다.");
	}
	
}
