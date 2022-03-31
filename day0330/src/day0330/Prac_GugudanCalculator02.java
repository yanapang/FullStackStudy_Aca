package day0330;

import java.util.Scanner;


//반복문에서 필요한 변수를 미리 선언할수도 있고
//필요한 곳에서 바로 선언하여 사용할 수 있다.

//필요하다면 반복문에서 선택문을 표현할 수 있다.

public class Prac_GugudanCalculator02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("구구단 중에 몇단을 출력할까요?: ");
		int dan = sc.nextInt();
		//int i = 1;
		for (int i=9; i>=1; i--) {
			if(i % 2 == 1)//홀수 1, 짝수 0, 만 출력 가능.
			System.out.println(dan+"*"+i+"="+dan*i);
		}

	}

}
