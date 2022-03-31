package day0329;

import java.util.Scanner;

public class CompareThreeNumb {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		int max;
		System.out.print("첫번째 수를 입력하세요: ");
		a = sc.nextInt();
		System.out.print("두번째 수를 입력하세요: ");
		b = sc.nextInt();
		System.out.print("세번째 수를 입력하세요: ");
		c = sc.nextInt();
		
		if (a>b) {
			if (a>c) {
				max  = a;
			} else {
				max = c;
			}
		} else {
			if (b>c) {
				max = b;
			} else {
				max = c;
			}
		}
		System.out.println("가장 큰 수는 "+ max +"입니다.");
	}

}
