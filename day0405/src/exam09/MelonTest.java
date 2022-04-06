package exam09;
class Food {
	protected double Cal;
	protected int Price;
	protected double Weight;
	public double getCal() {
		return Cal;
	}
	public void setCal(double cal) {
		Cal = cal;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public double getWeight() {
		return Weight;
	}
	public void setWeight(double weight) {
		Weight = weight;
	}
	public Food(double cal, int price, double weight) {
		super();
		Cal = cal;
		Price = price;
		Weight = weight;
	}
	public Food() {
		super();
		// TODO Auto-generated constructor stub
	}
	//method: returns whole information.
	public String getInfo() {
		return "Calories: "+ Cal + ", Price: "+ Price + ", Weight: "+Weight;
	}
}

class Melon extends Food {
	private String farm;

	public String getFarm() {
		return farm;
	}
	public void setFarm(String farm) {
		this.farm = farm;
	}

	public Melon(double cal, int price, double weight, String farm) {
		super(cal, price, weight);
		this.farm = farm;
	}
	public Melon() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getInfo() {
		return "Calories: "+ Cal + ", Price: "+ Price + ", Weight: "+Weight + ", farm: "+ farm;
	}
	
}

public class MelonTest {
	public static void main(String[] args) {
		Food f = new Food(100, 2000, 100);
		System.out.println(f.getInfo());
		
		Melon m = new Melon(200, 12000, 1000, "쌍용농원");
		System.out.println(m.getInfo());//부모 클래스의 메소드 getInfo 사용 가능. 
	}
}
