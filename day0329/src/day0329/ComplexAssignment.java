package day0329;

public class ComplexAssignment {

	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		
		sum = sum + i; //1
		i = i + 1;  //2
		
		sum = sum + i; //3
		i = i + 1;  //3
		
		sum = sum + i;  //6
		i = i + 1;  //4
		
		System.out.println("sum:"+sum);
		System.out.println("i:"+i);
		
	}

}
