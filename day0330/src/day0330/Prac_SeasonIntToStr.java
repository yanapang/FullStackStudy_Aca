package day0330;

import java.util.Scanner;

//����ڿ��� ���� �Է¹޾� �ش� ���� �ѱ۷� ���, switch~case�� �̿�.
public class Prac_SeasonIntToStr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����� ������ �ñ��ϽŰ���? : ");
		int mth = sc.nextInt();
		
		switch (mth) {
		case 1: case 2: case 12: System.out.println("�ܿ��Դϴ�."); break;
		case 3: case 4: case 5: System.out.println("���Դϴ�."); break;
		case 6: case 7: case 8: System.out.println("�����Դϴ�."); break;
		case 9: case 10: case 11: System.out.println("�����Դϴ�."); break;
		}

	}

}
