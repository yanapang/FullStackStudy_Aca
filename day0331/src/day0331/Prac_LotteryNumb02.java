package day0331;

import java.util.Random;

public class Prac_LotteryNumb02 {

	public static void main(String[] args) {
		int []data = new int[6];
		int i;
		//1~45사이의 난수생성.
		Random r = new Random();
		
		System.out.print("이번주 로또 당첨 번호: ");
		for (i=0; i<data.length; i++) {
			data[i] = r.nextInt(45)+1;
			
		}
		for (i=0; i<data.length; i++) {
			System.out.print(data[i]+" ");
		}
	}
//난수 중에 중복이 있을 수 있음.
}
