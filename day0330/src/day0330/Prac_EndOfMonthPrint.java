package day0330;

import java.util.Scanner;

//switch�� �̿�.
//2���� 28�ϱ����� ����.
//�ش� �� �Է� ��, "~���� ~�ϱ��� �־��~" ���.

public class Prac_EndOfMonthPrint {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է��ϼ���: ");
		int month = sc.nextInt();
		int lastDay=0;
		
		if(month<1 || month > 12) {
			System.out.println("�Է¹����� �Ѿ����ϴ�.");
			return;
		}
		
		switch (month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12: lastDay = 31; break;//31
		case 4: case 6: case 9: case 11: lastDay = 30;break;//30��
		case 2: lastDay = 28; break;
		}
		System.out.println(month+"���� "+ lastDay+"���� �־��!");
	}

}
