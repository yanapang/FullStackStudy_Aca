package day0331;

public class SortTest {

	public static void main(String[] args) {
		int []data= {15,24,10,18,44,42};
		
		//정렬: 값의 크기 순서대로 배치하는 것.
		//오름차순: 값이 작은것 순서대로 오는 것.
		//내림차순: 값이 큰것 순서대로 오는 것.
		
		for (int i=0; i<data.length; i++) { //i번째 값과 그다음, j번째 값을 비교
			for(int j=i+1; j<data.length; j++) {
				if (data[j]<data[i]) { //j값이 더 작으면 i와 j값 바꾸기.
					int temp = data[i];
					data[i]=data[j];
					data[j]=temp;
				} 
			}
		}//정렬 반복문
		
		//출력 반복문
		for (int i=0; i<data.length; i++) {
			System.out.print(data[i]+" ");
		}
	}
	

}
