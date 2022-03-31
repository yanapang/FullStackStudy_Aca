package day0330;

import java.util.Scanner;

public class Prac_EvenOddCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,even_sum=0,even_cnt=0,odd_sum=0, odd_cnt=0;
		System.out.println("수를 입력해주세요: ");
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
		System.out.println("1에서 "+n+"까지의 짝수의 합:"+even_sum);
		System.out.println("1에서 "+n+"까지의 짝수의 수:"+even_cnt);
		System.out.println("1에서 "+n+"까지의 홀수의 합:"+odd_sum);
		System.out.println("1에서 "+n+"까지의 홀수의 수:"+odd_cnt);
		//i는 이 시점에 없어짐. for 룹 안에서 선언되어서.
		
	}

}
