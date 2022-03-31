package day0331;

public class Prac_DoubleWhileGugudan {

	public static void main(String[] args) {
		int dan = 2;
		
		while (dan<=9) {
			int mul = 1;
			
			System.out.println(dan+"´Ü");
			while (mul<=9) {
				System.out.println(dan+"*"+mul+"="+dan*mul);
				mul++;
			}
			System.out.println();
			dan++;
		}
	}

}
