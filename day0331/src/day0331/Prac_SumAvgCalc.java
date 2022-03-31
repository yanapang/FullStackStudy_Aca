package day0331;

import java.util.Scanner;

public class Prac_SumAvgCalc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int []student = new int[5];
		int i, sum=0;
		
		for (i=0; i<student.length; i++) {
			System.out.println((i+1)+"번째 사람의 점수를 입력하세요:");
			student[i] = sc.nextInt();
		}
		
		System.out.println("*** 성적 처리 결과 ***");
		for (i=0; i<student.length; i++) {
			System.out.println((i+1)+"번째 학생의 점수: "+student[i]);
			sum += student[i];
		}
		double avg = sum/(double)student.length; 
		//double값을 return받으려면, 나누는 값들중 하나이상이 double 값이어야 한다.
		
		System.out.println("합계:"+sum);
		System.out.println("평균:"+avg);
	}

}
