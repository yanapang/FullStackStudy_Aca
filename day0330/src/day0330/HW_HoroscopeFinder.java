package day0330;

import java.util.Scanner;

public class HW_HoroscopeFinder {

	public static void main(String[] args) {
		// 이름, 생월, 생일 입력받아 별자리 판별후 출력.
		Scanner sc=new Scanner(System.in);
		System.out.println("이름을 입력하세요: ");
		String name = sc.next();
		System.out.println("생월을 입력하세요: ");
		int brtMth = sc.nextInt();
		System.out.println("생일을 입력하세요: ");
		int brtDt = sc.nextInt();
		
		String jari = "";
		boolean isLegit = true;
		
		if (brtMth>=1 && brtMth<=12) {
			switch(brtMth) {
			case 1: if(brtDt>=1 && brtDt<=19) {jari="염소자리";} 
				else if (brtDt<=31) {jari="물병자리";}
				else{isLegit=false;} break;
			case 2: if(brtDt>=1 && brtDt<=18) {jari="물병자리";} 
				else if (brtDt<=28) {jari="물고기자리";}
				else{isLegit=false;} break;
			case 3: if(brtDt>=1 && brtDt<=20) {jari="물고기자리";} 
				else if (brtDt<=31) {jari="양자리";}
				else{isLegit=false;} break;
			case 4: if(brtDt>=1 && brtDt<=19) {jari="양자리";} 
				else if (brtDt<=30) {jari="황소자리";}
				else{isLegit=false;} break;
			case 5: if(brtDt>=1 && brtDt<=20) {jari="황소자리";} 
				else if (brtDt<=31) {jari="쌍둥이자리";}
				else{isLegit=false;} break;
			case 6: if(brtDt>=1 && brtDt<=21) {jari="쌍둥이자리";} 
				else if (brtDt<=30) {jari="게자리";}
				else{isLegit=false;} break;
			case 7: if(brtDt>=1 && brtDt<=22) {jari="게자리";} 
				else if (brtDt<=31) {jari="사자자리";}
				else{isLegit=false;} break;
			case 8: if(brtDt>=1 && brtDt<=22) {jari="사자자리";} 
				else if (brtDt<=31) {jari="처녀자리";}
				else{isLegit=false;} break;
			case 9: if(brtDt>=1 && brtDt<=23) {jari="처녀자리";} 
				else if (brtDt<=30) {jari="천칭자리";}
				else{isLegit=false;} break;
			case 10: if(brtDt>=1 && brtDt<=22) {jari="천칭자리";} 
				else if (brtDt<=31) {jari="전갈자리";}
				else{isLegit=false;} break;
			case 11: if(brtDt>=1 && brtDt<=22) {jari="전갈자리";} 
				else if (brtDt<=30) {jari="사수자리";}
				else{isLegit=false;} break;
			case 12: if(brtDt>=1 && brtDt<=24) {jari="사수자리";} 
				else if (brtDt<=31) {jari="염소자리";}
				else{isLegit=false;} break;
			}
			if (isLegit == true){
				System.out.println(name+"님의 별자리는 "+ jari+"입니다.");
			} else {
				System.out.println("생일을 잘못입력했습니다.");
			}
		} else {
			System.out.println("생월을 잘못입력했습니다.");
		}
	}

}
