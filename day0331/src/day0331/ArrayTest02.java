package day0331;

public class ArrayTest02 {

	public static void main(String[] args) {
		int []team2 = {28, 27, 27, 25, 26};
		int sum=0;
		int avg;
		
		for (int i=0; i<team2.length; i++) {
			sum+=team2[i];
		}
		avg = sum/team2.length;
		
		System.out.println("Æò±Õ³ªÀÌ: "+avg);
	}

}
