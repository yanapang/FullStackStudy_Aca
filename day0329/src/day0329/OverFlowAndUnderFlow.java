package day0329;

public class OverFlowAndUnderFlow {

	public static void main(String[] args) {
		byte a = 127;
		a = (byte)(a+1); //기본형 int로 계산 된 수를, 강제로 byte로 변환해 저장.
		System.out.println(a);
		//byte로 표현가능한 수를 넘어 overflow 되어 -128이 출력.
		//cycle처럼 연결됨.
		
		byte b = -128;
		b = (byte)(b-1);
		System.out.println(b);
		//underflow되어 127이 출력.
	}

}
