package day0401;

import java.util.Scanner;

public class Exam04 {
	public static void main(String[] args) {
		int []dap = {1,2,3,4,1,2,3,4,1,2,};
		int []user = new int[10];		
		Scanner sc = new Scanner(System.in);
		
		for (int i=0; i<user.length; i++) {
			System.out.print((i+1)+"번 답을 입력하세요. ");
			user[i]= sc.nextInt();
		}
		
		
		for(int i=1; i<=10; i++) {
			System.out.print(i+ " ");
		}
		System.out.println();
		
		int n=0;
		for(int i=0; 1<=10; i++) {
			if(dap[i] == user[i]) {
				System.out.print("O ");
				i++;
			} else {
				System.out.print("X ");
			}
			
		}

		
	}
}
