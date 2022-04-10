package teamProgram02;

//import java.util.ArrayList;
import java.util.Scanner;

//사용자가 입력하는 문자열을 정수로 변환해 정수들의 합을 계산하는 프로그램
//정수로 변환 불가능한 문자열 입력시 예외 발생.
//예외 처리까지 할것

public class StringToInt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Input your number, enter to finish: ");
		String wrd = sc.nextLine();
		String []arr = wrd.split(" ");
		int sum=0;
		
		try {
			for (int i=0; i<arr.length; i++) {
				sum += Integer.parseInt(arr[i]);
			}
			System.out.println("정수들의 합은 " + sum);
		} catch(NumberFormatException a) {
			System.out.println("NumberFormatException 발생!");
		}
		
		sc.close();
	}
}
