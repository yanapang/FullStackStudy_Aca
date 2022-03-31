package day0331;

public class Prac_LotteryNumb {

	public static void main(String[] args) {
		int []data = {3, 6, 19, 18, 43, 45};
		int i;
		System.out.print("이번주 로또 당첨 번호: ");
		for (i=0; i<data.length; i++) {
			if (i<data.length-1) {
				System.out.print(data[i]+", ");
			} else {
				System.out.print(data[i]);
			}
			
			
		}
	}

}
