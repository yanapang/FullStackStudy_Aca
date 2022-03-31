package day0330;

//해당 case부터 끝가지 동작한다.
//만약, 해당 case에 

public class SwitchTest02 {
	public static void main(String[] args) {
		int n = 5;
		
		switch(n) {
			case 1: 
				System.out.println("일");
				break;
			case 2: 
				System.out.println("이");
				break;
			case 3: 
				System.out.println("삼");
				break;
			case 4: 
				System.out.println("사");
				break;
			case 5: 
				System.out.println("오");
				break;
			default: System.out.println("1에서 5사이의 값이 아닙니다.");
		}
	}
}
