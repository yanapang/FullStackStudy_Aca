package day0330;

import java.util.Scanner;

public class SeasonTest_Switch03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month;
		System.out.print("월을 입력하세요: ");
		month = sc.nextInt();
		String result = "";
//미리 잘못된값 입력된것 확인 후 return을 통해 다음 코드 실행 없이 끝냄.	
		if (month < 1 || month >12) {
			System.out.println("입력범위를 넘었습니다.");
			return;
		}
		switch (month) {
			case 3: case 4: case 5: result = "봄"; break;
			case 6: case 7: case 8: result = "여름"; break;
			case 9: case 10: case 11: result = "가을"; break;
			case 12: case 1: case 2: result = "겨울"; break;
		}
		System.out.println(month + "월은 "+ result + "입니다.");

		sc.close();
	}

}
