package teamProgram01;

//page 370 number1

import java.util.Scanner;

public class program01 {
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		
		System.out.print("Input String: ");
		
		String user_input = sc.nextLine();
		//nextLine(); 전체문장 입력
		//next(); 공백까지만 입력
		String []arr = user_input.split(" ");
		
		for (int i=0; i<arr.length; i++) {
			if(i == arr.length-1) {
				System.out.println(arr[i]);
				cnt++;
			} else {
				System.out.print(arr[i]+",");
				cnt++;
			}
		}
		
		System.out.println("모두 "+cnt+"개의 단어가 있습니다.");
		//System.out.println("모두 "+arr.length+"개의 단어가 있습니다.");
	}
}
