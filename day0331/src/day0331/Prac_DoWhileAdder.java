package day0331;

import java.util.Scanner;

public class Prac_DoWhileAdder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int i = 1;
		System.out.print("1���� ������ ���ұ��? ");
		int n = sc.nextInt();
		
		do {
			sum+=i;
			i++;
		} while(i<=n);
		
		System.out.println("1���� "+n+"������ ���� "+sum+"�Դϴ�.");
	}

}
