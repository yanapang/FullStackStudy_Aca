package day0330;

public class TeamWorkNumb4 {

	public static void main(String[] args) {
		int sum = 0;
		
		for (int i=0; i<=100; i++) {
			if (i%3==0 || i%4==0) {
				sum += i;
			}
		}
		System.out.println("3또는 4의 배수의 합="+ sum);
	}
}
