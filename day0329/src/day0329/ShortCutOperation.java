package day0329;

public class ShortCutOperation {

	public static void main(String[] args) {
		int a,b,c,d;
		a=b=c=d=5;
		
		if(++c > 100 & ++d >100) { //������ ��� ���� ���̾ �ڸ� ���۽�Ŵ.
			System.out.println("OK");
		} else {
			System.out.println("NO");
		}
		System.out.println("c:"+c);//6
		System.out.println("d:"+d);//6
		
		
		
		if(a>100 && ++b>100) { //�� ���� ��� ���� ���̸� �ڴ� ���� ����.
			System.out.println("OK");
		} else {
			System.out.println("NO");
		}
		
		System.out.println("a:"+a);//6
		System.out.println("b:"+b);//5

	}

}
