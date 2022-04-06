package teamProgram02;

class Employee {
	protected String name;
	protected String idNo;
	//getter n setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIdNo() {
		return idNo;
	}
	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}
	//constructor
	public Employee(String name, String idNo) {
		super();
		this.name = name;
		this.idNo = idNo;
	}
	//method
	public String computeSalary(){
		return "Name: "+ name+ ", ID Number: " +idNo+ ", Salary: unknown yet";
	}
}

class SalariedEmployee extends Employee {
	private int salary;

	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public SalariedEmployee(String name, String idNo, int salary) {
		super(name, idNo);
		this.salary = salary;
	}
	public String computeSalary() {
		return "Name: "+ name+ ", ID Number: " +idNo+ ", Salary: " + salary;
	}
}

class HourlyEmployee extends Employee {
	private int workHour;
	private int hourlyPay;
	public int getWorkHour() {
		return workHour;
	}
	public void setWorkHour(int workHour) {
		this.workHour = workHour;
	}
	public int getHourlyPay() {
		return hourlyPay;
	}
	public void setHourlyPay(int hourlyPay) {
		this.hourlyPay = hourlyPay;
	}
	public HourlyEmployee(String name, String idNo, int workHour, int hourlyPay) {
		super(name, idNo);
		this.workHour = workHour;
		this.hourlyPay = hourlyPay;
	}
	public String computeSalary() {
		return "Name: "+ name+ ", ID Number: " + idNo+ ", Total work Hour: " + workHour + ", Total pay: "+hourlyPay*workHour;
	}
	
}

public class EmployeeTest {

	public static void main(String[] args) {
		Employee e1 = new Employee("John", "0000");
		SalariedEmployee e2 = new SalariedEmployee("Sonny", "0011", 3000000);
		HourlyEmployee e3 = new HourlyEmployee("Jane", "0034", 52, 9300);
		
		System.out.println(e1.computeSalary());
		System.out.println(e2.computeSalary());
		System.out.println(e3.computeSalary());
		

	}

}
