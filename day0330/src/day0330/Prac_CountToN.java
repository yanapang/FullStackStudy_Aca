package day0330;

import java.util.Scanner;

public class Prac_CountToN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1�̻��� ������ �Է����ּ���: ");
		int n = sc.nextInt();
		int i;
		
		if (n<1) {
			System.out.println("�˸��� ���� �ƴմϴ�.");
		} else {
			for (i=1; i<=n; i++) {
				System.out.println(i);
			}
		}

	}

}
