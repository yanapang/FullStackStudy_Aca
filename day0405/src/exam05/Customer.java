package exam05;

public class Customer extends Person {
	private int no;
	private int mileage;
	
	public Customer(String name, String addr, String phone, int no, int mileage) {
		super(name,addr,phone);//부모의 생성자를 요구함. 반드시 첫번째에 와야함. 
		//this.name = name; 
		//자식클래스도 부모의 private 영역에 접근 불가.
		this.addr = addr;
		//protected는 외부의 다른 클래스로부터는 보호하되, 자식 클래스들로부터는 접근 허용.
		
		this.no = no;
		this.mileage = mileage;
	}
	
	public Customer() {
		
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	
	
}
