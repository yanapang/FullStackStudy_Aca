package day0330;

public class HW_Num7 {
	public static void main(String[] args) {
		int x, y=0;
		
		System.out.print("2���� 100������ ��� �Ҽ�: ");
		for (x=2; x<=100; x++) {
			for (y=2; y<x; y++) {
				if (x%y==0) {
					break;
				}
			}
			if (x==y) {
				System.out.print(x+" ");
			}
		}
	}
}


