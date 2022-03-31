package day0329;

import java.util.Scanner;

public class SeasonPrint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("월을 입력하세요: ");
		int mth = sc.nextInt();
		
		if (mth ==1 || mth ==2 || mth == 12) {
			System.out.println(mth+"월은 겨울입니다.");
		} else if (mth >= 3 && mth <=5 ) {
			System.out.println(mth+"월은 봄입니다.");
		} else if (mth >= 6 && mth <= 8) {
			System.out.println(mth+"월은 여름입니다.");
		} else if (mth >= 9 && mth <= 11){
			System.out.println(mth+"월은 가을입니다.");
		} else {
			System.out.println("1에서 12사이의 값을 입력하세요.");
		}
		
		
	}

}
