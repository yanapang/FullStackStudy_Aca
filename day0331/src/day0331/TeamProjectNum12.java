package day0331;

import java.util.Scanner;

public class TeamProjectNum12 {

	public static void main(String[] args) {
		int arr[] = {};
		Scanner sc = new Scanner(System.in);
		int end = -1;
		int i=0;
		int n;
		//-1 입력 전까지 입력받기
		
		while (true) {
			System.out.println("점수를 입력하세요: ");
			n = sc.nextInt();
			if (n==end) {
				break;
			} else {
				for (i=0; ;i++) {
					arr[i] = n;
				}
			}
		}//while loop 끝
		
		for (i=0; i<arr.length; i++) {
			//합계, 평균
			int sum=0;
			int avg;
			sum += arr[i];
			avg = sum/arr.length;
			System.out.println("합계: "+sum);
		}
	}

}
