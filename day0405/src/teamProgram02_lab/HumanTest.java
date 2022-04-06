package teamProgram02_lab;
//lab 1번
class Human{
	protected String name;
	protected int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Human(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		System.out.println("매개변수가 있는 Human");
	}
	public Human() {
		super();
		System.out.println("매개변수가 없는 Human");
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Name: "+ name + ", Age: "+ age;
	}
	public String getProfesion() {
		return "unknown";
	}
	
	public static void main(String[] args) {	
		Human h1 = new Human("Chunhyang", 18);
		Human h2 = new Human("Mongryung", 21);
		Human h3 = new Human("Satto", 50);
		
		System.out.println(h1);
		System.out.println(h2);
		System.out.println(h3);
	}
}

class Student extends Human {
	String major;
	public Student(String name, int age, String major) {
		super(name, age);
		this.major = major;
		System.out.println("매개변수가 있는 Student.");
	}
	
	public Student() {
		super();
		System.out.println("매개변수가 없는 Student.");
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	//setter getter
	public void setMajor(String major) {
		this.major = major;
	}
	public String getMajor() {
		return major;
	}
	public String toString() {
		return super.toString() + ", Major: "+major +".";
	}
	public String getProfesion() {
		return "Student";
	}
	public static void main(String[] args) {
		Student s1 = new Student("Myungjin", 21, "Computer");
		Student s2 = new Student("Mihyun", 22, "Business");
		Student s3 = new Student("Yongjun", 24, "Economics");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}

public class HumanTest {
	public static void main(String[] args) {
		Human hm = new Human();
		Student st = new Student();
		
		hm.main(args);
		System.out.println("Profession: "+hm.getProfesion());
		
		st.main(args);
		System.out.println("Profession: "+ st.getProfesion());
	}
}

// 부모 클래스 Human 객체로 생성시 Human객체에서 바로생성함.
// But, Student 클래스, 즉 자식 클래스에서 생성자만들기를 하면
// 부모 클래스의 생성자가 먼저 생성된 후, 자식 클래스가 생성이됨.