package day0330;

import java.util.Scanner;

public class PrimeNumberTest02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("N�� �Է��ϼ���: ");
		n = sc.nextInt();
		
		int i;
		for(i=2; i<=n; i++) {
			if(n % i==0) {
				break;
			} //2 �̻󿡼� �ϳ��̻� �������°� ������ �Ҽ��� �ƴ�.
			//�Ҽ���� i�� n �� ������ Ż��
			//�Ҽ��� �ƴ϶�� n�� ���� ���� Ż����.
		}
		
		//���� n�� �Ҽ���� i �� n�� ������ �ݺ��� Ż��.
		if(i == n) {
			System.out.println(n+"�� �Ҽ��Դϴ�.");
		} else {
			System.out.println(n+"�� �Ҽ��� �ƴմϴ�.");
		}
	}
		
}
