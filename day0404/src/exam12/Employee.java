package exam12;

public class Employee {
	private String name;
	private String phone;
	private int salary;
	
	//setter and getter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() { //phone number같은 경우 연산에 사용 되지 않아서, string처리 
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	//constructor
	public Employee(String name, String phone, int salary) {
		super();
		this.name = name;
		this.phone = phone;
		this.salary = salary;
	}
	public Employee() {
		this("홍길동", "010-1234-5678", 5000);
	}
	
	
}
