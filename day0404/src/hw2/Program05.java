package hw2;

class Student {
	private String name;
	private String rollno;
	private int age;
	
	
	public Student(String name, String rollno, int age) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.age = age;
	}


	public String toString() {
		return "학생의 이름: " + name + "\n"+
				"학생의 학번 : " + rollno + "\n"+
				"학생의 나이: " + age +"\n"+
				"Student 객체가 생성되었습니다. ";
	}
}

public class Program05 {
	public static void main(String[] args) {
		Student s1 = new Student("kim","0001",20);
		
		System.out.println(s1.toString());
	}
}
