package day0330;

import java.util.Scanner;

public class IntToEng {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("0���� 9������ ������ �Է��ϼ���: ");
		int n = sc.nextInt();
		
		switch (n) {
			case 0: System.out.println("��");
			case 1: System.out.println("��");
			case 2: System.out.println("��");
			case 3: System.out.println("��");
			case 4: System.out.println("��");
			case 5: System.out.println("��");
			case 6: System.out.println("��");
			case 7: System.out.println("ĥ");
			case 8: System.out.println("��");
			case 9: System.out.println("��");
			default: System.out.println("��ȿ�� ���� �ƴմϴ�.");
		}

	}

}
