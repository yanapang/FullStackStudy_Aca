package day0330;
//page 129, 8번.
//피타고라스의 정리를 만족하는 a, b, c. (단, 각 변은 100보다 작아야한다)
//피타고라스의 정리 : a^2 + b^2 = c^2
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
