package day0329;

import java.util.Scanner;

public class AddHunred {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է��ϼ���: ");
		int n = sc.nextInt();
		
		if (n>0) {
			System.out.println(n+100);
		} else {
			System.out.println(n*n);
		}
		
		System.out.println("�۾�����");	
	}

}
