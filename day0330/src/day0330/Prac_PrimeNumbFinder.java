package day0330;

import java.util.Scanner;

public class Prac_PrimeNumbFinder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("N�� �Է��ϼ���: ");
		n = sc.nextInt();
		int divisor_cnt = 0;
				
		for (int i=1; i<=n; i++) {
			if(n % i == 0) {
				divisor_cnt++;
			}
		}
		
		if (divisor_cnt <= 2) {
			System.out.println(n+"�� �Ҽ��Դϴ�.");
		} else {
			System.out.println(n+"�� �Ҽ��� �ƴմϴ�.");
		}
		

	}

}
