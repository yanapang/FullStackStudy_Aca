package exam10;

import java.util.Scanner;

//사용자한테 이름을 입력받아
//김씨인지 아닌지 판별하여 메세지를 출력하는 프로그램을 작성해본다. 
public class StringTest06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 입력: ");
		String name = sc.next();
		
		if (name.startsWith("김")) {
			System.out.println("김씨입니다.");
		} else {
			System.out.println("김씨가 아닙니다.");
		}
		System.out.println(name);
	}

}
