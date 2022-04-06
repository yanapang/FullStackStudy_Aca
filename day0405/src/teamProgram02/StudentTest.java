package teamProgram02;

class Student{
	protected String name;
	protected String idNo;
	protected String major;
	protected int grade;
	protected int cum_credit;
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
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getCum_credit() {
		return cum_credit;
	}
	public void setCum_credit(int cum_credit) {
		this.cum_credit = cum_credit;
	}
	public Student(String name, String idNo, String major, int grade, int cum_credit) {
		super();
		this.name = name;
		this.idNo = idNo;
		this.major = major;
		this.grade = grade;
		this.cum_credit = cum_credit;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", idNo=" + idNo + ", major=" + major + ", grade=" + grade + ", cum_credit="
				+ cum_credit + "]";
	}
	
}

class UnderGraduate extends Student {
	private String clubName;

	public String getClubName() {
		return clubName;
	}

	public void setClubName(String clubName) {
		this.clubName = clubName;
	}

	public UnderGraduate(String name, String idNo, String major, int grade, int cum_credit, String clubName) {
		super(name, idNo, major, grade, cum_credit);
		this.clubName = clubName;
	}

	@Override
	public String toString() {
		return "UnderGraduate [clubName=" + clubName + ", name=" + name + ", idNo=" + idNo + ", major=" + major
				+ ", grade=" + grade + ", cum_credit=" + cum_credit + "]";
	}
	
	
}
class Graduate extends Student{
	private String ta_type;//교육 조교 or 연구 조교;
	private double scholarship;//0~1;
	public String getTa_type() {
		return ta_type;
	}
	public void setTa_type(String ta_type) {
		if (ta_type =="연구조교" || ta_type =="교육조교") {			
			this.ta_type = ta_type;
		} else {
			System.out.println("조교 타입 잘못 입력하셨습니다.");
		}
	}
	public double getScholarship() {
		return scholarship;
	}
	public void setScholarship(double scholarship) {
		if(scholarship >=0 && scholarship <=1) {			
			this.scholarship = scholarship;
		} else {
			System.out.println("scholarship 비율은 0과 1사이 값이어야 합니다.");
		}
	}
	public Graduate(String name, String idNo, String major, int grade, int cum_credit, String ta_type,
			double scholarship) {
		super(name, idNo, major, grade, cum_credit);
		if(scholarship >=0 && scholarship <=1) {			
			this.scholarship = scholarship;
		} else {
			System.out.println("scholarship 비율은 0과 1사이 값이어야 합니다.");
		}
		if (ta_type =="연구조교" || ta_type =="교육조교") {			
			this.ta_type = ta_type;
		} else {
			System.out.println("조교 타입 잘못 입력하셨습니다.");
		}
	}
	@Override
	public String toString() {
		return "Graduate [ta_type=" + ta_type + ", scholarship=" + scholarship + ", name=" + name + ", idNo=" + idNo
				+ ", major=" + major + ", grade=" + grade + ", cum_credit=" + cum_credit + "]";
	}
	
	
	
}

public class StudentTest {

	public static void main(String[] args) {
		Student s1 = new Student("Kim", "0101", "Math", 3, 105);
		UnderGraduate s2 = new UnderGraduate("Lee", "0105", "Computer Science", 2, 90, "Dance Team");
		Graduate s3 = new Graduate("Dobi", "3000", "Biology", 3, 70, "교육조교", 0.9);
		
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		
	}

}
