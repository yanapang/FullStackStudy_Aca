package exam07;

public interface Movable {
	//int Speed =100; //인터페이스에는 상수만 올 수 있기 때문에,초깃값이 없으면 오류.
	//final int speed =100; 과 동일한 역할
	//인터페이스 내에서 변수는 자동 상수, final생략 가능.
	
	//public void printSpeed();{
	//	System.out.println("현재속도: "+ speed);
	//}
	//인터페이스 안의 메소드는 자동 추상이어서
	//인터페이스 안의 메소드가 구체화된 몸체를 갖고 있는 메소드를 가질 수 없다.
	
	public abstract void speedUp(int amount);//abstract 메소드선언.
	public void speedDown(int amount); //abstract 생략해도 오류가 나지 않음.
	//인터페이스는 완전 추상의 개념으로 abstract을 생략해도 자동 abstract이다.
}
