package day0330;

import java.util.Scanner;

public class Prac_FactorialMachine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("N을 입력하세요: ");
		n = sc.nextInt();
		int sum = 1;
		
		for (int i=n; i >= 1; i--) {
			sum *= i;
			System.out.print(i);
			if (i!=1) {				
				System.out.print("*");
			}//*를 1이 아닐때만 출력하기. for문 안에서 if문 사용.
		}
		System.out.println("="+sum);
	}

}
