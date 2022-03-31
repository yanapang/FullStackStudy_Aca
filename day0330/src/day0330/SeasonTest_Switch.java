package day0330;

import java.util.Scanner;

public class SeasonTest_Switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month;
		System.out.println("월을 입력하세요: ");
		month = sc.nextInt();
		
		switch (month) {
			case 3: case 4: case 5: System.out.println(month+"월은 봄입니다."); break;
			case 6: case 7: case 8: System.out.println(month+"월은 여름입니다."); break;
			case 9: case 10: case 11: System.out.println(month+"월은 가을입니다."); break;
			case 12: case 1: case 2: System.out.println(month+"월은 겨울입니다."); break;
			default: System.out.println("입력범위를 넘었습니다.");
		}
		sc.close();
	}

}