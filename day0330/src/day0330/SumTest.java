package day0330;

public class SumTest {

	public static void main(String[] args) {
		//1���� n���� ���� �����ϴ� ���α׷�
		int sum = 0;
		int i = 1;
		int n = 10;
		
		for (i=1; i<= n; i= i + 1) {
			sum += i;
		}
//		sum = sum + i;
//		i = i + 1;
//		
//		sum = sum + i;
//		i = i + 1;
//		
//		sum = sum + i;
//		i = i + 1;
//		
//		sum = sum + i;
//		i = i + 1;
//		
//		sum = sum + i;
//		i = i + 1;
		
		System.out.println("1���� "+ n + "������ ���� "+sum);
	}

}
