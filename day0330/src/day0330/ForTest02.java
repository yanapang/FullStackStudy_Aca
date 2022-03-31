package day0330;

import java.util.Scanner;

public class ForTest02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("n을 입력하세요: ");
		n = sc.nextInt();
		
		int i;
		
		for (i=1; i<=n; i++) {
			System.out.println(i);
		}

	}

}
