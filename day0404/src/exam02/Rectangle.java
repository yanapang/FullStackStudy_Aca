package exam02;

public class Rectangle {
	private double width;
	private double length;
	//method
	public double calcArea() {
		double area = width*length;
		return area;
	}
	
	//setter
	public void setWidth(double w) {
		width = w;
	}
	public void setLength(double l) {
		length = l;
	}
	
	//getter
	public double getWidth() {
		return width;
	}
	public double getLength() {
		return length;
	}
}
