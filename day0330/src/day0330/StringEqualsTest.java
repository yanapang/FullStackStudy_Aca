package day0330;

import java.util.Scanner;

//��������� ���ڿ� �Է¹޾� �� ���ڿ��� "hello"�� ������ �Ǻ��ϴ� ���α׷�

public class StringEqualsTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String data;
		System.out.println("���ڿ��� �Է��ϼ���: ");
		data=sc.next();
		
		if (data.equals("hello")) { //���ڿ� �񱳽� equals ����ؾ��Ѵ�.
			System.out.println("�¾ƿ�!");
		} else {
			System.out.println("Ʋ����!");
		}

	}

}
