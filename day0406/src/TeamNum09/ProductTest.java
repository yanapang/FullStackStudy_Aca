package TeamNum09;

class Product {
	protected String name;
	protected double price;
	//getter n setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	//constructor
	public Product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
}

class DiscountProduct extends Product {
	private double discount;
	@Override
	public double getPrice() {
		price = price * ((100-discount)/100);
		return price;
	}
	public DiscountProduct(String name, int price, double discount) {
		super(name, price);
		this.discount = discount;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	@Override
	public String toString() {
		return "DiscountProduct [discount=" + discount + "%, name=" + name + ", price=" + price + ", getPrice()="
				+ getPrice() + "]";
	}
}

public class ProductTest {
	public static void main(String[] args) {
		Product p1 = new Product("toothbrush", 3000);
		Product p2 = new DiscountProduct("toothbrush", 3000, 15);

		System.out.println(p1);
		System.out.println(p2);
	}
}
