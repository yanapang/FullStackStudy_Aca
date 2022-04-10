package exam06;

//Power Java. 인터페이스와 다형성 Lab 1번문제. (04/06 pdf)
public abstract class Vehicle {
	int speed; //추상클래스에 변수를 추가할 수 있다.
	public abstract double getKilosPerLiter();
	
	//추상클래스에 body구체화된 메소드를 추가할 수 있다.
	public void printSpeed() {
		System.out.println("현재속도: "+ speed);
	}
}
