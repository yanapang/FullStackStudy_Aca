package exam10;

public class StringTest12 {
	public static void setText(String str) {
		System.out.println(str+"을 설정하였습니다.");
	}
	
	public static void plusOne(double data) {
		System.out.println(data+1);
	}
	
	public static void main(String[] args) {
		int data = 1024;
		//setText(data);//오류
		//setText(String.valueOf(data));//int 변수를 String 형으로 변
		setText(data+""); //위와 동일한 결과.
		
		System.out.println("-------------");
		String a = "1000";
		String b = "2000";
		System.out.println(a+b);
		System.out.println(Integer.parseInt(a)+Integer.parseInt(b));
		//String을 Int로 변경해줌.
		
		//plusOne(a); //입력 값이 String이므로 오류남.
		plusOne(Double.parseDouble(a));
		
		
	}
	
	
}
