package exam10;

import java.util.Scanner;

//String substring(begin index, end index); end index-1 까지 리턴.
public class StringTest11 {

	public static void main(String[] args) {
//		String data = "hello java hello oracle";
//		String r = data.substring(6,10); //6부터 9까지 substring 으로 가져옴.
//		System.out.println(r);
//		
//		String r2 = data.substring(6); //6부터 끝까지  substring으로 가져옴.
//		System.out.println(r2);
		
//		String email = "tiger@naver.com";
		
		//사용자에게 이메일을 입력받아 id만 추출하여 출력한다.
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.prin("Type your e-mail address: ");
//		String email = sc.next();
//		String id = email.substring(0, email.indexOf("@"));
//		//0번째부터 @가 나오기 전까지 return해서 id에 저장함.
//		System.out.println("아이디는" + id);
		
		//String url = "http://www.sist.co.kr/write"; 
		//맨 뒤 슬래쉬 뒤만 잘라서 사용자가 원하는 것이 무엇인지 리턴하기.
		
//		System.out.print("Input URL: ");
//		String url = sc.next();
//		String service = url.substring(url.lastIndexOf("/")+1);
//		System.out.println(service);

//		System.out.println("Input String: ");
//		String input = sc.next();
//		String UpperC = input.toUpperCase();
//		System.out.println(UpperC);
		
//		String data="   hello  ";
//		System.out.println(data.length());
//		System.out.println(data.trim().length());
		
//		String []member = {"tiger","kim","Tiger","hong","   tiger  ","lee","  TIGER"};
		//member 배열중에 이름의 공백을 제거하고 대소문자 상관없이 tiger인 사람이 모두 몇명인지 찾기.
//		int cnt=0; //몇명인지 카운트할 변수 
//		for(String name:member) {
//			if(name.toLowerCase().trim().equals("tiger")) {
//				cnt++;
//			}
//		}
//		System.out.println("이름이 tiger인 사람은 모두 "+ cnt+ "명입니다.");
//		
		
//		for(String name: member) {
//			name = name.toLowerCase().trim();
//			if(name.equals("tiger")) {
//				cnt++;
//			}
//		}
//		System.out.println("이름이 tiger인 사람은 모두 "+ cnt+ "명입니다.");
		
		
//		for (int i=0; i<=member.length; i++) {
//
//			if (member[i].trim()).equalsIgnoreCase("tiger"){
//				cnt++;
//			}
//			System.out.println(cnt);
//		}
		
//		int data = 65; //'A'의 정수값. 
//		int data2 = 97; //'a'의 정수값.
//		System.out.println((char)data);
//		System.out.println((char)data2);
		
//		System.out.println('A'-65);
//		System.out.println('a'-97);
//		System.out.println("--------------------");
//		System.out.println('B'-65);
//		System.out.println('C'-65);
		
		//기본자료형을 String으로 만들기
//		boolean a = true;
//		String data = String.valueOf(a);
//		
//		int b = 1004;
//		String data2 = String.valueOf(b);
//		
//		double c = 26.7;
//		String data3 = String.valueOf(c);
//		
//		System.out.println(data);
//		System.out.println(data2);
//		System.out.println(data3);


		boolean a = true;
		String data = a+ "";
		
		int b = 123;
		String data2 = b+"";
		
	}	
}
