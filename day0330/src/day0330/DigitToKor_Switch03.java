package day0330;

import java.util.Scanner;

public class DigitToKor_Switch03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("0~9������ ���� �Է�: ");
		n = sc.nextInt();
		switch(n) {
			case 0:
			case 1:
			case 2:System.out.println("��");break;
			case 3:
			case 4:
			case 5:
			case 6:System.out.println("��");break;
			case 7:
			case 8:
			case 9:System.out.println("��");break;
			default:System.out.println("�Է¹����� �Ѿ����ϴ�.");
		}
		System.out.println("�۾�����");
		sc.close();
	}
}
