package hw_team2;

public class Person {
	private String name;
	private String mobile;
	private String office; //직장전화번호 
	private String email;
	
	//getter and setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getOffice() {
		return office;
	}
	public void setOffice(String office) {
		this.office = office;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	//constructor
	public Person(String name, String mobile, String office, String email) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.office = office;
		this.email = email;
	}
	
	public Person() {
		this("홍길동", "010-1234-5678", "서울", "gildong@gmail.com");
		// TODO Auto-generated constructor stub
	}
	//toString
	@Override
	public String toString() {
		return "name=" + name + ", mobile=" + mobile + ", office=" + office + ", email=" + email;
	}
	
	
	
	
}
