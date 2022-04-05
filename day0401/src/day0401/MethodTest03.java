package day0401;

public class MethodTest03 {
	//메소드의 정의 
	public static void sayHello(String name) { //매개변수 넣
		for(int i=1; i<=3; i++) {
		System.out.println(name +"야(아) 안녕");
		}
		return; 
	}
	
	public static void main(String[] args) {
		sayHello("민지"); //메소드의 호출
		
		int year=2022;
		System.out.println("올해는 "+ year +"연도 입니다. ");
		
		sayHello("주희");
		
		String title= "쌍용교육센터"; 
		System.out.println(title+"에서 훈련받고 있어요. ");
		
		sayHello("다정");
	}

}
