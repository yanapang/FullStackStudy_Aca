package exam09;

public class Box {
	private double width; // 가로 
	private double height;// 세로 
	private double length;// 높이
	private double volume;
	
	//생성자
	public Box() {
		width = 10;
		height = 10;
		length = 10;
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
	
	//getter
	public void calcVolume() {
		volume = width*length*height;
	}
	
	public double getVolume() {
		return volume;
	}
	
}
