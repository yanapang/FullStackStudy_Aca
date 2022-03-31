package day0328_a;

import java.util.Scanner;

public class MileToKm {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double inputMile, changeToKm;
		
		System.out.println("마일을 입력하시오: ");
		inputMile = sc.nextDouble();
		changeToKm = inputMile * 1.609;
		
		System.out.println(inputMile+ "마일은 "+ changeToKm + "킬로미터입니다.");
	}
}
