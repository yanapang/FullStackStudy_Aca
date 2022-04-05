package day0401;

public class MethodTest05 {
	public static void gugudan(int dan) {
		System.out.println("***"+dan+"단"+"***");
		for (int i=1; i<=9; i++) {
			System.out.println(dan+"*"+i+"="+(dan*i));
		}
		System.out.println();
		return;
	}
	
	public static void main(String[] args) {
		gugudan(7); //7단 출력 ;
		gugudan(2); //2단 출력 ;

	}
}
