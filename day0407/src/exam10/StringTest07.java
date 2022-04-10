package exam10;

public class StringTest07 {

	public static void main(String[] args) {
		String data1= "hello";
		String data2= "Hello";
		
		if(data1.equals(data2)) { //스트링이 같은지 확인. 대소문자 다르면 다름.
			System.out.println("대소문자 구별하여 같아요.");
		} else {
			System.out.println("대소문자 구별하여 달라요.");
		}
		
		System.out.println(" -------------------- ");
		if(data1.equalsIgnoreCase(data2)) { //스트링 대소문자 상관없이 같은지 확인.
			System.out.println("대소문자 구별없이 같아요.");
		} else {
			System.out.println("대소문자 구별없이 달라요.");
		}
	}

}
