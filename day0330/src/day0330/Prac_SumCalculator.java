package day0330;

import java.util.Scanner;

public class Prac_SumCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��� �ּ���: ");
		int n = sc.nextInt();
		int sum=0;
		
		if (n<1) {
			System.out.println("��ȿ���� ���� ���� �ԷµǾ����ϴ�.");
			return;
		} else {
			for (int i = 0; i <=n; i ++) {
				sum += i;
			}
			System.out.println("�Է� �������� ���� ����: "+ sum);
		}

	}

}
