package teamProgram01;

class Circle {
	protected int radius;
	
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public Circle(int radius) { this.radius = radius;}
	public Circle() { super();}
	
}
class Pizza extends Circle {
	private String pizza;
	
	public String getPizza() {
		return pizza;
	}
	public void setPizza(String pizza) {
		this.pizza = pizza;
	}
	
	public Pizza(String pizza, int radius) {
		super(radius);
		this.pizza = pizza;
	}
	public void print() {
		System.out.println("피자의 종류: " + pizza + ", 피자의 크기: "+radius);
	}
}


public class PizzaTest {
	public static void main(String[] args) {
		Pizza obj = new Pizza("Pepperoni", 20);
		obj.print();
	}

}
