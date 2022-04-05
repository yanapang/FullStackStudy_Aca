package day0401;

import java.util.Random;

public class Programming13 {

	public static void main(String[] args) {
	//page130/ no.13
		String []shape = {"clubs", "diamonds","Hearts","Spades"};
		String []numbers = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
		
		Random r = new Random();
		
		for(int i=0; i<5; i++) {
			int n = r.nextInt(shape.length);
			System.out.print(shape[n]+ "의 ");
			n = r.nextInt(numbers.length);
			System.out.println(numbers[n]);
			
			
		}
		

	}

}
