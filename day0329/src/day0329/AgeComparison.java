package day0329;

import java.util.Scanner;

public class AgeComparison {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age1, age2;
		System.out.println("첫번째 사람의 나이를 입력하세요: ");
		age1 = sc.nextInt();
		System.out.println("두번째 사람의 나이를 입력하세요: ");
		age2 = sc.nextInt();
		
		if (age1 == age2) {
			System.out.println("두사람의 나이가 같습니다.");
		} else if (age1 > age2) {
			System.out.println("첫번째 사람의 나이가 더 많습니다.");
		} else {
			System.out.println("두번째 사람의 나이가 더 많습니다.");
		}

	}

}
