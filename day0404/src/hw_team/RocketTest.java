package hw_team;

public class RocketTest {

	public static void main(String[] args) {
		Rocket r1 = new Rocket();
		Rocket r2 = new Rocket(100, 100);
		
		System.out.println(r1.toString());
		System.out.println(r2.toString());
		
		
		r1.moveUp();
		r2.moveUp();
		
		System.out.println(r1.toString());
		System.out.println(r2.toString());
	}

}
