package review;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

// 학생들의 정보를 배열에 저장하고 불러오기 
//학생들의정보는 Student class
class Student {
	private String name, addr, phone;
	//setter and getter
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public String getAddr() {return addr;}
	public void setAddr(String addr) {this.addr = addr;}
	public String getPhone() {return phone;}
	public void setPhone(String phone) {this.phone = phone;}
	
	//constructor
	public Student(String name, String addr, String phone) {
		super();
		this.name = name;
		this.addr = addr;
		this.phone = phone;
	}
	//method for insert, search, and delete the student.
	//use for-each methods
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(addr, name, phone);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this==obj) return true;
		if(obj == null) return false;
		if(getClass()!=obj.getClass()) return false;
		Student other = (Student) obj;
		return Objects.equals(addr, other.addr) && Objects.equals(name, other.name)
				&& Objects.equals(phone, other.phone);
		
	}
	
}
public class Prac_StudentTest {
	public static Scanner sc;
	
	public static void printMenu() {
		System.out.println("----------------------");
		System.out.println("1.등록, 2.검색, 3.삭제, 4.모두출력, 0.종료 ");
		System.out.print("메뉴를 선택하세요:");
	}
	
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		sc = new Scanner(System.in);
		int menu;
		
		while(true) {
			printMenu();
			menu = sc.nextInt();
			if(menu==0) {
				break;
			}
			
			switch(menu) {
			case 1: insertStudent(list);break;
			case 2: searchStudent(list);break;
			case 3: deleteStudent(list);break;
			case 4: printStudent(list);break;
			}
		}
		System.out.println("프로그램을 종료하였습니다.");
	}

	private static void printStudent(ArrayList<Student> list) {
		System.out.println("이름 \t 주소 \t 전화");
		for(int i=0; i<list.size();i++)	{
			Student s = list.get(i);
			System.out.println(s.getName()+"\t"+s.getAddr()+"\t"+s.getPhone());
		}
		
	}

	private static void deleteStudent(ArrayList<Student> list) {
		String name;
		System.out.print("삭제할 학생의 이름을 입력: ");
		name = sc.next();
		
		for(Student s: list) {
			if(s.getName().equals(name)) { //List 안의 Student 객체의 이름 중 같은게 있으
				list.remove(list.indexOf(s));
				System.out.println(name+" 학생의 정보를 삭제하였습니다. ");
			}
		}
		
	}

	private static void searchStudent(ArrayList<Student> list) {
		String name;
		System.out.print("검색할 학생의 이름 입력: ");
		name = sc.next();
		
		for(Student s:list) {
			if(s.getName().equals(name)) {
				System.out.println("검색한 학생의 정보는 다음과 같습니다.");
				System.out.println(s.getName()+"\t"+s.getAddr()+"\t"+s.getPhone());
			}
		}
		
	}

	private static void insertStudent(ArrayList<Student> list) {
		String name,addr,phone;
		System.out.print("등록할 학생의 이름: ");
		name = sc.next();
		System.out.print("등록할 학생의 주소: ");
		addr = sc.next(); 
		System.out.print("등록할 학생의 전화번호: ");
		phone = sc.next();
		
		Student s = new Student(name,addr,phone);
		list.add(s);
		System.out.println("학생의 정보를 등록하였습니다.");
		
	}

}
