package day0330;

import java.util.Scanner;

public class LastDate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month, date=31;
		System.out.print("���� �Է��ϼ���: ");
		month = sc.nextInt();
		//30: 4,6,9,11
		//31: 1,3,5,7,8,10,12
		//28: 2
		//31, default������ ���� �ƴѰ�츸 �� ���� �־���.
		
		if(month<1 || month > 12) {
			System.out.println("�Է¹����� �Ѿ����ϴ�.");
			return;
		}
		
		switch(month) {
		case 2: date = 28; break;
		case 4: case 6: case 9: case 11: date = 30; 
		}
		System.out.println(month +"���� "+ date +"�ϱ��� �־��.");
	}

}
