//���� �ϰ��� ����� 40�� �̻�, �ݳ����� ���� �ϰ��� ����.
//¦�������� ¦�������� �¾ ���, Ȧ������ Ȧ���⵵�� �¾����� ���� ����.
package day0328_a;

import java.util.Scanner;

public class EvenOddCheckUps {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		int BirthYear,thisYear, age;
		
		System.out.println("�̸�: ");
		name = sc.next();
		System.out.println("�¾ ��: ");
		BirthYear = sc.nextInt();
		System.out.println("���س⵵: ");
		thisYear = sc.nextInt();
		age = thisYear - BirthYear;
		
		if (age >= 40) {
			if (BirthYear % 2 == 0 && thisYear % 2 == 0) {
				System.out.println(name+"��, ���� ���� ����Դϴ�.");
			} else if (BirthYear % 2 != 0 && thisYear % 2 != 0) {
				System.out.println(name+"��, ���� ���� ����Դϴ�.");
			} else {
				System.out.println(name+"��, ���� ���� ����� �ƴմϴ�.");
			}
		} else {
			System.out.println("40�� �̻� ���� �� ���� ����� �ƴմϴ�.");
		}
	}

}
