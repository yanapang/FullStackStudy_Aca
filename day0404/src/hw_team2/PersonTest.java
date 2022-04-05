package hw_team2;

public class PersonTest {

	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person("이나라", "987-432-4322", "031-0000-0000", "nara@naver.com");
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		
	}

}
