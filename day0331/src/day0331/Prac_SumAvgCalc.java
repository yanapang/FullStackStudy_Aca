package day0331;

import java.util.Scanner;

public class Prac_SumAvgCalc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int []student = new int[5];
		int i, sum=0;
		
		for (i=0; i<student.length; i++) {
			System.out.println((i+1)+"��° ����� ������ �Է��ϼ���:");
			student[i] = sc.nextInt();
		}
		
		System.out.println("*** ���� ó�� ��� ***");
		for (i=0; i<student.length; i++) {
			System.out.println((i+1)+"��° �л��� ����: "+student[i]);
			sum += student[i];
		}
		double avg = sum/(double)student.length; 
		//double���� return��������, ������ ������ �ϳ��̻��� double ���̾�� �Ѵ�.
		
		System.out.println("�հ�:"+sum);
		System.out.println("���:"+avg);
	}

}
