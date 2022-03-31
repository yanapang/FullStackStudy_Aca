package day0329;

import java.util.Scanner;

public class teamProject {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요: ");
		int n = sc.nextInt();
		if (n >= 1 && n <=9) {
			if (n == 1) {
				System.out.println("ONE");
			} else if (n == 2 ) {
				System.out.println("TWO");
			} else if (n == 3 ) {
				System.out.println("THREE");
			} else if (n == 4 ) {
				System.out.println("FOUR");
			} else if (n == 5 ) {
				System.out.println("FIVE");
			} else if (n == 6 ) {
				System.out.println("SIX");
			} else if (n == 7 ) {
				System.out.println("SEVEN");
			} else if (n == 8 ) {
				System.out.println("EIGHT");
			} else {
				System.out.println("NINE");
			}
		} else {
			System.out.println("OTHER");
		}
	}
}
