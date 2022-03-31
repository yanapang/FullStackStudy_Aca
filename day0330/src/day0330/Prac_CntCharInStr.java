package day0330;

import java.util.Scanner;

public class Prac_CntCharInStr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("문자열을 입력: ");
		String input_Str = sc.next();
		int cnt = 0;
		
		for (int i=0; i<input_Str.length(); i++) {
			char ch = input_Str.charAt(i);
			if (ch == 'a') {
				cnt++;
			}
		}
		System.out.println("소문자 a의 수는 "+ cnt + "개 입니다.");
	}

}
