package day0330;

import java.util.Scanner;

public class Prac_GugudanCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �߿� ����� ����ұ��?: ");
		int dan = sc.nextInt();
		//int i = 1;
		
		for (int i=1; i<=9; i++) {
			System.out.println(dan+"*"+i+"="+dan*i);
		}

	}

}
