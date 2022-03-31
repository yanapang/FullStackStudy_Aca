package day0331;

import java.util.Random;

public class AutoLottoSort {

	public static void main(String[] args) {
		int []data = new int[6];
		Random r = new Random();
		int i;
		
		//random number generator.
		for (i=0; i<data.length; ) {
			int n = r.nextInt(45)+1; //randomInt는 0부터 특정값-1까지리턴, +1을 통해 값 보정;
			int j;
			//발생한 난수 n이 이미 있는지 조사.
			for(j=0; j<i; j++) {
				if(n==data[j]) {
					break; //중간에 탈출 == 중간에 중복값 있음.
				}
			}//end for j
			
			//위의 반복문을 다 돌았는지? == 중복값이없다는 의미.
			if (j==i) {
				data[i] = n;
				i++;
			}
		}//end for i
		
		//정렬하기
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
