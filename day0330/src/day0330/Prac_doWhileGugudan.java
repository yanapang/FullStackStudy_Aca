package day0330;

public class Prac_doWhileGugudan {

	public static void main(String[] args) {
		int dan = 2;
		
		do {
			int i = 1;
			System.out.println(dan+"��");
			
			do {
				System.out.println(dan+"*"+i+"="+dan*i);
				i++;
			} while(i<=9);
			dan++;
			System.out.println("**************");
		} while(dan<=9);
	}

}
