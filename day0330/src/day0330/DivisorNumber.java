package day0330;

import java.util.Scanner;

public class DivisorNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("N�� �Է��ϼ���:");
		n = sc.nextInt();
		System.out.println(n+"�� �����");
		for(int i=1; i<=n; i++) {
			if(n%i==0) {
				System.out.println(i+" ");
			}
		}
		System.out.println("�Դϴ�.");

	}

}
