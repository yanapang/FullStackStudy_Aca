package day0330;

import java.util.Scanner;

public class PrimeNumberTest03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("N�� �Է��ϼ���: ");
		n = sc.nextInt();
		
		boolean isPrimeNumber = true;
		for (int i=2; i<n; i++) {
			if(n % i == 0) {
				isPrimeNumber =false;
				break; //i���� n�� �Ǳ� �� �ϳ��� ������ ���� ������ false �� �ְ� Ż��.
			}
		}
		
		if(isPrimeNumber == true) {
			System.out.println(n + "�� �Ҽ��Դϴ�.");
		} else {
			System.out.println(n + "�� �Ҽ��� �ƴմϴ�.");
		}
	}
		
}
