package day0330;

public class SwitchTest {
	public static void main(String[] args) {
		int n = 5;
		
		switch(n) {
			case 1: System.out.println("일");
			case 2: System.out.println("이");
			case 3: System.out.println("삼");
			case 4: System.out.println("사");
			case 5: System.out.println("오");
			default: System.out.println("1에서 5사이의 값이 아닙니다.");
		}
	}
}
