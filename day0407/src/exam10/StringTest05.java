package exam10;

import java.util.Scanner;

public class StringTest05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input Password: ");
		String pw = sc.next();
		System.out.print("Input Password check: ");
		String pw_check = sc.next();
		
		if (pw.equals(pw_check)) {
			System.out.println("Checked!");
		} else {
			System.out.println("They are not the same.");
		}
	}
}
