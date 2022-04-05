package exam06;

public class Rectangle {
//생성자 만들기 
	private double width;
	private double length;
	//method
	public double calcArea() {
		double area = width*length;
		return area;
	}
	
//----------생성자 만들기 ----------
	public Rectangle() {
		width = 10;
		length = 10;
	}
	public Rectangle(double w, double l) {
		width = w;
		length = l;
	}
	
//	public Rectangle(int w) { //가로길이만 초기화 하고 싶다 
//		width = w;
//		length = 10;
//	}
//	public Rectangle(double l){ //세로 길이만 초기화 하고싶다 //이렇게는 불가.
//		length = l;
//	}
//---둘 중 하나만 초기화 하고 싶을 때, 대체 방법--
	public Rectangle(String type, double v) {
		//type: w, l
		if(type.equals("w")) {
			width = v;
			length = 5;
		} else if (type.equals("l")) {
			length= v;
			width = 5;
		}
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
