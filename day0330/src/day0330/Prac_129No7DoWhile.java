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
			} while(j<k); //j�� k�� �������� Ż����.
			
			if (k==j) {
				System.out.print(k+" ");
			} 
			k++;
		}while(k<=100);
		
	}

}
