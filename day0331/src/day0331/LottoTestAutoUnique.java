package day0331;

import java.util.Random;

public class LottoTestAutoUnique {

	public static void main(String[] args) {
		int []data = new int[6];
		int i;
		//1~45������ ��������.
		Random r = new Random();
		
		System.out.print("�̹��� �ζ� ��÷ ��ȣ: ");
		for (i=0; i<data.length; ) {
			int n = r.nextInt(45)+1; //n �� ������ ����.
			int j;
			//n�� data �迭�� �̹� �ִ��� �Ǻ��Ͽ� �ߺ��� ���� �ʵ��� ó��.
			for (j=0; j<i; j++) { 
				if (n==data[j]) { //n�� i ��° ������ ������ ������ ���� ���� �ִ��� Ȯ��.
					break; //���� ���� ������ Ż��.
				}
			}
			
			if (j==i) { //i ������ ���� ���� �־ Ż�������� ������ �̽���, ���� �����.
				data[i] = n; //�ߺ��� ���� ������ �迭�� i ��°�� ������.
				i++; //������ ���������.
			}
		}
		for (i=0; i<data.length; i++) {
			System.out.print(data[i]+" ");
		}
	}
}
