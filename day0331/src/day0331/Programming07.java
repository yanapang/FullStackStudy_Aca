package day0331;

public class Programming07 {

	public static void main(String[] args) {
		int i;
		for(int k=2; k<=100; k++) {
			for(i=2; i<=k-1 ; i++) {
				if(k % i ==0) {
					break;
				}
			}
			if(i==k) { //�߰��� Ż������ �ʰ� ������ �ݺ����� ���Ҵ���.
				System.out.print(k+" ");
			} 
		}

	}

}
