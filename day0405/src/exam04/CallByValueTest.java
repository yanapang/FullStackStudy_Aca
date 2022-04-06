package exam04;

class Exam01{
	//정수형 변수 하나를 매개변수로 전달받아 1 증가시키는 메소드.
	public static void plusOne(int n) {
		n = n+1;
		System.out.println(n);
		System.out.println("this method changed the value");
	}
}

public class CallByValueTest {

	public static void main(String[] args) {
		int age;
		age =28;
//		Exam01 ex = new Exam01();
//		
//		ex.plusOne(age);
		Exam01.plusOne(age);

		System.out.println("Age: "+age);
		System.out.println("but the value of Age stays the same");
	}

}
