package day0330;

import java.util.Scanner;


//�ݺ������� �ʿ��� ������ �̸� �����Ҽ��� �ְ�
//�ʿ��� ������ �ٷ� �����Ͽ� ����� �� �ִ�.

//�ʿ��ϴٸ� �ݺ������� ���ù��� ǥ���� �� �ִ�.

public class Prac_GugudanCalculator02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �߿� ����� ����ұ��?: ");
		int dan = sc.nextInt();
		//int i = 1;
		for (int i=9; i>=1; i--) {
			if(i % 2 == 1)//Ȧ�� 1, ¦�� 0, �� ��� ����.
			System.out.println(dan+"*"+i+"="+dan*i);
		}

	}

}
