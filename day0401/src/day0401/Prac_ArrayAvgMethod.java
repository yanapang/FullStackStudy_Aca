package day0401;

import java.util.Scanner;

public class Prac_ArrayAvgMethod {

	public static double avg_machine(double []arr) {
		double avg=0;
		double total = 1;
		for (int i=0; i<arr.length; i++) {
			total += arr[i];
		}
		avg=total/arr.length;
		return avg;
	}
	public static void main(String[] args) {
		double [] data = {2.5, 6.7, 3.2};
		System.out.println("배열의 평균: "+avg_machine(data));
		
	}

}
