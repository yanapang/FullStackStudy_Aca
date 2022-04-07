package exam05;

abstract class TwoD {
	protected int x, y;
	protected double area;
	//abstract 메소드 선언.
	public abstract void AreaCalc();
	public TwoD(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return "x=" + x + ", y=" + y + ", area=" + area;
	}
}

class Square extends TwoD {
	private double width, height;
	public Square(int x, int y, double width, double height) {
		super(x,y);
		this.width = width;
		this.height = height;
	}
	@Override
	public void AreaCalc() {
		area = width * height;
	}
	@Override
	public String toString() {
		return "Square \n width=" + width + ", height=" + height + ", x=" + x + ", y=" + y + ", area=" + area;
	}
}

class Triangle extends TwoD{
	private double width, height;
	public Triangle(int x, int y, double width, double height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}
	@Override
	public void AreaCalc() {
		area = width*height/2;
	}
	@Override
	public String toString() {
		return "Triangle \n width=" + width + ", height=" + height + ", " + super.toString();
	}
	
}

class Circle extends TwoD{
	private double radius;
	public Circle(int x, int y, double radius) {
		super(x,y);
		this.radius = radius;
	}
	@Override
	public void AreaCalc() {
		area = Math.PI*Math.pow(radius,2);
		//Math 클래스들의 메소드들 대부분 static메소드라 객체 생성 없이 사용가능.
	}
	@Override
	public String toString() {
		return "Circle \n radius=" + radius + ", " + super.toString();
	}	
}


public class TwoDTest {

	public static void main(String[] args) {
		//객체 생성.
		Square square = new Square(10, 10, 50, 20);
		Circle circle = new Circle(10, 100, 20);
		Triangle triangle = new Triangle(10, 50, 50, 20);
		//calculate the area
		square.AreaCalc();
		triangle.AreaCalc();
		circle.AreaCalc();
		//print the result
		System.out.println(square);
		System.out.println(triangle);
		System.out.println(circle);
	}

}
