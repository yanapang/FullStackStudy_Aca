package teamProgram01;

//Problem no.4 (Page 275)

class Rectangle {
	protected int width, height;
	//getter and setter
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	//생성
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
}

class ColorRectangle extends Rectangle {
	private String color;

	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public ColorRectangle(int width, int height, String color) {
		super(width, height);
		this.color = color;
	}

	
	
}


public class RectangleTest {

	public static void main(String[] args) {
		ColorRectangle obj = new ColorRectangle(100, 100, "blue");
		
		System.out.println("가로: "+ obj.getWidth());
		System.out.println("세로: "+ obj.getHeight());
		System.out.println("색상: "+ obj.getColor());
		
	}

}
