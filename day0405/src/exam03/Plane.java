package exam03;

public class Plane {
	private String company;
	private String model;
	private int capacity;//최대승객수 
	public static int planes;
	
	//setter getter
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	//생성자 constructor
	public Plane(String company, String model, int capacity) {
		super();
		this.company = company;
		this.model = model;
		this.capacity = capacity;
		planes++;
	}

	public Plane() {System.out.println("만들어진 비행기의 수: "+ Plane.getPlanes());
		//super();
		planes++;
	}
	
	//getPlanes()
	public static int getPlanes() {
		return planes;
	}//static 메소드에서는 static 변수만 접근 가능. 
	

	
	//생성
}
