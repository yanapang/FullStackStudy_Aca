package day0330;

import java.util.Scanner;

//사용자한테 문자열 입력받아 그 문자열이 "hello"와 같은지 판별하는 프로그램

public class StringEqualsTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String data;
		System.out.println("문자열을 입력하세요: ");
		data=sc.next();
		
		if (data.equals("hello")) { //문자열 비교시 equals 사용해야한다.
			System.out.println("맞아요!");
		} else {
			System.out.println("틀려요!");
		}

	}

}
