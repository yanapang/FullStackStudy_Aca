package day0401;

import java.util.ArrayList;
import java.util.Scanner;

public class Programming12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//컬렉션 사용
		ArrayList<Integer> n = new ArrayList<Integer> ();
		//동적 Array  n 선언.
		
		int data; //임시로 입력값 받을 변수 
		do {
			System.out.println("성적을 입력하세요: ");
			data = sc.nextInt();
			if(data==-1) {
				break;
			}
			n.add(data); //입력 받을때마다, 메모리에 저장. 
		} while (true);
		
		int total = 0;
//		for(int i=0; i<n.size(); i++) {
//			total += n.get(i);
//		}
		
		for(int d: n) {
			total += d;
		}
		
		System.out.println("Total: "+total);
		System.out.println("Average: "+(double)total/n.size());
		
//		int[]n = new int[100];
//		int i;
//		for(i=0; i<n.length; i++) {
//			System.out.println("Input ur score: ");
//			n[i] = sc.nextInt();
//			if(n[i] == -1) {
//				break;
//			}
//		}
//		
//		int total= 0;
//		double avg;
//		
//		for(int j=0; j<i; j++) {
//			total += n[j];	
//		}
//		
//		System.out.println("합계: "+total);
//		System.out.println("평균: "+ (total/(double)i));
	}

}
