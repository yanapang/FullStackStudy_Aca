package day0328_a;

import java.util.Date;
import java.util.Scanner;

public class CancerTest03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Date today = new Date();
		int thisYear = today.getYear()+1900;
		int userYear;
		int age;
		String name;
		System.out.println("***���� �ϰ��� ����� Ȯ�� ���α׷� ***");
		System.out.println("�̸��� �Է��ϼ���: ");
		name = sc.next();
		System.out.println("����⵵�� �Է��ϼ���: ");
		userYear = sc.nextInt();
		
		age = thisYear - userYear;
		
		System.out.println("*** ��� Ȯ�� ***");
		System.out.println("�̹�����: "+ thisYear);
		System.out.println("�������: "+ userYear);
		System.out.println("����: "+ age);
		
		if(age >= 40 && thisYear%2 == userYear%2) {
			System.out.println(name+"��, ���� �ϰ��� ����� �Դϴ�.");
		} else {
			System.out.println(name+"��, ���� �ϰ��� ����ڰ� �ƴմϴ�.");
		}
	}

}
