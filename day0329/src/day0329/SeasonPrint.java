package day0329;

import java.util.Scanner;

public class SeasonPrint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է��ϼ���: ");
		int mth = sc.nextInt();
		
		if (mth ==1 || mth ==2 || mth == 12) {
			System.out.println(mth+"���� �ܿ��Դϴ�.");
		} else if (mth >= 3 && mth <=5 ) {
			System.out.println(mth+"���� ���Դϴ�.");
		} else if (mth >= 6 && mth <= 8) {
			System.out.println(mth+"���� �����Դϴ�.");
		} else if (mth >= 9 && mth <= 11){
			System.out.println(mth+"���� �����Դϴ�.");
		} else {
			System.out.println("1���� 12������ ���� �Է��ϼ���.");
		}
		
		
	}

}
