package day0401;

import java.util.Random;

public class Programming13_unique {

	public static void main(String[] args) {
	//page130/ no.13
		//카드 모양을 위한 배열 
		String []shape = {"clubs", "diamonds","Hearts","Spades"}; 
		//카드 숫자 배열 
		String []numbers = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"}; 
		
		//난수 생성. 
		Random r = new Random();
		
		//카드모양 난수다섯개 담을 배열
		int user_shape[]=new int[5];
		//카드 숫자 5개를 담을 배열 
		int user_numbers[] = new int[5];
		
		
		//카드 모양과 카드 숫자 중복되지 않도록 5개의 난수를 만든다.
		for (int i=0; i<5; ) {
			int s = r.nextInt(shape.length); //카드 모양을 위한 난수 
			int n = r.nextInt(numbers.length); // 카드 숫자를 위한 난수 
			
			//이미 똑같은 s와 n이 배열에 있는지 확인.
			int j;
			for (j=0; j<i; j++){
				if (s==user_shape[j] && n == user_numbers[j]) {
					//카드모양과 숫자가 같은것이 있는지 확인
					break;
				}
			}
			
			if (j==i) {
				user_shape[i]=s;
				user_numbers[i]=n;
				i++;
			}
		}
		for (int i=0; i<5; i++) {
			System.out.print(shape[user_shape[i]]+"의 ");
			System.out.println(numbers[user_numbers[i]]);
		}
		

	}

}
