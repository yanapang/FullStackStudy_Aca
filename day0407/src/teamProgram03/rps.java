package teamProgram03;

import java.util.Random;
import java.util.Scanner;

public class rps {
	public static void main(String[] args) {
		Random r = new Random();
		int num = r.nextInt(3);
		//0~2 사이의 값을 랜덤으로 발생 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("하나를 선택하시오: 가위(0), 바위(1), 보(2) : ");
		int user = sc.nextInt();
		
		if (user>=0 && user<=2) {
			switch(num) {
			case 0: System.out.println("컴퓨터는 가위를 냈습니다."); break;
			case 1: System.out.println("컴퓨터는 바위를 냈습니다."); break;
			case 2: System.out.println("컴퓨터는 보를 냈습니다."); break;
			}
			if (user==num) {
				System.out.println("비겼습니다.");
			} else if(user-num==1 || (user==0&&num==2)) {
				//user wins
				System.out.println("사용자가 이겼습니다.");
			} else {
				System.out.println("컴퓨터가 이겼습니다.");
			}
				
		} else {
			System.out.println("잘못입력하셨습니다.");
		}
	}
}
