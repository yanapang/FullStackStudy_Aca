package day0401;

public class MaxTest {

	public static void main(String[] args) {
		int []data = {9, 8, 5, 15, 7};
		//find the max and print
		//negative numbers could be in the array
		
		//pretend the data[0] is the max number, and compare it to others.
		int max=data[0];
		
		int i;
		for (i=1; i<data.length; i++) {
			if (max<data[i]) {
				max = data[i];
			}
		}
		System.out.println("max:"+max);
	}
}
