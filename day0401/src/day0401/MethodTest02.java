package day0401;

public class MethodTest02 {
	//메소드의 정의 
	public static void sayHello() {
		System.out.println("주희야 안녕");
		System.out.println("주희야 안녕");
		System.out.println("주희야 안녕");
		return; 
	}
	
	public static void main(String[] args) {
		sayHello();
		
		int year=2022;
		System.out.println("올해는 "+ year +"연도 입니다. ");
		
		sayHello();
		
		String title= "쌍용교육센터"; 
		System.out.println(title+"에서 훈련받고 있어요. ");
		
		sayHello();
	}

}
