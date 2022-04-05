package day0401;

import java.util.Random;

public class Team_15 {
	public static void main(String[] args) {
		
		int [][]arr= new int[3][5];
		//int 형 배열은 자동으로 0으로 초기화됨. 
		
		//총 5번 도는 루프 (랜덤 넘버가 저장된 배열, 내부 5개 차면 끝내기); 
		//내부 루프 1) 3번 도는 루프
		//내부 루프 2) 5번 도는 루프 
		Random rd = new Random();
		
		for(int i=0; ;) {
			int r=rd.nextInt(3);
			int c=rd.nextInt(5);
			
			if (arr[r][c]==0) {
				arr[r][c]=1;
				i++;
				
			} else {
				continue;
			}
			
			if (i==5) {
				break;
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		

	}//main
}//class
