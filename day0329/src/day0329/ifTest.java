package day0329;

import java.util.Scanner;

public class ifTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("N�� �Է��ϼ���: ");
		n = sc.nextInt();
		if(n>0) {
			System.out.println("���");
		} else if (n<0) {
			System.out.println("����");
		} else {
			System.out.println("��");
		}

	}

}
