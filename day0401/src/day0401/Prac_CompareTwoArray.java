package day0401;

public class Prac_CompareTwoArray {
	public static boolean compareArray(int[]a, int[]b) {
		boolean isTrue = false;
		for(int i=0; i<a.length; i++) {
			for (int j=0; j<b.length; j++) {
				if (a[i] == b[i]) {
					isTrue = true;
				}
			}
		}
		return isTrue;
	}
	
	public static void main(String[] args) {
		int []a = {1,2,3,4,5};
		int []b = {1,2,3,4,5};
		boolean isSame = compareArray(a,b);
		System.out.println("두 배열의 값이 같은가? "+ isSame);
	}

}
