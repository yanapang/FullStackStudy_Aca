package day0328_a;

import java.util.Scanner;

public class MileToKm {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double inputMile, changeToKm;
		
		System.out.println("������ �Է��Ͻÿ�: ");
		inputMile = sc.nextDouble();
		changeToKm = inputMile * 1.609;
		
		System.out.println(inputMile+ "������ "+ changeToKm + "ų�ι����Դϴ�.");
	}
}
