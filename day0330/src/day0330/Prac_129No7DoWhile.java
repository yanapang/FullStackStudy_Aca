package day0330;

public class Prac_129No7DoWhile {

	public static void main(String[] args) {
		int k=2;	
		do {
			int j=2;
			do {
				if (k%j==0) {
					break;
				}
				j++;
			} while(j<k); //j가 k와 같아지면 탈출함.
			
			if (k==j) {
				System.out.print(k+" ");
			} 
			k++;
		}while(k<=100);
		
	}

}
