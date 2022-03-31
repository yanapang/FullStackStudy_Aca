package day0330;

import java.util.Scanner;

//사용자에게 월을 입력받아 해당 계절 한글로 출력, switch~case문 이용.
public class Prac_SeasonIntToStr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇월의 계절이 궁금하신가요? : ");
		int mth = sc.nextInt();
		
		switch (mth) {
		case 1: case 2: case 12: System.out.println("겨울입니다."); break;
		case 3: case 4: case 5: System.out.println("봄입니다."); break;
		case 6: case 7: case 8: System.out.println("여름입니다."); break;
		case 9: case 10: case 11: System.out.println("가을입니다."); break;
		}

	}

}
