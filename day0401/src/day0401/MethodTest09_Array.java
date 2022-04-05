package day0401;

public class MethodTest09_Array {

	public static void printMax(int []a) {
		// 정수형 배열을 매개변수로 전달받아 그 중에 가장 큰수를 찾아 출력하는 메소드를 정의 
		int max=a[0];
		for(int i=1; i<a.length;i++) {
			if(a[i]>max) {
				max = a[i];
			}
		}
		System.out.println("The max number in this Array is: "+ max);

	}
	
	public static void main(String[] args) {
		int []data = {10,20,30,40,50};
		printMax(data);
	}
}
