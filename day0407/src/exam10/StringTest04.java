package exam10;

import java.util.Scanner;

//사용자한테 문자열을 입력받는다. 입력받은 문자열에 소문자 a가 모두 몇개있는지 판별하여 출력하는 프로그램 작성.

public class StringTest04 {

	public static void main(String[] args) {
//		String data = new String("hello java");
//		char ch = data.charAt(4);
//		System.out.println(ch);
		
		String data;
		int cnt = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("input string: ");
		data = sc.next();
		int n = data.length();
		System.out.println("length of the string: "+ n);
		
		for(int i=0; i<data.length(); i++) {
			char ch = data.charAt(i);
			if(ch=='a') {
				cnt++;
				
			}
		}
		System.out.println("lowercase a number:"+cnt);	
	}

}
