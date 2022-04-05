package exam12;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee p1 = new Employee();
		Employee p2 = new Employee("김기기", "010-3210-5432", 8000);
		
		System.out.println("이름: "+p1.getName()+"\t"
					+"전화번호: " + p1.getPhone()+"\t"
					+"연봉: " +p1.getSalary());
		System.out.println("이름: "+p2.getName()+"\t"
					+"전화번호: " + p2.getPhone()+"\t"
					+"연봉: "+ p2.getSalary());
	}

}
