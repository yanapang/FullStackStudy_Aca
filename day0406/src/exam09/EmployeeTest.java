package exam09;

import java.util.ArrayList;
import java.util.Scanner;

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
		
		ArrayList<Employee> list = new ArrayList<Employee> ();
		
		//사원의 정보 입력받기
		int type;
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("1.월급제 사원, 2.시간제 사원, 0.종료: ");
			type = sc.nextInt();
			
			if (type ==0) {
				break;
			}
			
			String name;
			String no;
			System.out.println("사원의 이름: ");
			name = sc.next();
			System.out.println("사원 번호: ");
			no = sc.next();
			
			if(type ==1) {
				int hobong;
				System.out.print("호봉을 입력하세요: ");
				hobong = sc.nextInt();
				//arr[n++] = new SalariedEmployee(name, no, hobong);
				list.add(new SalariedEmployee(name, no, hobong));
			} else if (type ==2) {
				int base;
				int hours;
				System.out.print("시간당 급여를 입력하세요: ");
				base = sc.nextInt();
				System.out.print("일한 시간을 입력하세요: ");
				hours = sc.nextInt();
				//arr[n++] = new HourlyEmployee(name, no, base, hours);
				list.add(new HourlyEmployee(name, no, base, hours));
			} else {
				System.out.println("잘못 입력하셨습니다. ");
			}//입력끝
		}
		//급여를 계산하고 출력하기.
		for(int i=0; i<list.size();i++) { 
			//arr[i].computeSalary();
			//System.out.println(arr[i]);
			Employee e = list.get(i);
			
//			list.get(i).computeSalary();
//			System.out.println(list.get(i));
			
			//리스트의 요소를 하나씩꺼내와 Employee변수에 담음.
			e.computeSalary();
			//꺼내온 리스트의 요소를 갖고 급여 계산.
			
			System.out.println(e);
			//꺼내온 리스트의 요소 출력 
		}
	}
}
