package day0401;

import java.util.Scanner;

public class Prac_MethodTest02 {
	public static int findMax(int i, int j) { //return int value
		int r;
		if (i>j) {
			r=i;
		} else {
			r=j;
		} 
		return r; //값을 함께 return, 이때는 리턴 할 자료형 메소드 void 부분에 대체해 넣음. 
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input First Number: ");
		int a = sc.nextInt();
		System.out.print("Input Second Number: ");
		int b = sc.nextInt();
		
		int result = findMax(a,b); //return 으로 반환받는 값을 변수 안에 저장함. 
		System.out.println(result);
		System.out.println(findMax(40,30)); //값을 출력 받는 두가지 방법. 
	}

}
