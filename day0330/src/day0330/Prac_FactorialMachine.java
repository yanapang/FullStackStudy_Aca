package day0330;

import java.util.Scanner;

public class Prac_FactorialMachine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("N�� �Է��ϼ���: ");
		n = sc.nextInt();
		int sum = 1;
		
		for (int i=n; i >= 1; i--) {
			sum *= i;
			System.out.print(i);
			if (i!=1) {				
				System.out.print("*");
			}//*�� 1�� �ƴҶ��� ����ϱ�. for�� �ȿ��� if�� ���.
		}
		System.out.println("="+sum);
	}

}
