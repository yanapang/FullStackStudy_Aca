package day0330;

import java.util.Scanner;

public class Prac_EvenOddCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,even_sum=0,even_cnt=0,odd_sum=0, odd_cnt=0;
		System.out.println("���� �Է����ּ���: ");
		n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			if (i % 2 == 0) {
				even_cnt++;
				even_sum += i;
				
			} else {
				odd_cnt++;
				odd_sum += i;
			}
		}
		System.out.println("1���� "+n+"������ ¦���� ��:"+even_sum);
		System.out.println("1���� "+n+"������ ¦���� ��:"+even_cnt);
		System.out.println("1���� "+n+"������ Ȧ���� ��:"+odd_sum);
		System.out.println("1���� "+n+"������ Ȧ���� ��:"+odd_cnt);
		//i�� �� ������ ������. for �� �ȿ��� ����Ǿ.
		
	}

}
