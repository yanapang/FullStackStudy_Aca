package day0330;

import java.util.Scanner;

public class Prac_PrintAsterisk {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row, column;
		System.out.print("�� ���� �Է��ϼ���: ");
		row = sc.nextInt();
		System.out.print("ĭ ���� �Է��ϼ���: ");
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
