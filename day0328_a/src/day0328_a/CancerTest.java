package day0328_a;

import java.util.Scanner;

public class CancerTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		int age;
		
		System.out.print("�̸��� �Է��ϼ���: ");
		name = sc.next();
		System.out.print("���̸� �Է��ϼ���: ");
		age = sc.nextInt();

		if(age >= 40) {
			System.out.println(name + "��, ���� �ϰ��� ������Դϴ�.");
		} else {
			System.out.println(name + "��, ���� �ϰ��� ����ڰ� �ƴմϴ�.");
		}
	}

}
