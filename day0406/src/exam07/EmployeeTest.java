package exam07;

//모든 직원들이 가져야할공통적인 속성들과 기능들을일반화해서 만듬. 
abstract class Employee {
	protected String name;
	protected String idNo;
	protected int salary;
	//Getter and Setter
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public String getIdNo() {return idNo;}
	public void setIdNo(String idNo) {this.idNo = idNo;}
	//생성자 
	public Employee(String name, String idNo) {
		super();
		this.name = name;
		this.idNo = idNo;
	}
	//추상 메소드 
	public abstract void computeSalary();
	@Override
	public String toString() {
		return "Employee [name=" + name + ", idNo=" + idNo + ", salary=" + salary + "]";
	}
	
}


class SalariedEmployee extends Employee{
	private int hobong; //호봉 
	private int base; //기본급 
	private int extra_pay; //수당 
	
	public SalariedEmployee(String name, String idNo, int hobong) {
		super(name, idNo);
		this.hobong = hobong;
	}
	@Override
	public void computeSalary() {
		switch(hobong) {
			case 1: base = 2500000; extra_pay = 250000; break;
			case 2: base = 3000000; extra_pay = 300000; break;
			case 3: base = 4000000; extra_pay = 400000; break;
		}
		salary = base + extra_pay;
	}
	@Override
	public String toString() {
		return "SalariedEmployee [hobong=" + hobong + ", base=" + base + ", extra_pay=" + extra_pay + ", name=" + name
				+ ", idNo=" + idNo + ", salary=" + salary + "]";
	}
	
}


class HourlyEmployee extends Employee{
	private int hours;
	private int base;
	public HourlyEmployee(String name, String idNo, int base, int hours) {
		super(name, idNo);
		this.base = base;
		this.hours = hours;
	}
	@Override
	public void computeSalary() {
		salary = base*hours;
	}
	@Override
	public String toString() {
		return "HourlyEmployee [hours=" + hours + ", base=" + base + ", name=" + name + ", idNo=" + idNo + ", salary="
				+ salary + "]";
	}
}

public class EmployeeTest {
	public static void main(String[] args) {
		//*********
		//월급제 사원도 담을 수 있고 시간제 사원도 담을 수 있는
		//Employee배열을 만든다.
		Employee []arr = new Employee[3];
		
		arr[0] = new SalariedEmployee("Honggildong", "1001", 3);
		arr[1] = new HourlyEmployee("Leesoonshin", "1002", 300000, 10);
		arr[2] = new SalariedEmployee("Yookwansoon", "1003", 2);
		
		for (int i=0; i<arr.length; i++) {
			arr[i].computeSalary(); //각 객체가 바라보고 있는 자료형에 따라, 거기에 맞는 computeSalary가 동작.
			System.out.println(arr[i]);
		}
	}
}
