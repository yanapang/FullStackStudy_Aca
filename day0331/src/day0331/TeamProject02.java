package day0331;

public class TeamProject02 {
//page 129. numb10
	public static void main(String[] args) {
		double []dArray = {1.0, 2.0, 3.0, 4.0};
		int i;
		int j;
		double sum = 0;
		double max = 0;
		
		for (i=0; i<dArray.length; i++) {
			sum += dArray[i];
			
			if(max<dArray[i]) {
				max=dArray[i];
			}
			System.out.print(dArray[i]+" ");
		}
		System.out.println();
		
		System.out.println("합은 "+ sum);
		System.out.println("최대값은 "+max);
			
	}

}
