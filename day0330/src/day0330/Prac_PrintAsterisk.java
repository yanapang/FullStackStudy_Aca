package day0330;

import java.util.Scanner;

public class Prac_PrintAsterisk {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row, column;
		System.out.print("줄 수를 입력하세요: ");
		row = sc.nextInt();
		System.out.print("칸 수를 입력하세요: ");
		column = sc.nextInt();
		
		for (int i=1; i<=row; i++) {
			for (int j=1; j<=column; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}

}
