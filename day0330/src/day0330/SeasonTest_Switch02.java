
package day0330;

import java.util.Scanner;

public class SeasonTest_Switch02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month;
		System.out.print("���� �Է��ϼ���: ");
		month = sc.nextInt();
		String result = "";
		
		if (month >=1 && month <= 12) {
			switch (month) {
			case 3: case 4: case 5: result = "��"; break;
			case 6: case 7: case 8: result = "����"; break;
			case 9: case 10: case 11: result = "����"; break;
			case 12: case 1: case 2: result = "�ܿ�"; break;
			}
			System.out.println(month + "���� "+ result + "�Դϴ�.");
		} else {
			System.out.println("�Է¹����� �Ѿ����ϴ�.");
		}
		sc.close();
	}

}
