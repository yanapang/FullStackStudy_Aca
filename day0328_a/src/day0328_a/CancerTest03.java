package day0328_a;

import java.util.Date;
import java.util.Scanner;

public class CancerTest03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Date today = new Date();
		int thisYear = today.getYear()+1900;
		int userYear;
		int age;
		String name;
		System.out.println("***무료 암검진 대상자 확인 프로그램 ***");
		System.out.println("이름을 입력하세요: ");
		name = sc.next();
		System.out.println("출생년도를 입력하세요: ");
		userYear = sc.nextInt();
		
		age = thisYear - userYear;
		
		System.out.println("*** 결과 확인 ***");
		System.out.println("이번연도: "+ thisYear);
		System.out.println("출생연도: "+ userYear);
		System.out.println("나이: "+ age);
		
		if(age >= 40 && thisYear%2 == userYear%2) {
			System.out.println(name+"님, 무료 암검진 대상자 입니다.");
		} else {
			System.out.println(name+"님, 무료 암검진 대상자가 아닙니다.");
		}
	}

}
