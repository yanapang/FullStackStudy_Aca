package day0331;

import java.util.Scanner;

public class Prac_WhileAsteriskPrint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�� ���� �Է��ϼ���: ");
		int rows= sc.nextInt();
		System.out.println("ĭ ���� �Է��ϼ���: ");
		int cols= sc.nextInt();
		
//		while (rows>=1) {
//			int rem = cols;
//			while (rem>=1) {
//				System.out.print("*");
//				rem--;
//			}
//			System.out.println();
//			rows--;
//		}
		//----------lecturer's code ---
		int i=1;
		while(i<=rows) {
			int j=1;
			while(j<=cols) {
				System.out.print("*");
				j++;
			}
			i++;
			System.out.println();
		}
	}

}
