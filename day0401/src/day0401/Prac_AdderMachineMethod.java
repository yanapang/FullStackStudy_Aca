package day0401;

import java.util.Scanner;

public class Prac_AdderMachineMethod {
	public static int Adder(int n) {
		int sum = 0;
		for (int i=0; i<=n; i++) {			
			sum += i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		/*
		 * int result = Adder(10);
		 * System.out.println("Sum of 1 to 10: "+result);
		 * System.out.println("Sum of 1 to 100: "+Adder(100));
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Input N: ");
		int input_numb = sc.nextInt();
		
		int sum = Adder(input_numb);
		System.out.println("Sum of 1 to " +input_numb+ " is: "+sum);
	}
}