package day0330;
//page 129, 8��.
//��Ÿ����� ������ �����ϴ� a, b, c. (��, �� ���� 100���� �۾ƾ��Ѵ�)
//��Ÿ����� ���� : a^2 + b^2 = c^2
public class HW_Num8 {

	public static void main(String[] args) {
		int a, b, c= 0;
		
		for (a=1; a<=100; a++) {
			for (b=1; b<=100; b++) {
				for (c=1; c<=100; c++) {
					if ((a*a)+(b*b)==(c*c)) {
						System.out.println(a+" "+b+" "+c);
					}
				}
			}
		}
	}

}
