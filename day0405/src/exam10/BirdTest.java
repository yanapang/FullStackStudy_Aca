package exam10;

//하늘을 나는 새.
class Bird {
	protected String name;
	protected String color;
	protected boolean wing;
	
	public Bird(String name, String color, boolean wing) {
		super();
		this.name = name;
		this.color = color;
		this.wing = wing;
	}


	public Bird() {
		super();
		// TODO Auto-generated constructor stub
	}


	public void fly() {
		if (wing == true) {
			System.out.println(color + "색 "+ name + "이(가) 펄럭~펄럭~");
		} else {
			System.out.println(color + "색 "+name + "이(가) 날수없어요.");
		}
	}
}
//비행기
class Plane extends Bird{
	private boolean engine;

	public Plane(String name, String color, boolean wing, boolean engine) {
		super(name, color, wing);
		this.engine = engine;
	}

	public Plane() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void fly() {
		if (wing == true && engine == true) {
			System.out.println(color + "색 "+ name + "이(가) 슈우웅~");
		} else {
			System.out.println(color + "색 "+name + "이(가) 날수없어요.");
		}
	}
}

public class BirdTest {
	public static void main(String[] args) {
		Bird b1 = new Bird("참새", "노랑", true);
		Bird b2 = new Bird("까치", "검은색", false);
		
		b1.fly();
		b2.fly();
		
		Plane p = new Plane("Boing747", "Skyblue", true, true);
		p.fly();
	}

}
