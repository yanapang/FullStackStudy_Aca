package day0331;

import java.util.Random;

public class LottoTestAutoUnique {

	public static void main(String[] args) {
		int []data = new int[6];
		int i;
		//1~45사이의 난수생성.
		Random r = new Random();
		
		System.out.print("이번주 로또 당첨 번호: ");
		for (i=0; i<data.length; ) {
			int n = r.nextInt(45)+1; //n 이 생성된 난수.
			int j;
			//n이 data 배열에 이미 있는지 판별하여 중복이 되지 않도록 처리.
			for (j=0; j<i; j++) { 
				if (n==data[j]) { //n이 i 번째 이전에 생성된 난수와 같은 것이 있는지 확인.
					break; //같은 값이 있으면 탈출.
				}
			}
			
			if (j==i) { //i 이전에 같은 값이 있어서 탈출했으면 증감실 미실행, 난수 재생성.
				data[i] = n; //중복된 값이 없으니 배열의 i 번째에 저장함.
				i++; //증감식 선택적사용.
			}
		}
		for (i=0; i<data.length; i++) {
			System.out.print(data[i]+" ");
		}
	}
}
