package day0330;

import java.util.Scanner;

public class DigitToKor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, n10, n1;
		System.out.println("0���� 99������ ���� �Է��ϼ���: ");
		n = sc.nextInt();
		
		n10 = n/10;
		n1 = n%10;
		//
		if (n10 >= 0 && n10 <=9) {
			if (n10 == 0) {
				System.out.print("");
			} else if (n10 == 1) {
				System.out.print("��");
			} else if (n10 == 2) {
				System.out.print("�̽�");
			} else if (n10 == 3) {
				System.out.print("���");
			} else if (n10 == 4) {
				System.out.print("���");
			} else if (n10 == 5) {
				System.out.print("����");
			} else if (n10 == 6) {
				System.out.print("����");
			} else if (n10 == 7) {
				System.out.print("ĥ��");
			} else if (n10 == 8) {
				System.out.print("�Ƚ�");
			} else {
				System.out.print("����");
			} 
			
			//1���ڸ�
			if (n1 == 0) {
				System.out.println("");
			} else if (n1 == 1) {
				System.out.println("��");
			} else if (n1 == 2) {
				System.out.println("��");
			} else if (n1 == 3) {
				System.out.println("��");
			} else if (n1 == 4) {
				System.out.println("��");
			} else if (n1 == 5) {
				System.out.println("��");
			} else if (n1 == 6) {
				System.out.println("��");
			} else if (n1 == 7) {
				System.out.println("ĥ");
			} else if (n1 == 8) {
				System.out.println("��");
			} else {
				System.out.println("��");
			}
		} else {
			System.out.println("��ȿ���� ���� ���Դϴ�.");
		}
			
		//
		

	}

}
