//무료 암검진 대상은 40세 이상, 격년으로 무료 암검진 제공.
//짝수연도에 짝수연도에 태어난 사람, 홀수에는 홀수년도에 태어난사람이 무료 검진.
package day0328_a;

import java.util.Scanner;

public class EvenOddCheckUps {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		int BirthYear,thisYear, age;
		
		System.out.println("이름: ");
		name = sc.next();
		System.out.println("태어난 해: ");
		BirthYear = sc.nextInt();
		System.out.println("올해년도: ");
		thisYear = sc.nextInt();
		age = thisYear - BirthYear;
		
		if (age >= 40) {
			if (BirthYear % 2 == 0 && thisYear % 2 == 0) {
				System.out.println(name+"님, 올해 검진 대상입니다.");
			} else if (BirthYear % 2 != 0 && thisYear % 2 != 0) {
				System.out.println(name+"님, 올해 검진 대상입니다.");
			} else {
				System.out.println(name+"님, 올해 검진 대상이 아닙니다.");
			}
		} else {
			System.out.println("40세 이상 무료 암 검진 대상이 아닙니다.");
		}
	}

}
