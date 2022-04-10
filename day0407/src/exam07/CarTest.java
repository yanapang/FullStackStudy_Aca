package exam07;


public class CarTest {
	public static void main(String[] args) {
//		Car car = new Car("K5", "Black");
//		car.speedUp(100);
//		car.speedDown(50);
		//Card은 Movable을 구현한 클래스. is-a관계.
		
		//Movable m = new Car("K5","Black");
		//부모 변수에 자식변수를 넣을 수 있음.
		//m.speedUp(100);
		//m.speedDown(50);
		//부모 클래스에서 이미 선언 되었던 메소드라 호출 가능.
		//m.turnLeft(); 
		//자식 클래스에서 추가된 메소드는 부모 참조변수로 호출할 수 없다.
		//((Car)m).turnLeft();
		//캐스팅을 통해자식 클래스로 형변환 해주면 사용 가능.
		
		//Movable m = new Car("K5", "Black"); 가능!
		//Car c = m;//자식의 참조 변수가 부모의 참조변수를 가르킬 수 없다. 
		//Car c = (Car)m; //타입 캐스팅하면 가능!
		Car c = new Car("K5", "Black"); //가능
		//Movable m = c; //가능, 부모의참조변수에 자식 객채를 참조할 수 있다!
		Movable m = (Movable)c; //가능! 자식의 객체를 부모클래스로 형변환 하여 참조시킬 수 있다.
	}
}
