package day0331;

import java.util.Scanner;

public class Prac_NFactorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("N�� �Է��ϼ���:");
		int n = sc.nextInt();
		int sum=1;
		
		while (n>=1) {
			sum *= n;
			System.out.print(n);
			if (n!=1) {
				System.out.print("*");
			}
			n--;
		}
		System.out.println("="+sum);
	}

}
