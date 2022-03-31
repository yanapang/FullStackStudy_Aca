package day0330;

import java.util.Scanner;

public class Prac_CountToN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1이상의 정수를 입력해주세요: ");
		int n = sc.nextInt();
		int i;
		
		if (n<1) {
			System.out.println("알맞은 값이 아닙니다.");
		} else {
			for (i=1; i<=n; i++) {
				System.out.println(i);
			}
		}

	}

}
