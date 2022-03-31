package day0330;

import java.util.Scanner;

public class Prac_AsterTree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row;
		System.out.print("줄 수를 입력하세요: ");
		row = sc.nextInt();
		
		for (int i=1; i<=row; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}

}
