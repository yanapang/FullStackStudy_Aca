package day0330;

import java.util.Scanner;

public class SumTest_Input {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int sum =0;
		System.out.println("������ ���ұ��?");
		n = sc.nextInt();
		for(int i=1; i<=n;i++) {
			sum += i;
		}
		System.out.println("1���� "+n+"������ ���� "+sum+"�Դϴ�.");

	}

}
