package day0330;

import java.util.Scanner;

public class Prac_CntCharInStr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("���ڿ��� �Է�: ");
		String input_Str = sc.next();
		int cnt = 0;
		
		for (int i=0; i<input_Str.length(); i++) {
			char ch = input_Str.charAt(i);
			if (ch == 'a') {
				cnt++;
			}
		}
		System.out.println("�ҹ��� a�� ���� "+ cnt + "�� �Դϴ�.");
	}

}
