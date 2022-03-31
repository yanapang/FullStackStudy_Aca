package day0329;

import java.util.Scanner;

public class SeasonTest02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("월을 입력하세요: ");
		int month = sc.nextInt();
		
		if (month >= 1 && month <= 12) {
			if (month >= 3 && month <= 5) {
				System.out.println(month+"월은 봄입니다.");
			} else if (month >= 6 && month <=8) {
				System.out.println(month+"월은 여름입니다.");
			} else if (month >=9 && month <=11) {
				System.out.println(month+"월은 가을입니다.");
			} else {
				System.out.println(month+"월은 겨울입니다.");
			}
		} else {
			System.out.println("잘못된 값 입력됨.");
		}
		
		
	}

}
