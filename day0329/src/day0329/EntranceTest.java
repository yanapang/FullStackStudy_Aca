package day0329;

import java.util.Scanner;

public class EntranceTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���̸� �Է��Ͻÿ�: ");
		int age = sc.nextInt();
		
		if (age>=20) {
			System.out.println("���尡��");
		} else {
			System.out.println("����Ұ���");
		}
	}

}
