package exam10;

public class Box {
	private double width; // 가로 
	private double height;// 세로 
	private double length;// 높이
	private double volume;
	
	//생성자
	public Box() { //this() 사용 
		this(10, 10, 10); //꼭 생성자의 첫번째 문장으로 와야함. 
		System.out.println("매개변수가 없는 생성자가 동작하였습니다.");
	}
	
	public Box(double width, double length, double height) {
		this.width = width;
		this.length = length;
		this.height = height;
	}
	
	//setter
	public void setWidth(double width) {
		this.width = width;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	//getter
	public double getWidth() {
		return width;
	}
	public double getLength() {
		return length;
	}
	public double getHeight() {
		return height;
	}
	
	//method
	public void calcVolume() {
		volume = width*length*height;
	}
	
	public double getVolume() {
		return volume;
	}
	
}
