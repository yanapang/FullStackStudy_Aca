package day0329;

public class IntAndDouble {

	public static void main(String[] args) {
		int a = 5;
		int b = 2;
		
		double r = a/b;
		//계산 결과 자체가 int값이라 저장을 double에 해도 이미 잘린 값이 double로 변환됨.
		System.out.println(r);
		
		double r2 = a/(double)b;
		System.out.println(r2);
	}

}
