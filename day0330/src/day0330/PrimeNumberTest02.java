package day0330;

import java.util.Scanner;

public class PrimeNumberTest02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("N을 입력하세요: ");
		n = sc.nextInt();
		
		int i;
		for(i=2; i<=n; i++) {
			if(n % i==0) {
				break;
			} //2 이상에서 하나이상 나눠지는게 있으면 소수가 아님.
			//소수라면 i가 n 과 같을때 탈출
			//소수가 아니라면 n과 같기 전에 탈출함.
		}
		
		//만약 n이 소수라면 i 는 n과 같을때 반복문 탈출.
		if(i == n) {
			System.out.println(n+"은 소수입니다.");
		} else {
			System.out.println(n+"은 소수가 아닙니다.");
		}
	}
		
}
