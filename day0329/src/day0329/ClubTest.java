package day0329;

import java.util.Scanner;

public class ClubTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		int age;
		double height;
		System.out.println("�̸��� �Է��ϼ���: ");
		name = sc.next();
		System.out.println("���̸� �Է��ϼ���: ");
		age = sc.nextInt();		
		System.out.println("Ű�� �Է��ϼ���(cm): ");
		height = sc.nextDouble();
		
		if (age>=30 && height<=160) {
			System.out.println(name+"��, ���尡��");
		} else {
			System.out.println(name+"��, ����Ұ���");
		}

	}

}
