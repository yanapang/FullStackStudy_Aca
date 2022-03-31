package day0329;

public class ShortCutOperation {

	public static void main(String[] args) {
		int a,b,c,d;
		a=b=c=d=5;
		
		if(++c > 100 & ++d >100) { //논리합의 경우 앞이 참이어도 뒤를 동작시킴.
			System.out.println("OK");
		} else {
			System.out.println("NO");
		}
		System.out.println("c:"+c);//6
		System.out.println("d:"+d);//6
		
		
		
		if(a>100 && ++b>100) { //논리 합의 경우 앞이 참이면 뒤는 동작 안함.
			System.out.println("OK");
		} else {
			System.out.println("NO");
		}
		
		System.out.println("a:"+a);//6
		System.out.println("b:"+b);//5

	}

}
