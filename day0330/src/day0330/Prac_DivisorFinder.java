package day0330;

import java.util.Scanner;

public class Prac_DivisorFinder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("N을 입력하세요: ");
		int n = sc.nextInt();
		String divisor = "";
		
		System.out.print(n+ "의 약수는");
		
		for (int i=1; i<=n; i++) {
			if (n % i ==0) {
				System.out.print(" "+i);
			}
		}
		System.out.println("입니다.");
	}

}
