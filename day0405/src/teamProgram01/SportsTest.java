package teamProgram01;
//Problem no.3 (Page 275)

class Sports {
	public String getName() {
			return "아직결정되지 않음";
	}
	public int getPlayers() {
			return 0;
	}
}

class Soccer extends Sports {
	public String getName() {
			return "축구";
	}
	public int getPlayers() {
			return 11;
	}
}

public class SportsTest {
	public static void main(String[] args) {
		Soccer s = new Soccer();
		System.out.println("경기이름: "+ s.getName());
		System.out.println("경기자수: "+ s.getPlayers());
	}
}
