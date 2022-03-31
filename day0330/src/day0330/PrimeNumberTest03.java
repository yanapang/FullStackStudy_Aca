package day0330;

import java.util.Scanner;

public class PrimeNumberTest03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("N을 입력하세요: ");
		n = sc.nextInt();
		
		boolean isPrimeNumber = true;
		for (int i=2; i<n; i++) {
			if(n % i == 0) {
				isPrimeNumber =false;
				break; //i값이 n이 되기 전 하나라도 나뉘는 값이 있으면 false 값 넣고 탈출.
			}
		}
		
		if(isPrimeNumber == true) {
			System.out.println(n + "은 소수입니다.");
		} else {
			System.out.println(n + "은 소수가 아닙니다.");
		}
	}
		
}
