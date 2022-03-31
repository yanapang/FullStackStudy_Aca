package day0330;

import java.util.Scanner;

public class IntToEng {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("0에서 9사이의 정수를 입력하세요: ");
		int n = sc.nextInt();
		
		switch (n) {
			case 0: System.out.println("영");
			case 1: System.out.println("일");
			case 2: System.out.println("이");
			case 3: System.out.println("삼");
			case 4: System.out.println("사");
			case 5: System.out.println("오");
			case 6: System.out.println("육");
			case 7: System.out.println("칠");
			case 8: System.out.println("팔");
			case 9: System.out.println("구");
			default: System.out.println("유효한 값이 아닙니다.");
		}

	}

}
