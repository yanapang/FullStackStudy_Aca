package exam01;

import java.util.Scanner;

public class SajuTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String r[] = {"천귀","천액","천권","천파","천인","천문","천복","천고","천역","천간","천수","천명"};
		String r2[] = {"쥐","소","범","토끼","용","뱀","말","양","원숭이","닭","개","돼지"};//
		String r3[] = {"자[밤11-1]","축[1-3]","인[3-5]","묘[5-7]","진[7-9]","사[9-11]","오[낮11-1]",
				"미[1-3]","신[3-5]","유[5-7]","술[7-9]","해[9-11]"};
		
		String name, r_year, r_month, r_date, r_time;
		int n = 0;//현재 상태를 나타내는 변수.
		int menu = 0; //입력 받아들일 변수.
		
		System.out.println("*** 사주 팔자 알아보기 ***");
		System.out.print("이름을 입력: ");
		name = sc.next();
		
		for(int i=0; i<r2.length; i++) {
			System.out.print(i+":"+r2[i]+" ");
		}
		
		//생년
		System.out.print("띠를 입력: ");
		menu = sc.nextInt();
		n = menu;
		r_year = r[n];//생년에 대한 운명을 저장.
		
		//생월
		System.out.print("생월을 입력하세요: ");
		menu = sc.nextInt();
		n = n+menu-1; //3월이라면 menu에 3이 들어감. 자기자신 카운트 되므로, 2칸 움직여야함.
		n = n%12; //12 index를 넘지 않도록 12로 나눈값 사용.
		r_month = r[n];//생월에 대한 운명을 저장.
		
		//생일
		System.out.print("생일을 입력하세요: ");
		menu = sc.nextInt();
		
		n = n+menu-1;
		n = n%12;
		r_date = r[n];//생일에 대한 운명을 저장.
		
		//생시
		for(int i=0;i<r3.length;i++) {
			System.out.print(i+":"+r3[i]+" ");
		}
		System.out.print("생시를 입력하세요: ");
		//0번째부터 입력되므로 빼기1 필요 없음.
		menu = sc.nextInt();
		n=n+menu;
		n = n%12;
		
		r_time = r[n];//생시에 대한 운명을 저장.
		
		System.out.println("-------------------------");
		System.out.println(name+"님의 사주팔자는 다음과 같습니다.");
		System.out.println("생년의 운명: "+r_year);
		System.out.println("생월의 운명: "+r_month);
		System.out.println("생일의 운명: "+r_date);
		System.out.println("생시의 운명: "+r_time);
		
	//값을 입력 받은게 12를 넘어서는 안됨.
	}

}
