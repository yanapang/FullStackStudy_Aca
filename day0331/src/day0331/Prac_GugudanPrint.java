package day0331;

import java.util.Scanner;

public class Prac_GugudanPrint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �߿� ����� ����ұ��? ");
		int dan = sc.nextInt();
		int i=1;
		
		while (i <=9) {
			System.out.println(dan+"*"+i+"="+dan*i);
			i++;
		}
	}

}
