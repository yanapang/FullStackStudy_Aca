package hw_team3;

public class SongTest {

	public static void main(String[] args) {
		Song s1 = new Song("Outward Bound", "Nana", 180);
		Song s2 = new Song("Jambalya", "Carpenters");
		Song s3 = new Song("Yesterday");
		Song s4 = new Song();

		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		System.out.println(s4.toString());
	}

}
