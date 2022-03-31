package day0331;

public class TeamProject {
//page 129. numb10
	public static void main(String[] args) {
		double []dArray = {1.0, 2.0, 3.0, 4.0};
		int i;
		double sum = 0;
		double max = 0;
		
		for (i=0; i<dArray.length; i++) {
			System.out.print(dArray[i]+" ");
		}//배열 내 값 출력
		
		System.out.println();
		
		for (i=0; i<dArray.length; i++) {
			sum += dArray[i];
			int j;
			for (j=i+1; j<dArray.length; j++) {
				if (dArray[j]>dArray[i]) {
					max = dArray[j];
				} else {
					max = dArray[i];
				}
			}//배열 내 값 비교 후 max 저장.
		}
		
		System.out.println("합은 "+ sum);
		System.out.println("최대값은 "+max);
			
	}

}
