package day0328_a;

import java.util.Scanner;

public class EvenOddTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		String output = " ";
		System.out.print("���ڸ� �Է��ϼ���: ");
		n = sc.nextInt();
		if(n % 2 == 0) {
			output = "¦��";
		} else {
			output = "Ȧ��";
		}
		System.out.println(n+"�� "+output+"�Դϴ�.");
	}

}
