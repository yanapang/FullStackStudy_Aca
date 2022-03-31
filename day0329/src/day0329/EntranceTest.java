package day0329;

import java.util.Scanner;

public class EntranceTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하시오: ");
		int age = sc.nextInt();
		
		if (age>=20) {
			System.out.println("입장가능");
		} else {
			System.out.println("입장불가능");
		}
	}

}
