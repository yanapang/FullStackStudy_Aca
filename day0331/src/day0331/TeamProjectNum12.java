package day0331;

import java.util.Scanner;

public class TeamProjectNum12 {

	public static void main(String[] args) {
		int arr[] = {};
		Scanner sc = new Scanner(System.in);
		int end = -1;
		int i=0;
		int n;
		//-1 �Է� ������ �Է¹ޱ�
		
		while (true) {
			System.out.println("������ �Է��ϼ���: ");
			n = sc.nextInt();
			if (n==end) {
				break;
			} else {
				for (i=0; ;i++) {
					arr[i] = n;
				}
			}
		}//while loop ��
		
		for (i=0; i<arr.length; i++) {
			//�հ�, ���
			int sum=0;
			int avg;
			sum += arr[i];
			avg = sum/arr.length;
			System.out.println("�հ�: "+sum);
		}
	}

}
