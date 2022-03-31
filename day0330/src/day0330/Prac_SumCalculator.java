package day0330;

import java.util.Scanner;

public class Prac_SumCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력해 주세요: ");
		int n = sc.nextInt();
		int sum=0;
		
		if (n<1) {
			System.out.println("유효하지 않은 값이 입력되었습니다.");
			return;
		} else {
			for (int i = 0; i <=n; i ++) {
				sum += i;
			}
			System.out.println("입력 값까지의 누적 합은: "+ sum);
		}

	}

}
