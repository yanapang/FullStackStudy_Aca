package hw3_CancerChkUpTest;

import java.util.Date;
import java.util.Scanner;

//숙제3) 사용자 한테 주민번호를 입력받아 무료암검진 대상자 인지 판별하고 암검진 항목을 출력하는 프로그램을 작성합니다.	
//		<< 처리조건 >>
//			무료암검진 대상자는 나이가 40세 이상이고 
//				올해가 짝수년도이면 짝수년도에 태어나고
//				올해가 홀수년도이면 홀수년도에 태어난사람
//		<< 무료암검진 항목>>
//			40세이상 남자 : 위암,간암
//			40세이상 여자 : 위암,간암,유방암,자궁암
//			50세이상 남자 : 위암,간암,대장암
//			50세이상 여자 : 위암,간암,유방암,자궁암,대장암

public class CancerChkUpTest{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//입력 받는 부분
		System.out.println("주민번호를 입력해주세요: ");
		String id= sc.next();
		int thisYear = new Date().getYear();
		int userYear=0;
		int age=0;
		//7번째 자리 3, 4이면 2000, 1,2이면 1900더하기
		//주민번호로 나이 찾기
		if(id.charAt(6)=='3'||id.charAt(6)=='4') {
			System.out.println("무료 암검진 대상 나이가 아닙니다.");
		} else if((id.charAt(6)=='1'||id.charAt(6)=='2')) {
			userYear = Integer.parseInt(id.substring(0, 2));
			age = thisYear-userYear+1;
			System.out.println(age);
			
			if (age>=40) {
				//짝수, 홀수연도대상자 선정
				if(thisYear%2==0 && userYear%2==0) {
					System.out.println("짝수연도 출생자는 올해 무료 암검진 대상입니다.");
					
					if (age>=50) {
						if(id.charAt(6)=='1') {
							System.out.println("50세이상 남자 : 위암,간암,대장암");
						} else if(id.charAt(6)=='2') {
							System.out.println("50세이상 여자 : 위암,간암,유방암,자궁암,대장암");
						}
					} else {
						if(id.charAt(6)=='1') {
							System.out.println("40세이상 남자 : 위암,간암");
						} else if(id.charAt(6)=='2') {
							System.out.println("40세이상 여자 : 위암,간암,유방암,자궁암");
						}
					}
					
				} else if (thisYear%2!=0 && userYear%2!=0) {
					System.out.println("홀수연도 출생자는 올해 무료 암검진 대상입니다.");
					if (age>=50) {
						if(id.charAt(6)=='1') {
							System.out.println("50세이상 남자 : 위암,간암,대장암");
						} else if(id.charAt(6)=='2') {
							System.out.println("50세이상 여자 : 위암,간암,유방암,자궁암,대장암");
						}
					} else {
						if(id.charAt(6)=='1') {
							System.out.println("40세이상 남자 : 위암,간암");
						} else if(id.charAt(6)=='2') {
							System.out.println("40세이상 여자 : 위암,간암,유방암,자궁암");
						}
					}

				} else {
					System.out.println("올해 무료 암검진 대상이 아닙니다.");
				}
				//성별따라 출력문 나누기
			} else {
				System.out.println("무료암검진 대상이 아닙니다.");
			}
		}
		
	}
//메소드 만들기. age input으로 받고 출력문 나오게
}