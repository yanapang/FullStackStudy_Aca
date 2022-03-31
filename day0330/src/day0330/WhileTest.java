package day0330;

public class WhileTest {
	public static void main(String[] args) {
		int i = 1;
		
//1)		while(i<=3) {
//		System.out.println("hello");
//		i++;
//	}
		
		
		
//2)		//boolean flag = true;
		//while(flag) or  while(true) 맨날 참이어야 할때 사용.
		
		/*
		 * boolean flag = true;
		while(flag) {
			if (i>3) { //while 조건을 참으로 놓고
				break;// 이 상황에 맞으면 while문 탈출.
			}
			System.out.println("hello");
			i++;
		}
		System.out.println("종료");
		System.out.println("i:"+i);
		*/
		
//3)
		boolean flag = false;
		while(!flag) {
			System.out.println("hello");
			i++;
			if (i>3) {
				flag = true;
			}
		}
		System.out.println("종료");
		System.out.println("i:"+i);
	}

}
