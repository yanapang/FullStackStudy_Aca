package day0331;

import java.util.Random;

public class Prac_LotteryNumb02 {

	public static void main(String[] args) {
		int []data = new int[6];
		int i;
		//1~45������ ��������.
		Random r = new Random();
		
		System.out.print("�̹��� �ζ� ��÷ ��ȣ: ");
		for (i=0; i<data.length; i++) {
			data[i] = r.nextInt(45)+1;
			
		}
		for (i=0; i<data.length; i++) {
			System.out.print(data[i]+" ");
		}
	}
//���� �߿� �ߺ��� ���� �� ����.
}
