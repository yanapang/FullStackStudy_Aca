package day0330;

import java.util.Scanner;

//switch문 이용.
//2월은 28일까지로 설정.
//해당 월 입력 후, "~월은 ~일까지 있어요~" 출력.

public class Prac_EndOfMonthPrint {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("월을 입력하세요: ");
		int month = sc.nextInt();
		int lastDay=0;
		
		if(month<1 || month > 12) {
			System.out.println("입력범위를 넘었습니다.");
			return;
		}
		
		switch (month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12: lastDay = 31; break;//31
		case 4: case 6: case 9: case 11: lastDay = 30;break;//30일
		case 2: lastDay = 28; break;
		}
		System.out.println(month+"월은 "+ lastDay+"까지 있어요!");
	}

}
