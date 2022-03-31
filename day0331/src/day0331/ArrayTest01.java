package day0331;

public class ArrayTest01 {

	public static void main(String[] args) {
//		int[]data;
//		data=new int[5];
//		data[0] = 28;
//		data[1] = 23;
//		data[2] = 27;
//		data[3] = 26;
//		data[4] = 26;
		
		
		//배열을 선언함과 동시에 초기값을 설정할 수 있어요.
		//초기화 만큼 배열의 크기가 정해집니다.
		int []data= {28,23,27,26,26}; //선언과 동시에 초기값 줄때는 중괄호사용.

		for (int i=0; i<=4; i++) {
			System.out.println(data[i]);
		}
	}

}
