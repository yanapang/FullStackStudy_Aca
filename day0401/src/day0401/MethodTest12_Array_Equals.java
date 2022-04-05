package day0401;

public class MethodTest12_Array_Equals {
	public static boolean isEquals(int []a, int []b) {
		boolean flag = true;
		if(a.length != b.length) { //a, b배열의 길이가 같지 않다면 배열 확인 필요없음. 
			return false;
		}
		for(int i=0; i<a.length; i++) {
			//a, b 배열 값 안의 요소 비교.
			//하나라도 갖지 않은게 있으면 false return, 탈출 
			if(a[i] != b[i]) {
				flag = false;
				break;
			}
		}
		return flag;
	}
	public static void main(String[] args) {
		int []a = {1,2,3,4,5};
		int []b = {1,2,3,4,5};
		
		if(isEquals(a,b)) {
			System.out.println("They r same!");
		} else {
			System.out.println("They r different!");
		}

	}

}
