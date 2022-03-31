package day0330;

import java.util.Scanner;

public class LastDate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month, date=31;
		System.out.print("월을 입력하세요: ");
		month = sc.nextInt();
		//30: 4,6,9,11
		//31: 1,3,5,7,8,10,12
		//28: 2
		//31, default값으로 놓고 아닌경우만 값 새로 넣어줌.
		
		if(month<1 || month > 12) {
			System.out.println("입력범위를 넘었습니다.");
			return;
		}
		
		switch(month) {
		case 2: date = 28; break;
		case 4: case 6: case 9: case 11: date = 30; 
		}
		System.out.println(month +"월은 "+ date +"일까지 있어요.");
	}

}
