package exam11;

//우리가 클래스를 만들때, settter getter 매번만들기 번거롭다. 
//생성자도 마찬가지. 
//이클립스 자동 생성 
// 마우스 오른쪽 단추 -> source -> generate getters and setters
// 필요에 따라 설정 바꿔서 generate(여기서는 volume setters는 체크 해제)

//생성자 :마우스 오른쪽 단추 -> source -> generate Constructor using Fields ... 매개변수 갖는 생성자.
// source -> generate constructor from SuperClass ... 매개 변수 없는 생성자 
public class Box {
	private double width; // 가로 
	private double height;// 세로 
	private double length;// 높이
	private double volume;
	public void calcVolume() {
		volume = width * length * height;
	}
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getVolume() {
		return volume;
	}
	public Box(double width, double height, double length) {
		super();
		this.width = width;
		this.height = height;
		this.length = length;
	}
	public Box() {
		this(10,10,10);
	}
	
	
	
}
