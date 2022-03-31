package day0331;

import java.util.Random;

public class AutoLottoSort {

	public static void main(String[] args) {
		int []data = new int[6];
		Random r = new Random();
		int i;
		
		//random number generator.
		for (i=0; i<data.length; ) {
			int n = r.nextInt(45)+1; //randomInt�� 0���� Ư����-1��������, +1�� ���� �� ����;
			int j;
			//�߻��� ���� n�� �̹� �ִ��� ����.
			for(j=0; j<i; j++) {
				if(n==data[j]) {
					break; //�߰��� Ż�� == �߰��� �ߺ��� ����.
				}
			}//end for j
			
			//���� �ݺ����� �� ���Ҵ���? == �ߺ����̾��ٴ� �ǹ�.
			if (j==i) {
				data[i] = n;
				i++;
			}
		}//end for i
		
		//�����ϱ�
		for(i=0; i<data.length; i++) {
			for(int j=i+1; j<data.length; j++) {
				if (data[j]<data[i]){
					int temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			}
		}
		
		for(i=0; i<data.length; i++) {
			System.out.print(data[i]+" ");
		}
	}

}
