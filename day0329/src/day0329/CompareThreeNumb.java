package day0329;

import java.util.Scanner;

public class CompareThreeNumb {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		int max;
		System.out.print("ù��° ���� �Է��ϼ���: ");
		a = sc.nextInt();
		System.out.print("�ι�° ���� �Է��ϼ���: ");
		b = sc.nextInt();
		System.out.print("����° ���� �Է��ϼ���: ");
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
		System.out.println("���� ū ���� "+ max +"�Դϴ�.");
	}

}
