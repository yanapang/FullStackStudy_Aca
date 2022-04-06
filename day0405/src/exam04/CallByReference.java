package exam04;

class Exam02 {
	
	//정수형배열을 매개변수로 전달받아모든 요소를 출력하는 메소드를 정의 
	public static void printArray(int []data) {
		for (int i=0; i<data.length; i++) {
			System.out.print(data[i]+ "\t");
		}
		System.out.println();
	}
	//배열을 매개변수로 전달받아, 모든 요소를 1씩 증가시키는 메소드 정의
	public static void plusOne(int []data) {
		for (int i=0; i<data.length; i++) {
			data[i]++;
		}
		System.out.println("메소드안에서 배열의 요소 출력");
		printArray(data); //printArray에 매개변수 전달.
	}
}

public class CallByReference {

	public static void main(String[] args) {
		int []arr = {10,20,30,40,50};
		System.out.println("메소드 호출하기 전의 배열");
		Exam02.printArray(arr);
		
		Exam02.plusOne(arr);
		
		System.out.println("메소드 호출 후의 배열");
		Exam02.printArray(arr);
		
	}

}
