package day0401;

import java.util.Scanner;

public class Prac_MethodTest {
	public static void findMax(int i, int j) {
		int r;
		
		if (i>j) {
			r=i;
		} else {
			r=j;
		} 
		
		System.out.println(r+" is the bigger number");
		return;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input First Number: ");
		int a = sc.nextInt();
		System.out.println("Input Second Number: ");
		int b = sc.nextInt();
		
		findMax(a,b);

	}

}
