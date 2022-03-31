package day0330;

public class HW_Num5 {

	public static void main(String[] args) {
		int i, j;
		for (i=1; i<=6; i++) {
			for (j=1; j<=6; j++) {
				int sum = i+j;
				if (sum==6) {
					System.out.print("("+i+","+j+")");
					System.out.print(", ");
				}
				
			}
		}
	}

}
